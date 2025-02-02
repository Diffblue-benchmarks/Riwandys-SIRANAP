/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.Utama.administrator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAURENSIUS
 */
public class Perawat extends javax.swing.JFrame {
private void kosongft(){
        nip.setText(null);
        nip2.setText(null);
        nama2.setText(null);
        nama.setText(null);
        mulai.setText(null);
        mulai2.setText(null);
        selesai.setText(null);
        selesai2.setText(null);
        kelas.setText(null);
        kelas2.setText(null);
    }
    public void tampilan(){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NIP PERAWAT");
        x.addColumn("NAMA PERAWAT");
        x.addColumn("JAM MULAI KERJA");
        x.addColumn("JAM SELESAI KERJA");
        x.addColumn("KELAS");
        
       try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from perawat";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString("nip_perawat"),rset.getString("nama_perawat"),rset.getString("jam_mulai_kerja"),
                    rset.getString("jam_selesai_kerja"),rset.getString("kelas")});
            }
            tblperawat.setModel(x);
        }catch(SQLException ex){
          
        }
    }
    
    private void tampilkandata(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NIP PERAWAT");
        x.addColumn("NAMA PERAWAT");
        x.addColumn("JAM MULAI KERJA");
        x.addColumn("JAM SELESAI KERJA");
        x.addColumn("KELAS");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from perawat order by "+kolom+" asc";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5)});
            }
            tblperawat.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    
    private void tampilkancari(String kolom){
        DefaultTableModel x = new DefaultTableModel();
        x.addColumn("NIP PERAWAT");
        x.addColumn("NAMA PERAWAT");
        x.addColumn("JAM MULAI KERJA");
        x.addColumn("JAM SELESAI KERJA");
        x.addColumn("KELAS");
        
        try(
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/rumah_sakit1",
                    "root",
                    "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from perawat where nip_perawat like '%"+kolom+"%' or "+
                    "nama_perawat like '%"+kolom+"%' or jam_mulai_kerja like '%"+kolom+"%'"+"or jam_selesai_kerja like '%"+kolom+"%'"
                    +"or kelas ='"+kolom+"'";
            
            ResultSet rset=stmt.executeQuery(strSelect);
            
            while(rset.next()){
                x.addRow(new Object[] {rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5)});
            }
            tblperawat.setModel(x);
        }catch(SQLException ex){
            
        }
    }
    /**
     * Creates new form dokter
     */
    public Perawat() {
        initComponents();
        tampilan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nip = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        mulai = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cari_data = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        urut = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblperawat = new javax.swing.JTable();
        selesai = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nip2 = new javax.swing.JTextField();
        nama2 = new javax.swing.JTextField();
        mulai2 = new javax.swing.JTextField();
        kelas2 = new javax.swing.JTextField();
        selesai2 = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        batal2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PERAWAT");

        jLabel2.setText("SAVE DATA");

        jLabel3.setText("NIP PERAWAT");

        jLabel4.setText("NAMA PERAWAT");

        jLabel5.setText("JAM MULAI KERJA");

        jLabel6.setText("KELAS");

        save.setText("SAVE");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        batal.setText("BATAL");
        batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batalMouseClicked(evt);
            }
        });

        jLabel12.setText("CARI DATA");

        cari.setText("CARI");
        cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cariMouseClicked(evt);
            }
        });

        jLabel13.setText("URUT DATA");

        urut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIP PERAWAT", "NAMA PERAWAT", "JAM MULAI KERJA", "JAM SELESAI KERJA", "KELAS" }));
        urut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urutActionPerformed(evt);
            }
        });

        tblperawat.setModel(new javax.swing.table.DefaultTableModel(
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
        tblperawat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblperawatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblperawat);

        jLabel14.setText("JAM SELESAI KERJA");

        jLabel15.setText("NIP PERAWAT");

        jLabel16.setText("NAMA PERAWAT");

        jLabel17.setText("JAM MULAI KERJA");

        jLabel18.setText("KELAS");

        save1.setText("UPDATE");
        save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save1MouseClicked(evt);
            }
        });

        batal2.setText("BATAL");
        batal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batal2MouseClicked(evt);
            }
        });

        jLabel19.setText("JAM SELESAI KERJA");

        jLabel20.setText("UPDATE DATA");

        jButton1.setText("DELETE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/icons8-left-32.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(save)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel14))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nip)
                                    .addComponent(nama)
                                    .addComponent(mulai)
                                    .addComponent(kelas)
                                    .addComponent(selesai, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(batal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(batal2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(save1))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nip2)
                                            .addComponent(nama2)
                                            .addComponent(mulai2)
                                            .addComponent(kelas2)
                                            .addComponent(selesai2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel12)
                                            .addComponent(cari_data)
                                            .addComponent(cari)
                                            .addComponent(jLabel13)
                                            .addComponent(urut, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(119, 119, 119))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(mulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batal))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(nip2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(nama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(mulai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(selesai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(kelas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cari_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cari)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(urut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(save1)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batal2)))
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cariMouseClicked
       String kolom = cari_data.getText();
        tampilkancari(kolom);
    }//GEN-LAST:event_cariMouseClicked

    private void urutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urutActionPerformed
         String kolom;

        if (urut.getSelectedItem()=="NIP PERAWAT"){
            tampilkandata("NIP_PERAWAT");
        } else if (urut.getSelectedItem()=="NAMA PERAWAT"){
            tampilkandata("nama_PERAWAT");
        }else if (urut.getSelectedItem()=="JAM MULAI KERJA"){
            tampilkandata("JAM_MULAI_KERJA");
        }else if (urut.getSelectedItem()=="JAM SELESAI KERJA"){
            tampilkandata("JAM_SELESAI_KERJA");
        }else if (urut.getSelectedItem()=="KELAS"){
            tampilkandata("KELAS");
        }
    }//GEN-LAST:event_urutActionPerformed

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String insert = "insert into perawat values ('"+nip.getText()+"','"+nama.getText()+"','"+mulai.getText()+"','"+
                    selesai.getText()+"','"+kelas.getText()+"')";
            stmt.executeUpdate(insert);
            JOptionPane.showMessageDialog(null,"tambah data berhasil");
            tampilan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"gagal tambah data");
            ex.printStackTrace();
        }        
    }//GEN-LAST:event_saveMouseClicked

    private void save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save1MouseClicked
        DefaultTableModel model = (DefaultTableModel) tblperawat.getModel();
        try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rumah_sakit1","root","");
            Statement stmt = conn.createStatement();
        ){
            String update = "update perawat set nip_perawat='"+nip2.getText()+"',NAMA_perawat='"+nama2.getText()+
                    "',jam_mulai_kerja='"+mulai2.getText()+"',jam_selesai_kerja='"+selesai2.getText()+
                    "',kelas='"+kelas2.getText()+
                    "' where nip_perawat = '"+model.getValueAt(tblperawat.getSelectedRow(), 0).toString()+"'";
            stmt.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "update data berhasil");
            tampilan();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"gagal update data");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_save1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/rumah_sakit1",
                "root",
                "");
            Statement stmt = conn.createStatement();
        ){
            String delete = "delete from perawat where nip_perawat = '"+nip2.getText()+"'";
            stmt.executeUpdate(delete);
            tampilan();
        }catch (SQLException ex) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void tblperawatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblperawatMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblperawat.getModel();
        nip2.setText(model.getValueAt(tblperawat.getSelectedRow(), 0).toString());
        nama2.setText(model.getValueAt(tblperawat.getSelectedRow(), 1).toString());
        mulai2.setText(model.getValueAt(tblperawat.getSelectedRow(), 2).toString());
        selesai2.setText(model.getValueAt(tblperawat.getSelectedRow(), 3).toString());
        kelas2.setText(model.getValueAt(tblperawat.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tblperawatMouseClicked

    private void batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batalMouseClicked
        // TODO add your handling code here:
        kosongft();
    }//GEN-LAST:event_batalMouseClicked

    private void batal2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batal2MouseClicked
        // TODO add your handling code here:
        kosongft();
    }//GEN-LAST:event_batal2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        Main objek = new Main(administrator);
        objek.setLocationRelativeTo(null);
        objek.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Perawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton batal2;
    private javax.swing.JButton cari;
    private javax.swing.JTextField cari_data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField kelas2;
    private javax.swing.JTextField mulai;
    private javax.swing.JTextField mulai2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nama2;
    private javax.swing.JTextField nip;
    private javax.swing.JTextField nip2;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JTextField selesai;
    private javax.swing.JTextField selesai2;
    private javax.swing.JTable tblperawat;
    private javax.swing.JComboBox<String> urut;
    // End of variables declaration//GEN-END:variables
}
