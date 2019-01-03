/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import entitas.Emtitas_Jenis_Kue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Jenis_Method {
      Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
     public  Jenis_Method () throws Exception{
        try {
            st = koneksi.getKoneksi().createStatement();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan saat Membuat Koneksi pada : \n"+e); 
            throw e;
        } finally{
               System.out.println("Ini Finally Block");       
        }
    }
      public List tampil(){
        List logData = new ArrayList();
        sql = "select * from jenis_kue order by id_jenis asc ";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                entitas.Emtitas_Jenis_Kue eb = new Emtitas_Jenis_Kue();
                eb.setId_jenis(rs.getString("id_jenis"));
                eb.setNama_jenis(rs.getString("nama_jenis"));
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(Emtitas_Jenis_Kue.class.getName()).log(Level.SEVERE,null,e);            
        }finally{
            System.out.println("Ini Finally Block");
        }
        return logData;
    }
    
    public int tambah(Emtitas_Jenis_Kue eb){
        sql = "insert into jenis_kue (id_jenis, nama_jenis) values ('"+eb.getId_jenis()
                +"', '"+eb.getNama_jenis()+"')";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(Emtitas_Jenis_Kue.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            System.out.println("Ini Finally Block");
        }
        return hasil;
    }
    
    public int hapus(Emtitas_Jenis_Kue eb){
        sql = "delete from jenis_kue where id_jenis= '"+eb.getId_jenis()+"'";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(Emtitas_Jenis_Kue.class.getName()).log(Level.SEVERE,null,e);
        }
        return hasil;
    }
    
    public int edit(Emtitas_Jenis_Kue eb){
        sql = "update jenis_kue set nama_jenis = '"+eb.getNama_jenis()
                +"' where id_jenis = '"+eb.getId_jenis()+"'";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(Emtitas_Jenis_Kue.class.getName()).log(Level.SEVERE,null,e);
        }finally{
            System.out.println("Ini Finally Block");
        }
        return hasil;
    }
    
    public List cari(String caridata){
        List logData = new ArrayList();
        sql = "select * from jenis_kue where id_jenis like '%"+caridata+"%' or nama_jenis like '%"+caridata+"%' order by id_jenis asc";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Emtitas_Jenis_Kue eb = new Emtitas_Jenis_Kue();
                eb.setId_jenis(rs.getString("id_jenis"));
                eb.setNama_jenis(rs.getString("nama_jenis"));
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(Emtitas_Jenis_Kue.class.getName()).log(Level.SEVERE,null,e);            
        } finally{
            System.out.println("Ini Finally Block");
        }
        return logData;
    }
    
}
