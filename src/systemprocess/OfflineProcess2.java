/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemprocess;

/**
 *
 * @author Sazzad
 */
public class OfflineProcess2 extends javax.swing.JFrame {

    /**
     * Creates new form OfflineProcess2
     */
    public OfflineProcess2() {
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField1.setText("Application name  :");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 60, 130, 30);

        jTextField2.setText("Application name  :");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(90, 120, 130, 30);

        jTextField3.setText("Application name  :");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(90, 180, 130, 30);

        jTextField4.setText("Application name  :");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(90, 240, 130, 30);

        jTextField5.setText("Application name  :");
        jPanel1.add(jTextField5);
        jTextField5.setBounds(90, 302, 130, 30);

        jTextField6.setText("Application name  :");
        jPanel1.add(jTextField6);
        jTextField6.setBounds(90, 360, 130, 30);

        jTextField7.setText("Application name  :");
        jPanel1.add(jTextField7);
        jTextField7.setBounds(90, 420, 130, 30);

        jTextField8.setText("Application name  :");
        jPanel1.add(jTextField8);
        jTextField8.setBounds(90, 482, 130, 30);

        jTextField9.setText("Application name  :");
        jPanel1.add(jTextField9);
        jTextField9.setBounds(90, 542, 130, 30);

        jTextField10.setText("Application name  :");
        jPanel1.add(jTextField10);
        jTextField10.setBounds(90, 600, 130, 30);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(320, 60, 190, 30);
        jPanel1.add(jTextField12);
        jTextField12.setBounds(320, 120, 190, 30);
        jPanel1.add(jTextField13);
        jTextField13.setBounds(320, 180, 190, 30);
        jPanel1.add(jTextField14);
        jTextField14.setBounds(320, 242, 190, 30);
        jPanel1.add(jTextField15);
        jTextField15.setBounds(320, 300, 190, 30);
        jPanel1.add(jTextField16);
        jTextField16.setBounds(320, 362, 190, 30);
        jPanel1.add(jTextField17);
        jTextField17.setBounds(320, 420, 190, 30);
        jPanel1.add(jTextField18);
        jTextField18.setBounds(320, 482, 190, 30);
        jPanel1.add(jTextField19);
        jTextField19.setBounds(320, 540, 190, 30);
        jPanel1.add(jTextField20);
        jTextField20.setBounds(320, 592, 190, 30);

        jButton1.setText("Show Activity");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(340, 650, 210, 40);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(60, 650, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\java fx practice\\SystemProcess\\Time-Machine-Wallpaper-For-Android.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Welcomepage2 welcome1 = new Welcomepage2();
        welcome1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(OfflineProcess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfflineProcess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfflineProcess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfflineProcess2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfflineProcess2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
