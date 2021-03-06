/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.table.DefaultTableModel;
import entitas.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import method.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Master_list_kue extends javax.swing.JFrame {
  private DefaultTableModel model;
    List<Entitas_list_kue> listKue = new ArrayList<>();
    Entitas_list_kue es = new Entitas_list_kue();
    List_kue_Method sm = new List_kue_Method();
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;    
    
    List<Emtitas_Jenis_Kue> listJenis = new ArrayList<>();
    Emtitas_Jenis_Kue ek = new Emtitas_Jenis_Kue();
    Jenis_Method km = new Jenis_Method();
    /**
     * Creates new form Master_list
     */
    public Master_list_kue() throws Exception {
        initComponents();
          try {         
            st = koneksi.getKoneksi().createStatement();
        } catch (SQLException ex) {
            
        }
          
        BuatTabel();
        tampil();
        isiCombo1();       
           Bersih();
            SiapIsi(false);
            tombolAwal();
            Edkdkue.setEnabled(false);
            setLocationRelativeTo(this);
            buatkode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkue = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        edHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ednama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbmjeniskue = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Edkdkue = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        btntambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tambah.png"))); // NOI18N
        btntambah.setText("Tambah");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tutup.png"))); // NOI18N
        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(2, 2, 2)
                .add(btntambah)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnsimpan)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnedit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnhapus)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnkeluar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btntambah)
                    .add(btnsimpan)
                    .add(btnedit)
                    .add(btnhapus)
                    .add(btnkeluar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblkue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblkue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkue);

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        jLabel9.setText("Cari");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(edHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 90, 20));

        jLabel5.setText("Jenis Kue");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setText("Rp");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel3.setText("Harga");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(ednama, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 54, 221, -1));

        jLabel1.setText("kd kue");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 26, -1, -1));

        cbmjeniskue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih" }));
        jPanel1.add(cbmjeniskue, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 85, -1, -1));

        jLabel2.setText("Nama kue");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 57, -1, -1));
        jPanel1.add(Edkdkue, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 23, 102, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Data List Kue");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 514, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(cari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 397, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(layout.createSequentialGroup()
                                .add(32, 32, 32)
                                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 503, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(cari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 177, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        if(btntambah.getText().equalsIgnoreCase("tambah")){
            btntambah.setText("Batal");
          Bersih();
            SiapIsi(true);
            Edkdkue.requestFocus();
            btntambah.setEnabled(true);
            btnsimpan.setEnabled(true);
            btnhapus.setEnabled(false);
            btnedit.setEnabled(false);
            btnkeluar.setEnabled(false);
            cari.setEnabled(false);
            buatkode();
        }else{
            btntambah.setText("Tambah");
            Bersih();
            SiapIsi(false);
            tombolAwal();
            cari.setEnabled(true);
        }
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
      if(Edkdkue.getText().isEmpty()  || ednama.getText().isEmpty() 
            ||cbmjeniskue.getSelectedIndex()==0|| edHarga.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Silahkan Lengkapi Data !!");
        }else{
            es.setKd_kue(Edkdkue.getText());
                es.setNama_kue(ednama.getText());
                es.setJenis_kue(cbmjeniskue.getSelectedItem().toString());                              
                es.setHarga(edHarga.getText());
                
                
         if(btntambah.getText().equalsIgnoreCase("batal")){
            if(sm.tambah(es)==1){               
                JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Simpan Data Gagal !!");
                }
            tampil();
            }      
        
        if(btnedit.getText().equalsIgnoreCase("batal")){
            if(sm.edit(es)==1){
                JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
            }else{
                JOptionPane.showMessageDialog(null, "Edit Data Gagal !!");
                }
            tampil();
            }
        
        Bersih();
        SiapIsi(false);
        btntambah.setText("Tambah");
        btnedit.setText("Edit");
        tombolAwal();
        cari.setEnabled(true);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        es.setKd_kue(Edkdkue.getText());
        
        if(btnedit.getText().equalsIgnoreCase("edit")){
            btnedit.setText("Batal");
            SiapIsi(true);
            Edkdkue.setEnabled(false);            
            ednama.requestFocus();
            btntambah.setEnabled(false);
            btntambah.setText("Tambah");
            btnsimpan.setEnabled(true);
            btnhapus.setEnabled(false);
            btnedit.setEnabled(true);
            btnkeluar.setEnabled(false);
            cari.setEnabled(false);
        }else{
            btnedit.setText("Edit");
            Bersih();
            SiapIsi(false);
            tombolAwal();
            cari.setEnabled(true);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
       es.setKd_kue(Edkdkue.getText());
        
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Ini ??", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(pesan == JOptionPane.YES_OPTION){
            if(sm.hapus(es)==1){
                entitas.Entitas_list_kue n=new Entitas_list_kue();
                method.List_kue_Method mn=new List_kue_Method();
                n.setKd_kue(Edkdkue.getText());
                mn.hapus(n);
                JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
                Bersih();
                SiapIsi(false);
                btntambah.setText("Tambah");
                tombolAwal();
                tampil();
                buatkode();
            }else{
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal !!");
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void tblkueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkueMouseClicked
        // TODO add your handling code here:
 int baris = tblkue.getSelectedRow();
        Edkdkue.setText(tblkue.getModel().getValueAt(baris,0).toString());
        ednama.setText(tblkue.getModel().getValueAt(baris,1).toString());
        edHarga.setText(tblkue.getModel().getValueAt(baris,2).toString());
       
        
        listKue = sm.tampilSiswa(Edkdkue.getText());
         cbmjeniskue.setSelectedItem(listKue.get(0).getJenis_kue());        
         edHarga.setText(listKue.get(0).getHarga());
        
        SiapIsi(false);
       // btncetak.setEnabled(true);
        btnsimpan.setEnabled(false);
        btntambah.setEnabled(true);
        btntambah.setText("Batal");
        btnhapus.setEnabled(true);
        btnedit.setEnabled(true);
    }//GEN-LAST:event_tblkueMouseClicked

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
  String find = null;
        find = cari.getText();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        listKue.clear();
        listKue=sm.cari(find);
        for (int i = 0; i < listKue.size(); i++) {
            Object[] a=new Object[4];
            a[0]=listKue.get(i).getKd_kue();
            a[1]=listKue.get(i).getNama_kue();
            a[2]=listKue.get(i).getHarga(); 
            model.addRow(a);
        }
    }//GEN-LAST:event_cariKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Master_list_kue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_list_kue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_list_kue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_list_kue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Master_list_kue().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Master_list_kue.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Edkdkue;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField cari;
    private javax.swing.JComboBox cbmjeniskue;
    private javax.swing.JTextField edHarga;
    private javax.swing.JTextField ednama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblkue;
    // End of variables declaration//GEN-END:variables
  private void BuatTabel(){
        model=new DefaultTableModel();
        model.addColumn("Kode Kue");
        model.addColumn("Nama Kue");  
        model.addColumn("Jenis Kue");
        model.addColumn("Harga");
        tblkue.setModel(model);
    }
   private void tombolAwal(){
        btntambah.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
        btnkeluar.setEnabled(true);
     //   btncetak.setEnabled(false);
   //     kodepetugas.setEnabled(true);
    }
   private void isiCombo1(){
        listJenis = km.tampil();
        for (Emtitas_Jenis_Kue ej1 : listJenis){
            cbmjeniskue.addItem(ej1.getNama_jenis());
            }
    }
   private void tampil(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        listKue.clear();
        listKue=sm.tampil();
        for (int i = 0; i < listKue.size(); i++) {
            Object[] a=new Object[8];
            a[0]=listKue.get(i).getKd_kue();
            a[1]=listKue.get(i).getNama_kue();
            a[2]=listKue.get(i).getJenis_kue(); 
            a[3]=listKue.get(i).getHarga();            
            model.addRow(a);
        }
    }
     private void buatkode(){
   
        try {
    
String sql = "SELECT kd_kue FROM daftar_menu ORDER BY kd_kue DESC";
String kelas=cbmjeniskue.getSelectedItem().toString();

rs=st.executeQuery(sql);
if (rs.next()) {
String kd_barang = rs.getString("kd_kue").substring(2);
String AN = "" +(Integer.parseInt(kd_barang) + 1);
String Nol = "";
if(AN.length()==1)
{Nol = "000";}
else if(AN.length()==2)
{Nol = "00";}
else if(AN.length()==3)
{Nol = "0";}
else if(AN.length()==4)
{Nol = "";}
  
        Edkdkue.setText("LK"+ Nol +AN);
    
     
} else {
   
        Edkdkue.setText("LK0001");
    
    
}
} catch (Exception e) {
e.printStackTrace();
    
}
    }
     private void Bersih(){
       
         ednama.setText(null);
         cbmjeniskue.setSelectedIndex(0);        
         edHarga.setText(null);
         
    }
      private void SiapIsi(boolean a){
       
       ednama.setEnabled(a);
       cbmjeniskue.setEnabled(a);       
        edHarga.setEnabled(a);       
    }
}
