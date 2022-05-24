/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Home_Form extends javax.swing.JFrame {

    private int mousex, mousey;

    public Home_Form() {
        initComponents();
    }

    private void setColor(JPanel jp) {
        jp.setBackground(new Color(85, 68, 118));
    }

    private void resetcolor(JPanel jp) {
        jp.setBackground(new Color(64, 43, 100));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DPane = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        storebtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        billbtn = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        accbtn = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        khbtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        doanhThubtn = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BaoCaobtn = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PhieuNhapbtn = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-sales-64.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel7MouseDragged(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel7MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 33, 89));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(938, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 960, 40));

        DPane.setPreferredSize(new java.awt.Dimension(950, 630));

        javax.swing.GroupLayout DPaneLayout = new javax.swing.GroupLayout(DPane);
        DPane.setLayout(DPaneLayout);
        DPaneLayout.setHorizontalGroup(
            DPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        DPaneLayout.setVerticalGroup(
            DPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel1.add(DPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 960, 630));

        jPanel5.setBackground(new java.awt.Color(54, 33, 89));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storebtn.setBackground(new java.awt.Color(85, 65, 118));
        storebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                storebtnMousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/warehouse (2).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Quản Lý Sản Phẩm ");

        javax.swing.GroupLayout storebtnLayout = new javax.swing.GroupLayout(storebtn);
        storebtn.setLayout(storebtnLayout);
        storebtnLayout.setHorizontalGroup(
            storebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storebtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(0, 55, Short.MAX_VALUE))
        );
        storebtnLayout.setVerticalGroup(
            storebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(storebtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(storebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(storebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        billbtn.setBackground(new java.awt.Color(64, 43, 100));
        billbtn.setPreferredSize(new java.awt.Dimension(270, 40));
        billbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                billbtnMousePressed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bill.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Quản Lý Hóa Đơn");

        javax.swing.GroupLayout billbtnLayout = new javax.swing.GroupLayout(billbtn);
        billbtn.setLayout(billbtnLayout);
        billbtnLayout.setHorizontalGroup(
            billbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(0, 65, Short.MAX_VALUE))
        );
        billbtnLayout.setVerticalGroup(
            billbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billbtnLayout.createSequentialGroup()
                .addGroup(billbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel5.add(billbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, -1, -1));

        accbtn.setBackground(new java.awt.Color(64, 43, 100));
        accbtn.setPreferredSize(new java.awt.Dimension(270, 40));
        accbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accbtnMousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accountant.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Quản Lý Tài Khoản");

        javax.swing.GroupLayout accbtnLayout = new javax.swing.GroupLayout(accbtn);
        accbtn.setLayout(accbtnLayout);
        accbtnLayout.setHorizontalGroup(
            accbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accbtnLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(0, 59, Short.MAX_VALUE))
        );
        accbtnLayout.setVerticalGroup(
            accbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(accbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel5.add(accbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        logoutbtn.setBackground(new java.awt.Color(64, 43, 100));
        logoutbtn.setPreferredSize(new java.awt.Dimension(270, 40));
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutbtnMousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log-out.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Log Out");

        javax.swing.GroupLayout logoutbtnLayout = new javax.swing.GroupLayout(logoutbtn);
        logoutbtn.setLayout(logoutbtnLayout);
        logoutbtnLayout.setHorizontalGroup(
            logoutbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        logoutbtnLayout.setVerticalGroup(
            logoutbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoutbtnLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(logoutbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel5.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        exitbtn.setBackground(new java.awt.Color(64, 43, 100));
        exitbtn.setPreferredSize(new java.awt.Dimension(270, 40));
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitbtnMousePressed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Exit");

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        khbtn.setBackground(new java.awt.Color(64, 43, 100));
        khbtn.setPreferredSize(new java.awt.Dimension(270, 40));
        khbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                khbtnMousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rating.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Quản Lý Khách Hàng ");

        javax.swing.GroupLayout khbtnLayout = new javax.swing.GroupLayout(khbtn);
        khbtn.setLayout(khbtnLayout);
        khbtnLayout.setHorizontalGroup(
            khbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khbtnLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        khbtnLayout.setVerticalGroup(
            khbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(khbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel5.add(khbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        doanhThubtn.setBackground(new java.awt.Color(64, 43, 100));
        doanhThubtn.setPreferredSize(new java.awt.Dimension(270, 40));
        doanhThubtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                doanhThubtnMousePressed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bar-chart.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Thống Kê Doanh Thu ");

        javax.swing.GroupLayout doanhThubtnLayout = new javax.swing.GroupLayout(doanhThubtn);
        doanhThubtn.setLayout(doanhThubtnLayout);
        doanhThubtnLayout.setHorizontalGroup(
            doanhThubtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doanhThubtnLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(0, 33, Short.MAX_VALUE))
        );
        doanhThubtnLayout.setVerticalGroup(
            doanhThubtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doanhThubtnLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(doanhThubtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel5.add(doanhThubtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        BaoCaobtn.setBackground(new java.awt.Color(64, 43, 100));
        BaoCaobtn.setPreferredSize(new java.awt.Dimension(270, 40));
        BaoCaobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BaoCaobtnMousePressed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seo-report.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Báo Cáo");

        javax.swing.GroupLayout BaoCaobtnLayout = new javax.swing.GroupLayout(BaoCaobtn);
        BaoCaobtn.setLayout(BaoCaobtnLayout);
        BaoCaobtnLayout.setHorizontalGroup(
            BaoCaobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaoCaobtnLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(0, 149, Short.MAX_VALUE))
        );
        BaoCaobtnLayout.setVerticalGroup(
            BaoCaobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BaoCaobtnLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(BaoCaobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel5.add(BaoCaobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        PhieuNhapbtn.setBackground(new java.awt.Color(64, 43, 100));
        PhieuNhapbtn.setPreferredSize(new java.awt.Dimension(270, 40));
        PhieuNhapbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PhieuNhapbtnMousePressed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/import.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Quản Lý Nhập Hàng ");

        javax.swing.GroupLayout PhieuNhapbtnLayout = new javax.swing.GroupLayout(PhieuNhapbtn);
        PhieuNhapbtn.setLayout(PhieuNhapbtnLayout);
        PhieuNhapbtnLayout.setHorizontalGroup(
            PhieuNhapbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuNhapbtnLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        PhieuNhapbtnLayout.setVerticalGroup(
            PhieuNhapbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieuNhapbtnLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(PhieuNhapbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel5.add(PhieuNhapbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    JInternalFrame active = null;

    private void openchildframe(JInternalFrame f) {
        if (active != null) {
            active.dispose();
        }
        active = f;
        DPane.add(active);
        active.show();
    }
    private void storebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storebtnMousePressed
        setColor(storebtn);
        resetcolor(billbtn);
        resetcolor(accbtn);
        resetcolor(exitbtn);
        resetcolor(khbtn);
        resetcolor(PhieuNhapbtn);
        resetcolor(BaoCaobtn);
        resetcolor(doanhThubtn);
        Product_Form pf = new Product_Form();
        openchildframe(pf);
    }//GEN-LAST:event_storebtnMousePressed

    private void billbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billbtnMousePressed
        setColor(billbtn);
        resetcolor(storebtn);
        resetcolor(accbtn);
        resetcolor(PhieuNhapbtn);
        resetcolor(exitbtn);
        resetcolor(khbtn);
        resetcolor(BaoCaobtn);
        resetcolor(doanhThubtn);
        Bill_Frame bf;
        try {
            bf = new Bill_Frame();
            openchildframe(bf);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home_Form.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_billbtnMousePressed

    private void accbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accbtnMousePressed
        setColor(accbtn);
        resetcolor(storebtn);
        resetcolor(billbtn);
        resetcolor(exitbtn);
        resetcolor(logoutbtn);
        resetcolor(PhieuNhapbtn);
        resetcolor(khbtn);
        resetcolor(BaoCaobtn);
        resetcolor(doanhThubtn);
        try {
            Accountform a = new Accountform();
            openchildframe(a);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_accbtnMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel1MousePressed

    private void jPanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MousePressed
        mousex = this.getX();
        mousey = this.getY();
    }//GEN-LAST:event_jPanel7MousePressed

    private void jPanel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseDragged
        this.setLocation(this.getX() + evt.getX() - mousex, this.getY() + evt.getY() - mousey);
    }//GEN-LAST:event_jPanel7MouseDragged

    private void logoutbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMousePressed
        setColor(logoutbtn);
        resetcolor(storebtn);
        resetcolor(billbtn);
        resetcolor(exitbtn);
        resetcolor(accbtn);
        resetcolor(khbtn);
        resetcolor(BaoCaobtn);
        resetcolor(PhieuNhapbtn);
        resetcolor(doanhThubtn);
        int r = JOptionPane.showConfirmDialog(this, "Logout???", "Notification", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (r == JOptionPane.YES_OPTION) {
            login l = new login();
            this.dispose();
            l.setVisible(true);
        }
    }//GEN-LAST:event_logoutbtnMousePressed

    private void exitbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMousePressed
        setColor(exitbtn);
        resetcolor(storebtn);
        resetcolor(billbtn);
        resetcolor(accbtn);
        resetcolor(logoutbtn);
        resetcolor(khbtn);
        resetcolor(BaoCaobtn);
        resetcolor(doanhThubtn);
        resetcolor(PhieuNhapbtn);
        int r = JOptionPane.showConfirmDialog(this, "EXIT???", "Notification", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (r == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnMousePressed

    private void khbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_khbtnMousePressed
        setColor(khbtn);
        resetcolor(storebtn);
        resetcolor(billbtn);
        resetcolor(accbtn);
        resetcolor(logoutbtn);
        resetcolor(exitbtn);
        resetcolor(doanhThubtn);
        resetcolor(BaoCaobtn);
        resetcolor(PhieuNhapbtn);
        KhachHangFrame kf = new KhachHangFrame();
        openchildframe(kf);
    }//GEN-LAST:event_khbtnMousePressed

    private void doanhThubtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doanhThubtnMousePressed
        setColor(doanhThubtn);
        resetcolor(storebtn);
        resetcolor(billbtn);
        resetcolor(accbtn);
        resetcolor(logoutbtn);
        resetcolor(exitbtn);
        resetcolor(khbtn);
        resetcolor(BaoCaobtn);
        resetcolor(PhieuNhapbtn);
        Chart_Frame cf = new Chart_Frame();
        openchildframe(cf);
    }//GEN-LAST:event_doanhThubtnMousePressed

    private void BaoCaobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BaoCaobtnMousePressed
        setColor(BaoCaobtn);
        resetcolor(storebtn);
        resetcolor(billbtn);
        resetcolor(accbtn);
        resetcolor(logoutbtn);
        resetcolor(exitbtn);
        resetcolor(khbtn);
        resetcolor(doanhThubtn);
        resetcolor(PhieuNhapbtn);
        Report_Frame rp = new Report_Frame();
        openchildframe(rp);
    }//GEN-LAST:event_BaoCaobtnMousePressed

    private void PhieuNhapbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhieuNhapbtnMousePressed
        setColor(PhieuNhapbtn);
        resetcolor(storebtn);
        resetcolor(billbtn);
        resetcolor(accbtn);
        resetcolor(logoutbtn);
        resetcolor(exitbtn);
        resetcolor(khbtn);
        resetcolor(doanhThubtn);
        resetcolor(BaoCaobtn);
        PhieuNhap_Frame pn = new PhieuNhap_Frame();
        openchildframe(pn);
    }//GEN-LAST:event_PhieuNhapbtnMousePressed

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
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BaoCaobtn;
    private javax.swing.JDesktopPane DPane;
    private javax.swing.JPanel PhieuNhapbtn;
    private javax.swing.JPanel accbtn;
    private javax.swing.JPanel billbtn;
    private javax.swing.JPanel doanhThubtn;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel khbtn;
    private javax.swing.JPanel logoutbtn;
    private javax.swing.JPanel storebtn;
    // End of variables declaration//GEN-END:variables
}
