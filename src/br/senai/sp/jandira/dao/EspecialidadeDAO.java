package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
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
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282226\\eclipse-workspace\\Clinica\\Especialidade.txt";
    private final static String URL_TEMPORARIO = "C:\\Users\\22282226\\eclipse-workspace\\Clinica\\Especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMPORARIO = Paths.get(URL_TEMPORARIO);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
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

    public static void atualizar(Especialidade especialidadeAtualizada) {//UPDATE
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(especialidadeAtualizada.getCodigo())) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
        
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) {//DELETE

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
       
        atualizarArquivo();

    }

    private static void atualizarArquivo() {
         //PASSO 1 - CRIAR UMA REPRESENTAÇÃO DOS ARQUIVOS QUE SERÃO MANIPULADOS

        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMPORARIO);

        try {
            //PASSO 2 - Criar um arquivo temporário
            arquivoTemp.createNewFile();

            //PASSO 3 - Abrir o arquivo temporário
            BufferedWriter bwTemporario = Files.newBufferedWriter(
                    PATH_TEMPORARIO,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na lista para adcionar as especialidades 
            //no arquivo temporário, exceto o resgistro que não queremos mais
            for(Especialidade e : especialidades){
                bwTemporario.write(e.getEspecilaidadeSeparadaPorPontoEVirgula());
                bwTemporario.newLine();
            }
            
            
            bwTemporario.close();
            
            //Excluir o arquivo
            arquivoAtual.delete();
            
            //Renomear o arquivo
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEscpecialidade() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
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
    public static DefaultListModel<Especialidade> getModelEsp(){
        DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<Especialidade>();
        for(Especialidade percorrer : getEspecialidades()){
            especialidadeLista.addElement(percorrer);
        }
        return especialidadeLista;
    }

    public static DefaultTableModel getTabelaEspecialidades() {

        String[] titulo = {"Código", "Nome da especilidade", "Descrição"};
        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            int i = especialidades.indexOf(e);
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();

        }

        return new DefaultTableModel(dados, titulo);

    }

    

}
