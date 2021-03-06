/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import BLL.HOADON_BLL;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
/**
 *
 * @author ASUS
 */
public class Chart_Frame extends javax.swing.JInternalFrame {

    /**
     * Creates new form Chart_Frame
     */
    HOADON_BLL bll = new HOADON_BLL();
    public Chart_Frame() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        bll.getYear(combobox);
        this.setSize(960,630);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();

        jButton1.setText("Tính Doanh Thu ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel4.setBackground(new java.awt.Color(113, 86, 221));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOANH THU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLabel5)
                .addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         DefaultCategoryDataset dcd = new DefaultCategoryDataset();
         String year = combobox.getSelectedItem().toString();
        dcd.setValue(bll.DoanhThu(year, "1"), "Doanh Thu","1");
        dcd.setValue(bll.DoanhThu(year, "2"), "Doanh Thu","2");
        dcd.setValue(bll.DoanhThu(year, "3"), "Doanh Thu","3");
        dcd.setValue(bll.DoanhThu(year, "4"), "Doanh Thu","4");
        dcd.setValue(bll.DoanhThu(year, "5"), "Doanh Thu","5");
        dcd.setValue(bll.DoanhThu(year, "6"), "Doanh Thu","6");
        dcd.setValue(bll.DoanhThu(year, "7"), "Doanh Thu","7");
        dcd.setValue(bll.DoanhThu(year, "8"), "Doanh Thu","8");
        dcd.setValue(bll.DoanhThu(year, "9"), "Doanh Thu","9");
        dcd.setValue(bll.DoanhThu(year, "10"), "Doanh Thu","10");
        dcd.setValue(bll.DoanhThu(year, "11"), "Doanh Thu","11");
        dcd.setValue(bll.DoanhThu(year, "12"), "Doanh Thu","12");
        JFreeChart barChart = ChartFactory.createBarChart("Doanh Thu", "Tháng", "$", dcd, PlotOrientation.VERTICAL, true, false, true);
        CategoryPlot barChrt = barChart.getCategoryPlot();
        barChrt.setRangeGridlinePaint(Color.BLACK);
        ChartPanel cp = new ChartPanel(barChart);
        panel1.removeAll();
        panel1.add(cp,BorderLayout.CENTER);
        panel1.validate();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
