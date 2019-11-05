package version3;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
        
//EEE, d MMM yyyy HH:mm:ss

import version3.FrameUserInfo;
public class FrameMain extends javax.swing.JFrame {
      
      public static int iterator = 0;
            public FrameMain() {
                  initComponents();
                  p2.setVisible(false);
                  p3.setVisible(false);
      }
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            Overall = new javax.swing.JPanel();
            ContainerPanel = new javax.swing.JPanel();
            pnlContent = new javax.swing.JPanel();
            pnlTimein = new javax.swing.JPanel();
            AddPanel = new javax.swing.JPanel();
            jLabel7 = new javax.swing.JLabel();
            txtFieldPlateno = new javax.swing.JTextField();
            txtFieldName = new javax.swing.JTextField();
            cmbLocation = new javax.swing.JComboBox();
            jPanel11 = new javax.swing.JPanel();
            jLabel5 = new javax.swing.JLabel();
            ParkingLotLayout = new javax.swing.JPanel();
            rowA = new javax.swing.JPanel();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jButton5 = new javax.swing.JButton();
            rowB = new javax.swing.JPanel();
            jButton16 = new javax.swing.JButton();
            jButton17 = new javax.swing.JButton();
            jButton18 = new javax.swing.JButton();
            jButton19 = new javax.swing.JButton();
            jButton20 = new javax.swing.JButton();
            rowC = new javax.swing.JPanel();
            jButton6 = new javax.swing.JButton();
            jButton7 = new javax.swing.JButton();
            jButton8 = new javax.swing.JButton();
            jButton9 = new javax.swing.JButton();
            jButton10 = new javax.swing.JButton();
            rowD = new javax.swing.JPanel();
            jButton11 = new javax.swing.JButton();
            jButton12 = new javax.swing.JButton();
            jButton13 = new javax.swing.JButton();
            jButton14 = new javax.swing.JButton();
            jButton15 = new javax.swing.JButton();
            topLane = new javax.swing.JPanel();
            jPanel18 = new javax.swing.JPanel();
            jPanel19 = new javax.swing.JPanel();
            jPanel20 = new javax.swing.JPanel();
            jPanel21 = new javax.swing.JPanel();
            jPanel22 = new javax.swing.JPanel();
            jPanel23 = new javax.swing.JPanel();
            jPanel24 = new javax.swing.JPanel();
            jPanel25 = new javax.swing.JPanel();
            jPanel42 = new javax.swing.JPanel();
            jPanel36 = new javax.swing.JPanel();
            botLane = new javax.swing.JPanel();
            jPanel33 = new javax.swing.JPanel();
            jPanel26 = new javax.swing.JPanel();
            jPanel27 = new javax.swing.JPanel();
            jPanel28 = new javax.swing.JPanel();
            jPanel29 = new javax.swing.JPanel();
            jPanel30 = new javax.swing.JPanel();
            jPanel41 = new javax.swing.JPanel();
            jPanel31 = new javax.swing.JPanel();
            midLaneRight = new javax.swing.JPanel();
            jPanel37 = new javax.swing.JPanel();
            jPanel38 = new javax.swing.JPanel();
            jPanel39 = new javax.swing.JPanel();
            midLaneLeft = new javax.swing.JPanel();
            jPanel34 = new javax.swing.JPanel();
            jPanel32 = new javax.swing.JPanel();
            jPanel35 = new javax.swing.JPanel();
            jLabel6 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            pnlOverview = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTableOverview = new javax.swing.JTable();
            pnlLogs = new javax.swing.JPanel();
            jPanel12 = new javax.swing.JPanel();
            jScrollPane2 = new javax.swing.JScrollPane();
            jTableLogs = new javax.swing.JTable();
            TabTimein = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            p1 = new javax.swing.JPanel();
            TabOverview = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            p2 = new javax.swing.JPanel();
            TabLogs = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            p3 = new javax.swing.JPanel();
            Logout = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            ContainerHeader = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            setResizable(false);

            Overall.setBackground(new java.awt.Color(0, 0, 0));
            Overall.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            ContainerPanel.setBackground(new java.awt.Color(0, 0, 0));
            ContainerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            pnlContent.setBackground(new java.awt.Color(51, 51, 51));
            pnlContent.setLayout(new java.awt.CardLayout());

            pnlTimein.setBackground(new java.awt.Color(0, 0, 0));
            pnlTimein.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            AddPanel.setBackground(new java.awt.Color(102, 102, 102));
            AddPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel7.setBackground(new java.awt.Color(0, 0, 0));
            jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("User Information");
            AddPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 40));

            txtFieldPlateno.setForeground(new java.awt.Color(102, 102, 102));
            txtFieldPlateno.setText("Plate No.");
            txtFieldPlateno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
            txtFieldPlateno.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        txtFieldPlatenoMouseClicked(evt);
                  }
            });
            AddPanel.add(txtFieldPlateno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 175, 30));

            txtFieldName.setForeground(new java.awt.Color(102, 102, 102));
            txtFieldName.setText("Name");
            txtFieldName.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 7));
            txtFieldName.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        txtFieldNameMouseClicked(evt);
                  }
            });
            AddPanel.add(txtFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 175, 30));

            cmbLocation.setForeground(new java.awt.Color(102, 102, 102));
            cmbLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Parking Location --", "A1", "A2", "A3", "A4", "A5", "B1", "B2", "B3", "B4", "B5", "C1", "C2", "C3", "C4", "C5", "D1", "D2", "D3", "D4", "D5" }));
            cmbLocation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 7, 1, 1));
            cmbLocation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            cmbLocation.setEditor(null);
            cmbLocation.setOpaque(false);
            cmbLocation.setRequestFocusEnabled(false);
            AddPanel.add(cmbLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 175, 30));

            jPanel11.setBackground(new java.awt.Color(51, 255, 51));
            jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jPanel11MouseEntered(evt);
                  }
            });

            jLabel5.setBackground(new java.awt.Color(255, 255, 255));
            jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(102, 102, 102));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("TIME IN");
            jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jLabel5MouseExited(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jLabel5MouseEntered(evt);
                  }
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel5MouseClicked(evt);
                  }
            });

            javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
            jPanel11.setLayout(jPanel11Layout);
            jPanel11Layout.setHorizontalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
            );
            jPanel11Layout.setVerticalGroup(
                  jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            );

            AddPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 175, 50));

            pnlTimein.add(AddPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 195, 458));

            ParkingLotLayout.setBackground(new java.awt.Color(51, 51, 51));
            ParkingLotLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            rowA.setBackground(new java.awt.Color(51, 51, 51));
            rowA.setForeground(new java.awt.Color(51, 51, 51));
            rowA.setLayout(new java.awt.GridLayout(1, 5, 5, 0));

            jButton1.setBackground(new java.awt.Color(102, 102, 102));
            jButton1.setForeground(new java.awt.Color(255, 0, 0));
            jButton1.setText("A1");
            jButton1.setBorder(null);
            jButton1.setEnabled(false);
            jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jButton1MouseClicked(evt);
                  }
            });
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });
            rowA.add(jButton1);

            jButton2.setBackground(new java.awt.Color(102, 102, 102));
            jButton2.setForeground(new java.awt.Color(255, 0, 0));
            jButton2.setText("A2");
            jButton2.setBorder(null);
            jButton2.setEnabled(false);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });
            rowA.add(jButton2);

            jButton3.setBackground(new java.awt.Color(102, 102, 102));
            jButton3.setForeground(new java.awt.Color(255, 0, 0));
            jButton3.setText("A3");
            jButton3.setBorder(null);
            jButton3.setEnabled(false);
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });
            rowA.add(jButton3);

            jButton4.setBackground(new java.awt.Color(102, 102, 102));
            jButton4.setForeground(new java.awt.Color(255, 0, 0));
            jButton4.setText("A4");
            jButton4.setBorder(null);
            jButton4.setEnabled(false);
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });
            rowA.add(jButton4);

            jButton5.setBackground(new java.awt.Color(102, 102, 102));
            jButton5.setForeground(new java.awt.Color(255, 0, 0));
            jButton5.setText("A5");
            jButton5.setBorder(null);
            jButton5.setEnabled(false);
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton5ActionPerformed(evt);
                  }
            });
            rowA.add(jButton5);

            ParkingLotLayout.add(rowA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 5, 335, 75));

            rowB.setBackground(new java.awt.Color(51, 51, 51));
            rowB.setLayout(new java.awt.GridLayout(1, 5, 5, 0));

            jButton16.setBackground(new java.awt.Color(102, 102, 102));
            jButton16.setForeground(new java.awt.Color(255, 0, 0));
            jButton16.setText("B1");
            jButton16.setBorder(null);
            jButton16.setEnabled(false);
            jButton16.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton16ActionPerformed(evt);
                  }
            });
            rowB.add(jButton16);

            jButton17.setBackground(new java.awt.Color(102, 102, 102));
            jButton17.setForeground(new java.awt.Color(255, 0, 0));
            jButton17.setText("B2");
            jButton17.setBorder(null);
            jButton17.setEnabled(false);
            jButton17.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton17ActionPerformed(evt);
                  }
            });
            rowB.add(jButton17);

            jButton18.setBackground(new java.awt.Color(102, 102, 102));
            jButton18.setForeground(new java.awt.Color(255, 0, 0));
            jButton18.setText("B3");
            jButton18.setBorder(null);
            jButton18.setEnabled(false);
            jButton18.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton18ActionPerformed(evt);
                  }
            });
            rowB.add(jButton18);

            jButton19.setBackground(new java.awt.Color(102, 102, 102));
            jButton19.setForeground(new java.awt.Color(255, 0, 0));
            jButton19.setText("B4");
            jButton19.setBorder(null);
            jButton19.setEnabled(false);
            jButton19.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton19ActionPerformed(evt);
                  }
            });
            rowB.add(jButton19);

            jButton20.setBackground(new java.awt.Color(102, 102, 102));
            jButton20.setForeground(new java.awt.Color(255, 0, 0));
            jButton20.setText("B5");
            jButton20.setBorder(null);
            jButton20.setEnabled(false);
            jButton20.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton20ActionPerformed(evt);
                  }
            });
            rowB.add(jButton20);

            ParkingLotLayout.add(rowB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 335, 75));

            rowC.setBackground(new java.awt.Color(51, 51, 51));
            rowC.setLayout(new java.awt.GridLayout(1, 5, 5, 0));

            jButton6.setBackground(new java.awt.Color(102, 102, 102));
            jButton6.setForeground(new java.awt.Color(255, 0, 0));
            jButton6.setText("C1");
            jButton6.setBorder(null);
            jButton6.setEnabled(false);
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton6ActionPerformed(evt);
                  }
            });
            rowC.add(jButton6);

            jButton7.setBackground(new java.awt.Color(102, 102, 102));
            jButton7.setForeground(new java.awt.Color(255, 0, 0));
            jButton7.setText("C2");
            jButton7.setBorder(null);
            jButton7.setEnabled(false);
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton7ActionPerformed(evt);
                  }
            });
            rowC.add(jButton7);

            jButton8.setBackground(new java.awt.Color(102, 102, 102));
            jButton8.setForeground(new java.awt.Color(255, 0, 0));
            jButton8.setText("C3");
            jButton8.setBorder(null);
            jButton8.setEnabled(false);
            jButton8.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton8ActionPerformed(evt);
                  }
            });
            rowC.add(jButton8);

            jButton9.setBackground(new java.awt.Color(102, 102, 102));
            jButton9.setForeground(new java.awt.Color(255, 0, 0));
            jButton9.setText("C4");
            jButton9.setBorder(null);
            jButton9.setEnabled(false);
            jButton9.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton9ActionPerformed(evt);
                  }
            });
            rowC.add(jButton9);

            jButton10.setBackground(new java.awt.Color(102, 102, 102));
            jButton10.setForeground(new java.awt.Color(255, 0, 0));
            jButton10.setText("C5");
            jButton10.setBorder(null);
            jButton10.setEnabled(false);
            jButton10.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton10ActionPerformed(evt);
                  }
            });
            rowC.add(jButton10);

            ParkingLotLayout.add(rowC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 335, 75));

            rowD.setBackground(new java.awt.Color(51, 51, 51));
            rowD.setLayout(new java.awt.GridLayout(1, 5, 5, 0));

            jButton11.setBackground(new java.awt.Color(102, 102, 102));
            jButton11.setForeground(new java.awt.Color(255, 0, 0));
            jButton11.setText("D1");
            jButton11.setBorder(null);
            jButton11.setEnabled(false);
            jButton11.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton11ActionPerformed(evt);
                  }
            });
            rowD.add(jButton11);

            jButton12.setBackground(new java.awt.Color(102, 102, 102));
            jButton12.setForeground(new java.awt.Color(255, 0, 0));
            jButton12.setText("D2");
            jButton12.setBorder(null);
            jButton12.setEnabled(false);
            jButton12.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton12ActionPerformed(evt);
                  }
            });
            rowD.add(jButton12);

            jButton13.setBackground(new java.awt.Color(102, 102, 102));
            jButton13.setForeground(new java.awt.Color(255, 0, 0));
            jButton13.setText("D3");
            jButton13.setBorder(null);
            jButton13.setEnabled(false);
            jButton13.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton13ActionPerformed(evt);
                  }
            });
            rowD.add(jButton13);

            jButton14.setBackground(new java.awt.Color(102, 102, 102));
            jButton14.setForeground(new java.awt.Color(255, 0, 0));
            jButton14.setText("D4");
            jButton14.setBorder(null);
            jButton14.setEnabled(false);
            jButton14.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton14ActionPerformed(evt);
                  }
            });
            rowD.add(jButton14);

            jButton15.setBackground(new java.awt.Color(102, 102, 102));
            jButton15.setForeground(new java.awt.Color(255, 0, 0));
            jButton15.setText("D5");
            jButton15.setBorder(null);
            jButton15.setEnabled(false);
            jButton15.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton15ActionPerformed(evt);
                  }
            });
            rowD.add(jButton15);

            ParkingLotLayout.add(rowD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 375, 335, 75));

            topLane.setBackground(new java.awt.Color(102, 102, 102));
            topLane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
            jPanel18.setLayout(jPanel18Layout);
            jPanel18Layout.setHorizontalGroup(
                  jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel18Layout.setVerticalGroup(
                  jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 27, -1, 5));

            javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
            jPanel19.setLayout(jPanel19Layout);
            jPanel19Layout.setHorizontalGroup(
                  jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel19Layout.setVerticalGroup(
                  jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 27, -1, 5));

            javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
            jPanel20.setLayout(jPanel20Layout);
            jPanel20Layout.setHorizontalGroup(
                  jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel20Layout.setVerticalGroup(
                  jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 27, -1, 5));

            javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
            jPanel21.setLayout(jPanel21Layout);
            jPanel21Layout.setHorizontalGroup(
                  jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel21Layout.setVerticalGroup(
                  jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 27, -1, 5));

            javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
            jPanel22.setLayout(jPanel22Layout);
            jPanel22Layout.setHorizontalGroup(
                  jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel22Layout.setVerticalGroup(
                  jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 27, -1, 5));

            javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
            jPanel23.setLayout(jPanel23Layout);
            jPanel23Layout.setHorizontalGroup(
                  jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel23Layout.setVerticalGroup(
                  jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 27, -1, 5));

            javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
            jPanel24.setLayout(jPanel24Layout);
            jPanel24Layout.setHorizontalGroup(
                  jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel24Layout.setVerticalGroup(
                  jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 27, -1, 5));

            javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
            jPanel25.setLayout(jPanel25Layout);
            jPanel25Layout.setHorizontalGroup(
                  jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 25, Short.MAX_VALUE)
            );
            jPanel25Layout.setVerticalGroup(
                  jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            topLane.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 27, 25, 5));

            javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
            jPanel42.setLayout(jPanel42Layout);
            jPanel42Layout.setHorizontalGroup(
                  jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel42Layout.setVerticalGroup(
                  jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 35, Short.MAX_VALUE)
            );

            topLane.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 27, 5, 35));

            javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
            jPanel36.setLayout(jPanel36Layout);
            jPanel36Layout.setHorizontalGroup(
                  jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel36Layout.setVerticalGroup(
                  jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 35, Short.MAX_VALUE)
            );

            topLane.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 27, 5, 35));

            ParkingLotLayout.add(topLane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 85, 550, 60));

            botLane.setBackground(new java.awt.Color(102, 102, 102));
            botLane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
            jPanel33.setLayout(jPanel33Layout);
            jPanel33Layout.setHorizontalGroup(
                  jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel33Layout.setVerticalGroup(
                  jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 31, Short.MAX_VALUE)
            );

            botLane.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 5, 31));

            javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
            jPanel26.setLayout(jPanel26Layout);
            jPanel26Layout.setHorizontalGroup(
                  jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel26Layout.setVerticalGroup(
                  jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            botLane.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 27, -1, 5));

            javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
            jPanel27.setLayout(jPanel27Layout);
            jPanel27Layout.setHorizontalGroup(
                  jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel27Layout.setVerticalGroup(
                  jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            botLane.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 27, -1, 5));

            javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
            jPanel28.setLayout(jPanel28Layout);
            jPanel28Layout.setHorizontalGroup(
                  jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel28Layout.setVerticalGroup(
                  jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            botLane.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 27, -1, 5));

            javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
            jPanel29.setLayout(jPanel29Layout);
            jPanel29Layout.setHorizontalGroup(
                  jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel29Layout.setVerticalGroup(
                  jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            botLane.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 27, -1, 5));

            javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
            jPanel30.setLayout(jPanel30Layout);
            jPanel30Layout.setHorizontalGroup(
                  jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 40, Short.MAX_VALUE)
            );
            jPanel30Layout.setVerticalGroup(
                  jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            botLane.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 27, -1, 5));

            javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
            jPanel41.setLayout(jPanel41Layout);
            jPanel41Layout.setHorizontalGroup(
                  jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel41Layout.setVerticalGroup(
                  jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 28, Short.MAX_VALUE)
            );

            botLane.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 0, 5, 28));

            javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
            jPanel31.setLayout(jPanel31Layout);
            jPanel31Layout.setHorizontalGroup(
                  jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 30, Short.MAX_VALUE)
            );
            jPanel31Layout.setVerticalGroup(
                  jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            botLane.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 27, 30, 5));

            ParkingLotLayout.add(botLane, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 310, 465, 60));

            midLaneRight.setBackground(new java.awt.Color(102, 102, 102));
            midLaneRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
            jPanel37.setLayout(jPanel37Layout);
            jPanel37Layout.setHorizontalGroup(
                  jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel37Layout.setVerticalGroup(
                  jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 35, Short.MAX_VALUE)
            );

            midLaneRight.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 5, 35));

            javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
            jPanel38.setLayout(jPanel38Layout);
            jPanel38Layout.setHorizontalGroup(
                  jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel38Layout.setVerticalGroup(
                  jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 35, Short.MAX_VALUE)
            );

            midLaneRight.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 5, 35));

            javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
            jPanel39.setLayout(jPanel39Layout);
            jPanel39Layout.setHorizontalGroup(
                  jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel39Layout.setVerticalGroup(
                  jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            midLaneRight.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 5, 5));

            ParkingLotLayout.add(midLaneRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 145, 60, 165));

            midLaneLeft.setBackground(new java.awt.Color(102, 102, 102));
            midLaneLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
            jPanel34.setLayout(jPanel34Layout);
            jPanel34Layout.setHorizontalGroup(
                  jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel34Layout.setVerticalGroup(
                  jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 35, Short.MAX_VALUE)
            );

            midLaneLeft.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, 5, 35));

            javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
            jPanel32.setLayout(jPanel32Layout);
            jPanel32Layout.setHorizontalGroup(
                  jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel32Layout.setVerticalGroup(
                  jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 35, Short.MAX_VALUE)
            );

            midLaneLeft.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 5, 35));

            javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
            jPanel35.setLayout(jPanel35Layout);
            jPanel35Layout.setHorizontalGroup(
                  jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );
            jPanel35Layout.setVerticalGroup(
                  jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            midLaneLeft.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 5, 5));

            ParkingLotLayout.add(midLaneLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 145, 60, 165));

            jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel6.setText("Exit");
            ParkingLotLayout.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

            jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 255, 255));
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("Entrance");
            ParkingLotLayout.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 80, 20));

            pnlTimein.add(ParkingLotLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 11, 575, 458));

            pnlContent.add(pnlTimein, "card2");

            pnlOverview.setBackground(new java.awt.Color(102, 102, 102));
            pnlOverview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel3.setBackground(new java.awt.Color(0, 0, 0));

            jTableOverview.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jTableOverview.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Location", "Status", "Time in", "Plate no.", "Name"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableOverview.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jTableOverview.setGridColor(new java.awt.Color(51, 51, 51));
            jTableOverview.setOpaque(false);
            jTableOverview.setRowHeight(25);
            jTableOverview.setShowHorizontalLines(false);
            jTableOverview.setShowVerticalLines(false);
            jTableOverview.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(jTableOverview);
            jTableOverview.getColumnModel().getColumn(0).setResizable(false);
            jTableOverview.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTableOverview.getColumnModel().getColumn(1).setResizable(false);
            jTableOverview.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTableOverview.getColumnModel().getColumn(2).setResizable(false);
            jTableOverview.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableOverview.getColumnModel().getColumn(3).setResizable(false);
            jTableOverview.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTableOverview.getColumnModel().getColumn(4).setResizable(false);
            jTableOverview.getColumnModel().getColumn(4).setPreferredWidth(200);

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            );

            pnlOverview.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 400));

            pnlContent.add(pnlOverview, "card3");

            pnlLogs.setBackground(new java.awt.Color(0, 0, 0));
            pnlLogs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel12.setBackground(new java.awt.Color(102, 102, 102));

            jTableLogs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jTableLogs.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {

                  },
                  new String [] {
                        "Location", "Time In", "Plate no.", "Name"
                  }
            ) {
                  boolean[] canEdit = new boolean [] {
                        false, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                  }
            });
            jTableLogs.setOpaque(false);
            jTableLogs.setRowHeight(25);
            jTableLogs.setShowHorizontalLines(false);
            jTableLogs.setShowVerticalLines(false);
            jTableLogs.getTableHeader().setReorderingAllowed(false);
            jScrollPane2.setViewportView(jTableLogs);
            jTableLogs.getColumnModel().getColumn(0).setResizable(false);
            jTableLogs.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTableLogs.getColumnModel().getColumn(1).setResizable(false);
            jTableLogs.getColumnModel().getColumn(1).setPreferredWidth(1);
            jTableLogs.getColumnModel().getColumn(2).setResizable(false);
            jTableLogs.getColumnModel().getColumn(2).setPreferredWidth(1);
            jTableLogs.getColumnModel().getColumn(3).setResizable(false);
            jTableLogs.getColumnModel().getColumn(3).setPreferredWidth(50);

            javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
            jPanel12.setLayout(jPanel12Layout);
            jPanel12Layout.setHorizontalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            );
            jPanel12Layout.setVerticalGroup(
                  jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            );

            pnlLogs.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 780, 400));

            pnlContent.add(pnlLogs, "card4");

            ContainerPanel.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 480));

            TabTimein.setBackground(new java.awt.Color(51, 51, 51));
            TabTimein.setPreferredSize(new java.awt.Dimension(450, 70));
            TabTimein.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("TIME IN");
            jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jLabel2MouseExited(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jLabel2MouseEntered(evt);
                  }
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel2MouseClicked(evt);
                  }
            });
            TabTimein.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

            p1.setBackground(new java.awt.Color(51, 255, 51));

            javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
            p1.setLayout(p1Layout);
            p1Layout.setHorizontalGroup(
                  p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 190, Short.MAX_VALUE)
            );
            p1Layout.setVerticalGroup(
                  p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            TabTimein.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 190, 5));

            ContainerPanel.add(TabTimein, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

            TabOverview.setBackground(new java.awt.Color(51, 51, 51));
            TabOverview.setPreferredSize(new java.awt.Dimension(450, 70));
            TabOverview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setText("OVERVIEW");
            jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jLabel3MouseExited(evt);
                  }
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel3MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jLabel3MouseEntered(evt);
                  }
            });
            TabOverview.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

            p2.setBackground(new java.awt.Color(51, 255, 51));
            p2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

            javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
            p2.setLayout(p2Layout);
            p2Layout.setHorizontalGroup(
                  p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 190, Short.MAX_VALUE)
            );
            p2Layout.setVerticalGroup(
                  p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            TabOverview.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 190, 5));

            ContainerPanel.add(TabOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 70));

            TabLogs.setBackground(new java.awt.Color(51, 51, 51));
            TabLogs.setPreferredSize(new java.awt.Dimension(450, 70));
            TabLogs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel4.setText("LOGS");
            jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel4MouseClicked(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jLabel4MouseExited(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jLabel4MouseEntered(evt);
                  }
            });
            TabLogs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

            p3.setBackground(new java.awt.Color(51, 255, 51));

            javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
            p3.setLayout(p3Layout);
            p3Layout.setHorizontalGroup(
                  p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 190, Short.MAX_VALUE)
            );
            p3Layout.setVerticalGroup(
                  p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 5, Short.MAX_VALUE)
            );

            TabLogs.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 190, 5));

            ContainerPanel.add(TabLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 190, 70));

            Logout.setBackground(new java.awt.Color(51, 51, 51));
            Logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(255, 255, 255));
            jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel10.setText("LOGOUT");
            jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel10MouseClicked(evt);
                  }
            });
            Logout.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

            ContainerPanel.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 120, 40));

            Overall.add(ContainerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 550));

            ContainerHeader.setBackground(new java.awt.Color(51, 255, 51));
            ContainerHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jPanel2.setBackground(new java.awt.Color(255, 0, 0));

            jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 36)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("x");
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jLabel1MouseEntered(evt);
                  }
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel1MouseClicked(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jLabel1MouseExited(evt);
                  }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            );

            ContainerHeader.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

            jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
            jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel9.setText("PARKING LOT PROGRAM");
            ContainerHeader.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

            Overall.add(ContainerHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(Overall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(Overall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800, 600);
      }// </editor-fold>//GEN-END:initComponents
      private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
            jLabel1.setForeground(Color.WHITE);
            jPanel2.setBackground(new Color(51, 51, 51));
      }//GEN-LAST:event_jLabel1MouseEntered
      private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            System.exit(1);
      }//GEN-LAST:event_jLabel1MouseClicked
      private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
            jLabel1.setForeground(Color.WHITE);
            jPanel2.setBackground(Color.RED);
      }//GEN-LAST:event_jLabel1MouseExited
      private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
            MyInstantiation.mouseEntered(TabOverview, jLabel3);
      }//GEN-LAST:event_jLabel3MouseEntered
      private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
            MyInstantiation.mouseExited(TabOverview, jLabel3);
      }//GEN-LAST:event_jLabel3MouseExited
      private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
            MyInstantiation.mouseEntered(TabLogs, jLabel4);
      }//GEN-LAST:event_jLabel4MouseEntered
      private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
            MyInstantiation.mouseExited(TabLogs, jLabel4);
      }//GEN-LAST:event_jLabel4MouseExited
      private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
            MyInstantiation.mouseClicked(p1, p3, p2);
            swapContainer(pnlOverview);
      }//GEN-LAST:event_jLabel3MouseClicked
      private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
            MyInstantiation.mouseClicked(p1, p2, p3);
            swapContainer(pnlLogs);
      }//GEN-LAST:event_jLabel4MouseClicked
      private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            MyInstantiation.mouseClicked(p3, p2, p1);
            swapContainer(pnlTimein);
      }//GEN-LAST:event_jLabel2MouseClicked
      private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
            MyInstantiation.mouseEntered(TabTimein, jLabel2);
      }//GEN-LAST:event_jLabel2MouseEntered
      private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
            MyInstantiation.mouseExited(TabTimein, jLabel2);
      }//GEN-LAST:event_jLabel2MouseExited
      private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
      }//GEN-LAST:event_jPanel11MouseEntered
      private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
            jPanel11.setBackground(new Color(233, 87, 63));
            jLabel5.setForeground(Color.WHITE);
      }//GEN-LAST:event_jLabel5MouseEntered
      private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
            jPanel11.setBackground(new Color(51,255,51));
            jLabel5.setForeground(new Color(102,102,102));
      }//GEN-LAST:event_jLabel5MouseExited
      private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

      }//GEN-LAST:event_jButton1MouseClicked
      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String location="A2"; int loc = 1;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);
            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton2ActionPerformed
      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            String location="A3"; int loc = 2;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton3ActionPerformed
      private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            String location="A4"; int loc = 3;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton4ActionPerformed
      private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            String location="A5"; int loc = 4;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton5ActionPerformed
      private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
            String location="D5"; int loc = 19;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton15ActionPerformed
      private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
            String location="B1"; int loc = 5;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton16ActionPerformed
      private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
            String location="B2"; int loc = 6;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton17ActionPerformed
      private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
            String location="B3"; int loc = 7;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton18ActionPerformed
      private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
            String location="B4"; int loc = 8;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton19ActionPerformed
      private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
            String location="B5"; int loc = 9;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton20ActionPerformed
      private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            String location="C1"; int loc = 10;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton6ActionPerformed
      private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            String location="C2"; int loc = 11;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton7ActionPerformed
      private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            String location="C3"; int loc = 12;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton8ActionPerformed
      private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            String location="C4"; int loc = 13;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton9ActionPerformed
      private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            String location="C5"; int loc = 14;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton10ActionPerformed
      private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            String location="D1"; int loc = 15;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton11ActionPerformed
      private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
            String location="D2"; int loc = 16;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton12ActionPerformed
      private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
            String location="D3"; int loc = 17;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton13ActionPerformed
      private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
            String location="D4"; int loc = 18;
            new FrameUserInfo().setVisible(true);
            FrameUserInfo.locationListener(location);

            MyInstantiation.buttonShower(loc);             
      }//GEN-LAST:event_jButton14ActionPerformed
      private void txtFieldNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldNameMouseClicked
            txtFieldName.setText("");
      }//GEN-LAST:event_txtFieldNameMouseClicked
      private void txtFieldPlatenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldPlatenoMouseClicked
            txtFieldPlateno.setText("");
      }//GEN-LAST:event_txtFieldPlatenoMouseClicked
      private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
            // TIME-IN MOUSE CLICKED
            MyInstantiation.addToRow();
            MyInstantiation.logsPopulate();
            
            
            int k = cmbLocation.getSelectedIndex();
//            int loc = cmbLocation.getSelectedIndex();
            
//            String NameInput = txtFieldName.getText();
//            String PlatenoInput = txtFieldPlateno.getText();
//            String LocationInput = cmbLocation.getSelectedItem().toString();
//            int index = cmbLocation.getSelectedIndex();
            
            txtFieldName.setText("Name");
            txtFieldPlateno.setText("Plate No.");
            cmbLocation.setSelectedIndex(0);

            new FramePopup().setVisible(true);
            MyInstantiation.buttonEnabler(k);
            iterator++;
      }//GEN-LAST:event_jLabel5MouseClicked
      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            new FrameUserInfo().setVisible(true);

            String location="A1"; int loc = 0;
            FrameUserInfo.locationListener(location);
            MyInstantiation.buttonShower(loc);
      }//GEN-LAST:event_jButton1ActionPerformed

      private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
            dispose();
            jTableOverview.removeAll();
            new FrameLogin().setVisible(true);
      }//GEN-LAST:event_jLabel10MouseClicked
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
                  java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new FrameMain().setVisible(true);
                  }
            });
      }
      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel AddPanel;
      private javax.swing.JPanel ContainerHeader;
      private javax.swing.JPanel ContainerPanel;
      private javax.swing.JPanel Logout;
      private javax.swing.JPanel Overall;
      private javax.swing.JPanel ParkingLotLayout;
      private javax.swing.JPanel TabLogs;
      private javax.swing.JPanel TabOverview;
      private javax.swing.JPanel TabTimein;
      private javax.swing.JPanel botLane;
      public static javax.swing.JComboBox cmbLocation;
      public static javax.swing.JButton jButton1;
      public static javax.swing.JButton jButton10;
      public static javax.swing.JButton jButton11;
      public static javax.swing.JButton jButton12;
      public static javax.swing.JButton jButton13;
      public static javax.swing.JButton jButton14;
      public static javax.swing.JButton jButton15;
      public static javax.swing.JButton jButton16;
      public static javax.swing.JButton jButton17;
      public static javax.swing.JButton jButton18;
      public static javax.swing.JButton jButton19;
      public static javax.swing.JButton jButton2;
      public static javax.swing.JButton jButton20;
      public static javax.swing.JButton jButton3;
      public static javax.swing.JButton jButton4;
      public static javax.swing.JButton jButton5;
      public static javax.swing.JButton jButton6;
      public static javax.swing.JButton jButton7;
      public static javax.swing.JButton jButton8;
      public static javax.swing.JButton jButton9;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel11;
      private javax.swing.JPanel jPanel12;
      private javax.swing.JPanel jPanel18;
      private javax.swing.JPanel jPanel19;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel20;
      private javax.swing.JPanel jPanel21;
      private javax.swing.JPanel jPanel22;
      private javax.swing.JPanel jPanel23;
      private javax.swing.JPanel jPanel24;
      private javax.swing.JPanel jPanel25;
      private javax.swing.JPanel jPanel26;
      private javax.swing.JPanel jPanel27;
      private javax.swing.JPanel jPanel28;
      private javax.swing.JPanel jPanel29;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel30;
      private javax.swing.JPanel jPanel31;
      private javax.swing.JPanel jPanel32;
      private javax.swing.JPanel jPanel33;
      private javax.swing.JPanel jPanel34;
      private javax.swing.JPanel jPanel35;
      private javax.swing.JPanel jPanel36;
      private javax.swing.JPanel jPanel37;
      private javax.swing.JPanel jPanel38;
      private javax.swing.JPanel jPanel39;
      private javax.swing.JPanel jPanel41;
      private javax.swing.JPanel jPanel42;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane2;
      public static javax.swing.JTable jTableLogs;
      public static javax.swing.JTable jTableOverview;
      private javax.swing.JPanel midLaneLeft;
      private javax.swing.JPanel midLaneRight;
      private javax.swing.JPanel p1;
      private javax.swing.JPanel p2;
      private javax.swing.JPanel p3;
      private javax.swing.JPanel pnlContent;
      private javax.swing.JPanel pnlLogs;
      private javax.swing.JPanel pnlOverview;
      private javax.swing.JPanel pnlTimein;
      private javax.swing.JPanel rowA;
      private javax.swing.JPanel rowB;
      private javax.swing.JPanel rowC;
      private javax.swing.JPanel rowD;
      private javax.swing.JPanel topLane;
      public static javax.swing.JTextField txtFieldName;
      public static javax.swing.JTextField txtFieldPlateno;
      // End of variables declaration//GEN-END:variables

      private void swapContainer(JPanel p) {
            pnlContent.removeAll();
            pnlContent.add(p);
            revalidate();
            repaint();
      }
}