/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KhachHang;

/**
 *
 * @author 84987
 */
public class KhachHang {
    private int MaKH;
    private String TenKH;
    private String CMT;
    private String DiaChi;
    private String SDTKH;
    private String LoaiKH;

    public KhachHang(int MaKH, String TenKH, String CMT, String DiaChi, String SDTKH, String LoaiKH) {
        this.MaKH = MaKH;
        this.TenKH = TenKH;
        this.CMT = CMT;
        this.DiaChi = DiaChi;
        this.SDTKH = SDTKH;
        this.LoaiKH = LoaiKH;
    }

    public KhachHang() {
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getCMT() {
        return CMT;
    }

    public void setCMT(String CMT) {
        this.CMT = CMT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDTKH() {
        return SDTKH;
    }

    public void setSDTKH(String SDTKH) {
        this.SDTKH = SDTKH;
    }

    public String getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(String LoaiKH) {
        this.LoaiKH = LoaiKH;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "MaKH=" + MaKH + ", TenKH=" + TenKH + ", CMT=" + CMT + ", DiaChi=" + DiaChi + ", SDTKH=" + SDTKH + ", LoaiKH=" + LoaiKH + '}';
    }
    
}
