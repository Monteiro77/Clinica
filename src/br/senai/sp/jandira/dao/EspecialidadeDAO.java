package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {
    
    private final static String URL = "C:\\Users\\22282226\\eclipse-workspace\\Clinica\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    
    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    public static void gravar(Especialidade e) {
        especialidades.add(e);
        
        //** GRAVAR EM ARQUIVO **//
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(e.getEspecilaidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException error) {
            
            JOptionPane.showMessageDialog(null, "ocorrreu um erro");
        }
        
    }
    
    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {//UPDATE
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) {//DELETE
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEscpecialidade() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
           while(linha != null){
               //transformar os dados da linha em uma especialidade
               String[] vetor = linha.split(";");
               Especialidade e = new Especialidade(
                       vetor[2],
                       vetor[1],
                       Integer.valueOf(vetor[0]));
               
               // Guardar a especialidade na lista
               especialidades.add(e);
               
               //Ler A proxima linha
               linha = leitor.readLine();
           }
           
           leitor.close();
           
        } catch (IOException error) {
            
            JOptionPane.showMessageDialog(null,
                    "ocorreu um erro ao ler o arquivo");
            
        }
            
    }

    public static DefaultTableModel getTabelaEspecialidades() {

        String[] titulo = {"Código", "Nome da especilidade", "Descrição"};
        String[][] dados = new String[especialidades.size()][3];
        
        
        for(Especialidade e: especialidades){
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
                    
        }

        return new DefaultTableModel(dados, titulo);

    }

}
