/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsLab;

/**
 *
 * @author alecco
 */
public class frmDisplayList extends javax.swing.JFrame {

      /**
       * Creates new form frmDisplayList
       */
      public frmDisplayList() {
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            txtFieldDisplay = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            jPanel1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            txtFieldDisplay.setEditable(false);
            txtFieldDisplay.setBackground(new java.awt.Color(51, 51, 51));
            txtFieldDisplay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
            txtFieldDisplay.setForeground(new java.awt.Color(255, 255, 255));
            txtFieldDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jPanel1.add(txtFieldDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 100));

            jButton1.setBackground(new java.awt.Color(51, 51, 51));
            jButton1.setForeground(new java.awt.Color(153, 255, 0));
            jButton1.setText("< Back");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });
            jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 153, 100, 30));

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("LINKEDLIST DISPLAY");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 230, 40));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
            );

            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            setBounds((screenSize.width-416)/2, (screenSize.height-233)/2, 416, 233);
      }// </editor-fold>//GEN-END:initComponents

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            dispose();
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
                  java.util.logging.Logger.getLogger(frmDisplayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(frmDisplayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(frmDisplayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(frmDisplayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new frmDisplayList().setVisible(true);
                  }
            });
      }
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton1;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JPanel jPanel1;
      public static javax.swing.JTextField txtFieldDisplay;
      // End of variables declaration//GEN-END:variables
}
