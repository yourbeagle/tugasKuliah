package grosirin;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

public class homepage extends javax.swing.JFrame {
        public String barang1,barang2,barang3;
        public static String GlobalList,GlobalBarang;
        Connection con;
        PreparedStatement pst;
        Statement stm;
        ResultSet rs;
        JFileChooser jfc;
        File file;

    public homepage() {
        initComponents();
       // load();
    }

    private void load(){
        try {
//            String id = lbIdUser.getText();
//            globalIdUser = id;
//            System.out.print(globalIdUser);
            lbIdUser.setText(LoginPage.globalIdUser);
            String sql = "select namaBarang, harga, photopath,idBarang from barang ORDER BY idbarang ASC LIMIT 3";
            con = Koneksi.configDB();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
                while(rs.next()){
                    
                }
                rs.absolute(1);
                lbNama1.setText (rs.getString("namaBarang"));
                lbHarga1.setText ("Rp. "+rs.getString("harga"));
                String tmtpoto = rs.getString("photopath");
                barang1 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(gb1.getWidth(), gb1.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        gb1.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
                rs.absolute(2);
                    lbNama2.setText (rs.getString("namaBarang"));
                    lbHarga2.setText ("Rp. "+rs.getString("harga"));
                    tmtpoto = rs.getString("photopath");
                    barang2 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(gb2.getWidth(), gb2.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        gb2.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
                    rs.absolute(3);
                    lbNama3.setText (rs.getString("namaBarang"));
                    lbHarga3.setText ("Rp. "+rs.getString("harga"));
                    tmtpoto = rs.getString("photopath");
                    barang3 = rs.getString("idBarang");
                    try {
                        Toolkit toolkit=Toolkit.getDefaultToolkit();
                        String path=new File(".").getCanonicalPath();
                        Image image=toolkit.getImage(path+"/src/Image/barang/"+tmtpoto); 
                        Image imagedResized=image.getScaledInstance(gb3.getWidth(), gb3.getHeight(), Image.SCALE_DEFAULT);
                        ImageIcon icon=new ImageIcon(imagedResized);
                        gb3.setIcon(icon); 
                    } catch (Exception e) {
                      System.out.println(e.getMessage());
                    }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void setIconImage()
    {
       Image img = new ImageIcon("src\\image\\iconlogo.png").getImage();
       Image imgRsz = img.getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_DEFAULT);
       ImageIcon logoIcon = new ImageIcon(imgRsz); 
       lbImage.setIcon(logoIcon);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        javax.swing.JButton tb1 = new javax.swing.JButton();
        tb2 = new javax.swing.JButton();
        tb3 = new javax.swing.JButton();
        tb4 = new javax.swing.JButton();
        tb5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        gb1 = new javax.swing.JButton();
        lbNama1 = new javax.swing.JLabel();
        lbHarga1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        gb2 = new javax.swing.JButton();
        lbNama2 = new javax.swing.JLabel();
        lbHarga2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        gb3 = new javax.swing.JButton();
        lbNama3 = new javax.swing.JLabel();
        lbHarga3 = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        lbIdUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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

        jPanel2.setBackground(new java.awt.Color(186, 199, 240));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 72));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Explor Now");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel11.setText("SPECIAL DISKON");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 865, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tb1.setBackground(new java.awt.Color(255, 255, 255));
        tb1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb1.setText("MINYAK");
        tb1.setBorder(null);
        tb1.setPreferredSize(new java.awt.Dimension(143, 40));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        tb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb1ActionPerformed(evt);
            }
        });

        tb2.setBackground(new java.awt.Color(255, 255, 255));
        tb2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb2.setText("MIE");
        tb2.setPreferredSize(new java.awt.Dimension(143, 40));
        tb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb2MouseClicked(evt);
            }
        });
        tb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb2ActionPerformed(evt);
            }
        });

        tb3.setBackground(new java.awt.Color(255, 255, 255));
        tb3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb3.setText("BERAS");
        tb3.setPreferredSize(new java.awt.Dimension(143, 40));
        tb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb3MouseClicked(evt);
            }
        });

        tb4.setBackground(new java.awt.Color(255, 255, 255));
        tb4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb4.setText("SUSU");
        tb4.setPreferredSize(new java.awt.Dimension(143, 40));
        tb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb4MouseClicked(evt);
            }
        });

        tb5.setBackground(new java.awt.Color(255, 255, 255));
        tb5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tb5.setText("ROTI");
        tb5.setPreferredSize(new java.awt.Dimension(143, 40));
        tb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb5MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("BEST SELLER PRODUCT");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        gb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb1ActionPerformed(evt);
            }
        });

        lbNama1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNama1.setText("Mie Sedaap");

        lbHarga1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lbHarga1.setText("Rp. 2500");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(gb1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbHarga1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNama1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gb1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNama1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHarga1)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        gb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb2ActionPerformed(evt);
            }
        });

        lbNama2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNama2.setText("Mie Sedaap");

        lbHarga2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lbHarga2.setText("Rp. 2500");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(gb2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNama2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(lbHarga2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gb2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNama2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHarga2)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        gb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gb3ActionPerformed(evt);
            }
        });

        lbNama3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbNama3.setText("Mie Sedaap");

        lbHarga3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        lbHarga3.setText("Rp. 2500");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(gb3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNama3, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(lbHarga3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gb3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNama3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHarga3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(62, 62, 62)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(74, 74, 74))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106)
                            .addComponent(tb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(141, 141, 141)
                            .addComponent(tb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(143, 143, 143)
                            .addComponent(tb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(95, 95, 95)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbIdUser)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lbIdUser)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        load();
        setIconImage();
    }//GEN-LAST:event_formWindowActivated

    private void gb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb1ActionPerformed
        GlobalBarang = barang1;
        this.dispose();
        viewbarang hp = new viewbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_gb1ActionPerformed

    private void gb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb2ActionPerformed
        GlobalBarang = barang2;
        this.dispose();
        viewbarang hp = new viewbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_gb2ActionPerformed

    private void gb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gb3ActionPerformed
        GlobalBarang = barang3;
        this.dispose();
        viewbarang hp = new viewbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_gb3ActionPerformed

    private void tb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tb2ActionPerformed

    private void tb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb1ActionPerformed
        
    }//GEN-LAST:event_tb1ActionPerformed

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
        GlobalList = "4";
        System.out.println("TES barang" + GlobalList);
        this.dispose();
        listbarang hp = new listbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_tb1MouseClicked

    private void tb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb2MouseClicked
        GlobalList = "5";
        System.out.println("TES barang" + GlobalList);
        this.dispose();
        listbarang hp = new listbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_tb2MouseClicked

    private void tb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb3MouseClicked
       GlobalList = "3";
        System.out.println("TES barang" + GlobalList);
        this.dispose();
        listbarang hp = new listbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_tb3MouseClicked

    private void tb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb4MouseClicked
        GlobalList = "2";
        System.out.println("TES barang" + GlobalList);
        this.dispose();
        listbarang hp = new listbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_tb4MouseClicked

    private void tb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb5MouseClicked
       GlobalList = "1";
        System.out.println("TES barang" + GlobalList);
        this.dispose();
        listbarang hp = new listbarang();
        hp.setVisible(true);
    }//GEN-LAST:event_tb5MouseClicked

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gb1;
    private javax.swing.JButton gb2;
    private javax.swing.JButton gb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbHarga1;
    private javax.swing.JLabel lbHarga2;
    private javax.swing.JLabel lbHarga3;
    public static javax.swing.JLabel lbIdUser;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbNama1;
    private javax.swing.JLabel lbNama2;
    private javax.swing.JLabel lbNama3;
    private javax.swing.JButton tb2;
    private javax.swing.JButton tb3;
    private javax.swing.JButton tb4;
    private javax.swing.JButton tb5;
    // End of variables declaration//GEN-END:variables
}
