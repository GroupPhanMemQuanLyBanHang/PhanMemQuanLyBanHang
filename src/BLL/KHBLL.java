/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KHDAL;
import DTO.KHDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QT
 */
public class KHBLL {
    public static void DoDuLieu(ResultSet rs, JTable khachhang) {
        Object[] objs = new Object[]{"Mã KH", "Mã Loại KH", "Họ Tên","Địa Chỉ","Giới Tính","Điện Thoại","Loại KH","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        khachhang.setModel(tableModel);
        try {
            while (rs.next()) {
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaKH");
                item[1] = rs.getInt("MaLoaiKH");
                item[2] = rs.getString("TenKH");
                item[3] = rs.getString("DiaChi");
                item[4] = rs.getInt("GioiTinh");
                item[5] = rs.getString("SoDienThoai");
                item[6] = rs.getString("LoaiKH");
                item[7] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static boolean KiemTra(KHDTO KH){
        boolean ketqua = true;
        if(KH.getTenkh().trim().equals("")){
            System.out.println("Chưa nhập tên");
            return false;
        }else if(KH.getDiachi().trim().equals("")){
            System.out.println("Chưa nhập địa chỉ");
            return false;      
        }else if(KH.getSdt().trim().equals("")){
            System.out.println("Chưa nhập số điện thoại");
            return false;
        }else if(KH.getLoaikh().trim().equals("")){
            System.out.println("Chưa nhập loại khách hàng");
            return false;
        }
        return ketqua;
    }     
      public static void Them(KHDTO KH){
          boolean ketquakiemtra = KiemTra(KH);
          if(ketquakiemtra){
              KHDAL.Them(KH);
          }
      }
      public static void Sua(KHDTO KH) {
        boolean ketquakiemtra = KiemTra(KH);
        if (ketquakiemtra) {
            KHDAL.Sua(KH);
        }
    }

    public static void Xoa(String MaKH) {
        if (MaKH.equals("")) {

        } else {
            KHDAL.Xoa(MaKH);
        }
    }
    public static void RemoveRowInTable(JTable tblTam, int viTriDong){
        DefaultTableModel tableModel = (DefaultTableModel) tblTam.getModel();       
        tableModel.removeRow(viTriDong);
    }  

    public static ResultSet LayTatCaKH() {
        ResultSet rs;
        rs = KHDAL.Select();
        return rs;
    }
    public static ResultSet LaySanPhamTheoTuKhoa(String tukhoa){
        ResultSet rs;
        rs = KHDAL.Search(tukhoa);
        
        return rs;
    }
}
