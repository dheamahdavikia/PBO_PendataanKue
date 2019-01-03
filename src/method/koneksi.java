/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi() throws Exception{
        if(koneksi == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/list_kue","root","");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan saat Membuat Koneksi pada :\n"+e);
                throw e;
            }
        }
        return koneksi;
    }
    
}
