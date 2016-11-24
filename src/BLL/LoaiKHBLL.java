/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.LoaiKHDAL;
import DTO.LoaiKHDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QT
 */
public class LoaiKHBLL {
    public static void DoDuLieu(ResultSet rs, JTable jTable10) {
        Object[] objs = new Object[]{ "Nhóm Khách hàng"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        jTable10.setModel(tableModel);
        try {
            while (rs.next()) {
                Object[] item = new Object[1];
               
                item[0] = rs.getString("TenLoaiKH");
               
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public static boolean KiemTra(LoaiKHDTO LKH){
        boolean ketqua = true;
        if(LKH.getTenloaikh().trim().equals("")){
            System.out.println("Chưa nhập tên");
            return false;
        }
        return ketqua;
    }     
      public static void Them(LoaiKHDTO LKH){
          boolean ketquakiemtra = KiemTra(LKH);
          if(ketquakiemtra){
              LoaiKHDAL.Them(LKH);
          }
      }
      public static void Sua(LoaiKHDTO LKH) {
        boolean ketquakiemtra = KiemTra(LKH);
        if (ketquakiemtra) {
            LoaiKHDAL.Sua(LKH);
        }
    }

    public static void Xoa(String MaLoaiKH) {
        if (MaLoaiKH.equals("")) {

        } else {
            LoaiKHDAL.Xoa(MaLoaiKH);
        }
    }
    public static void RemoveRowInTable(JTable tblTam, int viTriDong){
        DefaultTableModel tableModel = (DefaultTableModel) tblTam.getModel();
        
        tableModel.removeRow(viTriDong);
    }
    

    public static ResultSet LayTatCaLoaiKH() {
        ResultSet rs;
        rs = LoaiKHDAL.Select();
        return rs;
    }

}

