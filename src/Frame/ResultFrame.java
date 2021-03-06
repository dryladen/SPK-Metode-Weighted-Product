package Frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Laden
 */
public class ResultFrame extends javax.swing.JFrame {

    private final DefaultListModel modelSpringBed;
    private final ArrayList<String> dataIdSpringBed = new ArrayList();
    private ArrayList<BobotPenilaian> dataSpringBed = new ArrayList();
    private PreparedStatement pst;
    private ResultSet result;
    private Statement stm;
    private final Koneksi koneksi = new Koneksi();
    
    public ResultFrame() {
        initComponents();
        modelSpringBed = new DefaultListModel();
        pnlSpringBed.setModel(modelSpringBed);
        getData();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlSpringBed = new javax.swing.JList<>();
        jTextFieldHarga = new javax.swing.JTextField();
        jTextFieldBahan = new javax.swing.JTextField();
        jTextFieldKeempukan = new javax.swing.JTextField();
        jTextFieldWarna = new javax.swing.JTextField();
        jTextFieldLebar = new javax.swing.JTextField();
        jTextFieldFitur = new javax.swing.JTextField();
        jTextFieldGaransi = new javax.swing.JTextField();
        jLabelHarga = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelLebar = new javax.swing.JLabel();
        jLabelFitur = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cButton1 = new Frame.CButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        pnlSpringBed.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Spring Bed Terbaik", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Yu Gothic", 1, 14))); // NOI18N
        pnlSpringBed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSpringBedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pnlSpringBed);

        jTextFieldHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHargaActionPerformed(evt);
            }
        });

        jTextFieldKeempukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldKeempukanActionPerformed(evt);
            }
        });

        jTextFieldWarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldWarnaActionPerformed(evt);
            }
        });

        jLabelHarga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelHarga.setText("HARGA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("KECOCOKAN BAHAN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("KEEMPUKAN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("WARNA");

        jLabelLebar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLebar.setText("LEBAR");

        jLabelFitur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelFitur.setText("FITUR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("GARANSI");

        cButton1.setText("Back to Menu");
        cButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBahan, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jTextFieldHarga, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldWarna)
                            .addComponent(jTextFieldKeempukan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFitur)
                            .addComponent(jTextFieldLebar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFitur)
                                    .addComponent(jLabelHarga)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabelLebar)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextFieldGaransi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHarga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBahan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldKeempukan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLebar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFitur)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldFitur, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldGaransi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHargaActionPerformed

    private void jTextFieldKeempukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldKeempukanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldKeempukanActionPerformed

    private void jTextFieldWarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldWarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldWarnaActionPerformed

    private void pnlSpringBedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSpringBedMouseClicked
        // TODO add your handling code here:
        if(!pnlSpringBed.isSelectionEmpty() && evt.getButton() == 1){ // untuk menampilkan tanggal dan deskripsi
            try {
                int index = pnlSpringBed.getSelectedIndex();
                String sql = "SELECT * FROM dataSpringBed WHERE nama=?";
                Connection cn = koneksi.getKoneksi();
                pst = cn.prepareStatement(sql);
                pst.setString(1, dataSpringBed.get(index).getNama());
                result = pst.executeQuery();
                String harga = "0",bahan = "0",keempukan = "0",warna = "0",lebar = "0",fitur = "0",garansi = "0",nilaiV = "0";
                jTextFieldHarga.setText("");
                jTextFieldBahan.setText("");
                jTextFieldKeempukan.setText("");
                jTextFieldWarna.setText("");
                jTextFieldLebar.setText("");
                jTextFieldFitur.setText("");
                jTextFieldGaransi.setText("");
                while(result.next()){
                    harga = result.getString(3);
                    bahan = result.getString(4);
                    keempukan = result.getString(5);
                    warna = result.getString(6);
                    lebar = result.getString(7);
                    fitur = result.getString(8);
                    garansi = result.getString(9);
                    
                }
                jTextFieldHarga.setText(harga);
                jTextFieldKeempukan.setText(keempukan);
                jTextFieldBahan.setText(bahan);
                jTextFieldWarna.setText(warna);
                jTextFieldLebar.setText(lebar);
                jTextFieldFitur.setText(fitur);
                if(garansi.equals("0")){
                    jTextFieldGaransi.setText("Tidak ada"); 
                } else {
                    jTextFieldGaransi.setText("Ada"); 
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlSpringBed, ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    result.close();
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
    }//GEN-LAST:event_pnlSpringBedMouseClicked

    private void cButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButton1ActionPerformed
        // TODO add your handling code here:
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frame.CButton cButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFitur;
    private javax.swing.JLabel jLabelHarga;
    private javax.swing.JLabel jLabelLebar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBahan;
    private javax.swing.JTextField jTextFieldFitur;
    private javax.swing.JTextField jTextFieldGaransi;
    private javax.swing.JTextField jTextFieldHarga;
    private javax.swing.JTextField jTextFieldKeempukan;
    private javax.swing.JTextField jTextFieldLebar;
    private javax.swing.JTextField jTextFieldWarna;
    private javax.swing.JList<String> pnlSpringBed;
    // End of variables declaration//GEN-END:variables
    
    private void getData(){
        try{
            modelSpringBed.removeAllElements();
            dataSpringBed.clear();
            Connection cn = koneksi.getKoneksi();
            stm = cn.createStatement();
            result = stm.executeQuery("SELECT * FROM dataSpringBed");
            while(result.next()){
                dataIdSpringBed.add(result.getString(1));
                dataSpringBed.add(new BobotPenilaian(result.getString(2),result.getInt(3),result.getInt(4),result.getInt(5),result.getInt(6),result.getInt(7), result.getInt(8), result.getInt(9)));
            }
            MetodeWP wp = new MetodeWP(dataSpringBed);
            dataSpringBed.clear();
            dataSpringBed.addAll(wp.cariNilaiV());
            for(int i = 0; i < dataIdSpringBed.size(); i-=-1){
                modelSpringBed.addElement(dataSpringBed.get(i).getNama());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pnlSpringBed, "Error : "+ ex);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                stm.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pnlSpringBed, "Error set data : "+ ex);
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
