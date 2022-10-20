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

    public static PlanoDeSaude getEspecialidade(String numero) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getNumero() == numero) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(PlanoDeSaude planoDeSaudeAtualizado) {
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getNumero() == planoDeSaudeAtualizado.getNumero()) {
                planoDeSaude.set(planoDeSaude.indexOf(e), planoDeSaudeAtualizado);
                break;
            }
        }

    }

    public static void excluir(String numero) {//DELETE
        for (PlanoDeSaude e : planoDeSaude) {
            if (e.getNumero() == numero) {
                planoDeSaude.remove(e);
                break;
            }
        }
    }

    public static void criarListaDePlanosDeSaudes() {
        PlanoDeSaude p1 = new PlanoDeSaude("Notredame",
                "Ouro",
                LocalDate.of(2024, Month.SEPTEMBER, 10),
                "100");

        PlanoDeSaude p2 = new PlanoDeSaude("Amil",
                "Bronze",
                LocalDate.of(2024, Month.AUGUST, 5),
                "100");

        PlanoDeSaude p3 = new PlanoDeSaude("Bradesco Saude",
                "Platina",
                LocalDate.of(2024, Month.SEPTEMBER, 30),
                "100");

        PlanoDeSaude p4 = new PlanoDeSaude("Quali Saude",
                "Prata",
                LocalDate.of(2025, Month.SEPTEMBER, 25),
                "100");

        planoDeSaude.add(p1);
        planoDeSaude.add(p2);
        planoDeSaude.add(p3);
        planoDeSaude.add(p4);
    }

    public static DefaultTableModel getTabelaPlanoDeSaude() {
        String[] titulo = {"Operadora", "Categoria", "Validade", "Número"};
        String[][] dados = new String[planoDeSaude.size()][4];

        for (PlanoDeSaude e : planoDeSaude) {
            int i = planoDeSaude.indexOf(e);
            dados[i][0] = e.getOperadora();
            dados[i][1] = e.getCategoria();
            dados[i][2] = e.getValidade().toString();
            dados[i][3] = e.getNumero();
        }
        return new DefaultTableModel(dados, titulo);
    }
}
