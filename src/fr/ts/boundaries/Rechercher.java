package fr.ts.boundaries;

import fr.ts.entities.GlobalesConnection;
import fr.ts.entities.GlobalesFonctions;
import java.sql.*;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Joke-
 */
public class Rechercher extends javax.swing.JInternalFrame {

    public Connection cn;
    private DatabaseMetaData ldbmd;

    /**
     * Creates new form Rechercher
     */
    public Rechercher() {
        initComponents();
        setTitle("Rechercher");

        try {
            cn = GlobalesConnection.getConnection();
            ldbmd = cn.getMetaData();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        GlobalesFonctions.fillListDateBase(cn, ldbmd, jListBaseDonnees);
        setVisible(true);
    }
    
    private String listSelect (List<String> values) {
        String out = "";
        
        for (int i = 0; i < values.size(); i++) {
            out += values.get(i);
            out += ",";            
        }
        
        out = out.substring(0, out.length() - 1);
        
        return out;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBaseDonnees = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTables = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListColonneWhere = new javax.swing.JList<>();
        jTextFieldValeur = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableResultat = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButtonRechercher = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListColonnes = new javax.swing.JList<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Rechercher");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Base de données");

        jListBaseDonnees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListBaseDonneesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListBaseDonnees);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tables");

        jListTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListTablesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jListTables);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Condition (WHERE) :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Colonne");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Valeur");

        jScrollPane3.setViewportView(jListColonneWhere);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldValeur)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel3)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jTextFieldValeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableResultat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableResultat);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Résultat");

        jButtonRechercher.setText("Rechercher");
        jButtonRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRechercherActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Colonnes");

        jScrollPane6.setViewportView(jListColonnes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jButtonRechercher)))
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRechercher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListBaseDonneesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListBaseDonneesMouseReleased
        GlobalesFonctions.fillListTable(cn, ldbmd, jListBaseDonnees, jListTables);
        DefaultListModel dlm = new DefaultListModel();
        jListColonnes.setModel(dlm);
        jListColonneWhere.setModel(dlm);
        jTextFieldValeur.setText("");
    }//GEN-LAST:event_jListBaseDonneesMouseReleased

    private void jListTablesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTablesMouseReleased
        GlobalesFonctions.fillListColonne(cn, ldbmd, jListBaseDonnees, jListTables, jListColonnes);
        GlobalesFonctions.fillListColonne(cn, ldbmd, jListBaseDonnees, jListTables, jListColonneWhere);
        jTextFieldValeur.setText("");
    }//GEN-LAST:event_jListTablesMouseReleased

    private void jButtonRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRechercherActionPerformed
        List<String> values = jListColonnes.getSelectedValuesList();
        
        String lsDataBase = jListBaseDonnees.getSelectedValue();
        String lsTable = jListTables.getSelectedValue();
        String lsColonneWhere = jListColonneWhere.getSelectedValue();        

        ResultSet rs;
        PreparedStatement pst;

        try (Statement stmt = cn.createStatement()) {
            if (jListColonnes.isSelectionEmpty()) {
                if (jListColonneWhere.isSelectionEmpty()) {
                    rs = stmt.executeQuery("SELECT * FROM " + lsDataBase + "." + lsTable);
                    jTableResultat.setModel(GlobalesFonctions.fillTableResult(rs));
                } else {
                    pst = cn.prepareStatement("SELECT * FROM " + lsDataBase + "." + lsTable + " WHERE " + lsColonneWhere + " = ?");
                    pst.setString(1, jTextFieldValeur.getText());
                    rs = pst.executeQuery();
                    jTableResultat.setModel(GlobalesFonctions.fillTableResult(rs));
                }

            } else {
                String lsColonne = listSelect(values);
                if (jListColonneWhere.isSelectionEmpty()) {
                    rs = stmt.executeQuery("SELECT " + lsColonne + " FROM " + lsDataBase + "." + lsTable);
                    jTableResultat.setModel(GlobalesFonctions.fillTableResult(rs));
                } else {
                    pst = cn.prepareStatement("SELECT " + lsColonne + " FROM " + lsDataBase + "." + lsTable + " WHERE " + lsColonneWhere + " = ?");
                    pst.setString(1, jTextFieldValeur.getText());
                    rs = pst.executeQuery();
                    jTableResultat.setModel(GlobalesFonctions.fillTableResult(rs));
                }
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonRechercherActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRechercher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListBaseDonnees;
    private javax.swing.JList<String> jListColonneWhere;
    private javax.swing.JList<String> jListColonnes;
    private javax.swing.JList<String> jListTables;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableResultat;
    private javax.swing.JTextField jTextFieldValeur;
    // End of variables declaration//GEN-END:variables
}
