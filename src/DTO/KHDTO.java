/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author QT
 */
public class KHDTO {
    int makh;
    int maloaikh;
    String tenkh;
    String diachi;
    int gioitinh;
    String sdt;
    String loaikh;
    String mota;

    public KHDTO() {
    }

    public KHDTO(int makh, int maloaikh, String tenkh, String diachi, int gioitinh, String sdt, String loaikh, String mota) {
        this.makh = makh;
        this.maloaikh = maloaikh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.loaikh = loaikh;
        this.mota = mota;
    }

    

    public int getMakh() {
        return makh;
    }

    public int getMaloaikh() {
        return maloaikh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getLoaikh() {
        return loaikh;
    }

    public String getMota() {
        return mota;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public void setMaloaikh(int maloaikh) {
        this.maloaikh = maloaikh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setLoaikh(String loaikh) {
        this.loaikh = loaikh;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
    
    
}
