/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Alumno;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import persistencia.AlumnoData;
import persistencia.MiConexion;

/**
 *
 * @author PUESTO-A1
 */
public class friAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form friAlumnos
     */
   // AlumnoData aD;
    public friAlumnos() {
        initComponents();
        
         
    //   aD= new AlumnoData();
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
        lbApellido = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbDni = new javax.swing.JLabel();
        lbFechaNacimiento = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFDni = new javax.swing.JTextField();
        ckEstado = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        lbEstado1 = new javax.swing.JLabel();
        btGuardar = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));

        jPanel1.setBackground(new java.awt.Color(34, 39, 46));
        jPanel1.setForeground(new java.awt.Color(173, 186, 199));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbApellido.setForeground(new java.awt.Color(173, 186, 199));
        lbApellido.setText("Apellido");
        jPanel1.add(lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 30));

        lbNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(173, 186, 199));
        lbNombre.setText("Nombre");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, 30));

        lbDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDni.setForeground(new java.awt.Color(173, 186, 199));
        lbDni.setText("DNI");
        jPanel1.add(lbDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 30));

        lbFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbFechaNacimiento.setForeground(new java.awt.Color(173, 186, 199));
        lbFechaNacimiento.setText("Fecha de Nacimiento");
        jPanel1.add(lbFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        jTFApellido.setBackground(new java.awt.Color(34, 39, 46));
        jTFApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFApellido.setForeground(new java.awt.Color(173, 186, 199));
        jTFApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 186, 199)));
        jTFApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFApellidoFocusLost(evt);
            }
        });
        jTFApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 200, 30));

        jTFNombre.setBackground(new java.awt.Color(34, 39, 46));
        jTFNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNombre.setForeground(new java.awt.Color(173, 186, 199));
        jTFNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 186, 199)));
        jTFNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNombreFocusLost(evt);
            }
        });
        jPanel1.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 200, 30));

        jTFDni.setBackground(new java.awt.Color(34, 39, 46));
        jTFDni.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFDni.setForeground(new java.awt.Color(173, 186, 199));
        jTFDni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 186, 199)));
        jTFDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDniFocusLost(evt);
            }
        });
        jPanel1.add(jTFDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 200, 30));

        ckEstado.setBackground(new java.awt.Color(34, 39, 46));
        ckEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ckEstado.setForeground(new java.awt.Color(173, 186, 199));
        ckEstado.setText("Activo");
        ckEstado.setContentAreaFilled(false);
        ckEstado.setEnabled(false);
        ckEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(ckEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(173, 186, 199));
        jLabel1.setText("Formulario de alumno");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btBuscar.setBackground(new java.awt.Color(34, 39, 46));
        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBuscar.setForeground(new java.awt.Color(173, 186, 199));
        btBuscar.setText("Buscar");
        btBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBuscar.setContentAreaFilled(false);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 100, 30));

        btBorrar.setBackground(new java.awt.Color(34, 39, 46));
        btBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBorrar.setForeground(new java.awt.Color(173, 186, 199));
        btBorrar.setText("Borrar");
        btBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBorrar.setContentAreaFilled(false);
        btBorrar.setEnabled(false);
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 100, 30));

        lbEstado1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEstado1.setForeground(new java.awt.Color(173, 186, 199));
        lbEstado1.setText("Estado");
        jPanel1.add(lbEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 30));

        btGuardar.setBackground(new java.awt.Color(34, 39, 46));
        btGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btGuardar.setForeground(new java.awt.Color(173, 186, 199));
        btGuardar.setText("Guardar");
        btGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btGuardar.setContentAreaFilled(false);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 100, 30));

        btLimpiar.setBackground(new java.awt.Color(34, 39, 46));
        btLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpiar.setForeground(new java.awt.Color(173, 186, 199));
        btLimpiar.setText("Limpiar");
        btLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLimpiar.setContentAreaFilled(false);
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, 30));

        btActualizar.setBackground(new java.awt.Color(34, 39, 46));
        btActualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btActualizar.setForeground(new java.awt.Color(173, 186, 199));
        btActualizar.setText("Actualizar");
        btActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btActualizar.setContentAreaFilled(false);
        btActualizar.setEnabled(false);
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 100, 30));
        jPanel1.add(jdcFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFApellidoActionPerformed

    private void ckEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ckEstadoActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        
        Alumno al= new Alumno();
        MiConexion con = new MiConexion("jdbc:mysql://localhost/universidad", "root", "");
        AlumnoData aD= new AlumnoData(con);
        String dniBuscar=jTFDni.getText();
        al=aD.obtenerAlumnoXDni(dniBuscar);
        if (al!=null&&al.getEstado()!=0){
            jTFNombre.setText(al.getNombre());
            jTFApellido.setText(al.getApellido());
            jTFDni.setText(al.getDni());
            LocalDate lc = al.getFechaNacimiento();
           Date date = (Date) Date.valueOf(lc);
            jdcFechaNacimiento.setDate(date);
            ckEstado.setEnabled(true);
            ckEstado.setSelected(al.getEstado()==1);
            btActualizar.setEnabled(true);
            btBorrar.setEnabled(true);  
        } else {
            JOptionPane.showMessageDialog(this, "No existe un alumno con ese dni.");
        }
        
        
        
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
         Alumno al= new Alumno();
         MiConexion con = new MiConexion("jdbc:mysql://localhost/universidad", "root", "");
      
        AlumnoData aD= new AlumnoData(con);
        java.util.Date sfecha = jdcFechaNacimiento.getDate();
        LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        al.setFechaNacimiento(fechaNac);
        al.setNombre(jTFNombre.getText());
        al.setApellido(jTFApellido.getText());
        al.setDni(jTFDni.getText()); 
        aD.guardarAlumno(al);
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void jTFApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFApellidoFocusLost
String val="[a-zA-Z]*";
        if (!jTFApellido.getText().matches(val)){
            JOptionPane.showMessageDialog(this, "No es un dato Valido para apellido.");
            jTFApellido.requestFocus();
        }        
    }//GEN-LAST:event_jTFApellidoFocusLost

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        Limpiar();
        jTFApellido.setText("");
        
        
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        MiConexion con = new MiConexion("jdbc:mysql://localhost/universidad", "root", "");
        AlumnoData aD= new AlumnoData(con);
        Alumno al= new Alumno();
        al=aD.obtenerAlumnoXDni(jTFDni.getText());
        aD.actualizarAlumno(al);
        
    }//GEN-LAST:event_btActualizarActionPerformed
///////////// revisar.
    private void jTFNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreFocusLost
         String val="[a-zA-Z]*";
        if(!jTFNombre.getText().matches(val)){
            JOptionPane.showMessageDialog(this,"No es un dato valido para nombre.");
            jTFNombre.requestFocus();
        
        }
    }//GEN-LAST:event_jTFNombreFocusLost

    private void jTFDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDniFocusLost
          String val="[0-9]*";
        if(!jTFDni.getText().matches(val)){
            JOptionPane.showMessageDialog(this, "No es un dato valido para DNI.");
            jTFDni.requestFocus();
        }
    }//GEN-LAST:event_jTFDniFocusLost
    private void Limpiar(){
        jTFApellido.setText("");
        jTFNombre.setText("");
        jTFDni.setText("");
        jdcFechaNacimiento.setDate(null);
        ckEstado.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JCheckBox ckEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbEstado1;
    private javax.swing.JLabel lbFechaNacimiento;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables
}
