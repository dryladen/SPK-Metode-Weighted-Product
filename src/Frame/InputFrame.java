package Frame;

import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Laden
 */
public class InputFrame extends javax.swing.JFrame {

    private final Koneksi koneksi = new Koneksi();
    private boolean isDataUpdate = false;
    private String idSpringBed = null;
    private PreparedStatement pst;
    private ResultSet result;
    private Statement stm;
    private String sql = null;
    
    public InputFrame() {
        initComponents();
    }
    
    public InputFrame(boolean dataUpdate, String idSpringBed) {
        try {
            initComponents();
            this.isDataUpdate = dataUpdate;
            this.idSpringBed = idSpringBed;
            getDataUpdate();
        } catch (ParseException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new javax.swing.JPanel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabelNama = new javax.swing.JLabel();
        jLabelHarga = new javax.swing.JLabel();
        jLabelBahan = new javax.swing.JLabel();
        jLabelKeempukan = new javax.swing.JLabel();
        jLabelWarna = new javax.swing.JLabel();
        jLabelLebar = new javax.swing.JLabel();
        jLabelFitur = new javax.swing.JLabel();
        btnConfirm = new Frame.CButton();
        jComboBoxBahan = new javax.swing.JComboBox<>();
        jComboBoxKeempukan = new javax.swing.JComboBox<>();
        jComboBoxWarna = new javax.swing.JComboBox<>();
        jComboBoxLebar = new javax.swing.JComboBox<>();
        jComboBoxFitur = new javax.swing.JComboBox<>();
        btnCancel = new Frame.CButton();
        jTextFieldHarga = new javax.swing.JTextField();
        jLabelGaransi = new javax.swing.JLabel();
        jComboBoxGaransi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabelNama.setText("NAMA");

        jLabelHarga.setText("HARGA");

        jLabelBahan.setText("KECOCOKAN BAHAN");

        jLabelKeempukan.setText("KECOCOKAN KEEMPUKAN");

        jLabelWarna.setText("KECOCOKAN WARNA");

        jLabelLebar.setText("LEBAR");

        jLabelFitur.setText("KECOCOKAN FITUR");

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jComboBoxBahan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jComboBoxKeempukan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jComboBoxWarna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jComboBoxLebar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        jComboBoxFitur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        btnCancel.setText("Cancel");
        btnCancel.setMaximumSize(new java.awt.Dimension(69, 23));
        btnCancel.setMinimumSize(new java.awt.Dimension(69, 23));
        btnCancel.setPreferredSize(new java.awt.Dimension(69, 23));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabelGaransi.setText("GARANSI");

        jComboBoxGaransi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tidak ada", "Ada" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBoxKeempukan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxBahan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHarga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBahan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKeempukan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxWarna, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxLebar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxGaransi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxFitur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFitur)
                                    .addComponent(jLabelLebar)
                                    .addComponent(jLabelWarna)
                                    .addComponent(jLabelGaransi))
                                .addGap(0, 133, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNama)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHarga)
                        .addGap(44, 44, 44)
                        .addComponent(jLabelBahan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxBahan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jComboBoxWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxLebar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelWarna)
                                .addGap(43, 43, 43)
                                .addComponent(jLabelLebar)
                                .addGap(44, 44, 44)
                                .addComponent(jLabelFitur)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFitur, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelKeempukan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxKeempukan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelGaransi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxGaransi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        if(!jTextFieldNama.getText().isEmpty()){
            if(isDataUpdate == false){
                    sql = "INSERT INTO dataSpringBed (nama,harga,bahan,keempukan,warna,lebar,fitur,garansi) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')";
                    sql = String.format(sql, 
                            jTextFieldNama.getText(),
                            jTextFieldHarga.getText(),
                            jComboBoxBahan.getSelectedItem(),
                            jComboBoxKeempukan.getSelectedItem(),
                            jComboBoxWarna.getSelectedItem(),
                            jComboBoxLebar.getSelectedItem(),
                            jComboBoxFitur.getSelectedItem(),
                            jComboBoxGaransi.getSelectedIndex());

            } else if (isDataUpdate = true){
                sql = "UPDATE dataSpringBed SET nama='%s',harga='%s',bahan='%s', keempukan='%s',warna='%s', lebar='%s', fitur='%s', garansi='%s' WHERE id='%s'";
                sql = String.format(sql, 
                        jTextFieldNama.getText(),
                        jTextFieldHarga.getText(),
                        jComboBoxBahan.getSelectedItem(),
                        jComboBoxKeempukan.getSelectedItem(),
                        jComboBoxWarna.getSelectedItem(),
                        jComboBoxLebar.getSelectedItem(),
                        jComboBoxFitur.getSelectedItem(),
                        jComboBoxGaransi.getSelectedIndex(),
                        idSpringBed);
            }
            try {
                Connection cn = koneksi.getKoneksi();
                pst = cn.prepareStatement(sql);
                pst.execute();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(jPanel2, "Gagal membuat data baru : "+ex);
            } finally {
                try {
                    pst.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
        } else {
            JOptionPane.showMessageDialog(jPanel2, "Spring bed belum mempunyai nama");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Frame.CButton btnCancel;
    private Frame.CButton btnConfirm;
    private javax.swing.JComboBox<String> jComboBoxBahan;
    private javax.swing.JComboBox<String> jComboBoxFitur;
    private javax.swing.JComboBox<String> jComboBoxGaransi;
    private javax.swing.JComboBox<String> jComboBoxKeempukan;
    private javax.swing.JComboBox<String> jComboBoxLebar;
    private javax.swing.JComboBox<String> jComboBoxWarna;
    private javax.swing.JLabel jLabelBahan;
    private javax.swing.JLabel jLabelFitur;
    private javax.swing.JLabel jLabelGaransi;
    private javax.swing.JLabel jLabelHarga;
    private javax.swing.JLabel jLabelKeempukan;
    private javax.swing.JLabel jLabelLebar;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelWarna;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldHarga;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables
    private void getDataUpdate() throws ParseException {
        sql = "SELECT * FROM dataSpringBed WHERE id='%s'";
        sql = String.format(sql,this.idSpringBed);
        try {
            Connection cn = koneksi.getKoneksi();
            pst = cn.prepareStatement(sql);
            result = pst.executeQuery();
            while(result.next()){
                jTextFieldNama.setText(result.getString(2));
                jTextFieldHarga.setText(result.getString(3));
                jComboBoxBahan.setSelectedIndex(result.getInt(4));
                jComboBoxKeempukan.setSelectedIndex(result.getInt(5));
                jComboBoxWarna.setSelectedIndex(result.getInt(6));
                jComboBoxLebar.setSelectedIndex(result.getInt(7));
                jComboBoxFitur.setSelectedIndex(result.getInt(8));
                jComboBoxGaransi.setSelectedIndex(result.getInt(9));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InputFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pst.close();
                result.close();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
