package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    /*
    Essa classe será respinsável pela insistencia de dados da especialidade. por exemplo,
    adcionar uma nova especialidade, excluir uma nova especialidade,etc.
     */
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    
    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    public static void gravar(Especialidade e) {
        especialidades.add(e);
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
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração");
        Especialidade e2 = new Especialidade("Ginecologia", "Cuida da vagina ");
        Especialidade e3 = new Especialidade("Otorrinolaringlogia", "Cuida do ouvido ");
        Especialidade e4 = new Especialidade("Nefrologia", "Cuida do rin");

        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        ;

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
