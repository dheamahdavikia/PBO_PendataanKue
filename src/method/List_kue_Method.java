/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import entitas.Entitas_list_kue;
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
public class List_kue_Method {
     Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
    public  List_kue_Method(){
        try {
            st = koneksi.getKoneksi().createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan saat Membuat Koneksi pada : \n"+e);
        }
    }
    
    public List tampil(){
        List logData = new ArrayList();
        sql = "select * from daftar_menu order by kd_kue asc";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Entitas_list_kue eb = new Entitas_list_kue();
                eb.setKd_kue(rs.getString("kd_kue"));
                eb.setNama_kue(rs.getString("nama_kue"));
                eb.setJenis_kue(rs.getString("jenis_kue"));
                eb.setHarga(rs.getString("harga"));      
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);            
        }
        return logData;
    }
    
    public int tambah(Entitas_list_kue eb){
        sql = "insert into daftar_menu (kd_kue, nama_kue, jenis_kue, harga) values ('"+eb.getKd_kue()
               +"', '"+eb.getNama_kue()+"', '"+eb.getJenis_kue()+"', '"+eb.getHarga()+"')";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);
        }
        return hasil;
    }
    
    public int hapus(Entitas_list_kue eb){
        sql = "delete from daftar_menu where kd_kue= '"+eb.getKd_kue()+"'";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);
        }
        return hasil;
    }
    
    public int edit(Entitas_list_kue eb){
        sql = "update daftar_menu set nama_kue = '"+eb.getNama_kue()
                +"', jenis_kue = '"+eb.getJenis_kue()+"', harga = '"+eb.getHarga()
                +"' where kd_kue = '"+eb.getKd_kue()+"'";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);
        }
        return hasil;
    }
    
    public List cari(String caridata){
        List logData = new ArrayList();
        sql = "select * from daftar_menu where kd_kue like '%"+caridata+"%' or nama_kue like '%"+caridata+"%'";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Entitas_list_kue eb = new Entitas_list_kue();
                eb.setKd_kue(rs.getString("kd_kue"));
                eb.setNama_kue(rs.getString("nama_kue"));
                eb.setJenis_kue(rs.getString("jenis_kue"));
                eb.setHarga(rs.getString("harga"));
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);            
        }
        return logData;
    }
    
    public List tampilSiswa(String kd_kue){
        List logData = new ArrayList();
        sql = "select * from daftar_menu where kd_kue = '"+kd_kue+"'";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Entitas_list_kue eb = new Entitas_list_kue();
                eb.setKd_kue(rs.getString("kd_kue"));
                eb.setNama_kue(rs.getString("nama_kue"));
                eb.setJenis_kue(rs.getString("jenis_kue"));
                eb.setHarga(rs.getString("harga"));
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);            
        }
        return logData;
    }
    public List id(){
        List logData = new ArrayList();
        sql = "select SUBSTR(kd_kue ,3,7) As kd_kue from daftar_menu ";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Entitas_list_kue eb = new Entitas_list_kue();
                eb.setKd_kue(rs.getString("kd_kue"));
               
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);            
        }
        return logData;
    }
    public List tampilSis(){
        List logData = new ArrayList();
        sql = "select kd_kue,nama_kue,jenis_kue,harga from daftar_menu inner join jenis_kue using (id_jenis)";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Entitas_list_kue eb = new Entitas_list_kue();
                eb.setKd_kue(rs.getString("kd_kue"));
                eb.setNama_kue(rs.getString("nama_kue"));
                eb.setJenis_kue(rs.getString("nama_jenis"));
                eb.setHarga(rs.getString("harga"));
                
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(List_kue_Method.class.getName()).log(Level.SEVERE,null,e);            
        }
        return logData;
    }
}
