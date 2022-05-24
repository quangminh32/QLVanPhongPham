/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import DTO.HoaDon;
import BLL.HOADON_BLL;
public class Bill_Frame extends javax.swing.JInternalFrame {

    HOADON_BLL bll = new HOADON_BLL();
    
    public Bill_Frame() throws ClassNotFoundException {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        bll.getALLBill(jTable1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Updatebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        cthdbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Search_txt = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();
        Rfbtn = new javax.swing.JButton();
        TENKH_txt = new javax.swing.JTextField();
        MAHD_txt = new javax.swing.JTextField();
        NGAY_txt = new javax.swing.JTextField();
        SDT_txt = new javax.swing.JTextField();
        NV_txt = new javax.swing.JTextField();
        TONG_txt = new javax.swing.JTextField();
        searchcbbox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPasswordField1.setText("jPasswordField1");

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(960, 630));

        jPanel2.setBackground(new java.awt.Color(113, 86, 221));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ HÓA ĐƠN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setText("Tên KH");

        jLabel6.setText("Mã HĐ");

        jLabel7.setText("SÐT");

        jLabel8.setText("Ngày");

        jLabel9.setText("Tổng");

        Updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image10.png"))); // NOI18N
        Updatebtn.setText("Sửa Thông Tin Hóa Đơn");
        Updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UpdatebtnMousePressed(evt);
            }
        });

        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image9.png"))); // NOI18N
        addbtn.setText("Thêm Hóa Đơn");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image6.png"))); // NOI18N
        delbtn.setText("Xóa Hóa Đơn");
        delbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                delbtnMousePressed(evt);
            }
        });
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        cthdbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image8.png"))); // NOI18N
        cthdbtn.setText("Chi Tiết Hóa Đơn");
        cthdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cthdbtnActionPerformed(evt);
            }
        });

        jLabel10.setText("Nhân Viên BH");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image12.png"))); // NOI18N
        jButton1.setText("Clear ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel3.setText("Search");

        Searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image7.png"))); // NOI18N
        Searchbtn.setText("Search");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });

        Rfbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image11.png"))); // NOI18N
        Rfbtn.setText("Refresh ");
        Rfbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RfbtnActionPerformed(evt);
            }
        });

        MAHD_txt.setEditable(false);

        SDT_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDT_txtActionPerformed(evt);
            }
        });

        searchcbbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MaHD", "TenKH", "Ngay", "NV" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Tên KH", "SĐT KH", "Ngày", "Tổng", "Nhân Viên"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TONG_txt)
                                    .addComponent(NGAY_txt)
                                    .addComponent(TENKH_txt)
                                    .addComponent(MAHD_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(SDT_txt)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NV_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchcbbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Searchbtn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cthdbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Rfbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Search_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Searchbtn)
                            .addComponent(searchcbbox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(cthdbtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(MAHD_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TENKH_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(addbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SDT_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(Updatebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NGAY_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delbtn)
                    .addComponent(jLabel8))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TONG_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rfbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NV_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
        if(checkdata()){
            String TENKH = TENKH_txt.getText();
            int SDTKH = Integer.parseInt(SDT_txt.getText());
            String date = java.time.LocalDate.now().toString();
            int Tong = Integer.parseInt(TONG_txt.getText());
            String NV = NV_txt.getText();
            HoaDon hd = new HoaDon(0,TENKH,SDTKH,date,Tong,NV);
            bll.insertbill(hd);
            try {
                bll.getALLBill(jTable1);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Bill_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delbtnActionPerformed

    private void cthdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cthdbtnActionPerformed

        CTHD_Frame.MAHD = Integer.parseInt(MAHD_txt.getText());
        new CTHD_Frame().setVisible(true);
    }//GEN-LAST:event_cthdbtnActionPerformed
    private boolean checkdata(){
        if(TENKH_txt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Tên khách hàng rỗng");
            TENKH_txt.requestFocus();
            return false;
        }
        else if(SDT_txt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"SÐT khách hàng rỗng");
            SDT_txt.requestFocus();
            return false;
        }      
        else if(NV_txt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Nhân viên bán hàng rỗng");
            NV_txt.requestFocus();
            return false;
        }
        return true;
        
    }
    private void delbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbtnMousePressed
        int MAHD = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        int result = JOptionPane.showConfirmDialog(this,"Xóa Hóa Đơn Số: "+MAHD,"Thông Báo",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            bll.delbill(MAHD);
            try {
                bll.getALLBill(jTable1);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Bill_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_delbtnMousePressed

    private void UpdatebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatebtnMousePressed
        if(checkdata()){
            int MAHD = Integer.parseInt(MAHD_txt.getText());
            String TENKH = TENKH_txt.getText();
            int SDTKH = Integer.parseInt(SDT_txt.getText());
            String date = NGAY_txt.getText();
            int Tong = Integer.parseInt(TONG_txt.getText());
            String NV = NV_txt.getText();
            HoaDon hd = new HoaDon(MAHD,TENKH,SDTKH,date,Tong,NV); 
            bll.UpdateHD(hd);
            try {
                bll.getALLBill(jTable1);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Bill_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_UpdatebtnMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        MAHD_txt.setText("");
        TENKH_txt.setText("");
        SDT_txt.setText("");
        TONG_txt.setText("");
        NGAY_txt.setText("");
        NV_txt.setText("");
    }//GEN-LAST:event_jButton1MousePressed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
        if(!Search_txt.getText().isEmpty()){
            if(searchcbbox.getSelectedItem()=="MaHD"){
                bll.SearchBill(Search_txt.getText(), "MaHD", jTable1);
            }
            else if(searchcbbox.getSelectedItem()=="TenKH"){
                bll.SearchBill(Search_txt.getText(), "TenKH", jTable1);
            }
            else if(searchcbbox.getSelectedItem()=="Ngay"){
                bll.SearchBill(Search_txt.getText(), "Ngay", jTable1);
            }
            else if(searchcbbox.getSelectedItem()=="NV"){
                bll.SearchBill(Search_txt.getText(), "NV", jTable1);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this,"Chua nhap tu khoa tim kiem");
            Search_txt.requestFocus();
        }
    }//GEN-LAST:event_SearchbtnActionPerformed

    private void RfbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RfbtnActionPerformed
        try {
            bll.getALLBill(jTable1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bill_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RfbtnActionPerformed

    private void SDT_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SDT_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SDT_txtActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
       int i = jTable1.getSelectedRow();
        MAHD_txt.setText( jTable1.getValueAt(i,0).toString());
        TENKH_txt.setText(  jTable1.getValueAt(i,1).toString());
        SDT_txt.setText(  jTable1.getValueAt(i,2).toString());
        NGAY_txt.setText(  jTable1.getValueAt(i,3).toString());
        TONG_txt.setText(  jTable1.getValueAt(i,4).toString());
        NV_txt.setText(  jTable1.getValueAt(i,5).toString());
        String mahd = jTable1.getValueAt(i,0).toString();
    }//GEN-LAST:event_jTable1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MAHD_txt;
    private javax.swing.JTextField NGAY_txt;
    private javax.swing.JTextField NV_txt;
    private javax.swing.JButton Rfbtn;
    private javax.swing.JTextField SDT_txt;
    private javax.swing.JTextField Search_txt;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTextField TENKH_txt;
    private javax.swing.JTextField TONG_txt;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton cthdbtn;
    private javax.swing.JButton delbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> searchcbbox;
    // End of variables declaration//GEN-END:variables
}