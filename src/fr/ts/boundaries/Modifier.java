/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ts.boundaries;

import fr.ts.entities.GlobalesConnection;
import fr.ts.entities.GlobalesFonctions;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joke-
 */
public class Modifier extends javax.swing.JInternalFrame {

    public Connection cn;
    private DatabaseMetaData ldbmd;
    private String oldValue;
    private String oldId;

    public Modifier() {
        initComponents();
        setTitle("Modifier");

        try {
            cn = GlobalesConnection.getConnection();
            ldbmd = cn.getMetaData();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

        GlobalesFonctions.fillListDateBase(cn, ldbmd, jListBaseDonnees);

        jLabelMessage.setText("");
        jLabelMessageErreur.setText("");

        setVisible(true);
    }

    private String createStringUpdate(String dataBases, String table, List values) {

        String out;

        StringBuilder lsbUpdate = new StringBuilder();

        lsbUpdate.append("UPDATE ");
        lsbUpdate.append(dataBases);
        lsbUpdate.append(".");
        lsbUpdate.append(table);
        lsbUpdate.append(" SET ");

        for (int i = 1; i < jTable.getColumnCount(); i++) {

            lsbUpdate.append(jTable.getColumnName(i));
            lsbUpdate.append(" = '");
            lsbUpdate.append(values.get(i));
            lsbUpdate.append("', ");

        }

        out = lsbUpdate.substring(0, lsbUpdate.length() - 2);

        lsbUpdate = new StringBuilder();
        lsbUpdate.append(" WHERE ");
        lsbUpdate.append(jTable.getColumnName(0));
        lsbUpdate.append(" = '");
        lsbUpdate.append(values.get(0));
        lsbUpdate.append("', ");

        out += lsbUpdate.substring(0, lsbUpdate.length() - 2);

        return out;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBaseDonnees = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListTables = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonModifUnique = new javax.swing.JButton();
        jButtonModifPlusieurs = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelMessage = new javax.swing.JLabel();
        jLabelMessageErreur = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modifier");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Base de données");

        jListBaseDonnees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListBaseDonneesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jListBaseDonnees);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Table");

        jListTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jListTablesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jListTables);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable.setCellSelectionEnabled(true);
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTableMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        jButtonModifUnique.setText("Modifier unique");
        jButtonModifUnique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifUniqueActionPerformed(evt);
            }
        });

        jButtonModifPlusieurs.setText("Modifier tout");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Message :");

        jLabelMessage.setText("Message");

        jLabelMessageErreur.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMessageErreur.setText("Message erreur");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabelMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMessageErreur, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabelMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelMessageErreur, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jButtonModifUnique, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jButtonModifPlusieurs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 27, Short.MAX_VALUE)))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonModifUnique)
                            .addComponent(jButtonModifPlusieurs)))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListBaseDonneesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListBaseDonneesMouseReleased
        GlobalesFonctions.fillListTable(cn, ldbmd, jListBaseDonnees, jListTables);
    }//GEN-LAST:event_jListBaseDonneesMouseReleased

    private void jListTablesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTablesMouseReleased
        String lsDataBase = jListBaseDonnees.getSelectedValue();
        String lsTable = jListTables.getSelectedValue();

        ResultSet rs;

        try {
            Statement stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM " + lsDataBase + "." + lsTable);
            jTable.setModel(GlobalesFonctions.fillTableResult(rs));

        } catch (SQLException e) {
            jLabelMessageErreur.setText(e.getMessage());
        }
    }//GEN-LAST:event_jListTablesMouseReleased

    private void jButtonModifUniqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifUniqueActionPerformed
        String lsDataBase = jListBaseDonnees.getSelectedValue();
        String lsTable = jListTables.getSelectedValue();
        String newId = jTable.getValueAt(jTable.getSelectedRow(), 1).toString();
        
        List<String> listValues = new ArrayList();

        for (int i = 0; i < jTable.getColumnCount(); i++) {
            listValues.add(jTable.getValueAt(jTable.getSelectedRow(), i).toString());
        }
        
        String sqlUpdate = createStringUpdate(lsDataBase, lsTable, listValues);
        
        if (oldId.equals(newId)) {            
            
            try (PreparedStatement lpst = cn.prepareStatement(sqlUpdate)) {
                int affect = lpst.executeUpdate();
                jLabelMessage.setText("Mise à jour effectuée");
            } catch (Exception e) {
                jLabelMessageErreur.setText(e.getMessage());
            }
            
        } else {
            jLabelMessageErreur.setText("La clé primaire ne correspond pas à l'ancienne clé primaire");
        }
    }//GEN-LAST:event_jButtonModifUniqueActionPerformed

    private void jTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseReleased
        oldValue = jTable.getValueAt(jTable.getSelectedRow(), jTable.getSelectedColumn()).toString();
        oldId = jTable.getValueAt(jTable.getSelectedRow(), 1).toString();
    }//GEN-LAST:event_jTableMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModifPlusieurs;
    private javax.swing.JButton jButtonModifUnique;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JLabel jLabelMessageErreur;
    private javax.swing.JList<String> jListBaseDonnees;
    private javax.swing.JList<String> jListTables;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
