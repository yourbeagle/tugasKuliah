/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grosirin;

import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author haypp
 */
public class Checkout extends javax.swing.JFrame {
    Object data[] = new Object[5];
    String kurir, idKurir;
    int totalAkhir, totalBelanja;
    String idPenjualan;
    Connection con;
    PreparedStatement pst;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form Checkout
     */
    public Checkout() {
        initComponents();
        load();
        showAlamatUser();
    }
    
    public void showAlamatUser()
    {
        String sql = "select * from user where idUser="+LoginPage.globalIdUser;
        try {
            con = Koneksi.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next())
            {
                lbAlamat.setText(rs.getString("alamat"));
            }
            
        } catch (Exception e) {
        }
    }
    
    public void insertCart()
    {
        String sql2 = "select * from penjualan ORDER BY idPenjualan DESC LIMIT 1";
        String sql1 = "insert into detail_penjualan(idPenjualan, idBarang, jumlah, subTotal) values(?,?,?,?)";
        
        try {
            con = Koneksi.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql2);
            if (rs.next())
            {
                idPenjualan = rs.getString("idPenjualan");
            }
        } catch (Exception e) {
        }
        
        
        for (int i = 0; i < viewbarang.cartItem.size(); i++)
        {
            try {
                con = Koneksi.configDB();
                pst = con.prepareStatement(sql1);
                pst.setString(1, idPenjualan);
                pst.setString(2, viewbarang.cartItem.get(i).getIdBarang());
                pst.setString(3, viewbarang.cartItem.get(i).getJumlah());
                pst.setString(4, viewbarang.cartItem.get(i).getTotal());
                pst.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }
    
    
    public void load()
    {
        String id = LoginPage.globalIdUser;
        String sql = "select * from kurir Order by idKurir ASC Limit 4";
        try {
            con = Koneksi.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while(rs.next())
            {
                rs.absolute(1);
                rdBtn1.setText(rs.getString("namaKurir"));
                idKurir = rs.getString("idKurir");
                
                rs.absolute(2);
                rdBtn2.setText(rs.getString("namaKurir"));
                idKurir = rs.getString("idKurir");
                
                rs.absolute(3);
                rdBtn3.setText(rs.getString("namaKurir"));
                idKurir = rs.getString("idKurir");
                
                rs.absolute(4);
                rdBtn4.setText(rs.getString("namaKurir"));
                idKurir = rs.getString("idKurir");
            }
                
            
        } catch (Exception e) {
        }
        
        
        
        for (int i = 0; i < viewbarang.cartItem.size(); i++)
        {
            System.out.print(data[0] = viewbarang.cartItem.get(i).getIdBarang());
            System.out.print(data[0] = viewbarang.cartItem.get(i).getNamaBarang());
            System.out.print(data[0] = viewbarang.cartItem.get(i).getTotal());
            System.out.print(data[0] = viewbarang.cartItem.get(i).getJumlah());
         
        }
        
        lbBelanja.setText(cart.totalSemua);
        totalBelanja = Integer.parseInt(lbBelanja.getText());
        System.out.print(totalBelanja);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kurir = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbAlamat = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbBelanja = new javax.swing.JLabel();
        lbPengiriman = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rdBtn1 = new javax.swing.JRadioButton();
        rdBtn2 = new javax.swing.JRadioButton();
        rdBtn3 = new javax.swing.JRadioButton();
        rdBtn4 = new javax.swing.JRadioButton();
        btnBayar = new javax.swing.JButton();
        btHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(209, 219, 252));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setText("  Search");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButton1.setText("Cart");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Checkout");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Alamat");

        lbAlamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbAlamat.setText("IKI BAKAL ALAMAT");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Pengiriman");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Rincian");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Total Belanja   : Rp. ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pengiriman      : Rp.");

        lbBelanja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbBelanja.setText("Total Belanja  ");

        lbPengiriman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbPengiriman.setText("Total Belanja  ");

        lbTotal.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel8.setText("TOTAL");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel9.setText("Rp. ");

        rdBtn1.setText("jRadioButton1");
        rdBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdBtn1MouseClicked(evt);
            }
        });
        rdBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtn1ActionPerformed(evt);
            }
        });

        rdBtn2.setText("jRadioButton1");
        rdBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdBtn2MouseClicked(evt);
            }
        });

        rdBtn3.setText("jRadioButton2");
        rdBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdBtn3MouseClicked(evt);
            }
        });

        rdBtn4.setText("jRadioButton3");
        rdBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdBtn4MouseClicked(evt);
            }
        });

        btnBayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });

        btHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btHome.setText("HOME");
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdBtn1)
                        .addGap(71, 71, 71)
                        .addComponent(rdBtn2)
                        .addGap(66, 66, 66)
                        .addComponent(rdBtn3)
                        .addGap(70, 70, 70)
                        .addComponent(rdBtn4))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(lbAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbBelanja, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbPengiriman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lbBelanja))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPengiriman))))
                .addGap(114, 114, 114)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(90, 90, 90)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBtn1)
                    .addComponent(rdBtn2)
                    .addComponent(rdBtn3)
                    .addComponent(rdBtn4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void rdBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdBtn1MouseClicked
        // TODO add your handling code here:
       lbPengiriman.setText("20000");
       String jntTarif = lbPengiriman.getText();
       totalAkhir = Integer.parseInt(jntTarif) + totalBelanja;
       lbTotal.setText(String.valueOf(totalAkhir));
       if (rdBtn1.isSelected())
       {
           idKurir = "1";
       }
    }//GEN-LAST:event_rdBtn1MouseClicked

    private void rdBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdBtn2MouseClicked
        // TODO add your handling code here:
        lbPengiriman.setText("30000");
        String jneTarif = lbPengiriman.getText();
        totalAkhir = Integer.parseInt(jneTarif) + totalBelanja;
        lbTotal.setText(String.valueOf(totalAkhir));
        if (rdBtn2.isSelected())
       {
           idKurir = "2";
       }
    }//GEN-LAST:event_rdBtn2MouseClicked

    private void rdBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdBtn3MouseClicked
        // TODO add your handling code here:
        lbPengiriman.setText("40000");
        String tikiTarif = lbPengiriman.getText();
        totalAkhir = Integer.parseInt(tikiTarif) + totalBelanja;
        lbTotal.setText(String.valueOf(totalAkhir));
        if (rdBtn3.isSelected())
       {
           idKurir = "3";
       }
    }//GEN-LAST:event_rdBtn3MouseClicked

    private void rdBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdBtn4MouseClicked
        // TODO add your handling code here:
        lbPengiriman.setText("50000");
        String sicepatTarif = lbPengiriman.getText();
        totalAkhir = Integer.parseInt(sicepatTarif) + totalBelanja;
        lbTotal.setText(String.valueOf(totalAkhir));
        if (rdBtn4.isSelected())
       {
           idKurir = "4";
       }
    }//GEN-LAST:event_rdBtn4MouseClicked

    private void rdBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtn1ActionPerformed
        // TODO add your handling code here:
//       lbPengiriman.setText("20000");
//       String jntTarif = lbPengiriman.getText();
//       totalAkhir = Integer.parseInt(jntTarif) + totalBelanja;
//       lbTotal.setText(String.valueOf(totalAkhir));
    }//GEN-LAST:event_rdBtn1ActionPerformed

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        String sql = "insert into penjualan(idUser, idKurir, Total) values(?,?,?)";
        try {
            con = Koneksi.configDB();
            pst = con.prepareStatement(sql);
            pst.setString(1, LoginPage.globalIdUser);
            pst.setString(2, idKurir);
            pst.setInt(3, totalAkhir);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Berhasil Melakukan Pembayaran");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        insertCart();
        
    }//GEN-LAST:event_btnBayarActionPerformed

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        System.out.println("tes metu cok");
        this.dispose();
        homepage hp = new homepage();
        hp.setVisible(true);
    }//GEN-LAST:event_btHomeActionPerformed
    public void setIconImage()
    {
       Image img = new ImageIcon("src\\image\\iconlogo.png").getImage();
       Image imgRsz = img.getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_DEFAULT);
       ImageIcon logoIcon = new ImageIcon(imgRsz); 
       lbImage.setIcon(logoIcon);
    }    
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
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Kurir;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbAlamat;
    private javax.swing.JLabel lbBelanja;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbPengiriman;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JRadioButton rdBtn1;
    private javax.swing.JRadioButton rdBtn2;
    private javax.swing.JRadioButton rdBtn3;
    private javax.swing.JRadioButton rdBtn4;
    // End of variables declaration//GEN-END:variables
}
