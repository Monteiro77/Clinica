
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanoDeSaude extends javax.swing.JPanel {
    
    private int linha;
    
    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaudes();
        preencherTabela();
    }
    
    private int getLinha() {
        linha = tablePlanoDeSaude.getSelectedRow();
        return linha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanoDeSaude = new javax.swing.JPanel();
        panelListaPlanoDeSaude = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdcionar = new javax.swing.JButton();

        setLayout(null);

        panelPlanoDeSaude.setPreferredSize(new java.awt.Dimension(774, 260));
        panelPlanoDeSaude.setLayout(null);

        panelListaPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        panelListaPlanoDeSaude.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos de Saude", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        panelListaPlanoDeSaude.setToolTipText("Lista de especialidades\n");
        panelListaPlanoDeSaude.setLayout(null);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablePlanoDeSaude);

        panelListaPlanoDeSaude.add(jScrollPane3);
        jScrollPane3.setBounds(5, 18, 770, 177);

        panelPlanoDeSaude.add(panelListaPlanoDeSaude);
        panelListaPlanoDeSaude.setBounds(0, 0, 780, 200);

        buttonExcluir.setForeground(new java.awt.Color(153, 153, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        panelPlanoDeSaude.add(buttonExcluir);
        buttonExcluir.setBounds(580, 210, 50, 40);

        buttonEditar.setForeground(new java.awt.Color(153, 153, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar (1).png"))); // NOI18N
        buttonEditar.setToolTipText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        panelPlanoDeSaude.add(buttonEditar);
        buttonEditar.setBounds(640, 210, 50, 40);

        buttonAdcionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonAdcionar.setToolTipText("Adcionar");
        buttonAdcionar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        buttonAdcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdcionarActionPerformed(evt);
            }
        });
        panelPlanoDeSaude.add(buttonAdcionar);
        buttonAdcionar.setBounds(700, 210, 50, 40);

        add(panelPlanoDeSaude);
        panelPlanoDeSaude.setBounds(0, 0, 774, 260);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        linha = tablePlanoDeSaude.getSelectedRow();
        
        if ((getLinha()) != -1) {
            excluirPlanoDeSaude();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade que você deseja excluir",
                    "Atenção", 
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonExcluirActionPerformed
    private void excluirPlanoDeSaude() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if(getLinha() != -1){
            editarPlanoDeSaude();
        }else{
            JOptionPane.showConfirmDialog(this, "Por favor, selecione a linha que deseja editar", "Edição", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed
    public void editarPlanoDeSaude() {
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlanoDeSaude(getCodigo());
        
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, planoDeSaude, OperacaoEnum.EDITAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }
    private void buttonAdcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdcionarActionPerformed
        PlanoDeSaudeDialog tela = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADCIONAR);
        tela.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdcionarActionPerformed
    private Integer getCodigo() {
       String codigoStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdcionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelListaPlanoDeSaude;
    private javax.swing.JPanel panelPlanoDeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables
    private void preencherTabela() {

        tablePlanoDeSaude.setModel(PlanoDeSaudeDAO.getTabelaPlanoDeSaude());
        ajustarTarbela();
        
    }

    private void ajustarTarbela() {
        //Impedir que o usuária movimente as colunas
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das celulas da tabela
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);

        //definir largura das colunas
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(250);
        tablePlanoDeSaude.getColumnModel().getColumn(3).setPreferredWidth(117);
    }
    

}
