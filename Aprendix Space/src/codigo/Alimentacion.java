/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.AnimalesAlimentacion;

/**
 *
 * @author olga
 */
public class Alimentacion extends javax.swing.JDialog {
    public Clip clip;
    public String ruta="/sonido/";
    Icon correctMessage;
    Icon incorrectMessage;
    botonAnimal a = new botonAnimal(); //lista obtine el random
    AnimalesAlimentacion objeto = a.getAnimalAleatorio(); 

    /**
     * Creates new form Alimentacion
     */
    public Alimentacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal); //no borrar
        initComponents();
        setTitle("TEAM ICO");
        this.setLocationRelativeTo(this);
        this.setMinimumSize(new Dimension(600, 400));
        
        correctMessage = new ImageIcon(getClass().getResource("/recursos/correcto.png"));
        incorrectMessage = new ImageIcon(getClass().getResource("/recursos/incorrecto.png"));

        botonAnimal.setText(objeto.getNombre());
        botonAnimal.setIcon(objeto.getRuta());
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
        botonAnimal = new javax.swing.JButton();
        botonHerbivoros = new javax.swing.JButton();
        botonOmnivoros = new javax.swing.JButton();
        botonCarnivoros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        botonAnimal.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonAnimal.setBorder(null);
        botonAnimal.setBorderPainted(false);
        botonAnimal.setContentAreaFilled(false);
        botonAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAnimal.setIconTextGap(-3);
        botonAnimal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnimalActionPerformed(evt);
            }
        });

        botonHerbivoros.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonHerbivoros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/Hervivoros1.2.png"))); // NOI18N
        botonHerbivoros.setText("Herbívoro");
        botonHerbivoros.setBorder(null);
        botonHerbivoros.setBorderPainted(false);
        botonHerbivoros.setContentAreaFilled(false);
        botonHerbivoros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHerbivoros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonHerbivoros.setIconTextGap(-3);
        botonHerbivoros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/Hervivoros1.1.png"))); // NOI18N
        botonHerbivoros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/Hervivoros1.3.png"))); // NOI18N
        botonHerbivoros.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonHerbivoros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonHerbivoros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonHerbivorosMouseEntered(evt);
            }
        });
        botonHerbivoros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHerbivorosActionPerformed(evt);
            }
        });

        botonOmnivoros.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonOmnivoros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/onmivoros1.2.jpg"))); // NOI18N
        botonOmnivoros.setText("Omnívoro");
        botonOmnivoros.setBorder(null);
        botonOmnivoros.setBorderPainted(false);
        botonOmnivoros.setContentAreaFilled(false);
        botonOmnivoros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOmnivoros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOmnivoros.setIconTextGap(-3);
        botonOmnivoros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/onmivoros1.1.jpg"))); // NOI18N
        botonOmnivoros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/onmivoros1.3.jpg"))); // NOI18N
        botonOmnivoros.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonOmnivoros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOmnivoros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonOmnivorosMouseEntered(evt);
            }
        });
        botonOmnivoros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOmnivorosActionPerformed(evt);
            }
        });

        botonCarnivoros.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonCarnivoros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/Carnivoros1.2.png"))); // NOI18N
        botonCarnivoros.setText("Carnívoro");
        botonCarnivoros.setBorder(null);
        botonCarnivoros.setBorderPainted(false);
        botonCarnivoros.setContentAreaFilled(false);
        botonCarnivoros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCarnivoros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonCarnivoros.setIconTextGap(-3);
        botonCarnivoros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/Carnivoros1.1.png"))); // NOI18N
        botonCarnivoros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/Carnivoros1.3.png"))); // NOI18N
        botonCarnivoros.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonCarnivoros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonCarnivoros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCarnivorosMouseEntered(evt);
            }
        });
        botonCarnivoros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarnivorosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 3, 18)); // NOI18N
        jLabel1.setText("Selecciona la alimentación del animal que se muestra.");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonHerbivoros, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonOmnivoros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(botonCarnivoros, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonHerbivoros, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(botonOmnivoros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCarnivoros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(botonAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras)
                    .addComponent(jButtonSalir))
                .addContainerGap())
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

    private void botonAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAnimalActionPerformed

    private void botonHerbivorosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHerbivorosActionPerformed
        // TODO add your handling code here:
        botonHerbivoro herbivoros = new botonHerbivoro();

        if (herbivoros.getAlimentacion() == objeto.getAlimentacion()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "mensaje", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Alimentacion dialog = new Alimentacion(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
        }

    }//GEN-LAST:event_botonHerbivorosActionPerformed

    private void botonOmnivorosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOmnivorosActionPerformed
        // TODO add your handling code here:
        botonOmnivoro omnivoros = new botonOmnivoro();

        if (omnivoros.getAlimentacion() == objeto.getAlimentacion()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Alimentacion dialog = new Alimentacion(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
        }

    }//GEN-LAST:event_botonOmnivorosActionPerformed

    private void botonCarnivorosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarnivorosActionPerformed
        // TODO add your handling code here:
        botonCarnivoro carnivoros = new botonCarnivoro();

        if (carnivoros.getAlimentacion() == objeto.getAlimentacion()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Alimentacion dialog = new Alimentacion(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
        }

    }//GEN-LAST:event_botonCarnivorosActionPerformed

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

    private void botonHerbivorosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHerbivorosMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonHerbivorosMouseEntered

    private void botonOmnivorosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOmnivorosMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonOmnivorosMouseEntered

    private void botonCarnivorosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCarnivorosMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonCarnivorosMouseEntered

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
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alimentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Alimentacion dialog = new Alimentacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }

                    
});
                dialog.setVisible (true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnimal;
    private javax.swing.JButton botonCarnivoros;
    private javax.swing.JButton botonHerbivoros;
    private javax.swing.JButton botonOmnivoros;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private class botonAnimal {

        ArrayList<AnimalesAlimentacion> listaAnimales = new ArrayList<>();

        public botonAnimal() {
            //1=Herbivoro 2=Omnivoro 3=Carnivoro

            listaAnimales.add(new AnimalesAlimentacion(1, "Conejo", "/recursos/animales/Conejo-del-bosque1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(2, "Cerdo", "/recursos/animales/Cerdo1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(2, "Oso", "/recursos/animales/Oso1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(2, "Murcierlago", "/recursos/animales/Murcielago1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(2, "Correcaminos", "/recursos/animales/Correcaminos1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(1, "Camello", "/recursos/animales/Camello1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Zopilote", "/recursos/animales/Zopilote1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Jaguar", "/recursos/animales/Jaguar1.3.gif"));
            listaAnimales.add(new AnimalesAlimentacion(1, "Guacamaya", "/recrusos/animales/Guacamaya1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Anaconda", "/recursos/animales/Anaconda1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Escorpion", "/recursos/animales/Escorpion1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Lobo", "/recursos/animales/Lobo1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(2, "Raton", "/recursos/animales/Raton1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Tigre", "/recursos/animales/Tigre1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(2, "Zorrillo", "/recursos/animales/Zorrillo1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Oso polar", "/recursos/animales/Oso-polar1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Pulpo", "/recursos/animales/Pulpo1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(3, "Tiburon", "/recursos/animales/Tiburon1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(1, "Canguro", "/recursos/animales/Canguro1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(1, "Koala", "/recursos/animales/Koala1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(1, "Rinoceronte", "/recursos/animales/Rinoceronte1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(1, "Cebra", "/recursos/animales/Cebra1.3.png"));
            listaAnimales.add(new AnimalesAlimentacion(2, "Ornitorrinco", "/recursos/animales/Ornitorrinco1.3.png"));
        }

        public AnimalesAlimentacion getAnimalAleatorio() {
            Random ale = new Random();
            int animalEscogido = (int) (ale.nextDouble() * listaAnimales.size());

            return listaAnimales.get(animalEscogido);
        }

    }

    private class botonHerbivoro {

        private final int alimentacion; //unica forever

        public botonHerbivoro() {
            this.alimentacion = 1;
        }

        public int getAlimentacion() {
            return alimentacion;
        }

    }

    private class botonOmnivoro {

        private final int alimentacion;

        public botonOmnivoro() {
            this.alimentacion = 2;
        }

        public int getAlimentacion() {
            return alimentacion;
        }

    }

    private class botonCarnivoro {

        private final int alimentacion;

        public botonCarnivoro() {
            this.alimentacion = 3;
        }

        public int getAlimentacion() {
            return alimentacion;
        }

    }

}
