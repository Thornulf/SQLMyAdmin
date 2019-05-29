package fr.ts.boundaries;

import fr.ts.entities.GlobalesConnection;
import fr.ts.entities.GlobalesFonctions;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class MDI extends javax.swing.JFrame {

    public Connection cn;
    public Rechercher jifRechercher = new Rechercher();
    public Ajouter jifAjouter = new Ajouter();
    public Modifier jifModifier = new Modifier();
    public Supprimer jifSupprimer = new Supprimer();

    public MDI() {
        initComponents();
        setTitle("BackOffice 2019");

        cn = GlobalesConnection.getConnection();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItemRechercher = new javax.swing.JMenuItem();
        jMenuItemAjouter = new javax.swing.JMenuItem();
        jMenuItemModifier = new javax.swing.JMenuItem();
        jMenuItemSupprimer = new javax.swing.JMenuItem();
        jMenuItemDeconnecter = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCascade = new javax.swing.JMenuItem();
        jMenuItemHorizontale = new javax.swing.JMenuItem();
        jMenuItemVerticale = new javax.swing.JMenuItem();
        jMenuItemFermer = new javax.swing.JMenuItem();
        jMenuItemFermerTout = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        jMenuItemRechercher.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRechercher.setText("Rechercher");
        jMenuItemRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRechercherActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemRechercher);

        jMenuItemAjouter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAjouter.setText("Ajouter");
        jMenuItemAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAjouterActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemAjouter);

        jMenuItemModifier.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemModifier.setText("Modifier");
        jMenuItemModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModifierActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemModifier);

        jMenuItemSupprimer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSupprimer.setText("Supprimer");
        jMenuItemSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSupprimerActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemSupprimer);

        jMenuItemDeconnecter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemDeconnecter.setText("Se déconnecter");
        jMenuItemDeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeconnecterActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItemDeconnecter);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        jMenu1.setText("Fenêtre");

        jMenuItemCascade.setText("Cascade");
        jMenu1.add(jMenuItemCascade);

        jMenuItemHorizontale.setText("Horizontale");
        jMenuItemHorizontale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHorizontaleActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemHorizontale);

        jMenuItemVerticale.setText("Verticale");
        jMenuItemVerticale.setPreferredSize(new java.awt.Dimension(109, 22));
        jMenuItemVerticale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVerticaleActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemVerticale);

        jMenuItemFermer.setText("Fermer");
        jMenuItemFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFermerActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFermer);

        jMenuItemFermerTout.setText("Fermer tout");
        jMenuItemFermerTout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFermerToutActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFermerTout);

        menuBar.add(jMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void focusJInternalFrame(JInternalFrame[] tFrames, String name) {
        try {
            for (int i = 0; i < tFrames.length; i++) {
                JInternalFrame tFrame = tFrames[i];
                if (tFrame.getTitle().equals(name)) {
                    tFrame.setSelected(true);
                } else {
                    tFrame.setSelected(false);
                }
                tFrame.setVisible(true);
            }
        } catch (PropertyVetoException e) {
            System.out.println(e.getMessage());
        }
    }

    private void jMenuItemFermerToutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFermerToutActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();

        try {
            for (int i = 0; i < tFrames.length; ++i) {
                tFrames[i].setClosed(true);
            }
        } catch (PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuItemFermerToutActionPerformed

    private void jMenuItemFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFermerActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();
        try {
            if (tFrames.length > 0) {
                tFrames[0].setClosed(true);
            }
        } catch (PropertyVetoException e) {
        }
    }//GEN-LAST:event_jMenuItemFermerActionPerformed

    private void jMenuItemHorizontaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHorizontaleActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();

        try {
            int ly = 0;

            int liLargeurBureau = jdpBureau.getWidth();
            int liHauteurBureau = jdpBureau.getHeight();
            int liHauteur = liHauteurBureau / tFrames.length;

            for (int i = tFrames.length - 1; i >= 0; i--) {
                tFrames[i].setBounds(0, ly, liLargeurBureau, liHauteur);
                ly += liHauteur;
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItemHorizontaleActionPerformed

    private void jMenuItemVerticaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVerticaleActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();

        try {
            int ly = 0;

            int liLargeurBureau = jdpBureau.getWidth();
            int liHauteurBureau = jdpBureau.getHeight();
            int liLargeur = liLargeurBureau / tFrames.length;

            for (int i = tFrames.length - 1; i >= 0; i--) {
                tFrames[i].setBounds(ly, 0, liHauteurBureau, liLargeur);
                ly += liLargeur;
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jMenuItemVerticaleActionPerformed

    private void jMenuItemRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRechercherActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();
        
        for (int i = 0; i < tFrames.length; i++) {
            JInternalFrame tFrame = tFrames[i];
            System.out.println(tFrame.getTitle());
        }

        boolean test = GlobalesFonctions.jframeExist(tFrames, "Rechercher");
        System.out.println(test);

        if (test) {
            
        } else {
            this.desktopPane.add(jifRechercher);
        }
        focusJInternalFrame(tFrames, "Rechercher");
    }//GEN-LAST:event_jMenuItemRechercherActionPerformed

    private void jMenuItemAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjouterActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();

        boolean test = GlobalesFonctions.jframeExist(tFrames, "Ajouter");
        System.out.println(test);

        if (!test) {
            this.desktopPane.add(jifAjouter);
        }
        focusJInternalFrame(tFrames, "Ajouter");
    }//GEN-LAST:event_jMenuItemAjouterActionPerformed

    private void jMenuItemModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModifierActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();

        boolean test = GlobalesFonctions.jframeExist(tFrames, "Modifier");

        if (!test) {
            this.desktopPane.add(jifModifier);
        }
        focusJInternalFrame(tFrames, "Modifier");
    }//GEN-LAST:event_jMenuItemModifierActionPerformed

    private void jMenuItemSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSupprimerActionPerformed

        JDesktopPane jdpBureau = this.desktopPane;
        JInternalFrame[] tFrames = jdpBureau.getAllFrames();

        boolean test = GlobalesFonctions.jframeExist(tFrames, "Supprimer");

        if (!test) {
            this.desktopPane.add(jifSupprimer);
        }
        focusJInternalFrame(tFrames, "Supprimer");
    }//GEN-LAST:event_jMenuItemSupprimerActionPerformed

    private void jMenuItemDeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeconnecterActionPerformed
        try {
            if (cn != null) {
                cn.close();
                jMenuItemFermerActionPerformed(evt);
                dispose();
            } else {
                jMenuItemFermerActionPerformed(evt);
                dispose();
            }
            new ConnectDataBase();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jMenuItemDeconnecterActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        try {
            if (cn != null) {
                cn.close();
                System.exit(0);
            } else {
                System.exit(0);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItemAjouter;
    private javax.swing.JMenuItem jMenuItemCascade;
    private javax.swing.JMenuItem jMenuItemDeconnecter;
    private javax.swing.JMenuItem jMenuItemFermer;
    private javax.swing.JMenuItem jMenuItemFermerTout;
    private javax.swing.JMenuItem jMenuItemHorizontale;
    private javax.swing.JMenuItem jMenuItemModifier;
    private javax.swing.JMenuItem jMenuItemRechercher;
    private javax.swing.JMenuItem jMenuItemSupprimer;
    private javax.swing.JMenuItem jMenuItemVerticale;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pasteMenuItem;
    // End of variables declaration//GEN-END:variables
}
