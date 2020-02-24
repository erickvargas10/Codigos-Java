/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantes;

import java.util.Scanner;

/**
 *
 * @author chalosalvador
 */
public class Principal {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = scan.nextInt();
        Estudiante[] estudiantes = new Estudiante[numEstudiantes];
        
        for(int i = 0; i < estudiantes.length; i++) {
            System.out.println("Datos del estudiante " + (i+1));
            scan.nextLine();
            
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();
            
            System.out.print("Apellido: ");
            String apellido = scan.nextLine();
            
            System.out.print("Cédula: ");
            String cedula = scan.nextLine();
            
            estudiantes[i] = new Estudiante(nombre, apellido, cedula);
            
            System.out.println("Cuántas materias toma este estudiante? ");            
            int numMaterias = scan.nextInt();
            String[] materias = new String[numMaterias];
            
            scan.nextLine();
            
            for(int j = 0; j < materias.length; j++){
                System.out.print("Nombre de materia " + (j + 1) + ": ");
                materias[j] = scan.nextLine();
            }
            
            estudiantes[i].setMaterias(materias);
            
            System.out.println("");
            System.out.println("");
        }
        
        
        System.out.println("############# INFORMACIÓN DE ESTUDIANTES #############");
        
        for(int i = 0; i< estudiantes.length; i++){
            System.out.println("Estudiante " + (i+1) + ":");
            
            System.out.println("Nombre completo: " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido() );
            System.out.println("Cédula: " + estudiantes[i].getCedula());
            
            System.out.println("--- MATERIAS");
            
            String[] me = estudiantes[i].getMaterias();
            for(int j = 0; j<me.length; j++) {
                System.out.println((j+1) + ". " + me[j]);
            }
            
            System.out.println("");
            System.out.println("");
        }
        
        
    }
    
}
