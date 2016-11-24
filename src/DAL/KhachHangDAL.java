/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHangDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class KhachHangDAL {
      public static void CauTruyVanThemSP(KhachHangDTO KH) {
        String SQLThem = "insert into KhachHang(MaLoaiKH,TenKH,DiaChi,GioiTinh,SoDienThoai,LoaiKH,MoTa) "
                + "values ("+KH.getMaLoaiKH()+",N'"+KH.getTenKhachHang()+"',N'"+KH.getDiaChi()+"','"+KH.getGioiTinh()+"','"+KH.getSDT()+"','"+KH.getLoaiKH()+"',N'"+KH.getMota()+"')" ;          
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
      public static void CauTruyVanSuaNV(KhachHangDTO kh) {
        String SQLSua = "update KhachHang set MaLoaiKH = '"+kh.getMaLoaiKH()+"',TenKH = N'"+kh.getTenKhachHang()+"',DiaChi = N'"+kh.getDiaChi()+"'"
                + ",GioiTinh = '"+kh.getGioiTinh()+"',SoDienThoai = '"+kh.getSDT()+"',LoaiKH = '"+kh.getLoaiKH()+"',MoTa = N'"+kh.getMota()+"' where MaKH = "+kh.getMaKH();
        ConnectionDB.ExcuteQueryUpdate(SQLSua);
    }
        public static ResultSet CauTruyvan(){
            ResultSet rs;
            String Sql = "select * from KhachHang,SanPham";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
        
        public static ResultSet LayDanhSachKhachHang(){
            ResultSet rs;
            String cautruyvan = "select * from KhachHang";
            rs =ConnectionDB.ExcuteQueryGetTable(cautruyvan);
            return  rs;
        }
        public static ResultSet LayKHTheoMaKH(int makh){
            ResultSet rs;
            String cauTruyVan = "select * from KhachHang where MaKH = " + makh; 
            rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
            return rs;
        }
}
