/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register_design;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author urbennoroac
 */
public class AlumnosActualizar extends javax.swing.JFrame {

    /**
     * Creates new form AlumnosActualizar
     */
    public AlumnosActualizar() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField_username = new javax.swing.JTextField();
        jTextField_pass1 = new javax.swing.JTextField();
        jTextField_pass2 = new javax.swing.JTextField();
        jTextField_phone = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_mail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(205, 164, 52));

        jButton1.setBackground(new java.awt.Color(0, 84, 140));
        jButton1.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField_username.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N

        jTextField_pass1.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N

        jTextField_pass2.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N

        jTextField_phone.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jTextField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_phoneActionPerformed(evt);
            }
        });

        jTextField_name.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel1.setText("Nombre Completo: ");

        jLabel2.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel2.setText("Telefono: ");

        jLabel3.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel3.setText("Usario: ");

        jLabel4.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña: ");

        jLabel5.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel5.setText("Confirmar Contraseña: ");

        jTextField_mail.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("AppleGothic", 0, 18)); // NOI18N
        jLabel6.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(jTextField_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(jTextField_mail))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String usern = jTextField_username.getText();
        String pass1 = jTextField_pass1.getText();
        String Phone = jTextField_phone.getText();
        String name = jTextField_name.getText();
        String mail = jTextField_mail.getText();
        if(verifyFields()){
             try {
                 if(!checkUsername(usern)){
                     PreparedStatement ps;
                     ResultSet rs;
                     String registerUser = " UPDATE users SET Nombre =?, username =?, password = ?, Telefono = ?, email = ? WHERE id = ?";
                     
                     ps = My_CNX.getConnection().prepareStatement(registerUser);
                     ps.setString(5, MenuTareasAlu.str1);
                     ps.setString(1, name);
                     ps.setString(2, usern);
                     ps.setString(3, pass1);
                     ps.setString(4, Phone);
                     
                     if(ps.executeUpdate() != 0){
                         JOptionPane.showMessageDialog(null, "Su cuenta ha sido actualizada");
                         
                     }else{
                         JOptionPane.showMessageDialog(null, "Error");
                     }
                     //ps.setString(5, MenuTareasAlu.str1);
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(AlumnosActualizar.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_phoneActionPerformed

    
     public boolean verifyFields(){
        String fname = jTextField_name.getText();
        String uname = jTextField_username.getText();
        String phone = jTextField_phone.getText();
        String pass1 = jTextField_pass1.getText();
        String pass2 = jTextField_pass2.getText();
        String mail = jTextField_mail.getText();
        
        if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals("") || mail.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Uno o mas de los campos esta vacio", "Campos vacios", 2);
            return false;
        }
        else if(!pass1.equals(pass2)){
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Confirmar contraseña", 2);
            return false;
            
        }
        else{
            return true;
            
        }
    }
     
     public boolean checkUsername(String username) throws SQLException{
         PreparedStatement st;
         ResultSet rs;
         boolean username_exist = false;
         
         String query = "SELECT * FROM users WHERE username = ?";
         try{
         st = My_CNX.getConnection().prepareStatement(query);
         st.setString(1, username);
         rs = st.executeQuery();
         
         if(rs.next()){
             username_exist = true;
             JOptionPane.showMessageDialog(null, "Este nombre de usuario esta en uso");
         }
         
          } catch (SQLException ex) {
                Logger.getLogger(AlumnosActualizar.class.getName()).log(Level.SEVERE, null, ex);
            }
         return username_exist;
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
            java.util.logging.Logger.getLogger(AlumnosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosActualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosActualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_mail;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_pass1;
    private javax.swing.JTextField jTextField_pass2;
    private javax.swing.JTextField jTextField_phone;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
