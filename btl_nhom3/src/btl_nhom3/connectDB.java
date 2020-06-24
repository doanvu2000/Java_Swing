/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btl_nhom3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import KhachHang.KhachHang;
import java.util.ArrayList;
public class connectDB {
    Connection conn=null;
    Statement stmt = null;
    connectDB(){
      try {
          Class.forName("com.mysql.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhom3","root","");
          stmt = conn.createStatement();
          System.out.println("Kết nối thành công");
      }catch(Exception e){
          JOptionPane.showConfirmDialog(null, e);
      };
     }
    public boolean AddKH(KhachHang kh){
        String sql = String.format("insert into khach_hang(MaKH, TenKH, CMT,DiaChi, SDTKH,LoaiKH) Value"
                + "(%d,'%s','%s','%s','%s','%s')",kh.getMaKH(),kh.getTenKH(),kh.getCMT(),
                kh.getDiaChi(),kh.getSDTKH(),kh.getLoaiKH());
        try {
            int rs = stmt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<KhachHang> getAllData() throws SQLException{
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khach_hang";
        KhachHang temp = null;
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            temp = new KhachHang();
            int maKH = rs.getInt("MaKH");
            String tenKH = rs.getString("TenKH");
            String CMT = rs.getString("CMT");
            String DiaChi = rs.getString("DiaChi");
            String SDT = rs.getString("SDTKH");
            String Loai = rs.getString("LoaiKH");
            temp.setMaKH(maKH);
            temp.setTenKH(tenKH);
            temp.setCMT(CMT);
            temp.setDiaChi(DiaChi);
            temp.setSDTKH(SDT);
            temp.setLoaiKH(Loai);
            list.add(temp);
        }
        rs.close();
        return list;
    }
    public boolean UpdateKH(KhachHang kh){
        String sql = String.format("UPDATE  khach_hang SET TenKH = '%s', CMT = '%s'"
                + ",DiaChi = '%s', SDTKH = '%s',LoaiKH = '%s' WHERE MaKH = %d",kh.getTenKH(),kh.getCMT(),
                kh.getDiaChi(),kh.getSDTKH(),kh.getLoaiKH(),kh.getMaKH());
        try {
            int rs = stmt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean DeleteKH(int MaKh){
        String sql = String.format("delete from khach_hang where MaKH = %d",MaKh);
        try {
            int rs = stmt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<KhachHang> search(int x) throws SQLException{
        ArrayList<KhachHang> list = new ArrayList<>();
        String sql = "select * from khach_hang where MaKH LIKE '"+x+"%'";
        KhachHang temp = null;
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            temp = new KhachHang();
            int maKH = rs.getInt("MaKH");
            String tenKH = rs.getString("TenKH");
            String CMT = rs.getString("CMT");
            String DiaChi = rs.getString("DiaChi");
            String SDT = rs.getString("SDTKH");
            String Loai = rs.getString("LoaiKH");
            temp.setMaKH(maKH);
            temp.setTenKH(tenKH);
            temp.setCMT(CMT);
            temp.setDiaChi(DiaChi);
            temp.setSDTKH(SDT);
            temp.setLoaiKH(Loai);
            list.add(temp);
        }
        rs.close();
        return list;
    }
}
