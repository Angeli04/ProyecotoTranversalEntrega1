/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entidades.Alumno;
import java.util.ArrayList;

/**
 *
 * @author PUESTO-A1
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public frmPrincipal() {
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

        dpPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumnos = new javax.swing.JMenu();
        jmAlumno = new javax.swing.JMenuItem();
        jMMaterias = new javax.swing.JMenu();
        jMInscripciones = new javax.swing.JMenu();
        jMCargarNotas = new javax.swing.JMenu();
        jMConsultas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        dpPrincipal.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpPrincipalLayout = new javax.swing.GroupLayout(dpPrincipal);
        dpPrincipal.setLayout(dpPrincipalLayout);
        dpPrincipalLayout.setHorizontalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        dpPrincipalLayout.setVerticalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jMAlumnos.setText("Alumnos");
        jMAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumnosActionPerformed(evt);
            }
        });

        jmAlumno.setText("Alumno");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });
        jMAlumnos.add(jmAlumno);

        jMenuBar1.add(jMAlumnos);

        jMMaterias.setText("Materias");
        jMenuBar1.add(jMMaterias);

        jMInscripciones.setText("Inscripciones");
        jMenuBar1.add(jMInscripciones);

        jMCargarNotas.setText("Carga de Notas");
        jMenuBar1.add(jMCargarNotas);

        jMConsultas.setText("Consultas");
        jMenuBar1.add(jMConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMAlumnosActionPerformed

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed
        dpPrincipal.removeAll();
        dpPrincipal.repaint();
        friAlumnos ventana= new friAlumnos();
       dpPrincipal.add(ventana);
       ventana.setVisible(true);
    }//GEN-LAST:event_jmAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        friAlumnos vent= new friAlumnos();
        vent.setVisible(true);
        frmPrincipal vent1= new frmPrincipal();
        vent1.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JMenu jMAlumnos;
    private javax.swing.JMenu jMCargarNotas;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenu jMInscripciones;
    private javax.swing.JMenu jMMaterias;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAlumno;
    // End of variables declaration//GEN-END:variables
}
