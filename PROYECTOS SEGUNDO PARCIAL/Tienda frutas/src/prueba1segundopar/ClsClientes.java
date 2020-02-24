
package prueba1segundopar;

public class ClsClientes {
    
    private String nombre;
    private String cedula;
    private String frutaC;
    private int precioC;

    public ClsClientes(String nombre, String cedula, String frutaC, int precioC) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.frutaC = frutaC;
        this.precioC = precioC;
    }

    ClsClientes(String nombreC, String cedulaC) {
         this.nombre = nombreC;
        this.cedula = cedulaC;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String Cedula) {
        this.cedula = Cedula;
    }

    public String getFrutaC() {
        return frutaC;
    }

    public void setFrutaC(String frutaC) {
        this.frutaC = frutaC;
    }

    public int getPrecioC() {
        return precioC;
    }

    public void setPrecioC(int precioC) {
        this.precioC = precioC;
    }

    @Override
    public String toString() {
        return cedula;
    }
    
    

    
    
    
}
