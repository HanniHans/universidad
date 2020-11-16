/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author root
 */
public class medidor {

    int alimento = 50;

    public void restar(JLabel la, JLabel le) {

    }

    public void manzana(JLabel la, JButton ba) {
        String a = la.getText();
        int alimento = Integer.parseInt(a);
        alimento = alimento + 10;
        if (alimento >= 100) {
            la.setText(String.valueOf(100));
        } else {
            la.setText(String.valueOf(alimento));
        }

    }

    public void Leche(JLabel la, JButton ba) {
        String a = la.getText();
        int alimento = Integer.parseInt(a);
        alimento = alimento + 20;

        if (alimento >= 100) {
            la.setText(String.valueOf(100));
        } else {
            la.setText(String.valueOf(alimento));
        }

    }

    public void Carne(JLabel la, JButton ba) {
        String a = la.getText();
        int alimento = Integer.parseInt(a);
        alimento = alimento + 20;

        if (alimento >= 100) {
            la.setText(String.valueOf(100));
        } else {
            la.setText(String.valueOf(alimento));
        }
    }

    public void uva(JLabel la, JButton ba) {
        String a = la.getText();
        int alimento = Integer.parseInt(a);
        alimento = alimento + 18;

        if (alimento >= 100) {
            la.setText(String.valueOf(100));
        } else {
            la.setText(String.valueOf(alimento));
        }
    }

    public void pasta(JLabel la, JButton ba) {
        String a = la.getText();
        int alimento = Integer.parseInt(a);
        alimento = alimento + 12;

        if (alimento >= 100) {
            la.setText(String.valueOf(100));
        } else {
            la.setText(String.valueOf(alimento));
        }
    }

    public void lasaña(JLabel la, JButton ba) {
        String a = la.getText();
        int alimento = Integer.parseInt(a);
        alimento = alimento + 20;

        if (alimento >= 100) {
            la.setText(String.valueOf(100));
        } else {
            la.setText(String.valueOf(alimento));
        }
    }

}
