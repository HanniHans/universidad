/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author root
 */
public class AnimalesEcosistemas {

    private int habitad;
    private String nombre;
    private String ruta;
    

    public AnimalesEcosistemas(int habitad, String nombre, String ruta) {
        this.habitad = habitad;
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public int getHabitad() {
        return habitad;
    }

    public String getNombre() {
        return nombre;
    }

    public ImageIcon getImagen() {
        return new ImageIcon(getClass().getResource(ruta));
    }

   
}
