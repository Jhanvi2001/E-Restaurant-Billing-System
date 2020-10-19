/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import static javafx.application.Platform.exit;
import javax.swing.JOptionPane;

/**
 *
 * @author virad
 */
public class Timeslot extends javax.swing.JFrame {

    /**
     * Creates new form Timeslot
     */
    public Timeslot() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        mon = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aut = new javax.swing.JTextArea();
        ava = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        hr = new javax.swing.JTextField();
        min = new javax.swing.JTextField();
        tab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        totalt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        book = new javax.swing.JButton();
        ap = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ENTER NAME             :-");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Enter Time Slot          :-");

        name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        mon.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        year.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("SELECT DATE            :-");

        aut.setColumns(20);
        aut.setRows(5);
        jScrollPane1.setViewportView(aut);

        ava.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ava.setText("Check Availability");
        ava.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avaMouseClicked(evt);
            }
        });
        ava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Time Slot                       :-");

        hr.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        min.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        tab.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Min");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Hr");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Table no");

        totalt.setColumns(20);
        totalt.setRows(5);
        jScrollPane2.setViewportView(totalt);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Enter Mobile Num        :-");

        num.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        book.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        book.setText("BOOK NOW");
        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookMouseEntered(evt);
            }
        });
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        ap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(num))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(ava)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(book)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 277, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mon, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(date)
                    .addComponent(year))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ava, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void avaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avaActionPerformed
        // TODO add your handling code here:
        
        
        totalt.setEnabled(true);
        aut.setEnabled(true);
        
        totalt.append("\n  Welcome To DIL HAI HINDUSTANI RESTAURANT");
        totalt.append("\n");
        totalt.append("\n\n  Total Slots");
        totalt.append("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        totalt.append("\n Time                                      Table ");
        totalt.append("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        totalt.append("\n 10:30 am                                Table1 ");
        totalt.append("\n 10:30 am                                Table2 ");
        totalt.append("\n 10:30 am                                Table3 ");
        totalt.append("\n 10:30 am                                Table4 ");
        totalt.append("\n 10:30 am                                Table5 \n");
        totalt.append("\n 11:30 am                                Table1 ");
        totalt.append("\n 11:30 am                                Table2 ");
        totalt.append("\n 11:30 am                                Table3 ");
        totalt.append("\n 11:30 am                                Table4 ");
        totalt.append("\n 11:30 am                                Table5 \n");
        totalt.append("\n 12:30 pm                                Table1 ");
        totalt.append("\n 12:30 pm                                Table2 ");
        totalt.append("\n 12:30 pm                                Table3 ");
        totalt.append("\n 12:30 pm                                Table4 ");
        totalt.append("\n 12:30 pm                                Table5 \n");
        totalt.append("\n 1:30 pm                                 Table1 ");
        totalt.append("\n 1:30 pm                                 Table2 ");
        totalt.append("\n 1:30 pm                                 Table3 ");
        totalt.append("\n 1:30 pm                                 Table4 ");
        totalt.append("\n 1:30 pm                                 Table5 \n");
        totalt.append("\n 2:30 pm                                 Table1 ");
        totalt.append("\n 2:30 pm                                 Table2 ");
        totalt.append("\n 2:30 pm                                 Table3 ");
        totalt.append("\n 2:30 pm                                 Table4 ");
        totalt.append("\n 2:30 pm                                 Table5 \n");
        totalt.append("\n 7:00 pm                                 Table1 ");
        totalt.append("\n 7:00 pm                                 Table2 ");
        totalt.append("\n 7:00 pm                                 Table3 ");
        totalt.append("\n 7:00 pm                                 Table4 ");
        totalt.append("\n 7:00 pm                                 Table5 \n");
        totalt.append("\n 8:15 pm                                 Table1 ");
        totalt.append("\n 8:15 pm                                 Table2 ");
        totalt.append("\n 8:15 pm                                 Table3 ");
        totalt.append("\n 8:15 pm                                 Table4 ");
        totalt.append("\n 8:15 pm                                 Table5 \n");
        totalt.append("\n 9:30 pm                                 Table1 ");
        totalt.append("\n 9:30 pm                                 Table2 ");
        totalt.append("\n 9:30 pm                                 Table3 ");
        totalt.append("\n 9:30 pm                                 Table4 ");
        totalt.append("\n 9:30 pm                                 Table5 \n");
        totalt.append("\n 10:45 pm                                Table1 ");
        totalt.append("\n 10:45 pm                                Table2 ");
        totalt.append("\n 10:45 pm                                Table3 ");
        totalt.append("\n 10:45 pm                                Table4 ");
        totalt.append("\n 10:45 pm                                Table5 \n");
        totalt.append("\n 12:00 am                                Table1 ");
        totalt.append("\n 12:00 am                                Table2 ");
        totalt.append("\n 12:00 am                                Table3 ");
        totalt.append("\n 12:00 am                                Table4 ");
        totalt.append("\n 12:00 am                                Table5 ");
                
        
        try{
            
            FileReader r = new FileReader("D:\\Restaurant (1)\\Restaurant System project\\Time slot.txt");
            BufferedReader bf = new BufferedReader(r);
            aut.read(bf, null);
            bf.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         
        
    }//GEN-LAST:event_avaActionPerformed

    private void avaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avaMouseClicked

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
        

        
        String n1 = name.getText();
        String n2 = num.getText();
        String n3 = date.getText();
        String n4 = mon.getText();
        String n5 = year.getText();
        String n6 = hr.getText();
        String n7 = min.getText();
        String n8 = tab.getText();

        
        try{
            
            FileWriter w = new FileWriter("D:\\Restaurant (1)\\Restaurant System project\\Time slot.txt" , true);
            BufferedWriter f = new BufferedWriter(w);
           
            w.write("Date\t\t\t" + "Allocate Time Slot");
            w.write("\n" + n3 + "/" + n4 + "/" + n5 + "\t\t\t" + n6 + "/" + n7 + "/    table no:-" + n8);
            
            FileWriter w1 = new FileWriter("D:\\Restaurant (1)\\Restaurant System project\\fTime slot.txt" , true);
            BufferedWriter f1 = new BufferedWriter(w);
           
            w1.write("Name\t\t\t"+"Number\t\t\t"+"Date\t\t\t\t" + "Allocate Time Slot");
            w1.write("\n" + n1 + "\t\t\t"+ n2 + "\t\t\t" + n3 + "/" + n4 + "/" + n5 + "\t\t\t" + n6 + "/" + n7 + "/    table no:-" + n8);
            

            JOptionPane.showMessageDialog(null, "Successfully allocate\n See you at the restaurant");
            w.close();
            f.close();
            w1.close();
            f1.close();
            exit();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(rootPane, "Error404");
            
        }
        exit e=new exit();
        e.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bookActionPerformed

    private void bookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bookMouseEntered

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookMouseClicked

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
            java.util.logging.Logger.getLogger(Timeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Timeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Timeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Timeslot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Timeslot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ap;
    private javax.swing.JTextArea aut;
    private javax.swing.JButton ava;
    private javax.swing.JButton book;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JTextField date;
    public javax.swing.JTextField hr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField min;
    public javax.swing.JTextField mon;
    public javax.swing.JTextField name;
    public javax.swing.JTextField num;
    public javax.swing.JTextField tab;
    private javax.swing.JTextArea totalt;
    public javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
