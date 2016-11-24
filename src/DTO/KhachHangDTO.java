/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Ridotoji Pham
 */
public class KhachHangDTO {
    private int MaKH;
    private int MaLoaiKH;
    private String TenKhachHang;
    private String DiaChi;
    private int GioiTinh;
    private String SDT;
    private  int LoaiKH;
    private String Mota;

   public  KhachHangDTO(){
       
   }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public int getMaLoaiKH() {
        return MaLoaiKH;
    }

    public void setMaLoaiKH(int MaLoaiKH) {
        this.MaLoaiKH = MaLoaiKH;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(int LoaiKH) {
        this.LoaiKH = LoaiKH;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public KhachHangDTO(int MaKH, int MaLoaiKH, String TenKhachHang, String DiaChi, int GioiTinh, String SDT, int LoaiKH, String Mota) {
        this.MaKH = MaKH;
        this.MaLoaiKH = MaLoaiKH;
        this.TenKhachHang = TenKhachHang;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.LoaiKH = LoaiKH;
        this.Mota = Mota;
    }
   
}
