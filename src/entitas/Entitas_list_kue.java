/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

/**
 *
 * @author User
 */
public class Entitas_list_kue extends Deskripsi{
    private String kd_kue, nama_kue, jenis_kue,harga;
    //override
    public void judul(){
        System.out.println("Aplikasi List Kue ");
    }
    
    //overload
    public void judul(String a){
        System.out.println("Aplikasi List Kue " + a);
    }
    
    public String getKd_kue() {
        return kd_kue;
    }

    public void setKd_kue(String kd_kue) {
        this.kd_kue = kd_kue;
    }

    public String getNama_kue() {
        return nama_kue;
    }

    public void setNama_kue(String nama_kue) {
        this.nama_kue = nama_kue;
    }

    public String getJenis_kue() {
        return jenis_kue;
    }

    public void setJenis_kue(String jenis_kue) {
        this.jenis_kue = jenis_kue;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    public static void main(String[] args) {
        Entitas_list_kue lk = new Entitas_list_kue();
        Emtitas_Jenis_Kue jk = new Emtitas_Jenis_Kue();
	Deskripsi d = lk;
        d.judul();
    }
}
