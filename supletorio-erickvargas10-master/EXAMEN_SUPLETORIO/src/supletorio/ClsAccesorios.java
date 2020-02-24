/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supletorio;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class ClsAccesorios extends ClsProductos{
    private String tipo;
    private String color;
     
     public ClsAccesorios(int id,String nombre, String precio, String marca, String categoria) {
        super(id,nombre, precio, marca, categoria);
    }

    public ClsAccesorios(int id,String nombre, String precio, String marca, String categoria, String tipo, String color) {
        super(id,nombre, precio, marca, categoria);
        this.tipo = tipo;
        this.color = color;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
