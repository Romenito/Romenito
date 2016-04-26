/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import DAO.ProdutoDAO;
import Modelo.Produto;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isaac
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastroProduto
     */
    
    private ProdutoDAO prodDAO = new ProdutoDAO();
    private String pesquisaNome = "";
    
    public CadastroProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jlNome = new javax.swing.JLabel();
        jlGram = new javax.swing.JLabel();
        jspExibeDados = new javax.swing.JScrollPane();
        jtProdutosCadastrados = new javax.swing.JTable();
        jcbTodosProdutos = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jbNovoProd = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbPesquisarProduto = new javax.swing.JButton();
        jlTituloPesquisarProd = new javax.swing.JLabel();
        jtfBarraPesquisarProd = new javax.swing.JTextField();
        jlDesc = new javax.swing.JLabel();
        jlFornecedor = new javax.swing.JLabel();
        jtfFornecedor = new javax.swing.JTextField();
        jlcodRevista = new javax.swing.JLabel();
        jlCiclo = new javax.swing.JLabel();
        jlValor = new javax.swing.JLabel();
        jlundMed = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jtfCodRevista = new javax.swing.JTextField();
        jtfCiclo = new javax.swing.JTextField();
        jtfValor = new javax.swing.JTextField();
        jcbUndMed = new javax.swing.JComboBox<>();
        jtfGram = new javax.swing.JTextField();
        jtfDesc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Produtos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlNome.setText("Nome:");
        getContentPane().add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 94, -1, -1));

        jlGram.setText("Gramatura:");
        getContentPane().add(jlGram, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 193, -1, -1));

        jtProdutosCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cod. Revista", "Fornecedor", "Valor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtProdutosCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutosCadastradosMouseClicked(evt);
            }
        });
        jspExibeDados.setViewportView(jtProdutosCadastrados);

        getContentPane().add(jspExibeDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 351, 590, 230));

        jcbTodosProdutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcbTodosProdutos.setText("Todos");
        jcbTodosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTodosProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(jcbTodosProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 310, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 0, 0));
        jlTitulo.setText("Gerenciamento de Produtos");
        jlTitulo.setName(""); // NOI18N

        jbNovoProd.setText("Novo Cadastro");
        jbNovoProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbNovoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoProdActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbPesquisarProduto.setText("Pesquisar");
        jbPesquisarProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarProdutoActionPerformed(evt);
            }
        });

        jlTituloPesquisarProd.setText("Pesquisar:");

        jtfBarraPesquisarProd.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfBarraPesquisarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBarraPesquisarProdActionPerformed(evt);
            }
        });

        jlDesc.setText("Descrição:");

        jlFornecedor.setText("Fornecedor:");

        jtfFornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfFornecedor.setEnabled(false);
        jtfFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFornecedorActionPerformed(evt);
            }
        });

        jlcodRevista.setText("cod. Revista:");

        jlCiclo.setText("Ciclo:");

        jlValor.setText("Valor:");

        jlundMed.setText("Unid. de Medida:");

        jtfNome.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfNome.setEnabled(false);
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jtfCodRevista.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfCodRevista.setEnabled(false);
        jtfCodRevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodRevistaActionPerformed(evt);
            }
        });

        jtfCiclo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfCiclo.setEnabled(false);
        jtfCiclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCicloActionPerformed(evt);
            }
        });

        jtfValor.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfValor.setEnabled(false);
        jtfValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorActionPerformed(evt);
            }
        });

        jcbUndMed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mililitros", "Gramas" }));
        jcbUndMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUndMedActionPerformed(evt);
            }
        });

        jtfGram.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfGram.setEnabled(false);
        jtfGram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfGramActionPerformed(evt);
            }
        });

        jtfDesc.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfDesc.setEnabled(false);
        jtfDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTituloPesquisarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfBarraPesquisarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbNovoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlFornecedor)
                        .addGap(14, 14, 14)
                        .addComponent(jtfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfGram, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlundMed))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jlcodRevista)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCodRevista, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbUndMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCiclo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jlTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlTitulo)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcodRevista)
                    .addComponent(jlCiclo)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCodRevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDesc)
                    .addComponent(jlFornecedor)
                    .addComponent(jtfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlValor)
                    .addComponent(jlundMed)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbUndMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfGram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTituloPesquisarProd)
                    .addComponent(jtfBarraPesquisarProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jtfCodRevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodRevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodRevistaActionPerformed

    private void jtfCicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCicloActionPerformed

    private void jtfFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFornecedorActionPerformed

    private void jtfDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescActionPerformed

    private void jtfGramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfGramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfGramActionPerformed

    private void jcbUndMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUndMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbUndMedActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Produto produto = new Produto();
        produto.setNome_produto(jtfNome.getText());
        produto.setCodigo_revista(jtfCodRevista.getText());
        produto.setCiclo_campanha(jtfCiclo.getText());
        produto.setFornecedor(jtfFornecedor.getText());
        produto.setDescricao(jtfDesc.getText());
        produto.setQuantidade_ml(Integer.parseInt(jtfGram.getText()));
        produto.setValor(Double.parseDouble(jtfValor.getText()));
        produto.setUnidade_medida(String.valueOf(jcbUndMed.getSelectedItem()));
        
        prodDAO.inserirProduto(produto);
        limparCampos();
         //ativa botoes
        jbNovoProd.setEnabled(true);
        jbEditar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jbSair.setEnabled(true);
        jtfNome.setEnabled(false);
        jtfCodRevista.setEnabled(false);
        jtfCiclo.setEnabled(false);
        jtfDesc.setEnabled(false);
        jtfFornecedor.setEnabled(false);
        jtfValor.setEnabled(false);
        jtfGram.setEnabled(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        Produto produto = new Produto();
        produto.setId_produto(Integer.parseInt(String.valueOf(jtProdutosCadastrados.getValueAt(jtProdutosCadastrados.getSelectedRow(), 0))));
        produto.setNome_produto(jtfNome.getText());
        produto.setCodigo_revista(jtfCodRevista.getText());
        produto.setDescricao(jtfDesc.getText());
        produto.setCiclo_campanha(jtfCiclo.getText());
        produto.setFornecedor(jtfFornecedor.getText());
        produto.setQuantidade_ml(Integer.parseInt(jtfGram.getText()));
        produto.setValor(Double.parseDouble(jtfValor.getText()));
        produto.setUnidade_medida(String.valueOf(jcbUndMed.getSelectedItem()));
        prodDAO.editarProduto(produto);
        limparCampos();
        jbNovoProd.setEnabled(true);
        jcbTodosProdutos.setSelected(false);
        jtProdutosCadastrados.setModel(new DefaultTableModel());
        jtfNome.setEnabled(false);
        jtfCodRevista.setEnabled(false);
        jtfCiclo.setEnabled(false);
        jtfDesc.setEnabled(false);
        jtfFornecedor.setEnabled(false);
        jtfValor.setEnabled(false);
        jtfGram.setEnabled(false);
        jbEditar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbNovoProd.setEnabled(true);
        jbExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbNovoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoProdActionPerformed
       jbSalvar.setEnabled(true);
       jbCancelar.setEnabled(true);
       jbSair.setEnabled(true);
       jbExcluir.setEnabled(false);
       jbEditar.setEnabled(false);
       jbNovoProd.setEnabled(false);
       jtfNome.setEnabled(true);
       jtfCodRevista.setEnabled(true);
       jtfCiclo.setEnabled(true);
       jtfDesc.setEnabled(true);
       jtfFornecedor.setEnabled(true);
       jtfValor.setEnabled(true);
       jtfGram.setEnabled(true);
    }//GEN-LAST:event_jbNovoProdActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        //Pega o ID do produto
        prodDAO.excluirProduto(prodDAO.pesquisarProduto(jtfNome.getText()).getId_produto());
        limparCampos();
        jtProdutosCadastrados.setModel(new DefaultTableModel());
        jcbTodosProdutos.setSelected(false);
        jtfNome.setEnabled(false);
        jtfCodRevista.setEnabled(false);
        jtfCiclo.setEnabled(false);
        jtfDesc.setEnabled(false);
        jtfFornecedor.setEnabled(false);
        jtfValor.setEnabled(false);
        jtfGram.setEnabled(false);
        jbEditar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbNovoProd.setEnabled(true);
        jbExcluir.setEnabled(false);
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtfBarraPesquisarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBarraPesquisarProdActionPerformed
        
    }//GEN-LAST:event_jtfBarraPesquisarProdActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        limparCampos();
        //ativa botoes
        jbNovoProd.setEnabled(true);
        jbEditar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbSalvar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtfNome.setEnabled(false);
        jtfCodRevista.setEnabled(false);
        jtfCiclo.setEnabled(false);
        jtfDesc.setEnabled(false);
        jtfFornecedor.setEnabled(false);
        jtfValor.setEnabled(false);
        jtfGram.setEnabled(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jtfValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorActionPerformed

    }//GEN-LAST:event_jtfValorActionPerformed

    private void jcbTodosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTodosProdutosActionPerformed
        jtProdutosCadastrados.setModel(prodDAO.pesquisarTodos());
        if(!jcbTodosProdutos.isSelected()){
            ((DefaultTableModel)jtProdutosCadastrados.getModel()).setRowCount(0);
        }    
    }//GEN-LAST:event_jcbTodosProdutosActionPerformed

    private void jbPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarProdutoActionPerformed
        Produto produto = prodDAO.pesquisarProduto(jtfBarraPesquisarProd.getText());
        Object dados[] = {produto.getId_produto(),produto.getNome_produto(),produto.getCodigo_revista(),produto.getFornecedor(),produto.getValor(),produto.getDescricao()};
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"ID","Nome","Cod. Revista","Fornecedor","Valor","Descrição"});
        tabela.addRow(dados);
        jtProdutosCadastrados.setModel(tabela);
    }//GEN-LAST:event_jbPesquisarProdutoActionPerformed

    private void jtProdutosCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosCadastradosMouseClicked
        //String pesquisa = ""+jtProdutosCadastrados.getValueAt(jtProdutosCadastrados.getSelectedRow(), 1);
        int idProd = (int)jtProdutosCadastrados.getModel().getValueAt(jtProdutosCadastrados.getSelectedRow(), 0);
        Produto produto = prodDAO.pesquisarProdutoID(idProd);
        jtfNome.setText(produto.getNome_produto());
        jtfCodRevista.setText(produto.getCodigo_revista());
        jtfCiclo.setText(produto.getCiclo_campanha());
        jtfDesc.setText(produto.getDescricao());
        jtfFornecedor.setText(produto.getFornecedor());
        jtfValor.setText(Double.toString(produto.getValor()));
        jcbUndMed.setSelectedItem(produto.getUnidade_medida());
        jtfGram.setText(Integer.toString(produto.getQuantidade_ml()));
        jbEditar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbNovoProd.setEnabled(false);
        jbExcluir.setEnabled(true);
        jtfNome.setEnabled(true);
        jtfCodRevista.setEnabled(true);
        jtfCiclo.setEnabled(true);
        jtfDesc.setEnabled(true);
        jtfFornecedor.setEnabled(true);
        jtfValor.setEnabled(true);
        jtfGram.setEnabled(true);
    }//GEN-LAST:event_jtProdutosCadastradosMouseClicked
    
    
    public void limparCampos(){
        jtfNome.setText("");
        jtfCodRevista.setText("");
        jtfCiclo.setText("");
        jtfFornecedor.setText("");
        jtfDesc.setText("");
        jtfGram.setText("");
        jtfValor.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovoProd;
    private javax.swing.JButton jbPesquisarProduto;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JCheckBox jcbTodosProdutos;
    private javax.swing.JComboBox<String> jcbUndMed;
    private javax.swing.JLabel jlCiclo;
    private javax.swing.JLabel jlDesc;
    private javax.swing.JLabel jlFornecedor;
    private javax.swing.JLabel jlGram;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlTituloPesquisarProd;
    private javax.swing.JLabel jlValor;
    private javax.swing.JLabel jlcodRevista;
    private javax.swing.JLabel jlundMed;
    private javax.swing.JScrollPane jspExibeDados;
    private javax.swing.JTable jtProdutosCadastrados;
    private javax.swing.JTextField jtfBarraPesquisarProd;
    private javax.swing.JTextField jtfCiclo;
    private javax.swing.JTextField jtfCodRevista;
    private javax.swing.JTextField jtfDesc;
    private javax.swing.JTextField jtfFornecedor;
    private javax.swing.JTextField jtfGram;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
