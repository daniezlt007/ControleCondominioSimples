/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.view;

import com.controle.dao.CondominioDAO;
import com.controle.dao.DAOFactory;
import com.controle.modelo.Condominio;
import com.utilitarios.Formatados;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class FrmCadMorador extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCadCondominio
     *
     * @throws java.text.ParseException
     */
    public FrmCadMorador() throws ParseException {
        initComponents();
        Formatados.mascara(jFormattedTextFieldFone, "(##)####-####");
        Formatados.mascara(jFormattedTextFieldCpf, "###.###.###-##");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldApto = new javax.swing.JTextField();
        jTextFieldBloco = new javax.swing.JTextField();
        jFormattedTextFieldFone = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFormattedTextFieldFracaoIdeal = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCota = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBoxCondominio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextFieldFone1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Apto:");

        jLabel5.setText("Bloco:");

        jLabel7.setText("Telefone:");

        jTextFieldCodigo.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jTextFieldApto.setEnabled(false);

        jTextFieldBloco.setEnabled(false);

        jFormattedTextFieldFone.setEnabled(false);

        jLabel14.setText("Fração Ideal:");

        jLabel15.setText("Valor Cota:");

        jFormattedTextFieldFracaoIdeal.setEnabled(false);

        jFormattedTextFieldCota.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel16.setText("Cadastro Morador");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/add.png"))); // NOI18N
        jButtonNovo.setToolTipText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/accept.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/application_remove.png"))); // NOI18N
        jButtonExcluir.setToolTipText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/home_next.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/search.png"))); // NOI18N
        jButtonPesquisar.setToolTipText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/application_edit.png"))); // NOI18N
        jButtonEditar.setToolTipText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jTextFieldPesquisa.setToolTipText("Pesquisar Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jButtonEditar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonExcluir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldPesquisa))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/skip_backward.png"))); // NOI18N
        jButtonPrimeiro.setToolTipText("Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });

        jButtonAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/rewind.png"))); // NOI18N
        jButtonAnterior.setToolTipText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/fast_forward.png"))); // NOI18N
        jButtonProximo.setToolTipText("Próximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });

        jButtonUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/controlecondominio/imagens/skip_forward.png"))); // NOI18N
        jButtonUltimo.setToolTipText("Último");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPrimeiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrimeiro)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonProximo)
                    .addComponent(jButtonUltimo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setText("CPF:");

        jLabel21.setText("Condomínio:");

        jComboBoxCondominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Celular:");

        jFormattedTextFieldFone1.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel2)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldCpf))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldApto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldBloco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldCota, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldFracaoIdeal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jComboBoxCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldBloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldApto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jFormattedTextFieldFracaoIdeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextFieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jFormattedTextFieldFone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desbloquearCampos() {
        jTextFieldNome.setEnabled(true);
        jTextFieldApto.setEnabled(true);
        jTextFieldBloco.setEnabled(true);
        jFormattedTextFieldFone.setEnabled(true);
        jFormattedTextFieldFracaoIdeal.setEnabled(true);
        jFormattedTextFieldCota.setEnabled(true);
        jFormattedTextFieldCpf.setEnabled(true);        
        jButtonSalvar.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }

    private void bloquearCampos() {
        jTextFieldNome.setEnabled(false);
        jTextFieldApto.setEnabled(false);
        jTextFieldBloco.setEnabled(false);
        jFormattedTextFieldFone.setEnabled(false);
        jFormattedTextFieldFracaoIdeal.setEnabled(false);
        jFormattedTextFieldCota.setEnabled(false);
        jFormattedTextFieldCpf.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        desbloquearCampos();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
    }//GEN-LAST:event_jButtonSalvarActionPerformed


    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String vazio = "";
        if (jTextFieldPesquisa.getText().equals(vazio)) {
            JOptionPane.showMessageDialog(null, "É necessário informar um código para ser pesquisado!");
        } else {
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        Condominio condominio = new Condominio();
        condominio.setCodCondominio(Integer.parseInt(jTextFieldCodigo.getText()));
        CondominioDAO j = DAOFactory.getDAOFactory().getCondominioDAO();
        j.excluir(condominio);
        JOptionPane.showMessageDialog(null, "Condomínio Excluído com Sucesso!");
        limparCampos();
        bloquearCampos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        CondominioDAO j = DAOFactory.getDAOFactory().getCondominioDAO();
        int a = Integer.parseInt(jTextFieldCodigo.getText());

        try {
            Condominio condominio = j.anterior(a);
            jTextFieldCodigo.setText(condominio.getCodCondominio().toString());
            jTextFieldNome.setText(condominio.getNomeCondominio());
            jTextFieldApto.setText(condominio.getBairroCondominio());
            jTextFieldBloco.setText(condominio.getCidadeCondominio());
            jFormattedTextFieldFone.setText(condominio.getFoneCondominio());
            jFormattedTextFieldCpf.setText(condominio.getCnpjCondominio());
            jFormattedTextFieldFracaoIdeal.setText(condominio.getMultaCondominio().toString());
            jFormattedTextFieldCota.setText(condominio.getRateioCondominio().toString());
            jButtonNovo.setEnabled(false);
            desbloquearCampos();
            jButtonSalvar.setEnabled(false);
            //JOptionPane.showMessageDialog(null, "Registro Encontrado!");
        } catch (NullPointerException e) {
            limparCampos();
            JOptionPane.showMessageDialog(null, "Registro não existe!");
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void msg(JTextField jt, String m) {
        if (jt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, m);
            jt.requestFocus();
        }
    }

    private String validarDoubleValor(JFormattedTextField j) {
        if (new Formatados().verificarSeEntradaENumeroDouble(new Formatados().tirarAVirgulaDoValor(j.getText()))) {
            Double numero = new Formatados().formatarValorStringParaDouble(j.getText());
            return String.valueOf(numero);
        }
        return null;
    }

    private void limparCampos() {
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldApto.setText("");
        jTextFieldBloco.setText("");
        jFormattedTextFieldFone.setText("");
        jFormattedTextFieldFracaoIdeal.setText("");
        jFormattedTextFieldCota.setText("");
        jFormattedTextFieldCpf.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JComboBox<String> jComboBoxCondominio;
    private javax.swing.JFormattedTextField jFormattedTextFieldCota;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone;
    private javax.swing.JFormattedTextField jFormattedTextFieldFone1;
    private javax.swing.JFormattedTextField jFormattedTextFieldFracaoIdeal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldApto;
    private javax.swing.JTextField jTextFieldBloco;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}