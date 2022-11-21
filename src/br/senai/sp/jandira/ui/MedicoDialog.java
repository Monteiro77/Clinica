
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;

public class MedicoDialog extends javax.swing.JDialog {
    
    private OperacaoEnum operacao;
    private Medico medico;

    public MedicoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public MedicoDialog(java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao) {
        super(parent, modal);
        
        this.operacao = operacao;
        medico = m;
        initComponents();
        preencherFormulario();
        
    }
    
    private void preencherFormulario() {
        fieldCodigo.setText(medico.getCodigo().toString());
        fieldCRM.setText(medico.getCrm());
        fieldNomeDoMedico.setText(medico.getNomeMedico());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo27 = new javax.swing.JPanel();
        labelIcon27 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelDataDeNascimento = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar1 = new javax.swing.JButton();
        fieldNomeDoMedico = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        formattedTextFieldDataDeNascimento = new javax.swing.JFormattedTextField();
        fieldCRM = new javax.swing.JTextField();
        labelCRM = new javax.swing.JLabel();
        fiedTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        listEspecialidadesDoMedico = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        listEspecialidades = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        buttonRemoverEspecialidade = new javax.swing.JButton();
        buttonAdcionarEspecialidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelTitulo27.setBackground(new java.awt.Color(255, 255, 255));
        panelTitulo27.setLayout(null);

        labelIcon27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        panelTitulo27.add(labelIcon27);
        labelIcon27.setBounds(15, 13, 64, 64);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setText("Médico - ADCIONAR");
        panelTitulo27.add(labelTitulo);
        labelTitulo.setBounds(91, 24, 237, 41);

        getContentPane().add(panelTitulo27);
        panelTitulo27.setBounds(0, 0, 580, 80);

        panelDetalhes.setBackground(new java.awt.Color(255, 255, 255));
        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes do Médico"));
        panelDetalhes.setLayout(null);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEmail.setText("E-mail");
        panelDetalhes.add(labelEmail);
        labelEmail.setBounds(170, 80, 80, 16);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCodigo.setText("Código");
        panelDetalhes.add(labelCodigo);
        labelCodigo.setBounds(20, 20, 50, 16);

        labelDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDataDeNascimento.setText("Data de nascimento");
        panelDetalhes.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(370, 80, 110, 16);

        fieldCodigo.setEditable(false);
        panelDetalhes.add(fieldCodigo);
        fieldCodigo.setBounds(20, 40, 80, 22);
        panelDetalhes.add(fieldEmail);
        fieldEmail.setBounds(170, 100, 180, 22);

        buttonSalvar.setBackground(new java.awt.Color(255, 255, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonSalvar);
        buttonSalvar.setBounds(480, 200, 60, 50);

        buttonCancelar1.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelar1.setToolTipText("Cancelar");
        buttonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar1ActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonCancelar1);
        buttonCancelar1.setBounds(410, 200, 60, 50);
        panelDetalhes.add(fieldNomeDoMedico);
        fieldNomeDoMedico.setBounds(260, 40, 240, 22);

        labelNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeDoMedico.setText("Nome do médico");
        panelDetalhes.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(260, 20, 100, 16);

        formattedTextFieldDataDeNascimento.setColumns(8);
        try {
            formattedTextFieldDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelDetalhes.add(formattedTextFieldDataDeNascimento);
        formattedTextFieldDataDeNascimento.setBounds(370, 100, 110, 22);
        panelDetalhes.add(fieldCRM);
        fieldCRM.setBounds(120, 40, 120, 22);

        labelCRM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCRM.setText("CRM");
        panelDetalhes.add(labelCRM);
        labelCRM.setBounds(120, 20, 50, 16);
        panelDetalhes.add(fiedTelefone);
        fiedTelefone.setBounds(20, 100, 130, 22);

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTelefone.setText("Telefone");
        panelDetalhes.add(labelTelefone);
        labelTelefone.setBounds(20, 80, 80, 16);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEspecialidadesDoMedico.setViewportView(jList1);

        panelDetalhes.add(listEspecialidadesDoMedico);
        listEspecialidadesDoMedico.setBounds(250, 150, 140, 120);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEspecialidades.setViewportView(jList2);

        panelDetalhes.add(listEspecialidades);
        listEspecialidades.setBounds(30, 150, 140, 120);

        buttonRemoverEspecialidade.setBackground(new java.awt.Color(255, 51, 51));
        buttonRemoverEspecialidade.setText("<");
        panelDetalhes.add(buttonRemoverEspecialidade);
        buttonRemoverEspecialidade.setBounds(180, 220, 60, 50);

        buttonAdcionarEspecialidade.setBackground(new java.awt.Color(0, 255, 51));
        buttonAdcionarEspecialidade.setText(">");
        panelDetalhes.add(buttonAdcionarEspecialidade);
        buttonAdcionarEspecialidade.setBounds(180, 150, 60, 50);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(0, 80, 580, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

       
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelar1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdcionarEspecialidade;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonRemoverEspecialidade;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSalvar1;
    private javax.swing.JButton buttonSalvar10;
    private javax.swing.JButton buttonSalvar11;
    private javax.swing.JButton buttonSalvar12;
    private javax.swing.JButton buttonSalvar13;
    private javax.swing.JButton buttonSalvar2;
    private javax.swing.JButton buttonSalvar3;
    private javax.swing.JButton buttonSalvar4;
    private javax.swing.JButton buttonSalvar5;
    private javax.swing.JButton buttonSalvar6;
    private javax.swing.JButton buttonSalvar7;
    private javax.swing.JButton buttonSalvar8;
    private javax.swing.JButton buttonSalvar9;
    private javax.swing.JTextField fiedTelefone;
    private javax.swing.JTextField fieldCRM;
    private javax.swing.JTextField fieldCategoria1;
    private javax.swing.JTextField fieldCategoria10;
    private javax.swing.JTextField fieldCategoria11;
    private javax.swing.JTextField fieldCategoria12;
    private javax.swing.JTextField fieldCategoria13;
    private javax.swing.JTextField fieldCategoria2;
    private javax.swing.JTextField fieldCategoria3;
    private javax.swing.JTextField fieldCategoria4;
    private javax.swing.JTextField fieldCategoria5;
    private javax.swing.JTextField fieldCategoria6;
    private javax.swing.JTextField fieldCategoria7;
    private javax.swing.JTextField fieldCategoria8;
    private javax.swing.JTextField fieldCategoria9;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldCodigo1;
    private javax.swing.JTextField fieldCodigo10;
    private javax.swing.JTextField fieldCodigo11;
    private javax.swing.JTextField fieldCodigo12;
    private javax.swing.JTextField fieldCodigo13;
    private javax.swing.JTextField fieldCodigo2;
    private javax.swing.JTextField fieldCodigo3;
    private javax.swing.JTextField fieldCodigo4;
    private javax.swing.JTextField fieldCodigo5;
    private javax.swing.JTextField fieldCodigo6;
    private javax.swing.JTextField fieldCodigo7;
    private javax.swing.JTextField fieldCodigo8;
    private javax.swing.JTextField fieldCodigo9;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNomeDoMedico;
    private javax.swing.JTextField fieldOperadora1;
    private javax.swing.JTextField fieldOperadora10;
    private javax.swing.JTextField fieldOperadora11;
    private javax.swing.JTextField fieldOperadora12;
    private javax.swing.JTextField fieldOperadora13;
    private javax.swing.JTextField fieldOperadora2;
    private javax.swing.JTextField fieldOperadora3;
    private javax.swing.JTextField fieldOperadora4;
    private javax.swing.JTextField fieldOperadora5;
    private javax.swing.JTextField fieldOperadora6;
    private javax.swing.JTextField fieldOperadora7;
    private javax.swing.JTextField fieldOperadora8;
    private javax.swing.JTextField fieldOperadora9;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCategoria1;
    private javax.swing.JLabel labelCategoria10;
    private javax.swing.JLabel labelCategoria11;
    private javax.swing.JLabel labelCategoria12;
    private javax.swing.JLabel labelCategoria13;
    private javax.swing.JLabel labelCategoria2;
    private javax.swing.JLabel labelCategoria3;
    private javax.swing.JLabel labelCategoria4;
    private javax.swing.JLabel labelCategoria5;
    private javax.swing.JLabel labelCategoria6;
    private javax.swing.JLabel labelCategoria7;
    private javax.swing.JLabel labelCategoria8;
    private javax.swing.JLabel labelCategoria9;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelIcon1;
    private javax.swing.JLabel labelIcon10;
    private javax.swing.JLabel labelIcon11;
    private javax.swing.JLabel labelIcon12;
    private javax.swing.JLabel labelIcon13;
    private javax.swing.JLabel labelIcon14;
    private javax.swing.JLabel labelIcon15;
    private javax.swing.JLabel labelIcon16;
    private javax.swing.JLabel labelIcon17;
    private javax.swing.JLabel labelIcon18;
    private javax.swing.JLabel labelIcon19;
    private javax.swing.JLabel labelIcon2;
    private javax.swing.JLabel labelIcon20;
    private javax.swing.JLabel labelIcon21;
    private javax.swing.JLabel labelIcon22;
    private javax.swing.JLabel labelIcon23;
    private javax.swing.JLabel labelIcon24;
    private javax.swing.JLabel labelIcon25;
    private javax.swing.JLabel labelIcon27;
    private javax.swing.JLabel labelIcon3;
    private javax.swing.JLabel labelIcon4;
    private javax.swing.JLabel labelIcon5;
    private javax.swing.JLabel labelIcon6;
    private javax.swing.JLabel labelIcon7;
    private javax.swing.JLabel labelIcon8;
    private javax.swing.JLabel labelIcon9;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelNumero10;
    private javax.swing.JLabel labelNumero11;
    private javax.swing.JLabel labelNumero12;
    private javax.swing.JLabel labelNumero13;
    private javax.swing.JLabel labelNumero14;
    private javax.swing.JLabel labelNumero2;
    private javax.swing.JLabel labelNumero3;
    private javax.swing.JLabel labelNumero4;
    private javax.swing.JLabel labelNumero5;
    private javax.swing.JLabel labelNumero6;
    private javax.swing.JLabel labelNumero7;
    private javax.swing.JLabel labelNumero8;
    private javax.swing.JLabel labelNumero9;
    private javax.swing.JLabel labelOperadora1;
    private javax.swing.JLabel labelOperadora10;
    private javax.swing.JLabel labelOperadora11;
    private javax.swing.JLabel labelOperadora12;
    private javax.swing.JLabel labelOperadora13;
    private javax.swing.JLabel labelOperadora2;
    private javax.swing.JLabel labelOperadora3;
    private javax.swing.JLabel labelOperadora4;
    private javax.swing.JLabel labelOperadora5;
    private javax.swing.JLabel labelOperadora6;
    private javax.swing.JLabel labelOperadora7;
    private javax.swing.JLabel labelOperadora8;
    private javax.swing.JLabel labelOperadora9;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo10;
    private javax.swing.JLabel labelTitulo11;
    private javax.swing.JLabel labelTitulo12;
    private javax.swing.JLabel labelTitulo13;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JLabel labelTitulo4;
    private javax.swing.JLabel labelTitulo5;
    private javax.swing.JLabel labelTitulo6;
    private javax.swing.JLabel labelTitulo7;
    private javax.swing.JLabel labelTitulo8;
    private javax.swing.JLabel labelTitulo9;
    private javax.swing.JLabel labelValidade1;
    private javax.swing.JLabel labelValidade10;
    private javax.swing.JLabel labelValidade11;
    private javax.swing.JLabel labelValidade12;
    private javax.swing.JLabel labelValidade13;
    private javax.swing.JLabel labelValidade2;
    private javax.swing.JLabel labelValidade3;
    private javax.swing.JLabel labelValidade4;
    private javax.swing.JLabel labelValidade5;
    private javax.swing.JLabel labelValidade6;
    private javax.swing.JLabel labelValidade7;
    private javax.swing.JLabel labelValidade8;
    private javax.swing.JLabel labelValidade9;
    private javax.swing.JScrollPane listEspecialidades;
    private javax.swing.JScrollPane listEspecialidadesDoMedico;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelDetalhes1;
    private javax.swing.JPanel panelDetalhes10;
    private javax.swing.JPanel panelDetalhes11;
    private javax.swing.JPanel panelDetalhes12;
    private javax.swing.JPanel panelDetalhes13;
    private javax.swing.JPanel panelDetalhes2;
    private javax.swing.JPanel panelDetalhes3;
    private javax.swing.JPanel panelDetalhes4;
    private javax.swing.JPanel panelDetalhes5;
    private javax.swing.JPanel panelDetalhes6;
    private javax.swing.JPanel panelDetalhes7;
    private javax.swing.JPanel panelDetalhes8;
    private javax.swing.JPanel panelDetalhes9;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTitulo1;
    private javax.swing.JPanel panelTitulo10;
    private javax.swing.JPanel panelTitulo11;
    private javax.swing.JPanel panelTitulo12;
    private javax.swing.JPanel panelTitulo13;
    private javax.swing.JPanel panelTitulo14;
    private javax.swing.JPanel panelTitulo15;
    private javax.swing.JPanel panelTitulo16;
    private javax.swing.JPanel panelTitulo17;
    private javax.swing.JPanel panelTitulo18;
    private javax.swing.JPanel panelTitulo19;
    private javax.swing.JPanel panelTitulo2;
    private javax.swing.JPanel panelTitulo20;
    private javax.swing.JPanel panelTitulo21;
    private javax.swing.JPanel panelTitulo22;
    private javax.swing.JPanel panelTitulo23;
    private javax.swing.JPanel panelTitulo24;
    private javax.swing.JPanel panelTitulo25;
    private javax.swing.JPanel panelTitulo27;
    private javax.swing.JPanel panelTitulo3;
    private javax.swing.JPanel panelTitulo4;
    private javax.swing.JPanel panelTitulo5;
    private javax.swing.JPanel panelTitulo6;
    private javax.swing.JPanel panelTitulo7;
    private javax.swing.JPanel panelTitulo8;
    private javax.swing.JPanel panelTitulo9;
    // End of variables declaration//GEN-END:variables
}
