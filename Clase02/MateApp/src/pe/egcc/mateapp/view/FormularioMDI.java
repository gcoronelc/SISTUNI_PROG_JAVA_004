/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.mateapp.view;

import javax.swing.JInternalFrame;

/**
 *
 * @author Gustavo Coronel
 */
public class FormularioMDI extends javax.swing.JFrame {

  /**
   * Creates new form FormularioMDI
   */
  public FormularioMDI() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    desktopPane = new javax.swing.JDesktopPane();
    menuBar = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuArchivoSalir = new javax.swing.JMenuItem();
    menuOpciones = new javax.swing.JMenu();
    menuOpcionesFactorial = new javax.swing.JMenuItem();
    menuOpcionesMcdMcm = new javax.swing.JMenuItem();
    menuOpcionesFibonacci = new javax.swing.JMenuItem();
    menuOpcionesPrimo = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("MATEMATICA");

    menuArchivo.setText("Archivo");

    menuArchivoSalir.setText("Salir");
    menuArchivoSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuArchivoSalirActionPerformed(evt);
      }
    });
    menuArchivo.add(menuArchivoSalir);

    menuBar.add(menuArchivo);

    menuOpciones.setText("Opciones");

    menuOpcionesFactorial.setText("Factorial");
    menuOpcionesFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesFactorialActionPerformed(evt);
      }
    });
    menuOpciones.add(menuOpcionesFactorial);

    menuOpcionesMcdMcm.setText("MCD y MCM");
    menuOpcionesMcdMcm.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesMcdMcmActionPerformed(evt);
      }
    });
    menuOpciones.add(menuOpcionesMcdMcm);

    menuOpcionesFibonacci.setText("Fibonacci");
    menuOpcionesFibonacci.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesFibonacciActionPerformed(evt);
      }
    });
    menuOpciones.add(menuOpcionesFibonacci);

    menuOpcionesPrimo.setText("Primo");
    menuOpcionesPrimo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuOpcionesPrimoActionPerformed(evt);
      }
    });
    menuOpciones.add(menuOpcionesPrimo);

    menuBar.add(menuOpciones);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void menuArchivoSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoSalirActionPerformed
    System.exit(0);
  }//GEN-LAST:event_menuArchivoSalirActionPerformed

  private void menuOpcionesFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesFactorialActionPerformed
    mostrarFormulario(FactorialView.class);
  }//GEN-LAST:event_menuOpcionesFactorialActionPerformed

  private void menuOpcionesMcdMcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesMcdMcmActionPerformed
    mostrarFormulario(McdMcmView.class);
  }//GEN-LAST:event_menuOpcionesMcdMcmActionPerformed

  private void menuOpcionesFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesFibonacciActionPerformed
    mostrarFormulario(FibonacciView.class);
  }//GEN-LAST:event_menuOpcionesFibonacciActionPerformed

  private void menuOpcionesPrimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpcionesPrimoActionPerformed
    mostrarFormulario(PrimoView.class);
  }//GEN-LAST:event_menuOpcionesPrimoActionPerformed

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
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FormularioMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FormularioMDI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JDesktopPane desktopPane;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenuItem menuArchivoSalir;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenu menuOpciones;
  private javax.swing.JMenuItem menuOpcionesFactorial;
  private javax.swing.JMenuItem menuOpcionesFibonacci;
  private javax.swing.JMenuItem menuOpcionesMcdMcm;
  private javax.swing.JMenuItem menuOpcionesPrimo;
  // End of variables declaration//GEN-END:variables

  private void mostrarFormulario(Class<?> aClass) {
    try {
      JInternalFrame view = null;
      // Averiguar si existe instancia
      view = existeForm(aClass);
      // Se crea la instancia
      if(view == null){
        view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
        desktopPane.add(view);
        view.setVisible(true);
      }
      // Se activa
      view.setSelected(true);
    } catch (Exception e) {
    }
  }

  private JInternalFrame existeForm(Class<?> aClass) {
    JInternalFrame view = null;
    for(JInternalFrame bean: desktopPane.getAllFrames()){
      if(aClass.isInstance(bean)){
        view = bean;
        break;
      }
    }
    return view;
  }

}
