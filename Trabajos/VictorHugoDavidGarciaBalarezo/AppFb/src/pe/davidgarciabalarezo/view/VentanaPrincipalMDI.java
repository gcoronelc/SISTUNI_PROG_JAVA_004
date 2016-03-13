/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.davidgarciabalarezo.view;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;
import pe.davidgarciabalarezo.appfb.acceder.InfoFacebook;

/**
 *
 * @author Computer Owner
 */
public class VentanaPrincipalMDI extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipalMDI
     */
    public VentanaPrincipalMDI() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        String atoken = AccesoView.txtAccessToken.getText();
        FacebookClient facebookClient = new DefaultFacebookClient(atoken);
        User users = facebookClient.fetchObject("me", User.class);   
        
        jmUsuario.setText( users.getName());
        this.setTitle("App GB - Cuenta Facebook"+"[ "+users.getName() + "]");
        System.out.println(users.getName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jmUsuario = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        jmMuro = new javax.swing.JMenu();
        jmPost = new javax.swing.JMenuItem();
        jmMiPerfil = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmUsuario.setMnemonic('f');
        jmUsuario.setText("Usuario");
        jmUsuario.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jmUsuarioComponentAdded(evt);
            }
        });

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jmUsuario.add(exitMenuItem);

        menuBar.add(jmUsuario);

        jmMuro.setText("Muro");
        jmMuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMuroActionPerformed(evt);
            }
        });

        jmPost.setText("Posts");
        jmPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPostActionPerformed(evt);
            }
        });
        jmMuro.add(jmPost);

        jmMiPerfil.setText("Mi Perfil");
        jmMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMiPerfilActionPerformed(evt);
            }
        });
        jmMuro.add(jmMiPerfil);

        menuBar.add(jmMuro);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        jMenu1.setText("Usuario");
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 2000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jmUsuarioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jmUsuarioComponentAdded
        // Agregando nombre de usuario segun facebook
   
    }//GEN-LAST:event_jmUsuarioComponentAdded

    private void jmMuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMuroActionPerformed
 //
    }//GEN-LAST:event_jmMuroActionPerformed

    private void jmPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPostActionPerformed
  
        //Abrir ventana
        ReporteView rv = new ReporteView(); 
        desktopPane.add(rv);
        rv.show();
    }//GEN-LAST:event_jmPostActionPerformed

    private void jmMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMiPerfilActionPerformed
        //Abrir ventana
        MiPerfilView rv = new MiPerfilView(); 
        desktopPane.add(rv);
        rv.show();
    }//GEN-LAST:event_jmMiPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jmMiPerfil;
    private javax.swing.JMenu jmMuro;
    private javax.swing.JMenuItem jmPost;
    private javax.swing.JMenu jmUsuario;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
