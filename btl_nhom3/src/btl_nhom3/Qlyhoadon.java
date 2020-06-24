package btl_nhom3;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Qlyhoadon extends javax.swing.JFrame {

    DefaultTableModel dtm;

    public void reset_text() {
        txt_ngaylap.setText("");
        txt_makh.setText("");
        txtmahd.setText("");
        txt_csm.setText("");
        txt_csc.setText("");
    }

    public void show_tb() {
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;
        dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) tbhd.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
            //System.out.println("Kết nối thành công");
            sm = conn.createStatement();
            dtm.setRowCount(0);
            String sql = "SELECT hoa_don.MaHD,hoa_don.NgayLap,hoa_don.MaKH,khach_hang.TenKH, khach_hang.DiaChi,hoa_don.ChiSoMoi,hoa_don.ChiSoCu ,don_gia.DonGia from hoa_don JOIN khach_hang ON hoa_don.MaKH=khach_hang.MaKH JOIN don_gia ON khach_hang.LoaiKH=don_gia.LoaiKH";
            rs = sm.executeQuery(sql);
            while (rs.next()) {
                String[] column = new String[9];
                column[0] = String.valueOf(rs.getInt("MaHD"));
                column[1] = rs.getString("NgayLap");
                column[2] = rs.getString("MaKH");
                column[3] = rs.getString("tenKH");
                column[4] = rs.getString("ChiSoMoi");
                column[5] = rs.getString("ChiSoCu");
                int tongtien;
                int dg = rs.getInt("dongia");
                int csm = rs.getInt("ChiSoMoi");
                int csc = rs.getInt("ChiSoCu");
                int sonuoc = csm - csc;
                tongtien = dg * sonuoc;
                column[6] = String.valueOf(sonuoc);
                column[7] = rs.getString("dongia");
                column[8] = String.valueOf(tongtien);
                dtm.addRow(column);
            }
            conn.close();
            sm.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println ("kết nối thất bại");
        } catch (Exception ex) {
            System.out.println ("kết nối thất bại");
        }
    }

    public Qlyhoadon() {
        initComponents();
        show_tb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnquaylai = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btnHienthi = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_makh = new javax.swing.JTextField();
        txt_csm = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbhd = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_tkmakh = new javax.swing.JTextField();
        btn_tkmakh = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_tktenkh = new javax.swing.JTextField();
        btn_tktenkh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtmahd = new javax.swing.JTextField();
        btn_in = new javax.swing.JButton();
        txt_ngaylap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_csc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_tenkhtk = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_makhtk = new javax.swing.JTextField();
        txt_tknuocTenkh = new javax.swing.JTextField();
        btn_tracuunuocmakh = new javax.swing.JButton();
        btntracunuoctenkh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbnuoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý hoá đơn và Quản lý chỉ số nước");

        btnquaylai.setText("Quay lại");
        btnquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquaylaiActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xoá");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btnHienthi.setText("Hiển thị");
        btnHienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHienthi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(btnthem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnxoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHienthi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btn_reset)
                .addContainerGap())
        );

        jLabel3.setText("Mã khách hàng:");

        jLabel5.setText("Chỉ số nước mới:");

        jLabel11.setText("Ngày lập:");

        tbhd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hoá đơn", "Ngày Lập", "Mã KH", "Tên KH", "Chỉ số mới", "Chỉ số cũ", "Số nước TT", "đơn giá", "Thành tiền"
            }
        ));
        tbhd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbhdMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbhd);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Bảng hoá đơn");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setText("Tìm kiếm hoá đơn theo mã khách hàng:");

        btn_tkmakh.setText("Tìm kiếm");
        btn_tkmakh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tkmakhActionPerformed(evt);
            }
        });

        jLabel13.setText("Tìm kiếm hoá đơn theo tên khách hàng:");

        btn_tktenkh.setText("Tìm kiếm");
        btn_tktenkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tktenkhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tkmakh))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tktenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tkmakh)
                    .addComponent(btn_tktenkh))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_tktenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tktenkh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tkmakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tkmakh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Mã hoá đơn:");

        btn_in.setText("In hoá đơn");
        btn_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inActionPerformed(evt);
            }
        });

        jLabel6.setText("Chỉ số nước cũ:");

        jLabel7.setText("(tự động nhập)");

        jLabel8.setText("(tự động nhâp)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btn_in))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_ngaylap, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel3))
                                            .addComponent(jLabel6))
                                        .addGap(97, 97, 97)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_makh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_csm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_csc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(138, 138, 138)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_makh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(txt_csm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_csc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_ngaylap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addGap(49, 49, 49))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_in)
                            .addComponent(jLabel1)
                            .addComponent(txtmahd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Quản lý hoá đơn", jPanel1);

        jLabel2.setText("Mã khách hàng");

        jLabel4.setText("Tên khách hàng");

        btn_tracuunuocmakh.setText("tra cứu theo mã khách hàng");
        btn_tracuunuocmakh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tracuunuocmakhActionPerformed(evt);
            }
        });

        btntracunuoctenkh.setText("tra cứu theo tên khách hàng");
        btntracunuoctenkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntracunuoctenkhActionPerformed(evt);
            }
        });

        tbnuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Ngày đo", "Chỉ số mới", "chỉ số cũ", "Số nước TT"
            }
        ));
        jScrollPane2.setViewportView(tbnuoc);

        javax.swing.GroupLayout txt_tenkhtkLayout = new javax.swing.GroupLayout(txt_tenkhtk);
        txt_tenkhtk.setLayout(txt_tenkhtkLayout);
        txt_tenkhtkLayout.setHorizontalGroup(
            txt_tenkhtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_tenkhtkLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(txt_tenkhtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(txt_tenkhtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_makhtk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tknuocTenkh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(txt_tenkhtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_tracuunuocmakh)
                    .addComponent(btntracunuoctenkh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(txt_tenkhtkLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        txt_tenkhtkLayout.setVerticalGroup(
            txt_tenkhtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txt_tenkhtkLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(txt_tenkhtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_makhtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tracuunuocmakh))
                .addGap(18, 18, 18)
                .addGroup(txt_tenkhtkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tknuocTenkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntracunuoctenkh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("tra cứu chỉ số nước", txt_tenkhtk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnquaylai, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnquaylai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        dispose();
        Main a = new Main();
        a.setVisible(true);
    }//GEN-LAST:event_btnquaylaiActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset_text();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;
        
        
        if (txt_makh.getText().isEmpty() || txt_csm.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(rootPane, "bạn nhập thiếu thông tin");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
                sm = conn.createStatement();
                String sql = "select hoa_don.ChiSoMoi from hoa_don where hoa_don.MaKH='" + txt_makh.getText() + "' and hoa_don.NgayLap=(select max(ngaylap) from hoa_don WHERE hoa_don.MaKH='" + txt_makh.getText() + "')";
                rs = sm.executeQuery(sql);
                int chiso = 0;
                while (rs.next()) {
                    chiso = rs.getInt("ChiSoMoi");
                }                                                                         
                if (Integer.valueOf(txt_csm.getText()) < chiso) {
                    JOptionPane.showMessageDialog(rootPane, "Chỉ số mới phải lớn hơn chỉ số cũ, Chỉ số cũ= " + chiso + "");
                } else {
                    String sql2 = "INSERT INTO hoa_don(MaKH,ChiSoCu,ChiSoMoi,NgayLap) values ('" + txt_makh.getText() + "','" + chiso + "','" + txt_csm.getText() + "','"+java.time.LocalDate.now()+"') ";
                    sm.executeUpdate(sql2);
                    show_tb();
                    reset_text();
                }
                conn.close();
                sm.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btn_tktenkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tktenkhActionPerformed
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;
        DefaultTableModel dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) tbhd.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
            sm = conn.createStatement();
            if (txt_tktenkh.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập tên khách hàng cần tìm kiếm");
                return;
            } else {
                dtm.setRowCount(0);
                String sql = "SELECT hoa_don.MaHD,hoa_don.NgayLap,hoa_don.MaKH,khach_hang.TenKH, khach_hang.DiaChi,hoa_don.ChiSoMoi,hoa_don.ChiSoCu ,don_gia.DonGia from hoa_don JOIN khach_hang ON hoa_don.MaKH=khach_hang.MaKH JOIN don_gia ON khach_hang.LoaiKH=don_gia.LoaiKH where TenKH like'%" + txt_tktenkh.getText() + "%'";
                rs = sm.executeQuery(sql);
                String[] column = new String[9];
                
                while (rs.next()) {
                    //String[] column = new String[9];
                    column[0] = String.valueOf(rs.getInt("MaHD"));
                    column[1] = rs.getString("NgayLap");
                    column[2] = rs.getString("MaKH");
                    column[3] = rs.getString("tenKH");
                    column[4] = rs.getString("ChiSoMoi");
                    column[5] = rs.getString("ChiSoCu");
                    int tongtien;
                    int dg = rs.getInt("dongia");
                    int csm = rs.getInt("ChiSoMoi");
                    int csc = rs.getInt("ChiSoCu");
                    int sonuoc = csm - csc;
                    tongtien = dg * sonuoc;
                    column[6] = String.valueOf(sonuoc);
                    column[7] = rs.getString("dongia");
                    column[8] = String.valueOf(tongtien);
                    dtm.addRow(column);
                }
                if(dtm.getRowCount()==0) JOptionPane.showMessageDialog(rootPane, "Không tìm thấy dữ liệu");
                
            }
            conn.close();
            sm.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_tktenkhActionPerformed

    private void btn_tkmakhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tkmakhActionPerformed
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;
        dtm = new DefaultTableModel();
        dtm = (DefaultTableModel) tbhd.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
            sm = conn.createStatement();
            dtm.setRowCount(0);
            if (txt_tkmakh.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã khách hàng cần tìm kiếm");
                return;
            } else {
                String sql = "SELECT hoa_don.MaHD,hoa_don.NgayLap,hoa_don.MaKH,khach_hang.TenKH, khach_hang.DiaChi,hoa_don.ChiSoMoi,hoa_don.ChiSoCu ,don_gia.DonGia from hoa_don JOIN khach_hang ON hoa_don.MaKH=khach_hang.MaKH JOIN don_gia ON khach_hang.LoaiKH=don_gia.LoaiKH where hoa_don.MaKH like'" + txt_tkmakh.getText() + "'";
                rs = sm.executeQuery(sql);
                while (rs.next()) {
                    String[] column = new String[9];
                    column[0] = String.valueOf(rs.getInt("MaHD"));
                    column[1] = rs.getString("NgayLap");
                    column[2] = rs.getString("MaKH");
                    column[3] = rs.getString("tenKH");
                    column[4] = rs.getString("ChiSoMoi");
                    column[5] = rs.getString("ChiSoCu");
                    int tongtien;
                    int dg = rs.getInt("dongia");
                    int csm = rs.getInt("ChiSoMoi");
                    int csc = rs.getInt("ChiSoCu");
                    int sonuoc = csm - csc;
                    tongtien = dg * sonuoc;
                    column[6] = String.valueOf(sonuoc);
                    column[7] = rs.getString("dongia");
                    column[8] = String.valueOf(tongtien);
                    dtm.addRow(column);
                }
            }
            conn.close();
            sm.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_tkmakhActionPerformed

    private void tbhdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbhdMouseClicked
        try{
        TableModel model = tbhd.getModel();
        int click = tbhd.getSelectedRow();
        txt_makh.setText(model.getValueAt(click, 2).toString());
        txt_csm.setText(model.getValueAt(click, 4).toString());
        txt_ngaylap.setText(model.getValueAt(click, 1).toString());
        txtmahd.setText(model.getValueAt(click, 0).toString());
        txt_csc.setText(model.getValueAt(click, 5).toString());
        }catch(Exception e){
            System.out.println("kết nối thất bại");
        }
    }//GEN-LAST:event_tbhdMouseClicked

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;
        DefaultTableModel dtm = new DefaultTableModel();

        dtm = (DefaultTableModel) tbhd.getModel();
        if (txtmahd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã hoá đơn cần xóa");
            return;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
                sm = conn.createStatement();
                String check_hd="";
                String sql1="select MaHD from hoa_don where MaHD='"+txtmahd.getText()+"'";
                rs=sm.executeQuery(sql1);
                while(rs.next()){
                    check_hd=rs.getString("MaHD");
                }
                if("".equals(check_hd)){
                    JOptionPane.showMessageDialog(rootPane, "không có mã hoá đơn này trong hệ thống");
                }
                else{
                
                String sql = "delete from hoa_don where MaHD='" + txtmahd.getText() + "'";
                sm.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "Xoá hoá đơn thành công");
                show_tb();
                }
                conn.close();
                sm.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "KHÔNG TÌM THẤY HOÁ ĐƠN CẦN XOÁ");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
            sm = conn.createStatement();
            String sql2 = "UPDATE `hoa_don` SET  `MaKH` = '" + txt_makh.getText() + "', `ChiSoMoi` = '" + txt_csm.getText() + "', `ChiSoCu` = '" + txt_csc.getText() + "' ,`NgayLap` = '" + txt_ngaylap.getText() + "' WHERE `hoa_don`.`MaHD` ='" + txtmahd.getText() + "' ";
            sm.executeUpdate(sql2);
            show_tb();
            reset_text();
            JOptionPane.showMessageDialog(rootPane, "Sửa thông tin thành công");
            conn.close();
            sm.close();
            rs.close();
        } catch (SQLException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Sửa thông tin không thành công");
        } catch (Exception ex) {
           
        }

    }//GEN-LAST:event_btnsuaActionPerformed

    private void btn_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;

        if (txtmahd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã hoá đơn cần in");
            return;
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
                sm = conn.createStatement();
                String check_hd = "";
                String sql1 = "select MaHD from hoa_don where MaHD='" + txtmahd.getText() + "'";
                rs = sm.executeQuery(sql1);
                while (rs.next()) {
                    check_hd = rs.getString("MaHD");
                }
                if ("".equals(check_hd)) {
                    JOptionPane.showMessageDialog(rootPane, "không có mã hoá đơn này trong hệ thống");
                } else {
                    mauHoaDon a = new mauHoaDon(txtmahd.getText());
                    a.setVisible(true);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Qlyhoadon.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_inActionPerformed

    private void btnHienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthiActionPerformed
        // TODO add your handling code here:
        show_tb();
    }//GEN-LAST:event_btnHienthiActionPerformed

    private void btn_tracuunuocmakhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tracuunuocmakhActionPerformed
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;

        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
            sm = conn.createStatement();
            dtm = new DefaultTableModel();
            dtm = (DefaultTableModel) tbnuoc.getModel();
            dtm.setRowCount(0);
            if (txt_makhtk.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập Mã khách hàng cần tìm kiếm");
                return;
            } else {
                String sql1 = "SELECT hoa_don.MaKH,khach_hang.TenKH,hoa_don.NgayLap,hoa_don.ChiSoMoi,hoa_don.ChiSoCu from hoa_don JOIN khach_hang ON hoa_don.MaKH=khach_hang.MaKH WHERE hoa_don.MaKH='" + txt_makhtk.getText() + "'";
                rs = sm.executeQuery(sql1);
                while (rs.next()) {
                    String[] a = new String[6];
                    a[0] = rs.getString(1);
                    a[1] = rs.getString(2);
                    a[2] = rs.getString(3);
                    a[3] = rs.getString(4);
                    a[4] = rs.getString(5);
                    int csm = rs.getInt("ChiSoMoi");
                    int csc = rs.getInt("ChiSoCu");
                    int sonuoc;
                    sonuoc = csm - csc;
                    a[5] = String.valueOf(sonuoc);
                    dtm.addRow(a);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Qlyhoadon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_tracuunuocmakhActionPerformed

    private void btntracunuoctenkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntracunuoctenkhActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        Statement sm = null;
        ResultSet rs = null;
        try {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3", "root", "");
            sm = conn.createStatement();
            dtm = new DefaultTableModel();
            dtm = (DefaultTableModel) tbnuoc.getModel();
            dtm.setRowCount(0);
            if (txt_tknuocTenkh.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập Tên khách hàng cần tìm kiếm");
                return;
            } else {
                String sql1 = "SELECT hoa_don.MaKH,khach_hang.TenKH,hoa_don.NgayLap,hoa_don.ChiSoMoi,hoa_don.ChiSoCu from hoa_don JOIN khach_hang ON hoa_don.MaKH=khach_hang.MaKH WHERE khach_hang.TenKH LIKE '%"+txt_tknuocTenkh.getText()+"%'";
                rs = sm.executeQuery(sql1);
                while (rs.next()) {
                    String[] a = new String[6];
                    a[0] = rs.getString(1);
                    a[1] = rs.getString(2);
                    a[2] = rs.getString(3);
                    a[3] = rs.getString(4);
                    a[4] = rs.getString(5);
                    int csm = rs.getInt("ChiSoMoi");
                    int csc = rs.getInt("ChiSoCu");
                    int sonuoc;
                    sonuoc = csm - csc;
                    a[5] = String.valueOf(sonuoc);
                    dtm.addRow(a);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Qlyhoadon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btntracunuoctenkhActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qlyhoadon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienthi;
    private javax.swing.JButton btn_in;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tkmakh;
    private javax.swing.JButton btn_tktenkh;
    private javax.swing.JButton btn_tracuunuocmakh;
    private javax.swing.JButton btnquaylai;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntracunuoctenkh;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbhd;
    private javax.swing.JTable tbnuoc;
    private javax.swing.JTextField txt_csc;
    private javax.swing.JTextField txt_csm;
    private javax.swing.JTextField txt_makh;
    private javax.swing.JTextField txt_makhtk;
    private javax.swing.JTextField txt_ngaylap;
    private javax.swing.JPanel txt_tenkhtk;
    private javax.swing.JTextField txt_tkmakh;
    private javax.swing.JTextField txt_tknuocTenkh;
    private javax.swing.JTextField txt_tktenkh;
    private javax.swing.JTextField txtmahd;
    // End of variables declaration//GEN-END:variables
}
