package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelEspecialidades extends javax.swing.JPanel {

    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEscpecialidade();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdcionar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(774, 260));
        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de especialidade", 0, 0, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setToolTipText("Lista de especialidades\n");
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableEspecialidades);

        jPanel2.add(jScrollPane3);

        add(jPanel2);
        jPanel2.setBounds(0, 0, 780, 200);

        buttonExcluir.setBackground(new java.awt.Color(255, 255, 255));
        buttonExcluir.setForeground(new java.awt.Color(153, 153, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        add(buttonExcluir);
        buttonExcluir.setBounds(580, 210, 50, 40);

        buttonEditar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEditar.setForeground(new java.awt.Color(153, 153, 255));
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar (1).png"))); // NOI18N
        buttonEditar.setToolTipText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        add(buttonEditar);
        buttonEditar.setBounds(640, 210, 50, 40);

        buttonAdcionar.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdcionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonAdcionar.setToolTipText("Adcionar");
        buttonAdcionar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        buttonAdcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdcionarActionPerformed(evt);
            }
        });
        add(buttonAdcionar);
        buttonAdcionar.setBounds(700, 210, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        int linha = tableEspecialidades.getSelectedRow();
        
        if(linha != -1) {
            excluirEspecialidade(linha);
        }else{
            JOptionPane.showMessageDialog(this, "Por favor, selecione a especialidade que você deseja excluir", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonExcluirActionPerformed
    
    private void excluirEspecialidade(int linha){
        String codigoStr = tableEspecialidades.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        
        int resposta = JOptionPane.showConfirmDialog(this, "Você confirma a exclusão?","Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
        
        EspecialidadeDAO.excluir(codigo);
        
        preencherTabela();
    }
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdcionarActionPerformed
        EspecialidadesDialog especialidadesDialog = new EspecialidadesDialog(null, true);
        especialidadesDialog.setVisible(true);
        preencherTabela();


    }//GEN-LAST:event_buttonAdcionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdcionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables
private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTarbela();
    }

    private void ajustarTarbela() {
        //Impedir que o usuária movimente as colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das celulas da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);

        //definir largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(467);
    }

}
