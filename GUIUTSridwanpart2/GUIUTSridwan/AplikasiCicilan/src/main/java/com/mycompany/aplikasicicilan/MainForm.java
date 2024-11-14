/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.aplikasicicilan;

import javax.swing.JOptionPane;

/**
 *
 * @author D-8
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    
    public MainForm() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupjk = new javax.swing.ButtonGroup();
        cmbDurasiCicilan = new javax.swing.JComboBox<>();
        rdbFlat = new javax.swing.JRadioButton();
        rdbEfektif = new javax.swing.JRadioButton();
        btnHitung = new javax.swing.JButton();
        chkAsuransi = new javax.swing.JCheckBox();
        chkPajak = new javax.swing.JCheckBox();
        btnReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotalPinjaman = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHasilCicilan = new javax.swing.JTextArea();
        btnKeluar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cmbBungaTahunan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbDurasiCicilan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36" }));

        groupjk.add(rdbFlat);
        rdbFlat.setText("Flat");

        groupjk.add(rdbEfektif);
        rdbEfektif.setText("Efektif");
        rdbEfektif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbEfektifActionPerformed(evt);
            }
        });

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        chkAsuransi.setText("Asuransi");

        chkPajak.setText("Pajak");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Pinjaman");

        jLabel2.setText("Durasi Cicilan");

        jLabel3.setText("Bunga Tahunan");

        jLabel4.setText("Jenis Cicilan");

        jLabel5.setText("Opsi Tambahan");

        jLabel6.setText("Hasil Cicilan");

        txtHasilCicilan.setColumns(20);
        txtHasilCicilan.setRows(5);
        jScrollPane1.setViewportView(txtHasilCicilan);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setText("Pembayaran Cicilan");

        cmbBungaTahunan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "1%", "2%", "3%", "4%", "5%" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbFlat)
                                .addGap(18, 18, 18)
                                .addComponent(rdbEfektif))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbDurasiCicilan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbBungaTahunan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkAsuransi)
                        .addGap(18, 18, 18)
                        .addComponent(chkPajak))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHitung)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeluar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotalPinjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbBungaTahunan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbDurasiCicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdbFlat)
                    .addComponent(rdbEfektif))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(chkAsuransi)
                    .addComponent(chkPajak))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnReset)
                    .addComponent(btnKeluar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        try {
         // Validasi input
         double totalPinjaman = Double.parseDouble(txtTotalPinjaman.getText());
         
         // Ambil nilai bunga dari ComboBox
         String selectedBunga = cmbBungaTahunan.getSelectedItem().toString();
         double bungaTahunan = Double.parseDouble(selectedBunga.replace("%", "")) / 100;
         
         // Ambil nilai durasi cicilan dari ComboBox
         int durasiCicilan = Integer.parseInt(cmbDurasiCicilan.getSelectedItem().toString());

         // Validasi jika tidak ada jenis cicilan yang dipilih
         if (!rdbFlat.isSelected() && !rdbEfektif.isSelected()) {
             JOptionPane.showMessageDialog(this, "Pilih jenis cicilan (Flat atau Efektif)", 
                     "Jenis Cicilan Tidak Dipilih", JOptionPane.WARNING_MESSAGE);
             return;  // Keluarkan method jika belum memilih cicilan
         }

         // Proses perhitungan
         boolean pakaiAsuransi = chkAsuransi.isSelected();
         boolean pakaiPajak = chkPajak.isSelected();

         double hasilCicilan = 0;

         if (rdbFlat.isSelected()) {
             // Cicilan Flat
             double bungaPerTahun = totalPinjaman * bungaTahunan;
             hasilCicilan = (totalPinjaman + (bungaPerTahun * durasiCicilan)) / (durasiCicilan * 12);
         } else if (rdbEfektif.isSelected()) {
             // Cicilan Efektif
             hasilCicilan = 0;
             double sisaPinjaman = totalPinjaman;
             for (int i = 0; i < durasiCicilan * 12; i++) {
                 double bungaBulanIni = sisaPinjaman * (bungaTahunan / 12);
                 double cicilanPokok = totalPinjaman / (durasiCicilan * 12);
                 hasilCicilan += cicilanPokok + bungaBulanIni;
                 sisaPinjaman -= cicilanPokok;
             }
             hasilCicilan = hasilCicilan / (durasiCicilan * 12);
         }

         // Tambahan biaya jika asuransi atau pajak dipilih
         if (pakaiAsuransi) {
             hasilCicilan += 50000; // Contoh biaya asuransi
         }
         if (pakaiPajak) {
             hasilCicilan += 25000; // Contoh biaya pajak
         }

         txtHasilCicilan.setText(String.format("Cicilan per bulan: Rp %.2f", hasilCicilan));
         JOptionPane.showMessageDialog(this, "Perhitungan berhasil!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

     } catch (NumberFormatException ex) {
         JOptionPane.showMessageDialog(this, "Input tidak valid. Pastikan semua nilai diisi dengan benar.", 
             "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void rdbEfektifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbEfektifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbEfektifActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin keluar?", 
            "Konfirmasi Keluar", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);
    
    if (response == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin mereset semua input?", 
            "Konfirmasi Reset", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE);
    
    if (response == JOptionPane.YES_OPTION) {
        txtTotalPinjaman.setText("");
        cmbBungaTahunan.setSelectedIndex(0);
        cmbDurasiCicilan.setSelectedIndex(0);
        rdbFlat.setSelected(false);
        rdbEfektif.setSelected(false);
        chkAsuransi.setSelected(false);
        chkPajak.setSelected(false);
        txtHasilCicilan.setText("");
    }
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox chkAsuransi;
    private javax.swing.JCheckBox chkPajak;
    private javax.swing.JComboBox<String> cmbBungaTahunan;
    private javax.swing.JComboBox<String> cmbDurasiCicilan;
    private javax.swing.ButtonGroup groupjk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbEfektif;
    private javax.swing.JRadioButton rdbFlat;
    private javax.swing.JTextArea txtHasilCicilan;
    private javax.swing.JTextField txtTotalPinjaman;
    // End of variables declaration//GEN-END:variables
}
