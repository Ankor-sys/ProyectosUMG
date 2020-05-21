/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo2p;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan Cifuentes
 */
public class Alumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleados
     */
    String BD = "jdbc:mysql://localhost/siu";
    String Usuario = "root";
    String Clave = "Cagada1234";
    

    public Alumnos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void Tabla() {
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);

            PreparedStatement ps = cn.prepareStatement("select * from alumnos");
            PreparedStatement ps2 = cn.prepareStatement("select * from alumnos");
            //pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            ResultSet rss = ps2.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("carnet_alumno");
                modelo.addColumn("nombre_alumno");
                modelo.addColumn("direccion_alumno");
                modelo.addColumn("telefono_alumno");
                modelo.addColumn("email_alumno");
                modelo.addColumn("estatus_alumno");

                tbl_alumno.setModel(modelo);

                String[] dato = new String[6];

                while (rss.next()) {
                    dato[0] = rss.getString(1);
                    dato[1] = rss.getString(2);
                    dato[2] = rss.getString(3);
                    dato[3] = rss.getString(4);
                    dato[4] = rss.getString(5);
                    dato[5] = rss.getString(6);

                    modelo.addRow(dato);
                }
            }

        } catch (Exception e) {

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_estatusalumno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_alumno = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setTitle("Alumnos");
        setVisible(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Carnet Alumno:");

        txt_nombre.setBackground(new java.awt.Color(204, 255, 255));
        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Alumno:");

        txt_codigo.setBackground(new java.awt.Color(204, 255, 255));
        txt_codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Direccion Alumo:");

        txt_direccion.setBackground(new java.awt.Color(204, 255, 255));
        txt_direccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingresa el código de Alumno: ");

        txt_buscar.setBackground(new java.awt.Color(204, 255, 255));
        txt_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton4.setBackground(new java.awt.Color(141, 141, 208));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(141, 141, 208));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarp.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(141, 141, 208));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(141, 141, 208));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Telefono Alumno: ");

        txt_telefono.setBackground(new java.awt.Color(204, 255, 255));
        txt_telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Email Alumno:");

        txt_email.setBackground(new java.awt.Color(204, 255, 255));
        txt_email.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Estatus Alumno:");

        txt_estatusalumno.setBackground(new java.awt.Color(204, 255, 255));
        txt_estatusalumno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_estatusalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estatusalumnoActionPerformed(evt);
            }
        });

        tbl_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Carnet Alumno", "Nombre Alumno", "Direccion Alumno", "Telefono Alumno", "E-Mail Alumno", "Estatus Alumno"
            }
        ));
        tbl_alumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_alumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_alumno);

        jButton5.setText("Listar Datos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                 Para modificar/ Eliminar:\n1. Debe buscar el carnet del alumno\n2. Luego seleccionar la fila de la tabla \n3. Modificar los campos necesarios\n4. Darle click al boton Modificar (Icono del \n    Lápiz).");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jButton1)
                        .addGap(15, 15, 15)
                        .addComponent(jButton2)
                        .addGap(25, 25, 25)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estatusalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txt_estatusalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//Codigo que permite consultar registros en la base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);

            PreparedStatement pstt4 = cn.prepareStatement("select * from alumnos where carnet_alumno=?");
            pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rss4 = pstt4.executeQuery();

            // hacer la copia del query para que la tabla empiece desde 1
            PreparedStatement ps = cn.prepareStatement("select * from alumnos where carnet_alumno=?");
            ps.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                DefaultTableModel modelo = new DefaultTableModel();

                modelo.addColumn("carnet_alumno");
                modelo.addColumn("nombre_alumno");
                modelo.addColumn("direccion_alumno");
                modelo.addColumn("telefono_alumno");
                modelo.addColumn("email_alumno");
                modelo.addColumn("estatus_alumno");

                tbl_alumno.setModel(modelo);

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
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no Registrado");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Codigo que permite insertar registros en al base de datos
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("insert into alumnos values(?,?,?,?,?,?)");

            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_direccion.getText().trim());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(5, txt_email.getText().trim());
            pst.setString(6, txt_estatusalumno.getText().trim());

            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_email.setText("");
            txt_estatusalumno.setText("");

            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en registro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Codigo que permite modificar registros en la base de datos
        try {
            String ID = txt_codigo.getText().trim();

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("update alumnos set carnet_alumno= ?, nombre_alumno=?, direccion_alumno=?, telefono_alumno=?, email_alumno=?, estatus_alumno=? where carnet_alumno = " + ID);

            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_direccion.getText().trim());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(5, txt_email.getText().trim());
            pst.setString(6, txt_estatusalumno.getText().trim());

            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_email.setText("");
            txt_estatusalumno.setText("");

            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en modificación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Codigo que permite borrar registros en la base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("delete from alumnos where carnet_alumno = ?");

            pst.setString(1, txt_codigo.getText().trim());
            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_email.setText("");
            txt_estatusalumno.setText("");

            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Tabla();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Error en eliminación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void txt_estatusalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estatusalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estatusalumnoActionPerformed

    private void tbl_alumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_alumnoMouseClicked

        // TODO add your handling code here:
        //para seleccionar el dato y mostrarlo en los txt
        int seleccionar = tbl_alumno.rowAtPoint(evt.getPoint());
        txt_codigo.setText(String.valueOf(tbl_alumno.getValueAt(seleccionar, 0)));
        txt_nombre.setText(String.valueOf(tbl_alumno.getValueAt(seleccionar, 1)));
        txt_direccion.setText(String.valueOf(tbl_alumno.getValueAt(seleccionar, 2)));
        txt_telefono.setText(String.valueOf(tbl_alumno.getValueAt(seleccionar, 3)));
        txt_email.setText(String.valueOf(tbl_alumno.getValueAt(seleccionar, 4)));
        txt_estatusalumno.setText(String.valueOf(tbl_alumno.getValueAt(seleccionar, 5)));

    }//GEN-LAST:event_tbl_alumnoMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Tabla();
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbl_alumno;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estatusalumno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
