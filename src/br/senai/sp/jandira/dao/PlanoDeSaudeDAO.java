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

    }

    public static void excluir(Integer codigo) {//DELETE
        for (PlanoDeSaude p : planoDeSaude) {
            if (p.getCodigo().equals(codigo) ) {
                planoDeSaude.remove(p);
                break;
            }
        }
    }

    public static void criarListaDePlanosDeSaudes() {
        PlanoDeSaude p1 = new PlanoDeSaude("Notredame",
                "Ouro",
                LocalDate.of(2024, Month.SEPTEMBER, 10), "2034");

        PlanoDeSaude p2 = new PlanoDeSaude("Amil",
                "Bronze",
                LocalDate.of(2024, Month.AUGUST, 5), "1934");

        PlanoDeSaude p3 = new PlanoDeSaude("Bradesco Saude",
                "Platina",
                LocalDate.of(2024, Month.SEPTEMBER, 30), "6482");

        PlanoDeSaude p4 = new PlanoDeSaude("Quali Saude",
                "Prata",
                LocalDate.of(2025, Month.SEPTEMBER, 25), "0923");

        planoDeSaude.add(p1);
        planoDeSaude.add(p2);
        planoDeSaude.add(p3);
        planoDeSaude.add(p4);
    }

    public static DefaultTableModel getTabelaPlanoDeSaude() {
        String[] titulo = {"Codigo", "Operadora", "Categoria", "Validade", "Numero"};
        
        String[][] dados = new String[planoDeSaude.size()][5];

        int i = 0;
        for (PlanoDeSaude p : planoDeSaude) {
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getValidade().toString();
            dados[i][4] = p.getNumero();
        i++;
        }
        
        return new DefaultTableModel(dados, titulo);
    }
}
