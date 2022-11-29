package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {
    
    
    private int linha;

    public PanelMedico() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabela();
        
    }

    private int getLinha() {
        linha = tableMedico.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelMedico = new javax.swing.JPanel();
        panelListaDeMedico = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setLayout(null);

        jPanel1.setLayout(null);

        panelMedico.setPreferredSize(new java.awt.Dimension(774, 260));
        panelMedico.setLayout(null);

        panelListaDeMedico.setBackground(new java.awt.Color(255, 255, 255));
        panelListaDeMedico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        panelListaDeMedico.setToolTipText("Lista de Medicos");
        panelListaDeMedico.setLayout(null);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableMedico);

        panelListaDeMedico.add(jScrollPane3);
        jScrollPane3.setBounds(5, 18, 770, 177);

        panelMedico.add(panelListaDeMedico);
        panelListaDeMedico.setBounds(0, 0, 780, 200);

        buttonExcluir.setForeground(new java.awt.Color(153, 153, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        panelMedico.add(buttonExcluir);
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
        panelMedico.add(buttonEditar);
        buttonEditar.setBounds(640, 210, 50, 40);

        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adcionar");
        buttonAdicionar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 2, true));
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        panelMedico.add(buttonAdicionar);
        buttonAdicionar.setBounds(700, 210, 50, 40);

        jPanel1.add(panelMedico);
        panelMedico.setBounds(0, 0, 774, 260);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 774, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        linha = tableMedico.getSelectedRow();
        
        if(getLinha() != -1){
            excluirMedico();
        }else{
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione o médico que você deseja excluir",
                "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed
    private void excluirMedico(){
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (resposta == 0) {
            
           
        }
    }
    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        if(getLinha() != -1){
            editarMedico();
        }else{
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione o médico que você deseja editar",
                "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonEditarActionPerformed
    
     private void editarMedico(){
         
        Medico medico = MedicoDAO.getMedico(getCodigo());
         
        MedicoDialog medicoDialog = new MedicoDialog(null, true, medico, OperacaoEnum.EDITAR);
        medicoDialog.setVisible(true);
        preencherTabela();
            
    }
    
    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        MedicoDialog medicoDialog = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        medicoDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarActionPerformed
    
    private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;  
    }
       
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelListaDeMedico;
    private javax.swing.JPanel panelMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables
    private void preencherTabela(){
       tableMedico.setModel(MedicoDAO.getTabelaMedicos());
       ajustarTabela();
    }
    private void ajustarTabela(){
        
        //Impedir que o usuária movimente as colunas
        tableMedico.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das celulas da tabela
        tableMedico.setDefaultEditor(Object.class, null);
        
        //definir largura das colunas
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(160);
    }
}
