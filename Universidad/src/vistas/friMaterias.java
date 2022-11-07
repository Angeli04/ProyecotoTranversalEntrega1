/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Materia;
import javax.swing.JOptionPane;
import persistencia.MateriaData;
import persistencia.MiConexion;

/**
 *
 * @author PUESTO-A1
 */
public class friMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form friMaterias
     */
    public friMaterias() {
        initComponents();
        llenarComboBox();
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
        jLNombre = new javax.swing.JLabel();
        jLPeriodo = new javax.swing.JLabel();
        jLIdMateria = new javax.swing.JLabel();
        jTFIdMateria = new javax.swing.JTextField();
        ckbEstado = new javax.swing.JCheckBox();
        btLimpiar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        cbPeriodo = new javax.swing.JComboBox<>();
        jLEstado = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        btSalir = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(34, 39, 46));
        jPanel1.setForeground(new java.awt.Color(173, 186, 199));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(173, 186, 199));
        jLabel1.setText("Formulario de materia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(173, 186, 199));
        jLNombre.setText("Nombre");
        jPanel1.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 200, 30));

        jLPeriodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLPeriodo.setForeground(new java.awt.Color(173, 186, 199));
        jLPeriodo.setText("Periodo");
        jPanel1.add(jLPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 200, 30));

        jLIdMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLIdMateria.setForeground(new java.awt.Color(173, 186, 199));
        jLIdMateria.setText("Id Materia");
        jPanel1.add(jLIdMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 200, 30));

        jTFIdMateria.setBackground(new java.awt.Color(34, 39, 46));
        jTFIdMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFIdMateria.setForeground(new java.awt.Color(173, 186, 199));
        jTFIdMateria.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 186, 199)));
        jTFIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdMateriaActionPerformed(evt);
            }
        });
        jPanel1.add(jTFIdMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 100, 30));

        ckbEstado.setBackground(new java.awt.Color(34, 39, 46));
        ckbEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ckbEstado.setForeground(new java.awt.Color(173, 186, 199));
        ckbEstado.setText("Activo");
        ckbEstado.setContentAreaFilled(false);
        jPanel1.add(ckbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 200, 30));

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
        jPanel1.add(btLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 100, 30));

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
        jPanel1.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 100, 30));

        cbPeriodo.setBackground(new java.awt.Color(34, 39, 46));
        cbPeriodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbPeriodo.setForeground(new java.awt.Color(173, 186, 199));
        cbPeriodo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 186, 199)));
        jPanel1.add(cbPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 70, 30));

        jLEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLEstado.setForeground(new java.awt.Color(173, 186, 199));
        jLEstado.setText("Estado");
        jPanel1.add(jLEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 30));

        jTFNombre.setBackground(new java.awt.Color(34, 39, 46));
        jTFNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFNombre.setForeground(new java.awt.Color(173, 186, 199));
        jTFNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 186, 199)));
        jTFNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNombreFocusLost(evt);
            }
        });
        jPanel1.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 200, 30));

        btSalir.setBackground(new java.awt.Color(34, 39, 46));
        btSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalir.setForeground(new java.awt.Color(173, 186, 199));
        btSalir.setText("Salir");
        btSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btSalir.setContentAreaFilled(false);
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 100, 30));

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
        jPanel1.add(btBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 100, 30));

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
        jPanel1.add(btActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 100, 30));

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
        jPanel1.add(btBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdMateriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdMateriaActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        MiConexion con= new MiConexion("jdbc:mysql://localhost/universidad","root","");
        Materia mat= new Materia();
        MateriaData mD= new MateriaData(con);
        try {
            Integer id= Integer.parseInt(jTFIdMateria.getText());
            mat=mD.obtenerMateria(id);
                jTFNombre.setText(mat.getNombre());
                cbPeriodo.setSelectedIndex(mat.getPeriodo()-1);
                cbPeriodo.setEnabled(true);
                if (mat.getEstado()!=0){
                ckbEstado.setSelected(true);
                btActualizar.setEnabled(true);
                btBorrar.setEnabled(true);
                jTFIdMateria.setEnabled(false);
                ckbEstado.setEnabled(false);
                }               
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "No es un ID valido, Ingrese numeros.");
            limpiarCampos();
        } catch(NullPointerException ex){
            JOptionPane.showMessageDialog(this, "No existe una materia con ese ID.");
            limpiarCampos();
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jTFNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombreFocusLost
        String val="[a-zA-Z0-9\\s]*";
        if (!jTFNombre.getText().matches(val)){
            JOptionPane.showMessageDialog(this, "No es un nombre valido, use solo letras.");
            jTFNombre.requestFocus();
        }
    }//GEN-LAST:event_jTFNombreFocusLost

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        MiConexion con= new MiConexion("jdbc:mysql://localhost/universidad", "root", "");
        MateriaData mD= new MateriaData(con);
        Materia mat= new Materia();
        int est=0;
        mat.setNombre(jTFNombre.getText());
        mat.setPeriodo(cbPeriodo.getSelectedIndex()+1);
        if (ckbEstado.isSelected()){
            est=1;
        }
        mat.setEstado(est);
        try{
            mD.guardarMateria(mat);
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "No se pudo guardar la materia.");
        }
        
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
       MiConexion con= new MiConexion("jdbc:mysql://localhost/universidad","root","");
       MateriaData mD= new MateriaData(con);
       Materia mat= new Materia();
       mat.setNombre(jTFNombre.getText());
       mat.setPeriodo(cbPeriodo.getSelectedIndex()+1);
       mat.setIdMateria(Integer.parseInt(jTFIdMateria.getText()));
       
       mD.actualizarMateria(mat);
      
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        MiConexion con = new MiConexion("jdbc:mysql://localhost/universidad","root","");
        MateriaData mD= new MateriaData(con);
        int id;
        id=Integer.parseInt(jTFIdMateria.getText());
        mD.eliminarMateria(id);
    }//GEN-LAST:event_btBorrarActionPerformed
    private void llenarComboBox(){
        cbPeriodo.addItem(1);
        cbPeriodo.addItem(2);
        cbPeriodo.addItem(3);
    }
    private void limpiarCampos(){
        jTFNombre.setText("");
        cbPeriodo.setSelectedIndex(0);
        ckbEstado.setSelected(false);
        jTFIdMateria.setText("");
        jTFIdMateria.setEnabled(true);
        ckbEstado.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Integer> cbPeriodo;
    private javax.swing.JCheckBox ckbEstado;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLIdMateria;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFIdMateria;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
