/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_nhom3;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class mauHoaDon extends javax.swing.JFrame {

    /**
     * Creates new form mauHoaDon
     */
    
    public mauHoaDon(){
         initComponents();
    }
    
    public mauHoaDon(String mahd) {
        initComponents();
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;           
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
            sm = conn.createStatement();
            
            String sql = "SELECT hoa_don.MaHD,hoa_don.NgayLap,hoa_don.MaKH,khach_hang.TenKH, khach_hang.DiaChi,hoa_don.ChiSoMoi,hoa_don.ChiSoCu ,don_gia.DonGia from hoa_don JOIN khach_hang ON hoa_don.MaKH=khach_hang.MaKH JOIN don_gia ON khach_hang.LoaiKH=don_gia.LoaiKH where hoa_don.MaHD='"+mahd+"' ";
            rs = sm.executeQuery(sql);
            
            String MaHD = null;
            String NgayLap = null;
            String MaKH = null;
            String TenKH = null;
            String ChiSoMoi = null;
            String ChiSoCu = null;
            String DonGia = null;
            String SoNuoc = null;
            String ThanhTien = null;
          
            
            while(rs.next()){    
                MaHD = String.valueOf(rs.getInt("MaHD"));
                NgayLap = rs.getString("NgayLap");
                MaKH = rs.getString("MaKH");
                TenKH = rs.getString("tenKH");
                ChiSoMoi = rs.getString("ChiSoMoi");
                ChiSoCu = rs.getString("ChiSoCu");
                int tongtien;
                int dg = rs.getInt("dongia");
                int csm = rs.getInt("ChiSoMoi");
                int csc = rs.getInt("ChiSoCu");
                int sonuoc = csm - csc;
                tongtien = dg * sonuoc;
                SoNuoc = String.valueOf(sonuoc);
                DonGia = rs.getString("dongia");
                ThanhTien = String.valueOf(tongtien);
            }
            lbcsm.setText(ChiSoMoi);
            lbcsc.setText(ChiSoCu);
            lbsonuoc.setText(SoNuoc);
            lbthanhtien.setText(ThanhTien);
            lbngay.setText(NgayLap);
            lbmakh.setText(MaKH);
            lbhd.setText(MaHD);
            lbtenkh.setText(TenKH);
            System.out.print(MaKH);
            conn.close();
            sm.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbcsm = new javax.swing.JLabel();
        lbcsc = new javax.swing.JLabel();
        lbsonuoc = new javax.swing.JLabel();
        lbthanhtien = new javax.swing.JLabel();
        lbmakh = new javax.swing.JLabel();
        lbhd = new javax.swing.JLabel();
        lbngay = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbtenkh = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOÁ ĐƠN");

        jLabel2.setText("Mã khách hàng:");

        jLabel3.setText("Số hoá đơn:");

        jLabel4.setText("Ngày lập:");

        jLabel5.setText("Thành tiền");

        jLabel6.setText("Số nước tiêu thụ");

        jLabel7.setText("Chỉ Số cũ");

        jLabel8.setText("Chỉ Số mới");

        lbcsm.setText("chisonoi");

        lbcsc.setText("txtcsc");

        lbsonuoc.setText("txtsonuoc");

        lbthanhtien.setText("txtthanhtien");

        lbmakh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbmakh.setText("makh hiển thị");

        lbhd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbhd.setText("Số hoá đơn hiển thị");

        lbngay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbngay.setText("Ngày lập hiển thị");

        jLabel9.setText("Tên khách hàng");

        lbtenkh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbtenkh.setText("Tên khách hàng hiển thị");

        jLabel10.setText("Thuế GTGT");

        jLabel11.setText("0% (tiền nước)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcsm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcsc))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbsonuoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbthanhtien)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbhd, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(lbngay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbtenkh)
                            .addComponent(lbmakh))))
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbhd)
                    .addComponent(jLabel2)
                    .addComponent(lbmakh))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbngay)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(lbtenkh))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcsm)
                    .addComponent(lbcsc)
                    .addComponent(lbsonuoc)
                    .addComponent(lbthanhtien)
                    .addComponent(jLabel11))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        btn_close.setText("close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(btn_close))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_close)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_btn_closeActionPerformed

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
            java.util.logging.Logger.getLogger(mauHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mauHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mauHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mauHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mauHoaDon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbcsc;
    private javax.swing.JLabel lbcsm;
    private javax.swing.JLabel lbhd;
    private javax.swing.JLabel lbmakh;
    private javax.swing.JLabel lbngay;
    private javax.swing.JLabel lbsonuoc;
    private javax.swing.JLabel lbtenkh;
    private javax.swing.JLabel lbthanhtien;
    // End of variables declaration//GEN-END:variables
}
