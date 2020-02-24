/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author chalosalvador
 */
public class Ventana1 extends JFrame {

    public static Ventana1 v1 = new Ventana1();
    private Ventana2 v2;// = new Ventana2();
    private JButton boton = new JButton("Pulsame");

//    ...
   public Ventana1() {
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                v2 = new Ventana2("El texto desde v1");
//                v2.setText("El texto desde v1");
                v2.setVisible(true);
                v2.setSize(300, 300);
                v1.setVisible(false);
            }
        });
        add(boton);
        
    }
   
   public static void main(String[] args){
       v1.setVisible(true);
       v1.setSize(500, 500);
   }
}
