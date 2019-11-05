package Stacks_Queue_HanoiTower;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyContents extends javax.swing.JFrame {

      Stack<String> stack = new Stack<String>();
      Queue<String> queue = new LinkedList<String>();
      String con;

      public MyContents() {
            initComponents();
      }


      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            Taskbar = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jPanel2 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            MyContent = new javax.swing.JPanel();
            contentStack = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTextArea1 = new javax.swing.JTextArea();
            jTextField1 = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jButton5 = new javax.swing.JButton();
            jButton6 = new javax.swing.JButton();
            jButton7 = new javax.swing.JButton();
            jButton8 = new javax.swing.JButton();
            jTextField2 = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            contentQueue = new javax.swing.JPanel();
            jScrollPane2 = new javax.swing.JScrollPane();
            jTextArea2 = new javax.swing.JTextArea();
            jTextField3 = new javax.swing.JTextField();
            jLabel5 = new javax.swing.JLabel();
            jButton9 = new javax.swing.JButton();
            jButton10 = new javax.swing.JButton();
            jButton11 = new javax.swing.JButton();
            jButton12 = new javax.swing.JButton();
            jButton13 = new javax.swing.JButton();
            jTextField4 = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            jButton14 = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            jTextField5 = new javax.swing.JTextField();
            contentHanoiTower = new javax.swing.JPanel();
            lbl = new javax.swing.JLabel();
            jPanel4 = new javax.swing.JPanel();
            a1 = new javax.swing.JButton();
            b1 = new javax.swing.JButton();
            c1 = new javax.swing.JButton();
            a2 = new javax.swing.JButton();
            b2 = new javax.swing.JButton();
            c2 = new javax.swing.JButton();
            a3 = new javax.swing.JButton();
            b3 = new javax.swing.JButton();
            c3 = new javax.swing.JButton();
            jLabel8 = new javax.swing.JLabel();
            jButton15 = new javax.swing.JButton();
            lblSolved = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            setResizable(false);

            jPanel1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            Taskbar.setBackground(new java.awt.Color(255, 255, 51));
            Taskbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel3.setBackground(new java.awt.Color(255, 0, 0));

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("X");
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel1MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            );

            Taskbar.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

            jPanel1.add(Taskbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

            jPanel2.setBackground(new java.awt.Color(0, 0, 0));
            jPanel2.setLayout(new java.awt.GridLayout(6, 0, 0, 5));

            jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Contents");
            jPanel2.add(jLabel2);

            jButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton2.setText("Stack");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });
            jPanel2.add(jButton2);

            jButton3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton3.setText("Queue");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });
            jPanel2.add(jButton3);

            jButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton4.setText("Hanoi Tower");
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });
            jPanel2.add(jButton4);

            jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, 370));

            MyContent.setBackground(new java.awt.Color(51, 51, 51));
            MyContent.setLayout(new java.awt.CardLayout());

            contentStack.setBackground(new java.awt.Color(0, 0, 0));
            contentStack.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTextArea1.setColumns(20);
            jTextArea1.setRows(5);
            jScrollPane1.setViewportView(jTextArea1);

            contentStack.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 100));

            jTextField1.setEditable(false);
            jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField1ActionPerformed(evt);
                  }
            });
            contentStack.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 60, 25));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel3.setText("Peek Result:");
            contentStack.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, 20));

            jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton1.setText("Push");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });
            contentStack.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

            jButton5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton5.setText("Pop");
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton5ActionPerformed(evt);
                  }
            });
            contentStack.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

            jButton6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton6.setText("Peek");
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton6ActionPerformed(evt);
                  }
            });
            contentStack.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 70, -1));

            jButton7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton7.setText("Display");
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton7ActionPerformed(evt);
                  }
            });
            contentStack.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 192, 260, 30));

            jButton8.setText("Clear Fields");
            jButton8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton8ActionPerformed(evt);
                  }
            });
            contentStack.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 335, 110, -1));

            jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            contentStack.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 25));

            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("STACK");
            contentStack.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 10, 250, 40));

            MyContent.add(contentStack, "card2");

            contentQueue.setBackground(new java.awt.Color(0, 0, 0));
            contentQueue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTextArea2.setColumns(20);
            jTextArea2.setRows(5);
            jScrollPane2.setViewportView(jTextArea2);

            contentQueue.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 260, 100));

            jTextField3.setEditable(false);
            jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jTextField3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField3ActionPerformed(evt);
                  }
            });
            contentQueue.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 60, 25));

            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel5.setText("Size:");
            contentQueue.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 110, 20));

            jButton9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton9.setText("Add");
            jButton9.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton9ActionPerformed(evt);
                  }
            });
            contentQueue.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

            jButton10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton10.setText("Poll");
            jButton10.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton10ActionPerformed(evt);
                  }
            });
            contentQueue.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

            jButton11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton11.setText("Peek");
            jButton11.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton11ActionPerformed(evt);
                  }
            });
            contentQueue.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));

            jButton12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton12.setText("Display");
            jButton12.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton12ActionPerformed(evt);
                  }
            });
            contentQueue.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 192, 260, 30));

            jButton13.setText("Clear Fields");
            jButton13.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton13ActionPerformed(evt);
                  }
            });
            contentQueue.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 335, 110, -1));

            jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            contentQueue.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 25));

            jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("QUEUE");
            contentQueue.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 10, 250, 40));

            jButton14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jButton14.setText("Size");
            jButton14.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton14ActionPerformed(evt);
                  }
            });
            contentQueue.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 70, -1));

            jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel7.setText("Peek Result:");
            contentQueue.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 110, 20));

            jTextField5.setEditable(false);
            jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            jTextField5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField5ActionPerformed(evt);
                  }
            });
            contentQueue.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 60, 25));

            MyContent.add(contentQueue, "card2");

            contentHanoiTower.setBackground(new java.awt.Color(102, 102, 102));
            contentHanoiTower.setFocusable(false);
            contentHanoiTower.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lbl.setBackground(new java.awt.Color(255, 255, 255));
            lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            lbl.setForeground(new java.awt.Color(255, 255, 255));
            lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            contentHanoiTower.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 70, 30));

            jPanel4.setBackground(new java.awt.Color(102, 102, 102));
            jPanel4.setLayout(new java.awt.GridLayout(3, 3, 10, 10));

            a1.setText("1");
            a1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        a1ActionPerformed(evt);
                  }
            });
            jPanel4.add(a1);

            b1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        b1ActionPerformed(evt);
                  }
            });
            jPanel4.add(b1);

            c1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        c1ActionPerformed(evt);
                  }
            });
            jPanel4.add(c1);

            a2.setText("2");
            a2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        a2ActionPerformed(evt);
                  }
            });
            jPanel4.add(a2);

            b2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        b2ActionPerformed(evt);
                  }
            });
            jPanel4.add(b2);

            c2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        c2ActionPerformed(evt);
                  }
            });
            jPanel4.add(c2);

            a3.setText("3");
            a3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        a3ActionPerformed(evt);
                  }
            });
            jPanel4.add(a3);

            b3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        b3ActionPerformed(evt);
                  }
            });
            jPanel4.add(b3);

            c3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        c3ActionPerformed(evt);
                  }
            });
            jPanel4.add(c3);

            contentHanoiTower.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 210));

            jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 255, 255));
            jLabel8.setText("No. of Errors:");
            contentHanoiTower.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 30));

            jButton15.setText("RESET");
            jButton15.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton15ActionPerformed(evt);
                  }
            });
            contentHanoiTower.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 80, -1));

            lblSolved.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            lblSolved.setForeground(new java.awt.Color(255, 255, 255));
            lblSolved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            contentHanoiTower.add(lblSolved, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 84, 260, 30));

            MyContent.add(contentHanoiTower, "card4");

            jPanel1.add(MyContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 300, 370));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            setBounds((screenSize.width-400)/2, (screenSize.height-400)/2, 400, 400);
      }// </editor-fold>//GEN-END:initComponents

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            showContents(contentStack);
      }//GEN-LAST:event_jButton2ActionPerformed

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            showContents(contentQueue);
      }//GEN-LAST:event_jButton3ActionPerformed

      private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            showContents(contentHanoiTower);
            a1.setText("1");
            a2.setText("2");
            a3.setText("3");
      }//GEN-LAST:event_jButton4ActionPerformed

      private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            System.exit(1);
      }//GEN-LAST:event_jLabel1MouseClicked

      private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextField1ActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String in = jTextField2.getText();
            stack.push(in);
            jTextField2.setText("");
      }//GEN-LAST:event_jButton1ActionPerformed

      private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            try{
            stack.pop();
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Stack is Empty");
            }
      }//GEN-LAST:event_jButton5ActionPerformed

      private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            try{
            jTextField1.setText(stack.peek());
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Stack is Empty");
            }
      }//GEN-LAST:event_jButton6ActionPerformed

      private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            jTextArea1.setText("" + stack);
      }//GEN-LAST:event_jButton7ActionPerformed

      private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            jTextArea1.setText("");
            jTextField1.setText("");
      }//GEN-LAST:event_jButton8ActionPerformed

      private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextField3ActionPerformed

      private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            queue.add(jTextField4.getText());
            jTextField4.setText("");
      }//GEN-LAST:event_jButton9ActionPerformed

      private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            try{
            queue.remove();
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Queue is Empty");
            }
      }//GEN-LAST:event_jButton10ActionPerformed

      private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            try{
            jTextField5.setText(queue.element());
            }catch(Exception e){
                  JOptionPane.showMessageDialog(null,"Queue is Empty");
            }            
      }//GEN-LAST:event_jButton11ActionPerformed

      private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
            jTextArea2.setText(queue+"");
      }//GEN-LAST:event_jButton12ActionPerformed

      private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
            jTextField5.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
      }//GEN-LAST:event_jButton13ActionPerformed

      private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_jTextField5ActionPerformed

      private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
            jTextField3.setText(queue.size()+"");
      }//GEN-LAST:event_jButton14ActionPerformed

      private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        myMethod(a1, a2, 1);
      }//GEN-LAST:event_a1ActionPerformed

      private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if(b2.getText().isEmpty())
            myMethod(b3, b2, 3);
        else
            errorMethod();
      }//GEN-LAST:event_b3ActionPerformed

      private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
    if(a1.getText().isEmpty())
            myMethod(a2, a3, 2);
        else
            errorMethod();
      }//GEN-LAST:event_a2ActionPerformed

      private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        if(c2.getText().isEmpty())
            myMethod(c3, c2, 3);
        else
            errorMethod();
      }//GEN-LAST:event_c3ActionPerformed

      private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
          if(c1.getText().isEmpty())
            myMethod(c2, c3, 2);
        else
            errorMethod();
      }//GEN-LAST:event_c2ActionPerformed

      private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed

       myMethod(c1,c2, 1);
      }//GEN-LAST:event_c1ActionPerformed

      private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if(b1.getText().isEmpty())
            myMethod(b2, b3, 2);
        else
            errorMethod();
      }//GEN-LAST:event_b2ActionPerformed

      private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        myMethod(b1, b2, 1);
      }//GEN-LAST:event_b1ActionPerformed

      private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
       if(a2.getText().isEmpty())
            myMethod(a3, a2, 3);
        else
            errorMethod();
      }//GEN-LAST:event_a3ActionPerformed

      private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
            a1.setText("1"); a2.setText("2"); a3.setText("3"); b1.setText(""); b2.setText(""); b3.setText(""); c1.setText(""); c2.setText(""); c3.setText("");
            temp = 0; error = 0; lbl.setText(""); lblSolved.setText("");
      }//GEN-LAST:event_jButton15ActionPerformed
    int temp , error;
    
 private void myMethod(JButton thisbtn, JButton lowbtn, int position) {
        if(thisbtn.getText().isEmpty() &&  !lowbtn.getText().isEmpty() && Integer.valueOf(lowbtn.getText()) > temp){
            thisbtn.setText(""+temp);
            temp = 0;
        }else if(thisbtn.getText().isEmpty() && position == 3){
            thisbtn.setText(""+temp);
            temp = 0;
        }else if(!thisbtn.getText().isEmpty() && temp == 0){
            temp = Integer.valueOf(thisbtn.getText());
            thisbtn.setText("");
        }
        else
            errorMethod();
        

    }
 

 
    public void errorMethod(){
        error++;
        lbl.setText(""+error);
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
                  java.util.logging.Logger.getLogger(MyContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(MyContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(MyContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(MyContents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new MyContents().setVisible(true);
                  }
            });
      }
      // Variables declaration - do not modify//GEN-BEGIN:variables
      public static javax.swing.JPanel MyContent;
      private javax.swing.JPanel Taskbar;
      private javax.swing.JButton a1;
      private javax.swing.JButton a2;
      private javax.swing.JButton a3;
      private javax.swing.JButton b1;
      private javax.swing.JButton b2;
      private javax.swing.JButton b3;
      private javax.swing.JButton c1;
      private javax.swing.JButton c2;
      private javax.swing.JButton c3;
      public static javax.swing.JPanel contentHanoiTower;
      public static javax.swing.JPanel contentQueue;
      public static javax.swing.JPanel contentStack;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton10;
      private javax.swing.JButton jButton11;
      private javax.swing.JButton jButton12;
      private javax.swing.JButton jButton13;
      private javax.swing.JButton jButton14;
      private javax.swing.JButton jButton15;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JButton jButton5;
      private javax.swing.JButton jButton6;
      private javax.swing.JButton jButton7;
      private javax.swing.JButton jButton8;
      private javax.swing.JButton jButton9;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      public static javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JTextArea jTextArea1;
      private javax.swing.JTextArea jTextArea2;
      private javax.swing.JTextField jTextField1;
      private javax.swing.JTextField jTextField2;
      private javax.swing.JTextField jTextField3;
      private javax.swing.JTextField jTextField4;
      private javax.swing.JTextField jTextField5;
      private javax.swing.JLabel lbl;
      public javax.swing.JLabel lblSolved;
      // End of variables declaration//GEN-END:variables
      public void showContents(JPanel p){
            MyContent.removeAll();
            MyContent.add(p);
            repaint();
            revalidate();
      }     
}
