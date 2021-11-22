package co.edu.itc.programacion2.PruebaBD.vista;

import co.edu.itc.programacion2.PruebaBD.negocio.CandidatoDAO;
import co.edu.itc.programacion2.PruebaBD.vo.CandidatoVO;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.List;

public class Listar extends javax.swing.JFrame {

    public Listar() {
        initComponents();
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        CandidatoDAO conn = new CandidatoDAO();
        List<CandidatoVO> candidatos = conn.listarCandidatos();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Acudiente");
        modelo.addColumn("Telefono");
        modelo.addColumn("Grado");
        
        String filas[] = new String[6];
        for (CandidatoVO can : candidatos) {
            filas[0] = can.getCodigoCandidato().toString();
            filas[1] = can.getNombre();
            filas[2] = can.getApellidos();
            filas[3] = can.getNombreAcudiente();
            filas[4] = can.getTelefonoAcudiente();
            filas[5] = can.getGradoAIngresar();
            modelo.addRow(filas);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTituloCandidatos = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 690, 270));

        txtTituloCandidatos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTituloCandidatos.setForeground(new java.awt.Color(255, 255, 255));
        txtTituloCandidatos.setText("Listado de candidatos");
        getContentPane().add(txtTituloCandidatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 270, 40));

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setText("Volver al menu inicial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/itc/programacion2/PruebaBD/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuInicial mi = new MenuInicial();
        mi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel txtTituloCandidatos;
    // End of variables declaration//GEN-END:variables
}
