/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebanking;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Omanshu Mahawar
 */
public class deleteaccount extends javax.swing.JFrame {

    /**
     * Creates new form deleteaccount
     */
    public deleteaccount() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtaccno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtname = new javax.swing.JTextField();
        jtxtgender = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtbalance = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtcardno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtpinno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtdob = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtaddress = new javax.swing.JTextField();
        Show = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("Add New Account");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ebanking/Webp.net-resizeimage (2).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel16.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 0));
        jLabel16.setText("Delete Account");

        jtxtaccno.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtaccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtaccnoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setText("Account No.");

        jtxtname.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnameActionPerformed(evt);
            }
        });

        jtxtgender.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgenderActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Name");

        jtxtbalance.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtbalanceActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("Account Details");

        jtxtcardno.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtcardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcardnoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Balance");

        jtxtpinno.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtpinno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpinnoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setText("Card Number");

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("Customer Details");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Pin Number");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Date of Birth");

        jtxtdob.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtdob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdobActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Gender");

        jtxtaddress.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jtxtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtaddressActionPerformed(evt);
            }
        });

        Show.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtxtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(61, 61, 61)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addGap(3, 3, 3))
                                                    .addComponent(jLabel11))))
                                        .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtcardno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtpinno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jtxtgender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxtaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15))
                                .addComponent(jLabel2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Show, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jtxtaccno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jtxtpinno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jtxtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtcardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Show)
                    .addComponent(delete)
                    .addComponent(back))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtaccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtaccnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtaccnoActionPerformed

    private void jtxtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnameActionPerformed

    private void jtxtgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtgenderActionPerformed

    private void jtxtbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtbalanceActionPerformed

    private void jtxtcardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcardnoActionPerformed

    private void jtxtpinnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpinnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpinnoActionPerformed

    private void jtxtdobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdobActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jtxtdobActionPerformed

    private void jtxtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtaddressActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed

        try
        {
            
            String u = "";
            String p = "";
            String a = "";
            String g = "";
            int pi = 0;
            int cd = 0;
            
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omibbank","root","");
            Statement stmt = con.createStatement();
            int acno = Integer.parseInt(jtxtaccno.getText());
            String query = "select * from newaccount where AccountNo="+acno+"; ";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                u = rs.getString("Name");
                p = rs.getString("DOB");
                a = rs.getString("Adress");
                g = rs.getString("Gender");
                pi = rs.getInt("PinNumber");
                cd = rs.getInt("CardNumber");
            }
            
            jtxtname.setText((u));
            jtxtdob.setText(p);
            jtxtaddress.setText(a);
            jtxtgender.setText(g);
            jtxtpinno.setText(""+pi);
            jtxtcardno.setText(""+cd);
            
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }//GEN-LAST:event_ShowActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omibbank","root","");
            Statement stmt = con.createStatement();
            
            int acno = Integer.parseInt(jtxtaccno.getText());
            String query = "delete from newaccount where AccountNo="+acno+";";
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Account Successfully deleted");
            
            stmt.close();
            con.close();

        }
        catch(Exception e)
        {
            System.out.print(e);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        employeemenu info = new employeemenu();
        info.setVisible(true);

        dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.lodeleteng.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteaccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Show;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtxtaccno;
    private javax.swing.JTextField jtxtaddress;
    private javax.swing.JTextField jtxtbalance;
    private javax.swing.JTextField jtxtcardno;
    private javax.swing.JTextField jtxtdob;
    private javax.swing.JTextField jtxtgender;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtpinno;
    // End of variables declaration//GEN-END:variables
}
