/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1segundopar;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class ClsFrutas {
      private int precio;
    private String nombre;
    private String Codigo;

    public ClsFrutas(int precio, String nombre, String Codigo) {
        this.precio = precio;
        this.nombre = nombre;
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
    
}
