/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author olga
 */
public class AnimalesCrias {
    
    private int comoNace; //Viviparo=1 Oviparo=2  Ovoviviparo=3
    private String nombre;
    private String ruta;

    public AnimalesCrias(int comoNace, String nombre, String ruta) {
        this.comoNace = comoNace;
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public int getComoNace() {
        return comoNace;
    }

    public String getNombre() {
        return nombre;
    }

    public ImageIcon getRuta() {
        return new ImageIcon(getClass().getResource(ruta));
    }
    
    
    
}
