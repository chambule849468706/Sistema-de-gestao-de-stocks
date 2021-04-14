/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Registar;

import Model.Dao.ModulodConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Registar_Fornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registar_Fornecedor
     */
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Registar_Fornecedor() {
        initComponents();
        conexao = ModulodConexao.conector();
    }

    private void registar() {
        String sql = "insert into tbFornecedor(nome,bairro,decrisao,telefone) values(?,?,?,?)";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNomeFornecedor.getText());
            pst.setString(2, txtDescrisao.getText());
            pst.setString(3, txtBairro.getText());
            pst.setString(4, txtTelefone.getText());
            int adicionado = pst.executeUpdate();
            if (adicionado > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor registado com sucesso!");
                txtDescrisao.setText("");
                txtNomeFornecedor.setText("");
                txtBairro.setText("");
                txtTelefone.setText("");
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
        lblNome = new javax.swing.JLabel();
        txtNomeFornecedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblDescrisao = new javax.swing.JLabel();
        txtDescrisao = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btnRegistar = new javax.swing.JButton();

        setTitle("Registar fornecedor");

        pnelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNome.setText("* Nome do fornecedor");

        txtNomeFornecedor.setBorder(null);

        lblDescrisao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblDescrisao.setText("* Descrisão dos serviços ");

        txtDescrisao.setBorder(null);

        lblBairro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBairro.setText("* Bairro");

        txtBairro.setBorder(null);

        lblTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTelefone.setText("* Telefone");

        txtTelefone.setBorder(null);

        btnRegistar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRegistar.setText("Registar");
        btnRegistar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnelPrincipalLayout = new javax.swing.GroupLayout(pnelPrincipal);
        pnelPrincipal.setLayout(pnelPrincipalLayout);
        pnelPrincipalLayout.setHorizontalGroup(
            pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistar)
                    .addGroup(pnelPrincipalLayout.createSequentialGroup()
                        .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBairro)
                            .addComponent(lblDescrisao)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addComponent(txtNomeFornecedor)
                            .addComponent(txtDescrisao)
                            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))))))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pnelPrincipalLayout.setVerticalGroup(
            pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelPrincipalLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescrisao)
                    .addComponent(txtDescrisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
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

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        // TODO add your handling code here:
        registar();
    }//GEN-LAST:event_btnRegistarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblDescrisao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnelPrincipal;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtDescrisao;
    private javax.swing.JTextField txtNomeFornecedor;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
