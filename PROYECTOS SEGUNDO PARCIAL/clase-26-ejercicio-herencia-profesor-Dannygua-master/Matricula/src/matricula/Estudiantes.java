
package matricula;


public class Estudiantes extends Persona {  //para que sepa de que se hereda  
   
    private int edad;

    public Estudiantes(String nombre, String apellido, int edad) {

        super(nombre,apellido);//el constructos super
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
}
