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
public class LoaiKHDTO {
    int maloaikh;
    String tenloaikh;
    String ghichu;

    public LoaiKHDTO() {
    }

    public LoaiKHDTO(int maloaikh, String tenloaikh, String ghichu) {
        this.maloaikh = maloaikh;
        this.tenloaikh = tenloaikh;
        this.ghichu = ghichu;
    }

    public int getMaloaikh() {
        return maloaikh;
    }

    public void setMaloaikh(int maloaikh) {
        this.maloaikh = maloaikh;
    }
   

    public String getTenloaikh() {
        return tenloaikh;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setTenloaikh(String tenloaikh) {
        this.tenloaikh = tenloaikh;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
    
}
