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
public class borrar {
    
    
 public void ocultar(JLabel la,JLabel le,JLabel li,JLabel lo,JButton ba,JButton be,JButton bi,JButton bo, JButton bu){
     la.setVisible(false);
     le.setVisible(false);
     li.setVisible(false);
     lo.setVisible(false);
     ba.setVisible(false);
     be.setVisible(false);
     bi.setVisible(false);
     bo.setVisible(false);
     bu.setVisible(false);
     
     
 }
 public void mostrar(JLabel la,JLabel le,JLabel li,JLabel lo,JButton ba,JButton be,JButton bi,JButton bo, JButton bu){
     la.setVisible(true);
     le.setVisible(true);
     li.setVisible(true);
     lo.setVisible(true);
     ba.setVisible(true);
     be.setVisible(true);
     bi.setVisible(true);
     bo.setVisible(true);
     bu.setVisible(true);
 }
 public void botonesM(JButton manza,JButton pasta,JButton leche,JButton carne,JButton lasaña,JButton uvas,JButton salir){
     manza.setVisible(true);
     pasta.setVisible(true);
     leche.setVisible(true);
     carne.setVisible(true);
     lasaña.setVisible(true);
     uvas.setVisible(true);
     salir.setVisible(true);
     
     
 }
    public void botonesO(JButton manza,JButton pasta,JButton leche,JButton carne,JButton lasaña,JButton uvas,JButton salir){
     manza.setVisible(false);
     pasta.setVisible(false);
     leche.setVisible(false);
     carne.setVisible(false);
     lasaña.setVisible(false);
     uvas.setVisible(false);
     salir.setVisible(false);
     
     
 }
}
