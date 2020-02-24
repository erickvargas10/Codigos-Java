package Tienda;

public class Producto {
    private String [] cantidad;
    private String  marca;
    private String tipo;
    private String codigo;

    public Producto(String marca , String  tipo, String codigo){
        this.marca=marca;
        this.tipo=tipo;
        this.codigo=codigo;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {
        return codigo;
    }
}
