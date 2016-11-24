/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class KhachHangBLL {
        public static void JTableKhachhang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Khách Hàng ","Mã Khách Hàng", "Số Điện Thoại","Địa Chỉ","Số Lượng","Đơn Giá"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[6];
                item[0] = rs.getString("TenKH");
                item[1] = rs.getString("MaKH");
                item[2] = rs.getString("SoDienThoai");
                item[3] = rs.getString("DiaChi");
                item[4] = rs.getString("SoLuong");
                item[5] = rs.getString("GiaBan");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public  static  void  ThemKhachHang(KhachHangDTO kh){
        boolean KT = KiemTra(kh);
        if(KT){
             KhachHangDAL.CauTruyVanThemSP(kh);
        }else{
            
        }
    }
    public  static  void  SuaKhachHang(KhachHangDTO kh){
        boolean KetQua = KiemTra(kh);
        if(KetQua){
            KhachHangDAL.CauTruyVanSuaNV(kh);
        }
    }

        public static boolean  KiemTra(KhachHangDTO KH){
            boolean KetQua = true;
            if(KH.getMota().equals(KetQua)){
                System.out.println("Pass");
                return  false;
            }
            return KetQua;
        }
        public static void ThemKH(KhachHangDTO Kh) {
         boolean Ketqua = KiemTra(Kh);
         if(Ketqua){
             KhachHangDAL.CauTruyVanThemSP(Kh);
         }
    }
        public static ResultSet LayTatCaKhachHang(){
        ResultSet rs;
        rs = KhachHangDAL.LayDanhSachKhachHang();
        return rs;
    }
        public static void DanhSachTenKhachHang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã KH","Tên Khách Hàng"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[2];
                item[0] = rs.getString("MaKH");
                item[1] = rs.getString("TenKH");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
        public static void DSnhom(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Khách Hàng ","Mã Khách Hàng", "Số Điện Thoại","Địa Chỉ","Số Lượng","Đơn Giá"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[6];
                item[0] = rs.getString("TenKH");
                item[1] = rs.getString("MaKH");
                item[2] = rs.getString("SoDienThoai");
                item[3] = rs.getString("DiaChi");
                item[4] = rs.getString("SoLuong");
                item[5] = rs.getString("GiaBan");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
        
        public static void LayKHTheoMaKH(ResultSet rs, JTable tableTam){
            Object [] objs = new Object[]{"Mã Khách Hàng","Tên Khách Hàng","Số Điện Thoại","Địa Chỉ"};
            DefaultTableModel tableModel = new DefaultTableModel(objs,0);
            tableTam.setModel(tableModel);
            
            try {
                while(rs.next()){
                    Object[] item = new Object[4];
                    item[0] = rs.getInt("MaKH");
                    item[1] = rs.getString("TenKH");
                    item[2] = rs.getString("SoDienThoai");
                    item[3] = rs.getString("DiaChi");
                    tableModel.addRow(item);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
        public static void LayKH(ResultSet rs, JTable tableTam){
            Object [] objs = new Object[]{"Mã Khách Hàng","Mã loại KH","Tên khách hàng","Địa chỉ","Số ĐT","Loại KH"};
            DefaultTableModel tableModel = new DefaultTableModel(objs,0);
            tableTam.setModel(tableModel);          
            try {
                while(rs.next()){
                    Object[] item = new Object[7];
                    item[0] = rs.getInt("MaKH");
                    item[1] = rs.getString("MaLoaiKH");
                    item[2] = rs.getString("TenKH");
                    item[3] = rs.getString("DiaChi");
                    item[4] = rs.getString("SoDienThoai");
                    item[5] = rs.getString("LoaiKH");
                    tableModel.addRow(item);
                }
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
}
