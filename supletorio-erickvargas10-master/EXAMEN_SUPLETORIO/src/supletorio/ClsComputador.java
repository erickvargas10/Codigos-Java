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
public class ClsComputador extends ClsProductos{
       private String tipo;
    private int capacidad;
    private int ram;
    private String procesador;
    
    public ClsComputador(int n,String nombre, String precio, String marca, String categoria) {
        super(n,nombre, precio, marca, categoria);
        
    }

    public ClsComputador(int n,String nombre, String precio, String marca, String categoria, String tipo, int capacidad, int ram, String procesador) {
        super(n, nombre, precio, marca, categoria);
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ram = ram;
        this.procesador = procesador;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    
}
