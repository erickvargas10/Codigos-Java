/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author chalosalvador
 */
public class Ventana2 extends JFrame {

    private JLabel etiqueta = new JLabel("su texto aquí");

//    ...
    public Ventana2(){
        add(etiqueta);
    }
    
    public Ventana2(String texto){
        etiqueta.setText(texto);
        add(etiqueta);
    }
   public void setText(String elTexto) {
        etiqueta.setText(elTexto);
    }
}
