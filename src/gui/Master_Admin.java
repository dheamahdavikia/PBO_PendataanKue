/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entitas.Entitas_Admin;
import groovy.xml.Entity;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import method.User_Method;

/**
 *
 * @author User
 */
public class Master_Admin extends javax.swing.JFrame {
    private DefaultTableModel model;
    List<entitas.Entitas_Admin> listTu = new ArrayList<>();
    Entitas_Admin es = new Entitas_Admin();
    User_Method sm = new User_Method();
    /**
     * Creates new form Master_TU
     */
    public Master_Admin() {
        initComponents();
           Bersih();
        SiapIsi(false);
        BuatTabel();
        tampil();
        setLocationRelativeTo(this);
        tombolAwal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kd_admin = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        telp = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jkel = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btntambah = new javax.swing.JButton();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltu = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        jLabel1.setText(" kd Admin");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("No.telp");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Username");

        jLabel7.setText("Password");

        jkel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih", "Laki-Laki", "Perempuan" }));

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

        jLabel8.setText("Cari");

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        tbltu.setModel(new javax.swing.table.DefaultTableModel(
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
        tbltu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbltu);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Data Admin");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel8)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cari, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(jLabel2)
                                    .add(jLabel3)
                                    .add(jLabel4)
                                    .add(jLabel5)
                                    .add(jLabel6)
                                    .add(jLabel7))
                                .add(28, 28, 28)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(nama, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(kd_admin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(telp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 122, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jkel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, password)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, username, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(alamat, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 354, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(13, 13, 13)
                .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(kd_admin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(nama, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(alamat, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(telp, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(jkel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(password, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(cari, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
         if(btntambah.getText().equalsIgnoreCase("tambah")){
            btntambah.setText("Batal");
            Bersih();
            SiapIsi(true);
            kd_admin.requestFocus();
            btntambah.setEnabled(true);
            btnsimpan.setEnabled(true);
            btnhapus.setEnabled(false);
            btnedit.setEnabled(false);
            btnkeluar.setEnabled(false);
            cari.setEnabled(false);
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
        if(kd_admin.getText().isEmpty() || nama.getText().isEmpty() || alamat.getText().isEmpty() 
            || telp.getText().isEmpty()||jkel.getSelectedItem().equals("") || username.getText().isEmpty()
                 || password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Silahkan Lengkapi Data !!");
        }else{
            es.setkd_admin(kd_admin.getText());
            es.setNama(nama.getText());
            es.setAlamat(alamat.getText());
            es.setNo_telp(telp.getText());
            es.setJ_kelamin(jkel.getSelectedItem().toString());
            es.setUsername(username.getText());
            es.setPassword(password.getText());
                
            
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
        es.setkd_admin(kd_admin.getText());
        
        if(btnedit.getText().equalsIgnoreCase("edit")){
            btnedit.setText("Batal");
            SiapIsi(true);
            kd_admin.setEnabled(false);            
            nama.requestFocus();
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
       es.setkd_admin(kd_admin.getText());
        
        int pesan = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Menghapus Data Ini ??", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(pesan == JOptionPane.YES_OPTION){
            if(sm.hapus(es)==1){
                JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
                Bersih();
                SiapIsi(false);
                btntambah.setText("Tambah");
                tombolAwal();
                tampil();
            }else{
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal !!");
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
        String find = null;
        find = cari.getText();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        listTu.clear();
        listTu=sm.cari(find);
        for (int i = 0; i < listTu.size(); i++) {
            Object[] a=new Object[7];
            a[0]=listTu.get(i).getkd_admin();
            a[1]=listTu.get(i).getNama();
            a[2]=listTu.get(i).getAlamat(); 
            a[3]=listTu.get(i).getJ_kelamin();
            a[4]=listTu.get(i).getNo_telp();
            a[5]=listTu.get(i).getUsername();
            a[6]=listTu.get(i).getPassword();
            model.addRow(a);
        }                            
    }//GEN-LAST:event_cariKeyReleased

    private void tbltuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltuMouseClicked
        // TODO add your handling code here:
        int baris = tbltu.getSelectedRow();
        kd_admin.setText(tbltu.getModel().getValueAt(baris,0).toString());
        nama.setText(tbltu.getModel().getValueAt(baris, 1).toString());
        alamat.setText(tbltu.getModel().getValueAt(baris, 2).toString());
        telp.setText(tbltu.getModel().getValueAt(baris, 4).toString());
        jkel.setSelectedItem(tbltu.getModel().getValueAt(baris, 3).toString());
       entitas.Entitas_Admin us= sm.cariuser(kd_admin.getText());
        username.setText(us.getUsername());
        password.setText(us.getPassword());
        
        SiapIsi(false);
        btnsimpan.setEnabled(false);
        btntambah.setEnabled(true);
        btntambah.setText("Batal");
        btnhapus.setEnabled(true);
        btnedit.setEnabled(true);
    }//GEN-LAST:event_tbltuMouseClicked

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
            java.util.logging.Logger.getLogger(Master_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_Admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JTextField cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jkel;
    private javax.swing.JTextField kd_admin;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField password;
    private javax.swing.JTable tbltu;
    private javax.swing.JTextField telp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
 private void tombolAwal(){
        btntambah.setEnabled(true);
        btnsimpan.setEnabled(false);
        btnedit.setEnabled(false);
        btnhapus.setEnabled(false);
        btnkeluar.setEnabled(true);
   //     kodepetugas.setEnabled(true);
    }
private void Bersih(){
        kd_admin.setText(null);
         nama.setText(null);
         alamat.setText(null);
         jkel.setSelectedItem(null);
         username.setText(null);
         telp.setText(null);
         password.setText(null);
         
    }
     
    private void SiapIsi(boolean a){
        kd_admin.setEnabled(a);
        nama.setEnabled(a);
        alamat.setEnabled(a);
        jkel.setEnabled(a);
        username.setEnabled(a);
        telp.setEnabled(a);
        password.setEnabled(a);
    }
    
       private void BuatTabel(){
        model=new DefaultTableModel();
        model.addColumn("Kode Admin");
        model.addColumn("Nama");  
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Telephone");
        tbltu.setModel(model);
    }
        
  //untuk menampilkan data di table pasien
    private void tampil(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        listTu.clear();
        listTu=sm.tampil();
        for (int i = 0; i < listTu.size(); i++) {
            Object[] a=new Object[7];
            a[0]=listTu.get(i).getkd_admin();
            a[1]=listTu.get(i).getNama();
            a[2]=listTu.get(i).getAlamat(); 
            a[3]=listTu.get(i).getJ_kelamin();
            a[4]=listTu.get(i).getNo_telp();
            a[5]=listTu.get(i).getUsername();
            a[6]=listTu.get(i).getPassword();
            model.addRow(a);
        }
    }
}
