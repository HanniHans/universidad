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
public class AnimalesAlimentacion {

    private int alimentacion;
    //Herbivoro= 1
    //Omnivoro= 2
    //Carnivoro= 3
    private String nombre;
    private String ruta;

    public AnimalesAlimentacion(int alimentacion, String nombre, String ruta) {
        this.alimentacion = alimentacion;
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public int getAlimentacion() {
        return alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public ImageIcon getRuta() {
        return new ImageIcon(getClass().getResource(ruta));
    }

}
