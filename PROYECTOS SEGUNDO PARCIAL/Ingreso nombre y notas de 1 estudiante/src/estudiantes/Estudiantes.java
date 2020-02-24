/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

public class Estudiantes {

    //Atributos del estudiantes
    String nombre;
    String apellido;
    Double nota1;
    Double nota2;
    Double nota3;
    Double promedio;
//constructores
    public Estudiantes(String nombre, String apellido, Double nota1, Double nota2, Double nota3, Double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.promedio = promedio;
    }
    
    // setters getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    @Override
   
    public String toString() {
        String informacion = "\n"+
                this.nombre+"             "+this.apellido+"             "+this.nota1+"            "+this.nota2+"             "+this.nota3+"            "+this.promedio+"  "
                             +"\n";
        
        return informacion;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
