package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;



public class PlanoDeSaudeDialog extends javax.swing.JDialog {
    
    private OperacaoEnum operacao;
    private PlanoDeSaude planoDeSaude;

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }
        public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        
        this.operacao = operacao;
        planoDeSaude = p;
        preencherTitulo();
        preencherFormulario();
    }
    
    
    
    private void preencherFormulario() {
        fieldNumero.setText(planoDeSaude.getNumero());
        fieldOperadora.setText(planoDeSaude.getOperadora());
        fieldCategoria.setText(planoDeSaude.getCategoria());
        formattedTextFieldValidade.setText(planoDeSaude.getDataFormatada());
        
    }
    
    private void preencherTitulo() {
       labelTitulo.setText("Plano De Saude - " + operacao);
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
        fieldCodigo = new javax.swing.JTextField();
        fieldOperadora = new javax.swing.JTextField();
        fieldCategoria = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        fieldNumero = new javax.swing.JTextField();
        labelNumero1 = new javax.swing.JLabel();
        formattedTextFieldValidade = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setText("Plano de Saúde - Adicionar");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTitulo)
                .addContainerGap(178, Short.MAX_VALUE))
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
        labelNumero.setText("Código");
        panelDetalhes.add(labelNumero);
        labelNumero.setBounds(170, 40, 50, 16);

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCategoria.setText("Categoria");
        panelDetalhes.add(labelCategoria);
        labelCategoria.setBounds(50, 160, 60, 16);

        labelValidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelValidade.setText("Valídade");
        panelDetalhes.add(labelValidade);
        labelValidade.setBounds(50, 220, 60, 16);

        fieldCodigo.setEditable(false);
        panelDetalhes.add(fieldCodigo);
        fieldCodigo.setBounds(170, 60, 60, 22);
        panelDetalhes.add(fieldOperadora);
        fieldOperadora.setBounds(50, 120, 200, 22);
        panelDetalhes.add(fieldCategoria);
        fieldCategoria.setBounds(50, 180, 200, 22);

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

        buttonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonCancelar);
        buttonCancelar.setBounds(410, 200, 60, 50);
        panelDetalhes.add(fieldNumero);
        fieldNumero.setBounds(50, 60, 60, 22);

        labelNumero1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNumero1.setText("Número");
        panelDetalhes.add(labelNumero1);
        labelNumero1.setBounds(50, 40, 50, 16);

        formattedTextFieldValidade.setColumns(8);
        try {
            formattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTextFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldValidadeActionPerformed(evt);
            }
        });
        panelDetalhes.add(formattedTextFieldValidade);
        formattedTextFieldValidade.setBounds(50, 240, 90, 22);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(0, 80, 580, 310);

        setSize(new java.awt.Dimension(598, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
     
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
        
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void formattedTextFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldValidadeActionPerformed

    private void editar() {
        
    
        CharSequence branco = " ";
        //Espaços em branco
        if(formattedTextFieldValidade.getText().contains(branco) == true || fieldNumero.getText().contains(branco) || fieldCategoria.getText().contains(branco)|| fieldOperadora.getText().contains(branco)){
            JOptionPane.showMessageDialog(this,
                    "Os campos, operadora, categoria e validade precisam estar preenchidos",
                    "Atenção", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            
        
        
        planoDeSaude.setCategoria(fieldCategoria.getText());
        planoDeSaude.setOperadora(fieldOperadora.getText());
        planoDeSaude.setDataFormatada(formattedTextFieldValidade.getText());
        planoDeSaude.setNumero(fieldNumero.getText());
        
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        
        JOptionPane.showMessageDialog(null,
                "Plano de saúde atualizado com sucesso",
                "Atualizar plano de saúde",
                JOptionPane.INFORMATION_MESSAGE);
        dispose();
        }
    }
    
    private void adicionar(){
        
        CharSequence branco = " ";
        //Espaços em branco
        if(formattedTextFieldValidade.getText().contains(branco) == true || fieldNumero.getText().contains(branco) || fieldCategoria.getText().contains(branco) || fieldOperadora.getText().contains(branco)){
            JOptionPane.showMessageDialog(this,
                    "Os campos, operadora, categoria e validade precisam estar preenchidos",
                    "Atenção", 
                    JOptionPane.INFORMATION_MESSAGE);
        }else{
            //Criar um objeto especialidade
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(fieldOperadora.getText());
        planoDeSaude.setCategoria(fieldCategoria.getText());
        planoDeSaude.setDataFormatada(formattedTextFieldValidade.getText());
        planoDeSaude.setNumero(fieldNumero.getText());

        //Gravar Especialidade atravez do DAO
        PlanoDeSaudeDAO.gravar(planoDeSaude);
        
        JOptionPane.showMessageDialog(null,
                "Plano de saúde gravado com sucesso",
                "Plano de Saude computado",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fieldCategoria;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldOperadora;
    private javax.swing.JFormattedTextField formattedTextFieldValidade;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelNumero1;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelTitulo;
    // End of variables declaration//GEN-END:variables
}
