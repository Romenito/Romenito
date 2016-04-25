/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import DAO.ClienteDAO;
import DAO.CompraDAO;
import DAO.ProdutoDAO;
import Modelo.Cliente;
import Modelo.Produto;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isaac
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Compra
     */
    private Cliente cliente;
    private Produto produto;
    private List<Produto> listaProd = new ArrayList<Produto>();
    private List<String> listaPag = new ArrayList<String>();
    private List<String> listaEnt = new ArrayList<String>();
    private double total = 0;
    //format para timestamp do mysql ou usar java.sql
    private DateFormat df = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
    private Timestamp dataAtual;
    
    public Compra() {
        cliente = null;
        produto = null;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jlTituloCompra = new javax.swing.JLabel();
        jlTituloCliente = new javax.swing.JLabel();
        jlTituloProduto = new javax.swing.JLabel();
        jlPesquisaCliente = new javax.swing.JLabel();
        jtfBarraPesquisaCliente = new javax.swing.JTextField();
        jbPesqCliente = new javax.swing.JButton();
        jcbTodosClientes = new javax.swing.JCheckBox();
        jcbTodosProdutos = new javax.swing.JCheckBox();
        jbPesqProduto = new javax.swing.JButton();
        jtfBarraPesquisaProduto = new javax.swing.JTextField();
        jlPesquisaProduto = new javax.swing.JLabel();
        jlnomeSobrenome = new javax.swing.JLabel();
        jlValorNomeSobrenome = new javax.swing.JLabel();
        jlcpfCliente = new javax.swing.JLabel();
        jlValorCPF = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jlEnderecoCompleto = new javax.swing.JLabel();
        jlValorFones = new javax.swing.JLabel();
        jlTelefoneCelular = new javax.swing.JLabel();
        jlProdutosComprados = new javax.swing.JLabel();
        jbAdicionaProduto = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtProdutosComprados = new javax.swing.JTable();
        jlDadosComprador = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jbRemoveProduto = new javax.swing.JButton();
        jlStatusPago = new javax.swing.JLabel();
        jcbStatusPagamento = new javax.swing.JComboBox<>();
        jlValorTotalComprado = new javax.swing.JLabel();
        jbFinalizaCompra = new javax.swing.JButton();
        jbCancelaCompra = new javax.swing.JButton();
        jldataCompra = new javax.swing.JLabel();
        jlDataAtual = new javax.swing.JLabel();
        jlStatusEntrega = new javax.swing.JLabel();
        jcbStatusEntrega = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cod Revista", "Ciclo", "Descrição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProdutos);

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Sobrenome", "CPF", "Endereço", "Fones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtClientes);

        jlTituloCompra.setText("Compra");

        jlTituloCliente.setText("Selecionar Cliente");

        jlTituloProduto.setText("Selecionar Produtos");

        jlPesquisaCliente.setText("Pesquisar:");

        jtfBarraPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBarraPesquisaClienteActionPerformed(evt);
            }
        });

        jbPesqCliente.setText("Pesquisar");
        jbPesqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesqClienteActionPerformed(evt);
            }
        });

        jcbTodosClientes.setText("Todos");
        jcbTodosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTodosClientesActionPerformed(evt);
            }
        });

        jcbTodosProdutos.setText("Todos");
        jcbTodosProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTodosProdutosActionPerformed(evt);
            }
        });

        jbPesqProduto.setText("Pesquisar");
        jbPesqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesqProdutoActionPerformed(evt);
            }
        });

        jtfBarraPesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBarraPesquisaProdutoActionPerformed(evt);
            }
        });

        jlPesquisaProduto.setText("Pesquisar:");

        jlnomeSobrenome.setText("Nome Completo:");

        jlValorNomeSobrenome.setText("nomeESobrenome");
        jlValorNomeSobrenome.setToolTipText("");
        jlValorNomeSobrenome.setVisible(false);

        jlcpfCliente.setText("CPF:");

        jlValorCPF.setText("cpfCliente");
        jlValorCPF.setToolTipText("");
        jlValorCPF.setVisible(false);

        jlEndereco.setText("Endereço:");

        jlEnderecoCompleto.setText("enderecoCliente");
        jlEnderecoCompleto.setToolTipText("");
        jlEnderecoCompleto.setVisible(false);

        jlValorFones.setText("telefoneECelular");
        jlValorFones.setToolTipText("");
        jlValorFones.setVisible(false);

        jlTelefoneCelular.setText("Fones:");

        jlProdutosComprados.setText("Produtos Comprados");

        jbAdicionaProduto.setText("Adicionar Produto");
        jbAdicionaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionaProdutoActionPerformed(evt);
            }
        });

        jtProdutosComprados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Descrição", "Pagamento", "Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtProdutosComprados);

        jlDadosComprador.setText("Dados do Comprador");

        jlTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlTotal.setText("Valor Total:");

        jbRemoveProduto.setText("Remover da Compra");
        jbRemoveProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoveProdutoActionPerformed(evt);
            }
        });

        jlStatusPago.setText("Estado de Pagamento:");

        jcbStatusPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Pendente" }));
        jcbStatusPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStatusPagamentoActionPerformed(evt);
            }
        });

        jlValorTotalComprado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlValorTotalComprado.setText("R$ 0.0");
        jlValorTotalComprado.setName(""); // NOI18N

        jbFinalizaCompra.setText("Finalizar Compra");
        jbFinalizaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizaCompraActionPerformed(evt);
            }
        });

        jbCancelaCompra.setText("Cancelar");
        jbCancelaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelaCompraActionPerformed(evt);
            }
        });

        jldataCompra.setText("Data da Compra:");

        jlDataAtual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlDataAtual.setText("dataAtual");
        jlDataAtual.setToolTipText("");
        jlDataAtual.setVisible(false);

        jlStatusEntrega.setText("Entrega:");

        jcbStatusEntrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregue", "Pendente" }));
        jcbStatusEntrega.setToolTipText("");
        jcbStatusEntrega.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jlTituloCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTituloProduto)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(jlTituloCompra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlPesquisaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBarraPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPesqCliente)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTodosClientes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlPesquisaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBarraPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPesqProduto)
                        .addGap(18, 18, 18)
                        .addComponent(jcbTodosProdutos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTelefoneCelular)
                        .addGap(18, 18, 18)
                        .addComponent(jlValorFones))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlnomeSobrenome)
                        .addGap(18, 18, 18)
                        .addComponent(jlValorNomeSobrenome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEnderecoCompleto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlcpfCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlValorCPF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbAdicionaProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlTotal)
                        .addGap(18, 18, 18)
                        .addComponent(jlValorTotalComprado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRemoveProduto)
                        .addContainerGap())
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jlDadosComprador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlProdutosComprados)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jldataCompra)
                .addGap(18, 18, 18)
                .addComponent(jlDataAtual)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlStatusPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbStatusPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jbFinalizaCompra)
                            .addGap(130, 130, 130)
                            .addComponent(jbCancelaCompra)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jlStatusEntrega)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcbStatusEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(355, 355, 355)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlTituloCompra)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfBarraPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbPesqCliente)
                            .addComponent(jlPesquisaCliente)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlTituloCliente)
                            .addComponent(jlTituloProduto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTodosClientes)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlPesquisaProduto)
                                .addComponent(jtfBarraPesquisaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbPesqProduto)
                                .addComponent(jcbTodosProdutos)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStatusPago)
                    .addComponent(jcbStatusPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdicionaProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlStatusEntrega)
                    .addComponent(jcbStatusEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProdutosComprados)
                    .addComponent(jlDadosComprador))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlnomeSobrenome)
                            .addComponent(jlValorNomeSobrenome))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlcpfCliente)
                            .addComponent(jlValorCPF))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEndereco)
                            .addComponent(jlEnderecoCompleto)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbRemoveProduto)
                                    .addComponent(jlTotal)
                                    .addComponent(jlValorTotalComprado))
                                .addGap(33, 33, 33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlTelefoneCelular)
                                    .addComponent(jlValorFones))
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jldataCompra)
                            .addComponent(jlDataAtual))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbFinalizaCompra)
                            .addComponent(jbCancelaCompra))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfBarraPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBarraPesquisaClienteActionPerformed
        
    }//GEN-LAST:event_jtfBarraPesquisaClienteActionPerformed

    private void jtfBarraPesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBarraPesquisaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBarraPesquisaProdutoActionPerformed

    private void jbFinalizaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizaCompraActionPerformed
        if(cliente!=null){
            List<Integer> ids = new ArrayList<>();
            //pega todos os ids
            for(int i=0;i<jtProdutosComprados.getModel().getRowCount();i++){
                ids.add((Integer)jtProdutosComprados.getModel().getValueAt(i, 0));
            }
            int idCliente = (int)jtClientes.getModel().getValueAt(jtClientes.getSelectedRow(), 0);
            new CompraDAO().finalizarCompra(ids,idCliente,listaPag,listaEnt,dataAtual);
            //new CompraDAO().finalizarCompra((int)jtClientes.getModel().getValueAt(jtClientes.getSelectedRow(), 0),jtProdutosComprados);
            //JOptionPane.showMessageDialog(null, ids+" "+ (int)jtClientes.getModel().getValueAt(jtClientes.getSelectedRow(), 0));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para finalizar a compra!");
        }
    }//GEN-LAST:event_jbFinalizaCompraActionPerformed

    private void jbPesqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesqClienteActionPerformed
        ClienteDAO pesqCli = new ClienteDAO();
        DefaultTableModel tabela = pesqCli.PesquisarClienteNome(jtfBarraPesquisaCliente.getText());
        jtClientes.setModel(tabela);
    }//GEN-LAST:event_jbPesqClienteActionPerformed

    private void jcbTodosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTodosClientesActionPerformed
        jtClientes.setModel(new ClienteDAO().PesquisarTodos()); 
        if(!jcbTodosClientes.isSelected()){
            ((DefaultTableModel)jtClientes.getModel()).setRowCount(0);
        }
    }//GEN-LAST:event_jcbTodosClientesActionPerformed

    private void jcbTodosProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTodosProdutosActionPerformed
        jtProdutos.setModel(new ProdutoDAO().pesquisarTodos());
        if(!jcbTodosProdutos.isSelected()){
            ((DefaultTableModel)jtProdutos.getModel()).setRowCount(0);
        }
    }//GEN-LAST:event_jcbTodosProdutosActionPerformed

    private void jcbStatusPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStatusPagamentoActionPerformed
        
    }//GEN-LAST:event_jcbStatusPagamentoActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        cliente = new ClienteDAO().pesquisarClienteID((int)(jtClientes.getValueAt(jtClientes.getSelectedRow(), 0)));
        if(cliente!=null){
            jlValorNomeSobrenome.setVisible(true);
            jlValorCPF.setVisible(true);
            jlEnderecoCompleto.setVisible(true);
            jlValorFones.setVisible(true);
            jlDataAtual.setVisible(true);
            jcbStatusEntrega.setVisible(true);
            jlValorNomeSobrenome.setText(cliente.getNome()+" "+cliente.getSobrenome());
            jlValorCPF.setText(cliente.getCpf());
            jlEnderecoCompleto.setText("Rua: "+cliente.getRua()+", nº: "+cliente.getNumero()+", Bairro: "+cliente.getBairro());
            jlValorFones.setText("Tel: "+cliente.getTelefone()+", Cel: "+cliente.getCelular());
            dataAtual = new Timestamp(System.currentTimeMillis());
            jlDataAtual.setText(df.format(dataAtual));
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente da tabela!");
        }
    }//GEN-LAST:event_jtClientesMouseClicked

    private void jtProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProdutosMouseClicked
        //atualiza o objeto produto para o que está selecionado na tabela no momento
        produto = new ProdutoDAO().pesquisarProdutoID((int)(jtProdutos.getValueAt(jtProdutos.getSelectedRow(), 0)));        
        /*if(produto!=null){
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto da tabela!");
        }*/
    }//GEN-LAST:event_jtProdutosMouseClicked

    private void jbAdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionaProdutoActionPerformed
        //int posicao = (int)(jtProdutos.getValueAt(jtProdutos.getSelectedRowCount(), 0));
        //Produto prod = new ProdutoDAO().pesquisarProdutoID(posicao);
        if(produto!=null){
            String estadoPag = String.valueOf(jcbStatusPagamento.getSelectedItem());
            String estadoEnt = String.valueOf(jcbStatusEntrega.getSelectedItem());
            listaPag.add(estadoPag);
            listaProd.add(produto);
            listaEnt.add(estadoEnt);
            total += listaProd.get(listaProd.lastIndexOf(produto)).getValor();
            Object dados[] = {produto.getId_produto(),produto.getNome_produto(),produto.getValor(),produto.getDescricao(),estadoPag,estadoEnt}; 
            ((DefaultTableModel)jtProdutosComprados.getModel()).addRow(dados);
                jlValorTotalComprado.setText("R$ "+String.format("%.2f",total));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto antes de adicioná-lo!");
        }
    }//GEN-LAST:event_jbAdicionaProdutoActionPerformed

    private void jbRemoveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoveProdutoActionPerformed
        int posicaoTab = jtProdutosComprados.getSelectionModel().getMaxSelectionIndex();
        if(posicaoTab>=0){
            //atualiza valor
            total-=listaProd.get(posicaoTab).getValor();
            jlValorTotalComprado.setText("R$ "+String.format("%.2f",(total)));
            listaPag.remove(posicaoTab);
            listaProd.remove(posicaoTab);
            listaEnt.remove(posicaoTab);
            ((DefaultTableModel)jtProdutosComprados.getModel()).removeRow(posicaoTab);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto da tabela antes de remover!");
       }
    }//GEN-LAST:event_jbRemoveProdutoActionPerformed

    private void jbCancelaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelaCompraActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCancelaCompraActionPerformed

    private void jbPesqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesqProdutoActionPerformed
        ProdutoDAO pesqProd = new ProdutoDAO();
        produto = pesqProd.pesquisarProduto(jtfBarraPesquisaProduto.getText());
        DefaultTableModel tabela = new DefaultTableModel();
        Object dados[] = {produto.getId_produto(),produto.getNome_produto(),produto.getCodigo_revista(),produto.getCiclo_campanha(),produto.getDescricao(),produto.getValor()};
        tabela.setColumnIdentifiers(new String[]{"ID","Nome","Cod Revista","Ciclo","Descrição","Valor"});
        tabela.addRow(dados);
        jtProdutos.setModel(tabela);
    }//GEN-LAST:event_jbPesqProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbAdicionaProduto;
    private javax.swing.JButton jbCancelaCompra;
    private javax.swing.JButton jbFinalizaCompra;
    private javax.swing.JButton jbPesqCliente;
    private javax.swing.JButton jbPesqProduto;
    private javax.swing.JButton jbRemoveProduto;
    private javax.swing.JComboBox<String> jcbStatusEntrega;
    private javax.swing.JComboBox<String> jcbStatusPagamento;
    private javax.swing.JCheckBox jcbTodosClientes;
    private javax.swing.JCheckBox jcbTodosProdutos;
    private javax.swing.JLabel jlDadosComprador;
    private javax.swing.JLabel jlDataAtual;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEnderecoCompleto;
    private javax.swing.JLabel jlPesquisaCliente;
    private javax.swing.JLabel jlPesquisaProduto;
    private javax.swing.JLabel jlProdutosComprados;
    private javax.swing.JLabel jlStatusEntrega;
    private javax.swing.JLabel jlStatusPago;
    private javax.swing.JLabel jlTelefoneCelular;
    private javax.swing.JLabel jlTituloCliente;
    private javax.swing.JLabel jlTituloCompra;
    private javax.swing.JLabel jlTituloProduto;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlValorCPF;
    private javax.swing.JLabel jlValorFones;
    private javax.swing.JLabel jlValorNomeSobrenome;
    private javax.swing.JLabel jlValorTotalComprado;
    private javax.swing.JLabel jlcpfCliente;
    private javax.swing.JLabel jldataCompra;
    private javax.swing.JLabel jlnomeSobrenome;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTable jtProdutosComprados;
    private javax.swing.JTextField jtfBarraPesquisaCliente;
    private javax.swing.JTextField jtfBarraPesquisaProduto;
    // End of variables declaration//GEN-END:variables
}