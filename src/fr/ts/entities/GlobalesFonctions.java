/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ts.entities;

import fr.ts.boundaries.Rechercher;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joke-
 */
public class GlobalesFonctions {
    
    public static void fillListDateBase(Connection cn, DatabaseMetaData ldbmd, JList jListBaseDonnees) {

        ResultSet lrs;

        try {
            lrs = ldbmd.getCatalogs();
            DefaultListModel idlm = new DefaultListModel();
            while (lrs.next()) {
                if (!lrs.getString(1).equals("information_schema") && !lrs.getString(1).equals("mysql") && !lrs.getString(1).equals("performance_schema") && !lrs.getString(1).equals("phpmyadmin") && !lrs.getString(1).equals("test")) {
                    idlm.addElement(lrs.getString(1));
                }
            }
            jListBaseDonnees.setModel(idlm);
            lrs.close();
        } catch (SQLException ex) {
            //jLabelMessage.setText(ex.getMessage());
        }
    }
    // GlobalesFonctions.fillListDateBase(cn, ldbmd, jListBaseDonnees);
    
    public static void fillListTable(Connection cn, DatabaseMetaData ldbmd, JList jListBaseDonnees, JList jListTables) {

        ResultSet lrs;

        String tTypes[] = null;
        String dataBase = jListBaseDonnees.getSelectedValue().toString();

        DefaultListModel idlm = new DefaultListModel();

        try {
            lrs = ldbmd.getTables(dataBase, "", "", tTypes);
            while (lrs.next()) {
                idlm.addElement(lrs.getString(3));
            }
            jListTables.setModel(idlm);
            lrs.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    // GlobalesFonctions.fillListTable(cn, ldbmd, jListBaseDonnees, jListTables);
    
    public static void fillListColonne(Connection cn, DatabaseMetaData ldbmd, JList jListBaseDonnees, JList jListTables, JList jListColonnes) {
        ResultSet lrs;

        String dataBase = jListBaseDonnees.getSelectedValue().toString();
        String table = jListTables.getSelectedValue().toString();

        DefaultListModel idlm = new DefaultListModel();

        try {
            lrs = ldbmd.getColumns(dataBase, "", table, "");
            while (lrs.next()) {
                idlm.addElement(lrs.getString(4));
            }
            jListColonnes.setModel(idlm);
            lrs.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    // GlobalesFonctions.fillListColonne(cn, ldbmd, jListBaseDonnees, jListTables, jListColonnes);
       
    public static DefaultTableModel fillTableResult(ResultSet rs) {
        DefaultTableModel out = null;
        ResultSetMetaData lrsmd;

        try {
            lrsmd = rs.getMetaData();

            String[] tEntetes;
            Object[][] tDataTable;
            Object[] tDataLigne;

            int nbColonne = lrsmd.getColumnCount();

            tEntetes = new String[nbColonne];
            for (int i = 0; i < nbColonne; i++) {
                tEntetes[i] = lrsmd.getColumnName(i + 1);
            }

            rs.last();
            int liLignes = rs.getRow();
            tDataTable = new Object[liLignes][nbColonne];

            rs.beforeFirst();
            int i = 0;
            while (rs.next()) {
                tDataLigne = new Object[nbColonne];
                for (int j = 0; j < nbColonne; j++) {
                    if (rs.getObject(j + 1) == null) {
                        tDataLigne[j] = "NULL";
                    } else {
                        tDataLigne[j] = rs.getObject(j + 1).toString();
                    }
                }
                tDataTable[i] = tDataLigne;
                i++;
            }

            out = new DefaultTableModel(tDataTable, tEntetes);

        } catch (SQLException ex) {
            Logger.getLogger(Rechercher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return out;
    }
    // GlobalesFonctions.fillTableResult(rs)
    
    public static boolean jframeExist(JInternalFrame[] jFrame, String jFrameName){
        boolean test = false;
        
        for (int i = 0; i < jFrame.length; i++) {
            String string = jFrame[i].getTitle();
            if (string.equals(jFrameName)) {
                test = true;
            }            
        }
        
        return test;
    }
}
