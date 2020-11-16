//Hannia estuvo aquí :3
package codigo;

import codigo.Alimentacion;
import java.awt.Dimension;
import static java.awt.image.ImageObserver.SOMEBITS;
import java.util.ArrayList;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.AnimalesCrias;

/**
 *
 * @author olga
 */
public class Babys extends javax.swing.JDialog {

    botonAnimal a = new botonAnimal();
    AnimalesCrias objeto = a.getAnimalAleatorio();
    
    public Clip clip;
    public String ruta = "/sonido/"; //ruta del sonido :)
    
    Icon correctMessage; //icono de JOPtionPane
    Icon incorrectMessage;//icono de JOptionPane

    public Babys(java.awt.Frame parent, boolean modal) {
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
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (Exception ex) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonAnimal = new javax.swing.JButton();
        botonViviparo = new javax.swing.JButton();
        botonOviparo = new javax.swing.JButton();
        botonOvoviviparo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        botonAnimal.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonAnimal.setBorder(null);
        botonAnimal.setBorderPainted(false);
        botonAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonAnimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAnimal.setIconTextGap(-3);
        botonAnimal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonAnimal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnimalActionPerformed(evt);
            }
        });

        botonViviparo.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonViviparo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/viviparos1.2.png"))); // NOI18N
        botonViviparo.setText("Vivíparo");
        botonViviparo.setBorder(null);
        botonViviparo.setBorderPainted(false);
        botonViviparo.setContentAreaFilled(false);
        botonViviparo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonViviparo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonViviparo.setIconTextGap(-3);
        botonViviparo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/viviparos1.1.png"))); // NOI18N
        botonViviparo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/viviparos1.3.png"))); // NOI18N
        botonViviparo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonViviparo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonViviparo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonViviparoMouseEntered(evt);
            }
        });
        botonViviparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonViviparoActionPerformed(evt);
            }
        });

        botonOviparo.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonOviparo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/oviparos1.2.png"))); // NOI18N
        botonOviparo.setText("Ovíparo");
        botonOviparo.setBorder(null);
        botonOviparo.setBorderPainted(false);
        botonOviparo.setContentAreaFilled(false);
        botonOviparo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOviparo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOviparo.setIconTextGap(-3);
        botonOviparo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/oviparos1.1.png"))); // NOI18N
        botonOviparo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/oviparos1.3.png"))); // NOI18N
        botonOviparo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonOviparo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOviparo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonOviparoMouseEntered(evt);
            }
        });
        botonOviparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOviparoActionPerformed(evt);
            }
        });

        botonOvoviviparo.setFont(new java.awt.Font("Constantia", 3, 12)); // NOI18N
        botonOvoviviparo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/ovoviviparo1.2.jpg"))); // NOI18N
        botonOvoviviparo.setText("Ovovivíparo");
        botonOvoviviparo.setBorder(null);
        botonOvoviviparo.setBorderPainted(false);
        botonOvoviviparo.setContentAreaFilled(false);
        botonOvoviviparo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonOvoviviparo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOvoviviparo.setIconTextGap(-3);
        botonOvoviviparo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/ovoviviparo1.1.jpg"))); // NOI18N
        botonOvoviviparo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/botones/ovoviviparo1.3.jpg"))); // NOI18N
        botonOvoviviparo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonOvoviviparo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonOvoviviparo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonOvoviviparoMouseEntered(evt);
            }
        });
        botonOvoviviparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOvoviviparoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 3, 18)); // NOI18N
        jLabel1.setText("Selecciona la forma en que nacen las crías del animal que se muestra.");

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
                        .addGap(28, 28, 28)
                        .addComponent(botonViviparo)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonOviparo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonOvoviviparo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(botonAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonOviparo, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(botonOvoviviparo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botonViviparo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras)
                    .addComponent(jButtonSalir))
                .addGap(5, 5, 5))
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

    private void botonOviparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOviparoActionPerformed
        // TODO add your handling code here:
        botonOviparo oviparo = new botonOviparo();
        if (oviparo.getComoNace() == objeto.getComoNace()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Babys dialog = new Babys(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
            
        }
    }//GEN-LAST:event_botonOviparoActionPerformed

    private void botonViviparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonViviparoActionPerformed
        // TODO add your handling code here:
        botonViviparo viviparo = new botonViviparo();
        if (viviparo.getComoNace() == objeto.getComoNace()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Babys dialog = new Babys(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
        }

    }//GEN-LAST:event_botonViviparoActionPerformed

    private void botonOvoviviparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOvoviviparoActionPerformed
        // TODO add your handling code here:
        botonOvoviviparo ovoviviparo = new botonOvoviviparo();

        if (ovoviviparo.getComoNace() == objeto.getComoNace()) {
            sonido("Ganar");
            JOptionPane.showMessageDialog(rootPane, "Muy bien", "=)", JOptionPane.INFORMATION_MESSAGE, correctMessage);
            this.setVisible(false);
            Babys dialog = new Babys(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        } else {
            sonido("Perder");
            JOptionPane.showMessageDialog(rootPane, "Incorrecto", "=(", JOptionPane.INFORMATION_MESSAGE, incorrectMessage);
            
        }

    }//GEN-LAST:event_botonOvoviviparoActionPerformed

    private void botonAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAnimalActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
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

    private void botonViviparoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonViviparoMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonViviparoMouseEntered

    private void botonOviparoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOviparoMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonOviparoMouseEntered

    private void botonOvoviviparoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOvoviviparoMouseEntered
        // TODO add your handling code here:
        sonido("Burbuja");
    }//GEN-LAST:event_botonOvoviviparoMouseEntered

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
            java.util.logging.Logger.getLogger(Babys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Babys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Babys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Babys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Babys dialog = new Babys(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonOviparo;
    private javax.swing.JButton botonOvoviviparo;
    private javax.swing.JButton botonViviparo;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private class botonAnimal {

        ArrayList<AnimalesCrias> listaAnimales = new ArrayList<>();

        public botonAnimal() {
            //como nace 1=viviparo 2=oviparo  3=Ovoviviparo

            listaAnimales.add(new AnimalesCrias(1, "Conejo", "/recursos/animales/Conejo-del-bosque1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Cerdo", "/recursos/animales/Cerdo1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Oso", "/recursos/animales/Oso1.3.png"));
            listaAnimales.add(new AnimalesCrias(2, "Correcaminos", "/recursos/animales/Correcaminos1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Escorpion", "/recursos/animales/Escorpion1.3.png"));
            listaAnimales.add(new AnimalesCrias(2, "Guacamaya", "/recrusos/animales/Guacamaya1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Lobo", "/recursos/animales/Lobo1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Murcielago", "/recursos/animales/Murcielago1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Camello", "/recursos/animales/Camello1.3.png"));
            listaAnimales.add(new AnimalesCrias(2, "Zopilote", "/recursos/animales/Zopilote1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Jaguar", "/recursos/animales/Jaguar1.3.gif"));
            listaAnimales.add(new AnimalesCrias(3, "Anaconda", "/recursos/animales/Anaconda1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Raton", "/recursos/animales/Raton1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Tigre", "/recursos/animales/Tigre1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Oso polar", "/recursos/animales/Oso-polar1.3.png"));
            listaAnimales.add(new AnimalesCrias(2, "Pulpo", "/recursos/animales/Pulpo1.3.png"));
            listaAnimales.add(new AnimalesCrias(3, "Tiburon", "/recursos/animales/Tiburon1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Canguro", "/recursos/animales/Canguro1.3.png"));
            listaAnimales.add(new AnimalesCrias(3, "Ornitorrinco", "/recursos/animales/Ornitorrinco1.3.png"));
            listaAnimales.add(new AnimalesCrias(1, "Cebra", "/recursos/animales/Cebra1.3.png"));

        }

        public AnimalesCrias getAnimalAleatorio() {
            Random ale = new Random();
            int animalEscogido = (int) (ale.nextDouble() * listaAnimales.size());

            return listaAnimales.get(animalEscogido);

        }

    }

    private class botonViviparo {

        private final int comoNace;

        public botonViviparo() {
            this.comoNace = 1;
        }

        public int getComoNace() {
            return comoNace;
        }

    }

    private class botonOviparo {

        private final int comoNace;

        public botonOviparo() {
            this.comoNace = 2;
        }

        public int getComoNace() {
            return comoNace;
        }

    }

    private class botonOvoviviparo {

        private final int comoNace;

        public botonOvoviviparo() {
            this.comoNace = 3;
        }

        public int getComoNace() {
            return comoNace;
        }

    }

}
