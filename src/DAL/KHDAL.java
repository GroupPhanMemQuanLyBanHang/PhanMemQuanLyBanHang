/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KHDTO;
import java.sql.ResultSet;

/**
 *
 * @author QT
 */
public class KHDAL {
    public static void Them(KHDTO KH){
        String cautruyvan="insert into KhachHang(MaLoaiKH,TenKH,DiaChi,GioiTinh,SoDienThoai,LoaiKH,MoTa)"
                + "values(N'"+ KH.getMaloaikh()+"',N'"+ KH.getTenkh()+"',N'"+KH.getDiachi()+"',N'"+KH.getGioitinh()+"',N'"+KH.getSdt()+"'"
                + ",N'"+KH.getLoaikh()+"',N'"+KH.getMota()+"')";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Xoa(String MaKH){
        String cautruyvan="delete KhachHang where MaKH=" + MaKH;
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Sua(KHDTO KH){
        String cautruyvan="update KhachHang set MaLoaiKH=N'"+KH.getMaloaikh()+"',TenKH=N'"+KH.getTenkh()+"',DiaChi=N'"+KH.getDiachi()+"',"
                + "GioiTinh=N'"+KH.getGioitinh()+"',SoDienThoai=N'"+KH.getSdt()+"',LoaiKH=N'"+KH.getLoaikh()+"',MoTa=N'"+KH.getMota()+"' where MaKH ="+KH.getMakh();
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static ResultSet Select(){
        ResultSet rs;
        String cautruyvan="select * from KhachHang";
        rs= ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }
    public static ResultSet Search(String tukhoa ){
        ResultSet rs;        
        String cautruyvan = "Select * from KhachHang "
                + "where MaLoaiKH like N'%" + tukhoa + "%' "
                + "or TenKH like N'%" + tukhoa + "%'"
                +"or DiaChi like N'%"+tukhoa+"%'"
                +"or GioiTinh like N'%"+tukhoa+"%'"
                +"or SoDienThoai like N'%"+tukhoa+"%'"
                +"or LoaiKH like N'%"+tukhoa+"%'"
                +"or MoTa like N'%"+tukhoa+"%'";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
         return rs;        
    }
}
