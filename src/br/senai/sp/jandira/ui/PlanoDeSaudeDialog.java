package br.senai.sp.jandira.ui;


public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelIcon = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelOperadora = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelValidade = new javax.swing.JLabel();
        fieldValidade = new javax.swing.JTextField();
        fieldNumero = new javax.swing.JTextField();
        fieldOperadora = new javax.swing.JTextField();
        fieldCategoria = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setText("Plano de Saúde - Adcionar");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelTituloLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(0, 0, 580, 80);

        panelDetalhes.setBackground(new java.awt.Color(255, 255, 255));
        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes do Plano"));
        panelDetalhes.setLayout(null);

        labelOperadora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelOperadora.setText("Operadadora");
        panelDetalhes.add(labelOperadora);
        labelOperadora.setBounds(50, 100, 80, 16);

        labelNumero.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNumero.setText("Número");
        panelDetalhes.add(labelNumero);
        labelNumero.setBounds(50, 40, 50, 16);

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCategoria.setText("Categoria");
        panelDetalhes.add(labelCategoria);
        labelCategoria.setBounds(50, 160, 60, 16);

        labelValidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValidade.setText("Valídade");
        panelDetalhes.add(labelValidade);
        labelValidade.setBounds(50, 220, 60, 16);
        panelDetalhes.add(fieldValidade);
        fieldValidade.setBounds(50, 240, 200, 22);
        panelDetalhes.add(fieldNumero);
        fieldNumero.setBounds(50, 60, 60, 22);
        panelDetalhes.add(fieldOperadora);
        fieldOperadora.setBounds(50, 120, 200, 22);
        panelDetalhes.add(fieldCategoria);
        fieldCategoria.setBounds(50, 180, 200, 22);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonSalvar);
        buttonSalvar.setBounds(480, 200, 60, 50);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonCancelar);
        buttonCancelar.setBounds(410, 200, 60, 50);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(0, 80, 580, 340);

        setSize(new java.awt.Dimension(598, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
       
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fieldCategoria;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldOperadora;
    private javax.swing.JTextField fieldValidade;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
