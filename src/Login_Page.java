
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
        initComponents();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("Driver Not Found");
            //Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_UserName = new javax.swing.JLabel();
        jTextField_UserName = new javax.swing.JTextField();
        jLabel_Password = new javax.swing.JLabel();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jButton_Reset = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        jButton_CreateAccount = new javax.swing.JButton();
        jButton_ForgetPassword = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Login Page");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 100, 22);

        jLabel_UserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_UserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_UserName.setText("User Name");
        jPanel1.add(jLabel_UserName);
        jLabel_UserName.setBounds(40, 100, 80, 17);
        jPanel1.add(jTextField_UserName);
        jTextField_UserName.setBounds(120, 100, 180, 30);

        jLabel_Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password");
        jPanel1.add(jLabel_Password);
        jLabel_Password.setBounds(40, 170, 80, 17);

        jPasswordField_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField_Password.setText("jPasswordField");
        jPanel1.add(jPasswordField_Password);
        jPasswordField_Password.setBounds(120, 170, 180, 30);

        jButton_Login.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Login.setText("Log In");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Login);
        jButton_Login.setBounds(40, 250, 67, 23);

        jButton_Reset.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Reset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_Reset.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Reset);
        jButton_Reset.setBounds(140, 250, 63, 23);

        jButton_Exit.setBackground(new java.awt.Color(102, 102, 102));
        jButton_Exit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_Exit.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Exit);
        jButton_Exit.setBounds(240, 250, 53, 23);

        jButton_CreateAccount.setBackground(new java.awt.Color(0, 102, 102));
        jButton_CreateAccount.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton_CreateAccount.setForeground(new java.awt.Color(204, 204, 204));
        jButton_CreateAccount.setText("Create An Acount");
        jButton_CreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreateAccountActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_CreateAccount);
        jButton_CreateAccount.setBounds(220, 60, 120, 10);

        jButton_ForgetPassword.setBackground(new java.awt.Color(0, 102, 102));
        jButton_ForgetPassword.setForeground(new java.awt.Color(204, 204, 204));
        jButton_ForgetPassword.setText("Forget Password");
        jPanel1.add(jButton_ForgetPassword);
        jButton_ForgetPassword.setBounds(100, 300, 130, 23);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Desktop\\Yamaha.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1320, 830);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        
        try {
            // TODO add your handling code here:
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
            PreparedStatement pstmt = con.prepareStatement("select * from firstpage where User_name = ? and   Password = ?");
            pstmt.setString(1, jTextField_UserName.getText().trim());
            pstmt.setString(2, jPasswordField_Password.getText().trim());
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
            //if(jTextField_UserName.equals("name") && jPasswordField_Password.equals("password")){
               JOptionPane.showMessageDialog(rootPane, "Login Successful");
               Admin_Page ad = new Admin_Page();
               ad.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Login Failed");
            }
            System.out.println("Successful");
        } catch (SQLException ex) {
            //Logger.getLogger(Login_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        // TODO add your handling code here:
        jTextField_UserName.setText(null);
        jPasswordField_Password.setText(null);
    }//GEN-LAST:event_jButton_ResetActionPerformed

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_CreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreateAccountActionPerformed
        // TODO add your handling code here:
        this.hide();
       Registration rg = new Registration();
        rg.setVisible(true);
    }//GEN-LAST:event_jButton_CreateAccountActionPerformed

    /**
     * @param args the command line arguments
     */ 
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Login_Page().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CreateAccount;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_ForgetPassword;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_UserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_UserName;
    // End of variables declaration//GEN-END:variables
}