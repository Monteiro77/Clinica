package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    private final static String URL = "C:\\Users\\22282226\\eclipse-workspace\\Clinica\\Medico.txt";
    private final static String URL_TEMPORARIO = "C:\\Users\\22282226\\eclipse-workspace\\Clinica\\Medico-temporario.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMPORARIO = Paths.get(URL_TEMPORARIO);
    
    
    
    //Classe com o objeetivo de persistir os dados 
    private static ArrayList<Medico> medico = new ArrayList<>();
    
    public static ArrayList<Medico> getMedico() {
        return medico;
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
            JOptionPane.showMessageDialog(null, "Ocorre um erro");
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
    
    public static void criarListaDeMedicos() {
        try {
            
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
           
            
            while(linha != null){
                //Transformar dados da linha em um plano de saúde
                String[] vetor = linha.split(";");
                
                String[] data = vetor[4].split("/");
                 
                Medico m = new Medico(Integer.valueOf(vetor[0]) ,vetor[1], vetor[2], vetor[3]);
                
                medico.add(m);
                
                linha = leitor.readLine();
            }
            
                leitor.close();
                  
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo");
        }
        
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
