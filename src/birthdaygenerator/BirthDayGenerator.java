/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdaygenerator;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Hasee Amarathunga
 */
public class BirthDayGenerator extends javax.swing.JFrame {

    /**
     * Creates new form BirthDayGenerator
     */
    public BirthDayGenerator() {
        initComponents();
        String id=btnnic.getText();
        
        
    }
    public int getYear() {
        return (1900 + Integer.parseInt(btnnic.getText().substring(0, 2)));
    }
    
    public int getDays() {
        int d = Integer.parseInt(btnnic.getText().substring(2, 5));
        if (d > 500) {
            return (d - 500);
        } else {
            return d;
        }
    }
    
    public String setMonth() {
        int mo = 0, da = 0;
        int days = getDays();
        int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month.length; i++) {
            if (days < month[i]) {
                mo = i + 1;
                da = days;
                break;
            } else {
                days = days - month[i];
            }
        }
        return (mo + "." + da);

    }
    public String getSex() {
        String M = "Male", F = "Female";
        int d = Integer.parseInt(btnnic.getText().substring(2, 5));
        if (d > 500) {
            return F;
        } else {
            return M;
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

        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnGenerator = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnnic = new javax.swing.JTextField();
        Btnreset = new javax.swing.JButton();
        Btnresult = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genderBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        BtnGenerator.setBackground(new java.awt.Color(255, 255, 255));
        BtnGenerator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGeneratorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnGeneratorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnGeneratorMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("GENERATE");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7.png"))); // NOI18N

        javax.swing.GroupLayout BtnGeneratorLayout = new javax.swing.GroupLayout(BtnGenerator);
        BtnGenerator.setLayout(BtnGeneratorLayout);
        BtnGeneratorLayout.setHorizontalGroup(
            BtnGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnGeneratorLayout.createSequentialGroup()
                .addGroup(BtnGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtnGeneratorLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2))
                    .addGroup(BtnGeneratorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BtnGeneratorLayout.setVerticalGroup(
            BtnGeneratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnGeneratorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BtnGeneratorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(16, 16, 16))
        );

        btnnic.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnnic.setForeground(new java.awt.Color(102, 102, 102));
        btnnic.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        btnnic.setToolTipText("");
        btnnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnicActionPerformed(evt);
            }
        });

        Btnreset.setBackground(new java.awt.Color(153, 153, 153));
        Btnreset.setText("Reset");
        Btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnresetActionPerformed(evt);
            }
        });

        Btnresult.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btnresult.setForeground(new java.awt.Color(255, 51, 51));
        Btnresult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btnresult.setText("BirthDay");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Enter NICNo :");

        genderBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        genderBtn.setForeground(new java.awt.Color(102, 102, 102));
        genderBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btnreset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnnic, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(genderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btnresult, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnic, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(BtnGenerator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btnresult, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(genderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnreset)
                    .addComponent(exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void BtnGeneratorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGeneratorMouseClicked
        // TODO add your handling code here:
        if(btnnic.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please Enter NIC-No.");
        }
        else{
            if(btnnic.getText().length()==10){
                Btnresult.setText(getYear()+"."+setMonth());
                String s=getSex();
                genderBtn.setText(s);
            }
            else{
                JOptionPane.showMessageDialog(null,"Please Enter Valid NIC-No.");
            }
        }

    }//GEN-LAST:event_BtnGeneratorMouseClicked

    private void BtnGeneratorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGeneratorMouseEntered
        // TODO add your handling code here:
        setColor(BtnGenerator);
    }//GEN-LAST:event_BtnGeneratorMouseEntered

    private void BtnGeneratorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGeneratorMouseExited
        // TODO add your handling code here:
        resetColor(BtnGenerator);
    }//GEN-LAST:event_BtnGeneratorMouseExited

    private void btnnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnicActionPerformed

    private void BtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnresetActionPerformed
        // TODO add your handling code here:
        btnnic.setText("");
    }//GEN-LAST:event_BtnresetActionPerformed

    
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(255,51,51));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(255,255,255));
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
            java.util.logging.Logger.getLogger(BirthDayGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BirthDayGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BirthDayGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BirthDayGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BirthDayGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnGenerator;
    private javax.swing.JButton Btnreset;
    private javax.swing.JLabel Btnresult;
    private javax.swing.JTextField btnnic;
    private javax.swing.JButton exit;
    private javax.swing.JLabel genderBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
