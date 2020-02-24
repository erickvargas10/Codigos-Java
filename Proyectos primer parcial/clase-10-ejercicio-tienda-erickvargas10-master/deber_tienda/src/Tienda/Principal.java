package Tienda;
import java.util.Scanner;

public class Principal {

    private String nombre;
    private String direccion;
    private String ruc;

    public Principal(String nombre, String direccion, String ruc) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRuc() {
        return ruc;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion=0;
        System.out.println("Ingrese nombre de la tienda");
        String nombre = scan.nextLine();
        System.out.println("Ingrese Direccion");
        String direccion = scan.nextLine();
        System.out.println("Ingrese Ruc");
        String ruc = scan.nextLine();

        System .out.println("#### INFORCACION TIENDA #### ");
        System .out.println(" NOMBRE :"+ nombre );
        System .out.println(" DIRECCION :"+ direccion);
        System .out.println(" RUC :"+ ruc);

        System.out.println("Ingrese el numero productos que va a ingresar");
        int cantidadPro = scan.nextInt();
        Producto[] producto = new Producto[cantidadPro];
        for (int i = 0; i <producto.length; i++) {
            System.out.println("Ingrese marca del prooducto " + (i + 1));
            scan.nextLine();
            String marca = scan.nextLine();
            System.out.println("Ingrese el tipo producto (alimento , electrodoméstico. ropa)");
            String tipo = scan.nextLine();
            System.out.println("Ingrese su codigo unico ");
            String codigo = scan.nextLine();
            producto[i] = new Producto(marca, tipo, codigo);
        }

        do{
            System.out.println("Menu de opciones");
            System.out.println("1._Ingresar nuevo producto");
            System.out.println("2._Visualizar productos");
            System.out.println("3._Salir");
            opcion=scan.nextInt();


        switch (opcion) {

            case 1:

                System.out.println("ingrese el nuevo producto");
                Producto[] productos = new Producto[1];
                for(int i=0;  i<1; i++) {
                    System.out.println("Ingrese marca del prooducto ");
                    scan.nextLine();
                    String marca = scan.nextLine();
                    System.out.println("Ingrese el tipo producto (alimento , electrodoméstico. ropa)");
                    String tipo = scan.nextLine();
                    System.out.println("Ingrese su codigo unico ");
                    String codigo = scan.nextLine();
                    productos[i]=new Producto(marca,tipo,codigo);
                }
                break;

            case 2:
                if(cantidadPro==0){
                    System.out.println("no existen productos ingresados");
                }else{
                    System.out.println("LISTA DE PRODUCTOS");
                    for (int i = 0; i <producto.length; i++) {
                        System.out.println("Producto  " + (i + 1)+ " :");
                        System.out.println("marca :" +producto[i].getMarca());
                        System.out.println("tipo :" +producto[i].getTipo());
                        System.out.println("codigo :" +producto[i].getCodigo());
                        System.out.println();
                    }
                }

                break;

            case 3:
                System.out.println("Gracias!");
                break;

                default:
                    System.out.println("Ingrese opcion correcta");
        }
        }while(opcion!=3);

    }
}

