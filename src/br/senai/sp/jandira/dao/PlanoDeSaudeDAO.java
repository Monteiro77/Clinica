package br.senai.sp.jandira.dao;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    private final static String URL = "C:\\Senai\\Clinica\\PlanoDeSaude.txt";
    private final static String URL_TEMPORARIO = "C:\\Senai\\Clinica\\PlanoDeSaude-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMPORARIO = Paths.get(URL_TEMPORARIO);
    
    //Essa classe será responsável pela persistencia de dados
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
    }
    
    public static void gravar(PlanoDeSaude p){
        planoDeSaude.add(p);
        
        //** Gravar em Arquivo **//
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(p.getPlanoDeSaudeSeparadoComPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
        
        
        
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo().equals(planoDeSaudeAtualizado.getCodigo())) {
                planoDeSaude.set(planoDeSaude.indexOf(e), planoDeSaudeAtualizado);
                break;
            }
        }
        
        atualizarArquivo();

    }

    public static void excluir(Integer codigo) {//DELETE
        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo().equals(codigo) ) {
                planoDeSaude.remove(p);
                break;
            }
        }
        
        atualizarArquivo();
    }
    
    public static void atualizarArquivo(){
        //PASSO 1 -CRIAR UMA REPRESENTAÇÃO DOS ARQUIVOS QUE SERÃO MANIPULADOS
        
        File arquivoAtual = new File(URL);
        File arquivoTemporario = new File(URL_TEMPORARIO);
        
        try {
            //Criar arquivo temporário 
            arquivoTemporario.createNewFile();
            
           //abrir arquivo temporário e colocar os dados
           BufferedWriter bwTemporário = Files.newBufferedWriter(
                   PATH_TEMPORARIO,
                   StandardOpenOption.APPEND,
                   StandardOpenOption.WRITE);
           
           //Iterar na lista para adcionar as especialidades 
            //no arquivo temporário, exceto o resgistro que não queremos mais
            for(PlanoDeSaude p : planoDeSaude){
                bwTemporário.write(p.getPlanoDeSaudeSeparadoComPontoEVirgula());
                bwTemporário.newLine();
            }
            
            bwTemporário.close();
            
            //Deletar o arquivo atual
            arquivoAtual.delete();
            
            //Renomear o arquivo temporário para o arquivo atual
            arquivoTemporario.renameTo(arquivoAtual);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static void criarListaDePlanosDeSaudes() {
        try {
            
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
           
            
            while(linha != null){
                //Transformar dados da linha em um plano de saúde
                String[] vetor = linha.split(";");
                
                String[] data = vetor[3].split("/");
                 
                PlanoDeSaude p = new PlanoDeSaude(vetor[1],
                        vetor[2],
                        LocalDate.of(Integer.parseInt(data[2]) , Integer.parseInt(data[1]), Integer.parseInt(data[0])),
                        vetor[4]);
                
                planoDeSaude.add(p);
                
                linha = leitor.readLine();
            }
            
                leitor.close();
                  
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o arquivo");
        }
        
    }

    public static DefaultTableModel getTabelaPlanoDeSaude() {
        String[] titulo = {"Codigo", "Operadora", "Categoria", "Validade", "Numero"};
        
        String[][] dados = new String[planoDeSaude.size()][5];

        int i = 0;
        for (PlanoDeSaude p : planoDeSaude) {
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getDataFormatada();
            dados[i][4] = p.getNumero();
        i++;
        }
        
        return new DefaultTableModel(dados, titulo);
    }
}
