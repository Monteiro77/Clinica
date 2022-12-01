
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {
    
    private OperacaoEnum operacao;
    private Medico medico;

    public MedicoDialog(java.awt.Frame parent, boolean modal,OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
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
        preencherTitulo();
        
    }
    
    private void preencherFormulario() {
        fieldCodigo.setText(medico.getCodigo().toString());
        fieldCRM.setText(medico.getCrm());
        fieldNomeDoMedico.setText(medico.getNomeMedico());
        
    }
    
    private void preencherTitulo() {
        labelTitulo.setText("Medico" + operacao);
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
        buttonRemoverDaLista = new javax.swing.JButton();
        buttonAdicionarParaLista = new javax.swing.JButton();

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
        fieldCodigo.setBounds(20, 40, 80, 20);
        panelDetalhes.add(fieldEmail);
        fieldEmail.setBounds(170, 100, 180, 20);

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
        fieldNomeDoMedico.setBounds(260, 40, 240, 20);

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
        formattedTextFieldDataDeNascimento.setBounds(370, 100, 110, 20);
        panelDetalhes.add(fieldCRM);
        fieldCRM.setBounds(120, 40, 120, 20);

        labelCRM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCRM.setText("CRM");
        panelDetalhes.add(labelCRM);
        labelCRM.setBounds(120, 20, 50, 16);
        panelDetalhes.add(fiedTelefone);
        fiedTelefone.setBounds(20, 100, 130, 20);

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

        buttonRemoverDaLista.setBackground(new java.awt.Color(255, 51, 51));
        buttonRemoverDaLista.setText("<");
        panelDetalhes.add(buttonRemoverDaLista);
        buttonRemoverDaLista.setBounds(180, 220, 60, 50);

        buttonAdicionarParaLista.setBackground(new java.awt.Color(0, 255, 51));
        buttonAdicionarParaLista.setText(">");
        panelDetalhes.add(buttonAdicionarParaLista);
        buttonAdicionarParaLista.setBounds(180, 150, 60, 50);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(0, 80, 580, 310);

        setSize(new java.awt.Dimension(579, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
       if(operacao == OperacaoEnum.ADICIONAR){
           adicionar();
       }else{
           editar();
       }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelar1ActionPerformed
    private void editar(){
        
        medico.setNomeMedico(fieldNomeDoMedico.getText());
        medico.setTelefoneMedico(fiedTelefone.getText());
        medico.setCrm(fieldCRM.getText());
        medico.setEmail(fieldEmail.getText());
        medico.setDataFormatada(formattedTextFieldDataDeNascimento.getText());
        
        MedicoDAO.atualizar(medico);
        
        JOptionPane.showMessageDialog(null,
                "Dados atualizados com sucesso!",
                "Atualizar Medico",
                JOptionPane.OK_OPTION);
        
        dispose();
    }
    private void adicionar(){
        
        Medico medico = new Medico();
        medico.setNomeMedico(fieldNomeDoMedico.getText());
        medico.setTelefoneMedico(fiedTelefone.getText());
        medico.setCrm(fieldCRM.getText());
        medico.setEmail(fieldEmail.getText());
        medico.setDataFormatada(formattedTextFieldDataDeNascimento.getText());
        
        // Gravar médico atravez do DAO
        MedicoDAO.gravar(medico);
        
        JOptionPane.showMessageDialog(null,
                "Medico adicionado com sucesso",
                "Adcionar Médico",
                JOptionPane.OK_OPTION);
        dispose();
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarParaLista;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonRemoverDaLista;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fiedTelefone;
    private javax.swing.JTextField fieldCRM;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNomeDoMedico;
    private javax.swing.JFormattedTextField formattedTextFieldDataDeNascimento;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JLabel labelCRM;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIcon27;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JScrollPane listEspecialidades;
    private javax.swing.JScrollPane listEspecialidadesDoMedico;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelTitulo27;
    // End of variables declaration//GEN-END:variables
}
