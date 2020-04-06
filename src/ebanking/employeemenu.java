/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebanking;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Omanshu Mahawar
 */
public class employeemenu extends javax.swing.JFrame {

    /**
     * Creates new form employeemenu
     */
    public employeemenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addaccount = new javax.swing.JButton();
        cusacdetails = new javax.swing.JButton();
        deleteacc = new javax.swing.JButton();
        depmoney = new javax.swing.JButton();
        newemployee = new javax.swing.JButton();
        fixeddeposit = new javax.swing.JButton();
        deleteemployee = new javax.swing.JButton();
        loan = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Employee Main Menu");

        addaccount.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        addaccount.setText("Add Account");
        addaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaccountActionPerformed(evt);
            }
        });

        cusacdetails.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        cusacdetails.setText("Customer A/c Details");
        cusacdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusacdetailsActionPerformed(evt);
            }
        });

        deleteacc.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        deleteacc.setText("Delete Account");
        deleteacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteaccActionPerformed(evt);
            }
        });

        depmoney.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        depmoney.setText("Deposit Money");
        depmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depmoneyActionPerformed(evt);
            }
        });

        newemployee.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        newemployee.setText("Add New Employee");
        newemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newemployeeActionPerformed(evt);
            }
        });

        fixeddeposit.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        fixeddeposit.setText("Fixed Deposit");
        fixeddeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixeddepositActionPerformed(evt);
            }
        });

        deleteemployee.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        deleteemployee.setText("Delete Employee");
        deleteemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteemployeeActionPerformed(evt);
            }
        });

        loan.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        loan.setText("Loan");
        loan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(255, 0, 51));
        EXIT.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ebanking/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel7.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(760, 760, 760)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(addaccount, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(cusacdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(deleteacc, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(depmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(newemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(fixeddeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(deleteemployee, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(loan, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(690, 690, 690)
                        .addComponent(EXIT)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addaccount)
                    .addComponent(cusacdetails))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteacc)
                    .addComponent(depmoney))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newemployee)
                    .addComponent(fixeddeposit))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteemployee)
                    .addComponent(loan))
                .addGap(21, 21, 21)
                .addComponent(EXIT)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccountActionPerformed
        addnewaccount info = new addnewaccount();
        info.setVisible(true);

        dispose();
    }//GEN-LAST:event_addaccountActionPerformed

    private void cusacdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusacdetailsActionPerformed
        // TODO add your handling code here:
        Showaccdetails info = new Showaccdetails();
        info.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cusacdetailsActionPerformed

    private void deleteaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteaccActionPerformed
        // TODO add your handling code here:
        deleteaccount info = new deleteaccount();
        info.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_deleteaccActionPerformed

    private void depmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depmoneyActionPerformed
        // TODO add your handling code here:
        DepositMoney info = new DepositMoney();
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_depmoneyActionPerformed

    private void newemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newemployeeActionPerformed
        // TODO add your handling code here:
        jaddnewemployee info = new jaddnewemployee();
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_newemployeeActionPerformed

    private void fixeddepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixeddepositActionPerformed
        // TODO add your handling code here:
        jfixeddeposit info = new jfixeddeposit();
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_fixeddepositActionPerformed

    private void deleteemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteemployeeActionPerformed
        
        Deleteemployee info = new Deleteemployee();
        info.setVisible(true);
        dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_deleteemployeeActionPerformed

    private void loanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanActionPerformed
        // TODO add your handling code here:
        loan info = new loan();
        info.setVisible(true);
        dispose();
    }//GEN-LAST:event_loanActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(employeemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeemenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JButton addaccount;
    private javax.swing.JButton cusacdetails;
    private javax.swing.JButton deleteacc;
    private javax.swing.JButton deleteemployee;
    private javax.swing.JButton depmoney;
    private javax.swing.JButton fixeddeposit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loan;
    private javax.swing.JButton newemployee;
    // End of variables declaration//GEN-END:variables
}
