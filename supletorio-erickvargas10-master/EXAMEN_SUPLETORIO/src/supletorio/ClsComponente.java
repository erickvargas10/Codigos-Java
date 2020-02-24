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
public class ClsComponente extends ClsProductos{
   private String tipo;
    private int capacidad;
    private int velocidad;
    
    public ClsComponente(int n,String nombre, String precio, String marca, String categoria) {
        super(n,nombre, precio, marca, categoria);
    }

    public ClsComponente(int n,String nombre, String precio, String marca, String categoria, String tipo, int capacidad, int velocidad) {
        super(n,nombre, precio, marca, categoria);
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
}
