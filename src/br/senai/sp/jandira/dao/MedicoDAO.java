package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        return null;
    }
    
    
}
