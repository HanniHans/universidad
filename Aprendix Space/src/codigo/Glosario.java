/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author hanni
 */
public class Glosario extends javax.swing.JDialog {
    public Clip clip;
    public String ruta="/sonido/";
    
    
    public Glosario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(this);
        this.setTitle("Glosario");
        
        jTextAreaDefincion.setLineWrap(true); //salto de linea
        jTextAreaDefincion.setWrapStyleWord(true); //no divide las letras
        
        AutoCompleteDecorator.decorate(jComboBoxGlosario); //Autocompletado del combo
    }
     public void sonido(String archivo) {
        try {
            clip= AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta+archivo+".wav")));
            clip.start();
        } catch (Exception ex) {
            
        }
    }
    
            
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jComboBoxGlosario = new javax.swing.JComboBox<>();
        jTextAreaDefincion = new javax.swing.JTextArea();
        jButtonAtras = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAceptarMouseEntered(evt);
            }
        });
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jComboBoxGlosario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnívoro", "Herbívoro", "Omnívoro", "Ovíparo", "Ovovivíparo", "Vivíparo" }));

        jTextAreaDefincion.setEditable(false);
        jTextAreaDefincion.setColumns(20);
        jTextAreaDefincion.setRows(5);

        jButtonAtras.setText("Atrás");
        jButtonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAtrasMouseEntered(evt);
            }
        });
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir del programa");
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseEntered(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jButtonAceptar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAreaDefincion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxGlosario, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jComboBoxGlosario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonAceptar)
                .addGap(18, 18, 18)
                .addComponent(jTextAreaDefincion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras)
                    .addComponent(jButtonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        sonido("boton_1");
        String Glosario=jComboBoxGlosario.getSelectedItem().toString();
        if(Glosario.equals("Carnívoro")){
            jTextAreaDefincion.setText("Son animales que se alimentan de carne.");
        }else if(Glosario.equals("Herbívoro")){
            jTextAreaDefincion.setText(" Son animales que se alimentan de plantas, pastos, hierbas y vegetales.");
        }else if(Glosario.equals("Omnívoro")){
            jTextAreaDefincion.setText("Son animales que se alimentan de carne y vegetales.");
        }else if(Glosario.equals("Ovíparo")){
            jTextAreaDefincion.setText("Son animales que nacen de un huevo.");
        }else if(Glosario.equals("Ovovivíparo")){
            jTextAreaDefincion.setText("Son animales cuyos embriones se "
                    + "desarrollan totalmente en el huevo que está en el "
                    + "interior del cuerpo de la madre y que salen del huevo de manera casi "
                    + "inmediata a la puesta de los huevos");
            
        }else if(Glosario.equals("Vivíparo")){
            jTextAreaDefincion.setText("Son animales que nacen del vientre de su madre.");
        }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseEntered
        // TODO add your handling code here:
        sonido("Bur");
    }//GEN-LAST:event_jButtonAceptarMouseEntered

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        sonido("boton_1");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        sonido("boton_1");
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtrasMouseEntered
        // TODO add your handling code here:
        sonido("Bur");
    }//GEN-LAST:event_jButtonAtrasMouseEntered

    private void jButtonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseEntered
        // TODO add your handling code here:
        sonido("Bur");
    }//GEN-LAST:event_jButtonSalirMouseEntered

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
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Glosario dialog = new Glosario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxGlosario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextAreaDefincion;
    // End of variables declaration//GEN-END:variables
}
