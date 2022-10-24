package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {
    
    private OperacaoEnum operacao;
    private Especialidade especialidade;
    
    public EspecialidadesDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        
        preencherTitulo();
    }
    
    public EspecialidadesDialog(java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {
        super(parent, modal);
        
        this.operacao = operacao;
        especialidade = e;
        initComponents();
        preencherFormulario();
        preencherTitulo();
    }
    
    private void preencherFormulario() {
        textCodigo.setText(especialidade.getCodigo().toString());
        textNomedaEspecialidade.setText(especialidade.getNome());
        textDesricao.setText(especialidade.getDescricao());
    }
    
    private void preencherTitulo() {
        labelTitulo.setText("Especialidades - " + operacao);
        
        
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIconAdcionar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        textNomedaEspecialidade = new javax.swing.JTextField();
        labelNomeDaEspecialidae = new javax.swing.JLabel();
        textDesricao = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitulo.setText("Especialidade - Adcionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(80, 20, 490, 40);

        labelIconAdcionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        jPanel1.add(labelIconAdcionar);
        labelIconAdcionar.setBounds(10, 10, 70, 64);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes da Especialidade"));
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCodigo.setText("Código");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(30, 30, 50, 16);

        textCodigo.setEditable(false);
        jPanel2.add(textCodigo);
        textCodigo.setBounds(30, 50, 60, 22);
        jPanel2.add(textNomedaEspecialidade);
        textNomedaEspecialidade.setBounds(30, 100, 290, 22);

        labelNomeDaEspecialidae.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNomeDaEspecialidae.setText("Nome da Especialiade");
        jPanel2.add(labelNomeDaEspecialidae);
        labelNomeDaEspecialidae.setBounds(30, 80, 120, 16);
        jPanel2.add(textDesricao);
        textDesricao.setBounds(30, 150, 290, 22);

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDescricao.setText("Descrição");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(30, 130, 60, 16);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/save.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(480, 200, 60, 50);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(410, 200, 60, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 80, 580, 290);

        setSize(new java.awt.Dimension(598, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADCIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();        
    }//GEN-LAST:event_buttonCancelarActionPerformed
    
    private void editar() {
        especialidade.setNome(textNomedaEspecialidade.getText());
        especialidade.setDescricao(textDesricao.getText());
        
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(null,
                "Especialidade atualizada com sucesso",
                "Atualizar Especialidade",
                JOptionPane.OK_OPTION);
//        dispose();
    }

    private void adicionar() {
        //Criar um objeto especialidade
        Especialidade especialidade = new Especialidade();
        especialidade.setNome(textNomedaEspecialidade.getText());
        especialidade.setDescricao(textDesricao.getText());

        //Gravar Especialidade atravez do DAO
        EspecialidadeDAO.gravar(especialidade);
        
        JOptionPane.showMessageDialog(null,
                "Especialidade gravada com sucesso",
                "Especialidade computada",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelIconAdcionar;
    private javax.swing.JLabel labelNomeDaEspecialidae;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDesricao;
    private javax.swing.JTextField textNomedaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
