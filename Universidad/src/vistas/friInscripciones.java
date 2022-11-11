/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.AlumnoData;
import persistencia.InscripcionData;

/**
 *
 * @author PUESTO-A1
 */
public class friInscripciones extends javax.swing.JInternalFrame {

    private AlumnoData alumnoData;
    private ArrayList<Alumno> alumnos;
    private InscripcionData inscripcionData;
    private DefaultTableModel modelo;
   // private AlumnoData listaAlumnos;
    
    /**
     * Creates new form friInscripciones
     */
    public friInscripciones() {
        initComponents();
       
        
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        alumnoData= new AlumnoData();
        inscripcionData= new InscripcionData();
        alumnos = (ArrayList)alumnoData.listarAlumnos();
        cargaComboBox();
        
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
        lbTitulo1 = new javax.swing.JLabel();
        lbAlumno = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        btInscribir = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbInscripciones = new javax.swing.JTable();
        lbTitulo2 = new javax.swing.JLabel();
        btAnular = new javax.swing.JButton();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(34, 39, 46));
        jPanel1.setForeground(new java.awt.Color(173, 186, 199));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTitulo1.setForeground(new java.awt.Color(173, 186, 199));
        lbTitulo1.setText("Formulario de inscripción");
        jPanel1.add(lbTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lbAlumno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbAlumno.setForeground(new java.awt.Color(173, 186, 199));
        lbAlumno.setText("Alumno");
        jPanel1.add(lbAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 200, 30));

        cbAlumnos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbAlumnos.setForeground(new java.awt.Color(173, 186, 199));
        jPanel1.add(cbAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 470, 30));

        btInscribir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btInscribir.setForeground(new java.awt.Color(173, 186, 199));
        btInscribir.setText("Inscribir");
        btInscribir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 186, 199), 1, true));
        btInscribir.setContentAreaFilled(false);
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });
        jPanel1.add(btInscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 100, 30));

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalir.setForeground(new java.awt.Color(173, 186, 199));
        btSalir.setText("Salir");
        btSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(173, 186, 199), 1, true));
        btSalir.setContentAreaFilled(false);
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 100, 30));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(720, 402));

        tbInscripciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbInscripciones);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 720, 260));

        lbTitulo2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lbTitulo2.setForeground(new java.awt.Color(173, 186, 199));
        lbTitulo2.setText("Listado de materias");
        jPanel1.add(lbTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 320, 50));

        btAnular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAnular.setForeground(new java.awt.Color(173, 186, 199));
        btAnular.setText("Anular Inscripcion");
        btAnular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 186, 199)));
        btAnular.setContentAreaFilled(false);
        btAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularActionPerformed(evt);
            }
        });
        jPanel1.add(btAnular, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 200, 30));

        rbInscriptas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbInscriptas.setForeground(new java.awt.Color(173, 186, 199));
        rbInscriptas.setText("Materias inscriptas");
        rbInscriptas.setContentAreaFilled(false);
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });
        jPanel1.add(rbInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        rbNoInscriptas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbNoInscriptas.setForeground(new java.awt.Color(173, 186, 199));
        rbNoInscriptas.setText("Materias no inscriptas");
        rbNoInscriptas.setContentAreaFilled(false);
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });
        jPanel1.add(rbNoInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                           
                                        

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {                                          
     
    }                                         
    
    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed

        
        int fila= tbInscripciones.getSelectedRow();
       
        if (fila!=-1){
           
            int idMat=(Integer)modelo.getValueAt(fila, 0);
            int periodo =(Integer) modelo.getValueAt(fila, 2);
            String nombre=(String) modelo.getValueAt(fila,1);
            Materia selec=new Materia(nombre,periodo,1);
            selec.setIdMateria(idMat);
            Alumno a= (Alumno) cbAlumnos.getSelectedItem();
            Inscripcion ins= new Inscripcion(a,selec,(-1));
            inscripcionData.guardarInscripcion(ins);
            cargarTablaNoInscripta();
            
        }else{
            JOptionPane.showMessageDialog(this,"No hay materia seleccionada");
        }

    }//GEN-LAST:event_btInscribirActionPerformed

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
       rbInscriptas.setSelected(false);
       cargarTablaNoInscripta();
       btAnular.setEnabled(false);
       btInscribir.setEnabled(true);
     
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
       rbNoInscriptas.setSelected(false);
       cargarTablaInscripta();
       btAnular.setEnabled(true);
       btInscribir.setEnabled(false);
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void btAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularActionPerformed
      int fila= tbInscripciones.getSelectedRow();
      
        if (fila!= -1){
            
            int idMat=(Integer)modelo.getValueAt(fila, 0);
            int periodo =(Integer) modelo.getValueAt(fila, 2);
            String nombre=(String) modelo.getValueAt(fila,1);
            Materia selec = new Materia(nombre,periodo,1);
            selec.setIdMateria(idMat);
            Alumno a= (Alumno) cbAlumnos.getSelectedItem();
           inscripcionData.eliminarInscripcion(a, selec);
            cargarTablaInscripta();
        }else{
            JOptionPane.showMessageDialog(this,"No hay materia seleccionada");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btAnularActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
     dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnular;
    private javax.swing.JButton btInscribir;
    private javax.swing.JButton btSalir;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAlumno;
    private javax.swing.JLabel lbTitulo1;
    private javax.swing.JLabel lbTitulo2;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    private javax.swing.JTable tbInscripciones;
    // End of variables declaration//GEN-END:variables

//    public void cargarAlumnos(){
//        listaAlumnos = new AlumnoData();
//    }

    private void borrarFilasTabla() {
        if (modelo != null) {
            int a = modelo.getRowCount() - 1;

            for (int i = a; i >= 0; i--) {
                modelo.removeRow(i);
            }
        }
        //modelo.setNumRows(0);
    }
    
    private void armarCabeceraTabla() {
        //titulos de las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        columnas.add("Año");
        //recorro el array y uso eso de titulos
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        //se lo cargo a la tabla
        tbInscripciones.setModel(modelo);

    }
    private void cargarTablaNoInscripta(){
        borrarFilasTabla();
        Alumno elegido= (Alumno) cbAlumnos.getSelectedItem();
        if(elegido!=null){
           ArrayList<Materia> listaMateria= (ArrayList)inscripcionData.obtenerMateriasNoInscriptas(elegido);
            for (Materia materia : listaMateria) {
                modelo.addRow(new Object[]{ materia.getIdMateria(),materia.getNombre(),materia.getPeriodo()});
                tbInscripciones.setModel(modelo);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno");
        }
        
    }
    private void cargarTablaInscripta(){
        borrarFilasTabla();
         Alumno elegido= (Alumno) cbAlumnos.getSelectedItem();
        if(elegido!=null){
           ArrayList<Materia> listaMateria= (ArrayList)inscripcionData.obtenerMateriasInscriptas(elegido);
            for (Materia ins : listaMateria) {
                modelo.addRow(new Object[]{ ins.getIdMateria(),ins.getNombre(),ins.getPeriodo()});
                
            }
    }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un alumno");
        }
    }
    private void cargaComboBox() {
       Collections.sort(alumnos, new Comparator<Alumno>() {
           @Override
           public int compare(Alumno o1, Alumno o2) {
               return o1.getApellido().compareTo(o2.getApellido());
           }
       });
        for (Alumno alumno : alumnos) {
            cbAlumnos.addItem(alumno);
            
        }
        
    }

    
}
