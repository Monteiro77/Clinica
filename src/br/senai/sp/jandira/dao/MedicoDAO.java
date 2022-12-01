package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    private final static String URL = "C:\\Users\\22282226\\eclipse-workspace\\Clinica\\Medicos.txt";
    private final static String URL_TEMPORARIO = "C:\\Users\\22282226\\eclipse-workspace\\Clinica\\Medico-temporario.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMPORARIO = Paths.get(URL_TEMPORARIO);
    
    //Classe com o objeetivo de persistir os dados 
    private static ArrayList<Medico> medico = new ArrayList<>();
    
    public static ArrayList<Medico> getMedico() {
        return medico;
    }

    public static Path getPATH() {
        return PATH;
    }
    
    public static void gravar(Medico m){
        medico.add(m);
        
        //**Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(m.getDadosDoMedicoComPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (Exception error) {
            error.printStackTrace(); 
        }
    }
    
    public static Medico getMedico(Integer codigo){
        for(Medico m : medico){
            if(m.getCodigo().equals(codigo)){
                return m;
            }
        }
        return null;
    }
    
    public static void atualizar(Medico MedicoAtualizado){
        for(Medico m : medico){
            if(m.getCodigo().equals(MedicoAtualizado.getCodigo())){
                medico.set(medico.indexOf(0), MedicoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }
    
    public static void excluir(Integer codigo){
        for(Medico m : medico){
            if(m.getCodigo().equals(codigo)){
                medico.remove(m);
                break;
            }
        }
        atualizarArquivo();
    }
    
    public static void atualizarArquivo(){
        
        File arquivoAtual = new File(URL);
        File arquivoTemporario = new File(URL_TEMPORARIO);
        
        try {
            arquivoTemporario.createNewFile();
            
            BufferedWriter bwTemporario = Files.newBufferedWriter(
                    PATH_TEMPORARIO, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(Medico m : medico){
                bwTemporario.write(m.getDadosDoMedicoComPontoEVirgula());
                bwTemporario.newLine();
            }
            
            bwTemporario.close();
            
            arquivoAtual.delete();
            
            arquivoTemporario.renameTo(arquivoAtual);
           
        } catch (Exception error) {
            error.printStackTrace();
        }
    
    }
    
    public static ArrayList<Especialidade> separaCodigos(String linha) {
        String[] vetor = linha.split(";");
        
        int codigoEspecialidade = 6;
        
        ArrayList<Especialidade> codigos = new ArrayList<>();
        while (codigoEspecialidade < vetor.length){
            codigos.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[codigoEspecialidade])));
        }
        return codigos;
    }
    
    public static void criarListaDeMedicos() {
        try {
            
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
           
            
            while(linha != null){
                //Transformar dados da linha em um plano de saúde
                String[] vetor = linha.split(";");
                
                
                 
                Medico m = new Medico(Integer.valueOf(vetor[0]), vetor[1], vetor[2], vetor[3], vetor[4], vetor[5], separaCodigos(linha));
                
                medico.add(m);
                
                linha = leitor.readLine();
            }
            
                leitor.close();
                  
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo");
        }
        
    }
    public static DefaultListModel<Especialidade> getEspecialidadeModel() {
        
        DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<Especialidade>();
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            for(Especialidade percorrer : separaCodigos(linha)) {
                especialidadeLista.addElement(percorrer);
            }
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao montar a lista do médico!");
        }
        return especialidadeLista;
    }

    
    
    public static DefaultTableModel getTabelaMedicos() {
        String[] titulo = {"codigo","crm", "nome", "telefone"};
        
        String[][] dados = new String[medico.size()][4];
        
        int i = 0;
        for(Medico m : medico) {
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNomeMedico();
            dados[i][3] = m.getTelefoneMedico();
            
            
            
            i++;
        }
        
        return new DefaultTableModel(dados, titulo);
    
    }

    
    
}
