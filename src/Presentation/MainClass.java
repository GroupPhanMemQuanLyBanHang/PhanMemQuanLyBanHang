/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DAL.ConnectionDB;

/**
 *
 * @author Ridotoji Pham
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static ConnectionDB Connection = new ConnectionDB();
    public static void main(String[] args) {
        // TODO code application logic here
          FrmChinh frm = new FrmChinh();
           frm.show();
    }
    
}
