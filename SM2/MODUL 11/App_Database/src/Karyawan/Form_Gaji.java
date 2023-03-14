/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;

import Koneksi.Db_Koneksi;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/** 
 *
 * @author Lenovo
 * 
 * 
 * 
 */


public final class Form_Gaji extends javax.swing.JFrame {

    //membuat class default Table model
    private DefaultTableModel model;
    String nip , nama, jabatan;
        int gapok ,transport,gaber;
    
    
    
    
    
    
    public Form_Gaji() {
        initComponents();
        
        //memberi penamaan field
        model = new DefaultTableModel();
        tblGaji.setModel(model);
        model.addColumn("NIP");
        model.addColumn("Nama");
        model.addColumn("Jabatan");
        model.addColumn("Gaji Pokok");
        model.addColumn("Transport");
        model.addColumn("Gaji Bersih");
        
        getData();
     
    }
    
    public void Reset(){
        nip     = "";
        nama    = "";
        jabatan = "";
        gapok = 0;
        transport = 0;
        gaber = 0;
        txtNip.setText(nip);
        txtNama.setText(nama);
        txtGapok.setText("");
        txtTransport.setText("");
        txtGaber.setText("");
        
    }
    
    public void loadData(){
        nip =  txtNip.getText();
        nama = txtNama.getText();
        jabatan = (String) cmboxJabatan.getSelectedItem();
        gapok = Integer.parseInt(txtGapok.getText());
        transport = Integer.parseInt(txtTransport.getText());
        gaber = Integer.parseInt(txtGaber.getText());
    }
    
    public void loadGaji(){
        jabatan =  "" + cmboxJabatan.getSelectedItem();
        switch(jabatan){
            case "Manager":
                gapok   = 5000000;
            break;
            case "Asisten Manager":
                gapok   = 4500000;
            break;
            case "Kepala HRD":
                gapok   = 4000000;
            break;
            case "Staff Keuangan":
                gapok   = 3500000;
            break;
            case "Karyawan":
                gapok   = 3000000;
            break;
            case "Office Boy":
                gapok   = 2000000;
            break;
        }
        
        transport = (int) (gapok * 0.1);
        gaber = gapok + transport;
        txtGapok.setText(""+gapok);
        txtTransport.setText(""+transport);
        txtGaber.setText(""+gaber);
        
    }
    
    public void saveData(){
        loadData();
        try{
            Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "insert into tblgaji (Nip,Nama,Jabatan,Gapok,Transport,Gaber)"
                        + "values('"+nip +"','"+nama+"','"+jabatan+"','"+gapok+"',"+
                        "'"+transport+"','"+gaber+"')";
            PreparedStatement p = (PreparedStatement) Db_Koneksi.getKoneksi().prepareStatement(sql);
            p.executeUpdate();
            getData();
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
    }
    
    public void dataSelect(){
        int i  = tblGaji.getSelectedRow();
        if (i == -1){
            //tidak ada baris terpilih
            return;
        }
        txtNip.setText(""+model.getValueAt(i, 0));
         txtNama.setText(""+model.getValueAt(i, 1));
          cmboxJabatan.setSelectedItem(""+model.getValueAt(i, 2));
           txtGapok.setText(""+model.getValueAt(i, 3));
            txtTransport.setText(""+model.getValueAt(i, 4));
             txtGaber.setText(""+model.getValueAt(i, 5));
    }
    
    
    
     public void  getData(){
        //menghapus isi data dari tabel tblgaji
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            //membuat statement pemanggilan data pada tabel tblgaji dari database 
            Statement stat = (Statement) Db_Koneksi.getKoneksi().createStatement();
            String sql = "select * from tblgaji";
            ResultSet res = stat.executeQuery(sql);
            
            //penelusuran baris pada tabel tblgaji dari db
            while(res.next()){
                Object[] obj = new Object[6];
                obj[0] = res.getString("Nip");
                obj[1] = res.getString("Nama");
                obj[2] = res.getString("Jabatan");
                obj[3] = res.getString("Gapok");
                obj[4] = res.getString("Transport");
                obj[5] = res.getString("Gaber");
                
                model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        
        
        
    }
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGaji = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cmboxJabatan = new javax.swing.JComboBox<>();
        txtGapok = new javax.swing.JTextField();
        txtTransport = new javax.swing.JTextField();
        txtGaber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblGaji.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGaji.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGajiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGaji);

        jLabel1.setText("NIP");

        jLabel2.setText("Nama");

        jLabel3.setText("Jabatan");

        jLabel4.setText("Gaji Bersih");

        jLabel5.setText("Gaji Pokok");

        jLabel6.setText("Transport");

        txtNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNipActionPerformed(evt);
            }
        });

        cmboxJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Asisten Manager", "Kepala HRD", "Staf Keuangan", "Karyawan", "Office Boy" }));
        cmboxJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboxJabatanActionPerformed(evt);
            }
        });

        txtTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransportActionPerformed(evt);
            }
        });

        txtGaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGaberActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Engravers MT", 3, 24)); // NOI18N
        jLabel7.setText("APLIKASI PENGGAJIAN");

        btnKeluar.setText("keluar");

        btnDelete.setText("delete");

        btnUpdate.setText("Update");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNip)
                                    .addComponent(txtNama)
                                    .addComponent(cmboxJabatan, 0, 188, Short.MAX_VALUE))
                                .addGap(121, 121, 121)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGapok)
                                    .addComponent(txtTransport)
                                    .addComponent(txtGaber, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(txtNip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGapok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cmboxJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKeluar)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNipActionPerformed

    private void txtTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransportActionPerformed

    private void txtGaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGaberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGaberActionPerformed

    private void cmboxJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboxJabatanActionPerformed
        loadGaji();
    }//GEN-LAST:event_cmboxJabatanActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        Reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblGajiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGajiMouseClicked
        dataSelect();
    }//GEN-LAST:event_tblGajiMouseClicked

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
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Gaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmboxJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGaji;
    private javax.swing.JTextField txtGaber;
    private javax.swing.JTextField txtGapok;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtTransport;
    // End of variables declaration//GEN-END:variables
}
