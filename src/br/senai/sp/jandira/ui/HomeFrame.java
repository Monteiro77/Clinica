package br.senai.sp.jandira.ui;


import java.awt.Toolkit;



public class HomeFrame extends javax.swing.JFrame {

    //Atributos da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanoDeSaude panelPlanoDeSaude;
    PanelMedico panelMedico;
    
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/agenda.png")));
        initPanels();
    }
    
    
    
    //Definindo constantes
    private final int POS_X = 10;
    private final int POS_Y = 160;
    private final int LARGURA = 780;
    private final int ALTURA = 260;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelSisacon = new javax.swing.JLabel();
        labelSistemaParaAgendamentoDeSistema = new javax.swing.JLabel();
        panelBarra = new javax.swing.JPanel();
        labelDadosParaContato = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        labelSite = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de agendamento");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 3));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Sistema para Agendamento de Consultas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 90);

        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/sair.png"))); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(710, 100, 80, 50);

        buttonAgenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda2.png"))); // NOI18N
        buttonAgenda.setToolTipText("Novo agendamento");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(10, 100, 60, 50);

        buttonPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano-de-saude.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Planos de Saúde");
        buttonPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(290, 100, 60, 50);

        buttonEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/medico2.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Lista de especialidades disponíveis");
        buttonEspecialidades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(220, 100, 60, 50);

        buttonMedicos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/doctor.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(150, 100, 60, 50);

        buttonPacientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/sneezing.png"))); // NOI18N
        buttonPacientes.setToolTipText("Lista de pacientes");
        buttonPacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(80, 100, 60, 50);

        labelSisacon.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelSisacon.setForeground(new java.awt.Color(51, 51, 255));
        labelSisacon.setText("30 NO COMANDO");

        labelSistemaParaAgendamentoDeSistema.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSistemaParaAgendamentoDeSistema.setText("Sistema para Agendamento de Consultas");

        panelBarra.setBackground(new java.awt.Color(0, 0, 255));
        panelBarra.setPreferredSize(new java.awt.Dimension(745, 2));

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        labelDadosParaContato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDadosParaContato.setText("Dados para contato:");

        labelEmail.setText("Email: monteiro240905@gmail.com");

        labelTelefone.setText("Telefone: 4002-8922");

        labelSite.setText("Site : 30praum.com.br");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelSisacon)
                        .addComponent(labelSistemaParaAgendamentoDeSistema)
                        .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelEmail)
                        .addComponent(labelTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelSite, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelDadosParaContato, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labelSisacon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSistemaParaAgendamentoDeSistema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDadosParaContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSite)
                .addGap(12, 12, 12))
        );

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 160, 780, 220);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/pagina-inicial.png"))); // NOI18N
        buttonHome.setToolTipText("Página Inicial");
        buttonHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(360, 100, 60, 50);

        setSize(new java.awt.Dimension(816, 476));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
       panelPlanoDeSaude.setVisible(true);
       panelHome.setVisible(false);
       panelEspecialidades.setVisible(false);
       panelMedico.setVisible(false);
       
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
        
        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelMedico.setVisible(false);
        
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(true);
        panelPlanoDeSaude.setVisible(false);
        panelMedico.setVisible(false);
        
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelMedico.setVisible(true);
       
    }//GEN-LAST:event_buttonMedicosActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDadosParaContato;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelSisacon;
    private javax.swing.JLabel labelSistemaParaAgendamentoDeSistema;
    private javax.swing.JLabel labelSite;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    
    private void initPanels(){
        panelEspecialidades = new PanelEspecialidades();
         panelEspecialidades.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        //-------------------------------------------//
        
        panelPlanoDeSaude = new PanelPlanoDeSaude();
        panelPlanoDeSaude.setBounds(POS_X,
                POS_Y,
                LARGURA,
                ALTURA);
        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);
        
        
       //----------------------------------------------//
       
       panelMedico = new PanelMedico();
       panelMedico.setBounds(POS_X,
               POS_Y,
               LARGURA,
               ALTURA);
       getContentPane().add(panelMedico);
       panelMedico.setVisible(false);
    }
}
