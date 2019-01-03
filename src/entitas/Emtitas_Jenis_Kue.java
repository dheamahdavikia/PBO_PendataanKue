/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

/**
 *
 * @author DESI-AMALIANY
 */
public class Emtitas_Jenis_Kue extends Deskripsi{
    private String id_jenis, nama_jenis;
    
    public void judul(){
        System.out.println("Jenis Kue ");
    }
    //overload
    public void judul(String a){
        System.out.println("Jenis Kue " + a);
    }
    
    public String getId_jenis() {
        return id_jenis;
    }

    public void setId_jenis(String id_jenis) {
        this.id_jenis = id_jenis;
    }

    public String getNama_jenis() {
        return nama_jenis;
    }

    public void setNama_jenis(String nama_jenis) {
        this.nama_jenis = nama_jenis;
    }
    
}
