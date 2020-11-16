/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.AnimalesEcosistemas;

/**
 *
 * @author olga
 */
public class Ecosistemas extends javax.swing.JDialog {

    public Clip clip;
    public String ruta = "/sonido/";
    Icon correctMessage;
    Icon incorrectMessage;
    botonAnimal a = new botonAnimal();
    AnimalesEcosistemas objeto = a.getAnimalAleatorio();

    /**
     * Creates new form EcosistemasVentana
     */
    public Ecosistemas(java.awt.Frame parent, boolean modal) {
        super(parent, modal); //no borrar :'v
        initComponents();
        this.setTitle("Ecosistemas");
        this.setLocationRelativeTo(null);
        correctMessage = new ImageIcon(getClass().getResource("/recursos/correcto.png")); //icono
        incorrectMessage = new ImageIcon(getClass().getResource("/recursos/incorrecto.png")); //icono

        //    botonAnimal a = new botonAnimal();
        //    Animales objeto = a.getAnimalAleatorio();
        botonAnimal.setText(objeto.getNombre()); //debe poner el nombre del animal
        botonAnimal.setIcon(objeto.getImagen()); //cambia la imagen 
    }

    public void sonido(String archivo) {
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonBosque = new javax.swing.JButton();
        botonDesierto = new javax.swing.JButton();
        botonSelva = new javax.swing.JButton();
        botonAnimal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        botonBosque.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonBosque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/bosque1.2.jpg"))); // NOI18N
        botonBosque.setText("Bosque");
        botonBosque.setBorder(null);
        botonBosque.setBorderPainted(false);
        botonBosque.setContentAreaFilled(false);
        botonBosque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBosque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonBosque.setIconTextGap(-3);
        botonBosque.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/bosque1.1.jpg"))); // NOI18N
        botonBosque.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/bosque1.3.jpg"))); // NOI18N
        botonBosque.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonBosque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonBosque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonBosqueMouseEntered(evt);
            }
        });
        botonBosque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBosqueActionPerformed(evt);
            }
        });

        botonDesierto.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonDesierto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/desierto1.2.jpg"))); // NOI18N
        botonDesierto.setText("Desierto");
        botonDesierto.setBorder(null);
        botonDesierto.setBorderPainted(false);
        botonDesierto.setContentAreaFilled(false);
        botonDesierto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonDesierto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDesierto.setIconTextGap(-3);
        botonDesierto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/desierto1.1.jpg"))); // NOI18N
        botonDesierto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/desierto1.3.jpg"))); // NOI18N
        botonDesierto.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonDesierto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonDesierto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonDesiertoMouseEntered(evt);
            }
        });
        botonDesierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesiertoActionPerformed(evt);
            }
        });

        botonSelva.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonSelva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/selva1.2.jpg"))); // NOI18N
        botonSelva.setText("Selva");
        botonSelva.setBorder(null);
        botonSelva.setBorderPainted(false);
        botonSelva.setContentAreaFilled(false);
        botonSelva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSelva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSelva.setIconTextGap(-3);
        botonSelva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/selva1.1.jpg"))); // NOI18N
        botonSelva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/selva1.3.jpg"))); // NOI18N
        botonSelva.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonSelva.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonSelva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSelvaMouseEntered(evt);
            }
        });
        botonSelva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSelvaActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Constantia", 3, 18)); // NOI18N
        jLabel1.setText("Selecciona el habitad del animal siguiente que se encuentra hasta abajo.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/aveVolando.gif"))); // NOI18N

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
                        .addComponent(jButtonAtras))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(botonBosque, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonDesierto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSelva, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSelva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDesierto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBosque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAtras, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
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

    private void botonBosqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBosqueActionPerformed
        // BOSQUE
        botonBosque bosque = new botonBosque();

        if (bosque.getHabitad() == objeto.getHabitad()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Ecosistemas dialog = new Ecosistemas(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
        }
    }//GEN-LAST:event_botonBosqueActionPerformed

    private void botonDesiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesiertoActionPerformed
        // DESIERTO
        botonDesierto desierto = new botonDesierto();
        if (desierto.getHabitad() == objeto.getHabitad()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Ecosistemas dialog = new Ecosistemas(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
        }
    }//GEN-LAST:event_botonDesiertoActionPerformed

    private void botonSelvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSelvaActionPerformed
        // SELVA
        botonSelva selva = new botonSelva();
        if (selva.getHabitad() == objeto.getHabitad()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Ecosistemas dialog = new Ecosistemas(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
        }
    }//GEN-LAST:event_botonSelvaActionPerformed

    private void botonAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnimalActionPerformed
        //NO HACE NADA
    }//GEN-LAST:event_botonAnimalActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        sonido("boton_1");
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
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

    private void botonBosqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBosqueMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonBosqueMouseEntered

    private void botonDesiertoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDesiertoMouseEntered
    sonido("Burbuja"); 
    }//GEN-LAST:event_botonDesiertoMouseEntered

    private void botonSelvaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSelvaMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonSelvaMouseEntered

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
            java.util.logging.Logger.getLogger(Ecosistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ecosistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ecosistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ecosistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ecosistemas dialog = new Ecosistemas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }

                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnimal;
    private javax.swing.JButton botonBosque;
    private javax.swing.JButton botonDesierto;
    private javax.swing.JButton botonSelva;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private class botonAnimal {

        ArrayList<AnimalesEcosistemas> listaAnimales = new ArrayList<>();

        public botonAnimal() {

            listaAnimales.add(new AnimalesEcosistemas(1, "Conejo", "/recursos/animales/Conejo-del-bosque1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(1, "Oso", "/recursos/animales/Oso1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(1, "Murcielago", "/recursos/animales/Murcielago1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(1, "Cerdo", "/recursos/animales/Cerdo1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(1, "Lobo", "/recursos/animales/Lobo1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(1, "Tigre", "/recursos/animales/Tigre1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(1, "Zorrillo", "/recursos/animales/Zorrillo1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(2, "Correcaminos", "/recursos/animales/Correcaminos1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(2, "Camello", "/recursos/animales/Camello1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(2, "Zopilote", "/recursos/animales/Zopilote1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(2, "Escorpion", "/recursos/animales/Escorpion1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(3, "Jaguar", "/recursos/animales/Jaguar1.3.gif"));
            listaAnimales.add(new AnimalesEcosistemas(3, "Guacamaya", "/recrusos/animales/Guacamaya1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(3, "Anaconda", "/recursos/animales/Anaconda1.3.png"));
            listaAnimales.add(new AnimalesEcosistemas(3, "Koala", "/recursos/animales/Koala1.3.png"));

        }

        public AnimalesEcosistemas getAnimalAleatorio() {
            Random ale = new Random();
            int animalEscogido = (int) (ale.nextDouble() * listaAnimales.size());

            System.out.println(animalEscogido);

            return listaAnimales.get(animalEscogido);

        }
    }

    private class botonBosque {

        private final int habitad;

        public botonBosque() {
            this.habitad = 1;
        }

        public int getHabitad() {
            return habitad;
        }
    }

    private class botonDesierto {

        private final int habitad;

        public botonDesierto() {
            this.habitad = 2;
        }

        private int getHabitad() {
            return habitad;
        }
    }

    private class botonSelva {

        private final int habitad;

        public botonSelva() {
            this.habitad = 3;
        }

        public int getHabitad() {
            return habitad;
        }

    }

}
