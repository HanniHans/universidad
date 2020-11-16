/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hanni
 */
public class Conjuntos extends javax.swing.JDialog {

    /**
     * Creates new form Conjuntos
     */
    public Conjuntos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("Conjutos");
        mostrarDatos("");
    }

    void mostrarDatos(String valor) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ingles");
        modelo.addColumn("Japones");
        modelo.addColumn("Frances");
        AddTable.setModel(modelo);
        String sql = "";
        if (valor.equals("")) {
            sql = "SELECT*FROM datos";
        } else {
            if (valor.equals("Universo")) {
                sql = "SELECT*FROM datos";
            } else {
                if (valor.equals("Inglés")) {
                    sql = "SELECT*FROM datos WHERE Ingles='" + "Si" + "'";
                } else {
                    if (valor.equals("Japonés")) {
                        sql = "SELECT*FROM datos WHERE Japones='" + "Si" + "'";
                    } else {
                        if (valor.equals("Frances")) {
                            sql = "SELECT*FROM datos WHERE Frances='" + "Si" + "'";
                        } else {
                            if (valor.equals("Conjunto Vacio")) {
                                sql = "SELECT*FROM datos WHERE Frances='" + "No" + "' AND Japones='" + "No" + "' AND Ingles='" + "No" + "'";
                            } else {
                                if (valor.equals("Inglés y Japonés")) {
                                    sql = "SELECT*FROM datos WHERE Ingles='" + "Si" + "' AND Japones='" + "Si" + "'";
                                } else {
                                    if (valor.equals("Inglés y Frances")) {
                                        sql = "SELECT*FROM datos WHERE Ingles='" + "Si" + "' AND Frances='" + "Si" + "'";
                                    } else {
                                        if (valor.equals("Frances y Japonés")) {
                                            sql = "SELECT*FROM datos WHERE Frances='" + "Si" + "' AND Japones='" + "Si" + "'";
                                        } else {
                                            if (valor.equals("Universo e Inglés")) {
                                                sql = "SELECT*FROM datos WHERE Ingles='" + "Si" + "' ";
                                            } else {
                                                if (valor.equals("Universo y Japonés")) {
                                                    sql = "SELECT*FROM datos WHERE Japones='" + "Si" + "'";
                                                } else {
                                                    if (valor.equals("Universo y Frances")) {
                                                        sql = "SELECT*FROM datos WHERE Frances='" + "Si" + "'";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }

        if (valor.equals("C. Inglés")) {
            sql = "SELECT*FROM datos WHERE Ingles='" + "No" + "' ";
        } else {
            if (valor.equals("C. Japonés")) {
                sql = "SELECT*FROM datos WHERE Japones='" + "No" + "' ";
            } else {
                if (valor.equals("C. Frances")) {
                    sql = "SELECT*FROM datos WHERE Frances='" + "No" + "' ";
                }
            }
        }
       /* Inglés-Frances
Frances-Inglés
Inglés-Japonés
Japonés-Inglés
Frances-Japonés
Japonés-Frances*/
       if(valor.equals(null)){
           JOptionPane.showMessageDialog(null, "Vacio");
       }
        if(valor.equals("Inglés-Frances")){
            sql = "SELECT*FROM datos WHERE Ingles='" + "Si" + "' AND Frances='" + "No" + "'";
        }else{
            if(valor.equals("Frances-Inglés")){
                sql = "SELECT*FROM datos WHERE Frances='" + "Si" + "' AND Ingles='" + "No" + "'";
            }else{
                if(valor.equals("Inglés-Japonés")){
                    sql = "SELECT*FROM datos WHERE Ingles='" + "Si" + "' AND Japones='" + "No" + "'";
                }else{
                    if(valor.equals("Japonés-Inglés")){
                        sql= "SELECT*FROM datos WHERE Japones='" + "Si" + "' AND Ingles='" + "No" + "'";
                    }else{
                        if(valor.equals("Frances-Japonés")){
                            sql = "SELECT*FROM datos WHERE Frances='" + "Si" + "' AND Japones='" + "No" + "'";
                        }else{
                            if(valor.equals("Japonés-Frances")){
                                sql = "SELECT*FROM datos WHETE Japones='" + "Si" + "' AND Frances='" + "No" + "'";
                            }
                        }
                    }
                }
            }
        }

        String[] datos = new String[5];

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                modelo.addRow(datos);
            }
            AddTable.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(AgregarAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxConjuntos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddTable = new javax.swing.JTable();
        jComboBoxUnion1 = new javax.swing.JComboBox<>();
        jComboBoxUnion2 = new javax.swing.JComboBox<>();
        jButtonConjuntos = new javax.swing.JButton();
        jButtonUnion = new javax.swing.JButton();
        jComboBoxInter = new javax.swing.JComboBox<>();
        jButtonInter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBoxCompl = new javax.swing.JComboBox<>();
        jButtonCompl = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxDife = new javax.swing.JComboBox<>();
        jButtonDif = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Conjutos");

        jLabel2.setText("Unión");

        jLabel3.setText("Intersección");

        jComboBoxConjuntos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Universo", "Inglés", "Japonés", "Frances", "Conjunto Vacio" }));
        jComboBoxConjuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConjuntosActionPerformed(evt);
            }
        });

        AddTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(AddTable);

        jComboBoxUnion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Universo", "Inglés", "Japonés", "Frances", "Conjunto Vacio" }));

        jComboBoxUnion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Universo", "Inglés", "Japonés", "Frances", "Conjunto Vacio" }));

        jButtonConjuntos.setText("Aceptar");
        jButtonConjuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConjuntosActionPerformed(evt);
            }
        });

        jButtonUnion.setText("Aceptar");
        jButtonUnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUnionActionPerformed(evt);
            }
        });

        jComboBoxInter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inglés y Japonés", "Inglés y Frances", "Frances y Japonés", "Universo e Inglés", "Universo y Japonés", "Universo y Frances" }));

        jButtonInter.setText("Aceptar");
        jButtonInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInterActionPerformed(evt);
            }
        });

        jLabel4.setText("Complemento");

        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxCompl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C. Inglés", "C. Japonés", "C. Frances" }));

        jButtonCompl.setText("Aceptar");
        jButtonCompl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComplActionPerformed(evt);
            }
        });

        jLabel5.setText("Diferencia");

        jComboBoxDife.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Inglés-Frances", "Frances-Inglés", "Inglés-Japonés", "Japonés-Inglés", "Frances-Japonés", "Japonés-Frances" }));

        jButtonDif.setText("Aceptar");
        jButtonDif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxInter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxConjuntos, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jComboBoxUnion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBoxUnion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxCompl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDife, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonUnion)
                            .addComponent(jButtonConjuntos)
                            .addComponent(jButtonInter)
                            .addComponent(jButtonCompl)
                            .addComponent(jButtonDif))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxConjuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConjuntos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxUnion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxUnion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonUnion)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxInter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonInter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxCompl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCompl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBoxDife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDif)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAtras)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConjuntosActionPerformed
        mostrarDatos(jComboBoxConjuntos.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonConjuntosActionPerformed

    private void jComboBoxConjuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConjuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxConjuntosActionPerformed

    private void jButtonUnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUnionActionPerformed
        mostrarDatos(jComboBoxUnion1.getSelectedItem().toString());
        mostrarDatos(jComboBoxUnion2.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonUnionActionPerformed

    private void jButtonInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInterActionPerformed
        // TODO add your handling code here:
        mostrarDatos(jComboBoxInter.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonInterActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonComplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComplActionPerformed
        // TODO add your handling code here:
        mostrarDatos(jComboBoxCompl.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonComplActionPerformed

    private void jButtonDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDifActionPerformed
        // TODO add your handling code here:
        mostrarDatos(jComboBoxDife.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonDifActionPerformed

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
            java.util.logging.Logger.getLogger(Conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conjuntos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Conjuntos dialog = new Conjuntos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AddTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCompl;
    private javax.swing.JButton jButtonConjuntos;
    private javax.swing.JButton jButtonDif;
    private javax.swing.JButton jButtonInter;
    private javax.swing.JButton jButtonUnion;
    private javax.swing.JComboBox<String> jComboBoxCompl;
    private javax.swing.JComboBox<String> jComboBoxConjuntos;
    private javax.swing.JComboBox<String> jComboBoxDife;
    private javax.swing.JComboBox<String> jComboBoxInter;
    private javax.swing.JComboBox<String> jComboBoxUnion1;
    private javax.swing.JComboBox<String> jComboBoxUnion2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
Conectar cc = new Conectar();
    Connection cn = cc.conexion();

}
