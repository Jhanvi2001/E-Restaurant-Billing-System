/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Circuit Lab
 */
public class new_password extends javax.swing.JFrame {

    /**
     * Creates new form new_password
     */
    public new_password() {
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
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        number = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 177, 108, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 125, 108, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mobile No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DIL HAI HINDUSTANI RESTAURANT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 110, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 230, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Circuit Lab\\OneDrive\\Desktop\\Restaurant\\Restaurant\\src\\restaurant\\child-holding-handful-candy_120602-168.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("CallToPrintStackTrace")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String p, m,c;
         p=jPasswordField1.getText();
         c=jPasswordField2.getText();
         
         m=number.getText();
       
           
    String jdbcUrl = "jdbc:mysql://localhost:3306/restaurant";
    String username = "root";
    String password = "2511";
    String sql = "update register set password=? where m_number=?";
    String s="update register set c_password=? where m_number=?";
 boolean valid = true;
        
               
         
         
         if (p.length() > 15 || p.length() < 8)
                {
                       JOptionPane.showMessageDialog(null,"Password should be less than 15 and more than 8 characters in length.");
                        valid = false;
                }
                
               
                String upperCaseChars = "(.*[A-Z].*)";
                if (!p.matches(upperCaseChars ))
                {
                        JOptionPane.showMessageDialog(null,"Password should contain atleast one upper case alphabet");
                        valid = false;
                }
                String lowerCaseChars = "(.*[a-z].*)";
                if (!p.matches(lowerCaseChars ))
                {
                        JOptionPane.showMessageDialog(null,"Password should contain atleast one lower case alphabet");
                        valid = false;
                }
                String numbers = "(.*[0-9].*)";
                if (!p.matches(numbers ))
                {
                        JOptionPane.showMessageDialog(null,"Password should contain atleast one number.");
                        valid = false;
                }
                String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
                if (!p.matches(specialChars ))
                {
                   JOptionPane.showMessageDialog(null,"Password should contain atleast one special character");
                    valid = false;
                }
                if(!c.equals(p))
                {
                        JOptionPane.showMessageDialog(null,"Password should match with confirm password");
                        valid = false;
                }
                if (valid)
                {   
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(sql);) {
      stmt.setString(1, p);
       
       stmt.setString(2, m);
      stmt.executeUpdate();
      
      System.out.println("Database updated successfully ");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
        PreparedStatement stmt = conn.prepareStatement(s);) {
      stmt.setString(1, c);
       
       stmt.setString(2, m);
      stmt.executeUpdate();
      
      System.out.println("Database updated  ");
    } catch (SQLException e) {
      e.printStackTrace();
    }
   JOptionPane.showMessageDialog(null,"successfully registered password");
   login l=new login();
   l.setVisible(true);
                    dispose();
   
                }
                else{
                    JOptionPane.showMessageDialog(null,"Try again");
                    new_password r=new  new_password();
                    r.setVisible(true);
                    dispose();
                }
  


               

            
       
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(new_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    public static javax.swing.JTextField number;
    // End of variables declaration//GEN-END:variables
}
