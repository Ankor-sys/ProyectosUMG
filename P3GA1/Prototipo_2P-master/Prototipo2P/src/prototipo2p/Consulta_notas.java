/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo2p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sucely Alvarez
 */
public class Consulta_notas extends javax.swing.JInternalFrame {

    String BD = "jdbc:mysql://localhost/siu";
    String Usuario = "root";
    String Clave = "Cagada1234";

    /**
     * Creates new form Consulta_notas
     */
    public Consulta_notas() {
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

        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_notas = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta Notas");
        setVisible(true);

        txtBuscar.setBackground(new java.awt.Color(204, 255, 255));
        txtBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese su número de carnet");

        Tbl_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Codigo Curso", "Nombre Curso", "Nombre Curso", "Tipo Nota", "Nota"
            }
        ));
        Tbl_notas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_notasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_notas);

        jButton4.setBackground(new java.awt.Color(141, 141, 208));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tbl_notasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_notasMouseClicked

    }//GEN-LAST:event_Tbl_notasMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String ID = txtBuscar.getText();

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pstt4 = cn.prepareStatement("select * from notas where carnet_alumno = " + ID);
            ResultSet rss4 = pstt4.executeQuery();

            PreparedStatement pstt = cn.prepareStatement("select * from notas where carnet_alumno = " + ID);
            ResultSet rss = pstt.executeQuery();
            if (rss.next()) {
                DefaultTableModel modelo = new DefaultTableModel();
                modelo.addColumn("codigo_notas");
                modelo.addColumn("carnet_alumno");
                modelo.addColumn("codigo_curso");
                modelo.addColumn("nombre_curso");
                modelo.addColumn("tipo_nota");
                modelo.addColumn("nota");

                Tbl_notas.setModel(modelo);
                String[] dato = new String[6];
                while (rss4.next()) {
                    dato[0] = rss4.getString(1);
                    dato[1] = rss4.getString(2);
                    dato[2] = rss4.getString(3);
                    dato[3] = rss4.getString(4);
                    dato[4] = rss4.getString(5);
                    dato[5] = rss4.getString(6);

                    modelo.addRow(dato);
                }
            }
            else{
                  JOptionPane.showMessageDialog(null, "El codigo de estudiante no existe");
                   }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_notas;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
