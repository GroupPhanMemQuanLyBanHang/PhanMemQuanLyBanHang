/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LoaiKHDTO;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author QT
 */
public class LoaiKHDAL {
    public static void Them(LoaiKHDTO LKH){
        String cautruyvan="insert into LoaiKhachHang(TenLoaiKH,GhiChu)"
                + "values(N'"+ LKH.getTenloaikh()+"',N'"+ LKH.getGhichu()+"')";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Xoa(String MaLoaiKH){
        String cautruyvan="delete LoaiKhachHang where MaLoaiKH=" + MaLoaiKH;
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Sua(LoaiKHDTO LKH){
        String cautruyvan="update LoaiKhachHang set TenLoaiKH=N'"+LKH.getTenloaikh()+"',GhiChu=N'"+LKH.getGhichu()+"'where MaLoaiKH ="+LKH.getMaloaikh();
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static ResultSet Select(){
        ResultSet rs;
        String cautruyvan="select * from LoaiKhachHang";
        rs= ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }

    
}
