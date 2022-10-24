package br.senai.sp.jandira.dao;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

    //Essa classe será responsável pela persistencia de dados
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planoDeSaude;
    }
    
    public static void gravar(PlanoDeSaude e){
        planoDeSaude.add(e);
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo()== codigo) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getCodigo()== planoDeSaudeAtualizado.getCodigo()) {
                planoDeSaude.set(planoDeSaude.indexOf(e), planoDeSaudeAtualizado);
                break;
            }
        }

    }

    public static void excluir(Integer codigo) {//DELETE
        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo()== codigo) {
                planoDeSaude.remove(p);
                break;
            }
        }
    }

    public static void criarListaDePlanosDeSaudes() {
        PlanoDeSaude p1 = new PlanoDeSaude("Notredame",
                "Ouro",
                LocalDate.of(2024, Month.SEPTEMBER, 10));

        PlanoDeSaude p2 = new PlanoDeSaude("Amil",
                "Bronze",
                LocalDate.of(2024, Month.AUGUST, 5));

        PlanoDeSaude p3 = new PlanoDeSaude("Bradesco Saude",
                "Platina",
                LocalDate.of(2024, Month.SEPTEMBER, 30));

        PlanoDeSaude p4 = new PlanoDeSaude("Quali Saude",
                "Prata",
                LocalDate.of(2025, Month.SEPTEMBER, 25));

        planoDeSaude.add(p1);
        planoDeSaude.add(p2);
        planoDeSaude.add(p3);
        planoDeSaude.add(p4);
    }

    public static DefaultTableModel getTabelaPlanoDeSaude() {
        String[] titulo = {"Operadora", "Categoria", "Validade", "Numero"};
        String[][] dados = new String[planoDeSaude.size()][4];

        for (PlanoDeSaude e : planoDeSaude) {
            int i = planoDeSaude.indexOf(e);
            dados[i][0] = e.getOperadora();
            dados[i][1] = e.getCategoria();
            dados[i][2] = e.getValidade().toString();
            dados[i][3] = e.getCodigo().toString();
        }
        return new DefaultTableModel(dados, titulo);
    }
}
