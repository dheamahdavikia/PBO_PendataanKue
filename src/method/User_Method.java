/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import entitas.Entitas_Admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class User_Method {
      Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
    public  User_Method(){
        try {
            st = koneksi.getKoneksi().createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan saat Membuat Koneksi pada : \n"+e);
        }
    }
    
    public List tampil(){
        List logData = new ArrayList();
        sql = "select * from user order by kd_admin asc";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Entitas_Admin eb = new Entitas_Admin();
                eb.setkd_admin(rs.getString("kd_admin"));
                eb.setNama(rs.getString("nama"));
                eb.setAlamat(rs.getString("alamat"));
                eb.setNo_telp(rs.getString("no_telp"));
                eb.setJ_kelamin(rs.getString("j_kelamin"));
                eb.setUsername(rs.getString("username"));
                eb.setPassword(rs.getString("password"));
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(User_Method.class.getName()).log(Level.SEVERE,null,e);            
        }
        return logData;
    }
    
    public int tambah(Entitas_Admin eb){
        sql = "insert into user (kd_admin, nama, alamat, no_telp, j_kelamin, username, password) values ('"+eb.getkd_admin()
                +"', '"+eb.getNama()+"', '"+eb.getAlamat()+"', '"+eb.getNo_telp()
                +"', '"+eb.getJ_kelamin()+"', '"+eb.getUsername()+"', '"+eb.getPassword()+"')";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(User_Method.class.getName()).log(Level.SEVERE,null,e);
        }
        return hasil;
    }
    
    public int hapus(Entitas_Admin eb){
        sql = "delete from user where kd_admin = '"+eb.getkd_admin()+"'";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(User_Method.class.getName()).log(Level.SEVERE,null,e);
        }
        return hasil;
    }
    
    public int edit(Entitas_Admin eb){
        sql = "update user set nama = '"+eb.getNama()
                +"', alamat = '"+eb.getAlamat()+"', no_telp = '"+eb.getNo_telp()
                +"', j_kelamin = '"+eb.getJ_kelamin()+"', username = '"+eb.getUsername()
                +"', password = '"+eb.getPassword()+"' where kd_admin = '"+eb.getkd_admin()+"'";
        int hasil = 0;
        try {
            hasil = st.executeUpdate(sql);
        } catch (Exception e) {
            Logger.getLogger(User_Method.class.getName()).log(Level.SEVERE,null,e);
        }
        return hasil;
    }
    
    public List cari(String caridata){
        List logData = new ArrayList();
        sql = "select * from user where kd_admin like '%"+caridata+"%' order by kd_admin asc";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Entitas_Admin eb = new Entitas_Admin();
                eb.setkd_admin(rs.getString("kd_admin"));
                eb.setNama(rs.getString("nama"));
                eb.setAlamat(rs.getString("alamat"));
                eb.setNo_telp(rs.getString("no_telp"));
                eb.setJ_kelamin(rs.getString("j_kelamin"));
                eb.setUsername(rs.getString("username"));
                eb.setPassword(rs.getString("password"));
                logData.add(eb);
            }
        } catch (Exception e) {
            Logger.getLogger(User_Method.class.getName()).log(Level.SEVERE,null,e);            
        }
        return logData;
    }
    
    public Entitas_Admin cariLogin(String username,String password){
        List logLogin = new ArrayList();
        int result;
        sql="select username, password,kd_admin,nama from user where username='"+username+"' and password='"+password+"'";
         Entitas_Admin eu = new Entitas_Admin();
        try{
            rs=st.executeQuery(sql);
            while(rs.next()){
               
                eu.setUsername(rs.getString("username"));
                eu.setPassword(rs.getString("password"));
                eu.setNama(rs.getString("nama"));
                eu.setkd_admin(rs.getString("kd_admin"));
                logLogin.add(eu);
            }
        } catch(SQLException a){
        }
        return eu;
    }
    public Entitas_Admin cariuser(String kd_admin){
        List logLogin = new ArrayList();
        int result;
        sql="select username, password,kd_admin,nama from user where kd_admin='"+kd_admin+"'";
         Entitas_Admin eu = new Entitas_Admin();
        try{
            rs=st.executeQuery(sql);
            while(rs.next()){
               
                eu.setUsername(rs.getString("username"));
                eu.setPassword(rs.getString("password"));
                eu.setNama(rs.getString("nama"));
                eu.setkd_admin(rs.getString("kd_admin"));
                logLogin.add(eu);
            }
        } catch(SQLException a){
        }
        return eu;
    }
    
    public List tampilIdUser(String username){
    List logNamaUser = new ArrayList();
    sql="select kd_admin from user where username='"+username+"'";
    try{
        rs=st.executeQuery(sql);        
        while(rs.next()){
            Entitas_Admin es = new Entitas_Admin();
            es.setkd_admin(rs.getString("kd_admin"));
            logNamaUser.add(es);            
       }
    } catch (SQLException a){
        JOptionPane.showMessageDialog(null,"Terjadi kesalahan tampil, pada : \n"+a);
    }
    return logNamaUser;
    }
}
