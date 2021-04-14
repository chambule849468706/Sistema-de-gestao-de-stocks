/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Consultar;

import Model.Dao.ModulodConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Consultar_Fornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Consultar_Fornecedor
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Consultar_Fornecedor() {
        initComponents();
        conexao = ModulodConexao.conector();
        consultar();
    }

    private void consultar() {
        String sql = "Select * from tbFornecedor";
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel modeloTb = (DefaultTableModel) tbleFornecedor.getModel();
            modeloTb.setNumRows(0);
            while (rs.next()) {
                modeloTb.addRow(new Object[]{rs.getString("nome"), rs.getString("bairro"), rs.getString("decrisao"), rs.getString("telefone")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnelPrincipal = new javax.swing.JPanel();
        txtPesquisar1 = new javax.swing.JTextField();
        jSeparatorPesquisar1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbleFornecedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Consultar fornecedor");

        pnelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        txtPesquisar1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPesquisar1.setText("Pesquisar fornecedor");
        txtPesquisar1.setBorder(null);
        txtPesquisar1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesquisar1FocusGained(evt);
            }
        });

        tbleFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do fornecedor", "Descrisão dos serviços", "Bairro", "Contacto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbleFornecedor);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/Search.png"))); // NOI18N

        javax.swing.GroupLayout pnelPrincipalLayout = new javax.swing.GroupLayout(pnelPrincipal);
        pnelPrincipal.setLayout(pnelPrincipalLayout);
        pnelPrincipalLayout.setHorizontalGroup(
            pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPesquisar1)
                    .addComponent(jSeparatorPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnelPrincipalLayout.setVerticalGroup(
            pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisar1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesquisar1FocusGained
        // TODO add your handling code here:
        txtPesquisar1.setText("");
    }//GEN-LAST:event_txtPesquisar1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorPesquisar1;
    private javax.swing.JPanel pnelPrincipal;
    private javax.swing.JTable tbleFornecedor;
    private javax.swing.JTextField txtPesquisar1;
    // End of variables declaration//GEN-END:variables
}
