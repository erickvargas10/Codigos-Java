/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soluciónexamen;

import java.util.Scanner;

/**
 *
 * @author chalosalvador
 */
public class SoluciónExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Autor[] autores = new Autor[3];

        autores[0] = new Autor("A1", "P1");
        autores[1] = new Autor("A2", "P2");
        autores[2] = new Autor("A3", "P3");

        Libro[] libros = new Libro[10];
        int opcion;
        int contadorLibros = 0;
        do {

            System.out.println("MENÚ DE OPCIONES");

            System.out.println("1. Ingresar libro");
            System.out.println("2. Lista de favoritos");
            System.out.println("3. Contar libros de autor");
            System.out.println("4. Salir");

            System.out.println("Ingrese la opción que desea:");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1:
                    String titulo;
                    int anio;
                    String favoritoString;
                    boolean favorito;

                    System.out.println("Ingrese el título:");
                    titulo = scan.nextLine();

                    System.out.println("Ingrese el año:");
                    anio = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Es favorito? (Si o No)");
                    favoritoString = scan.nextLine();
                    favorito = favoritoString.equals("Si");

                    System.out.println("Seleccione el autor");
                    System.out.println("1. " + autores[0].getNombre());
                    System.out.println("2. " + autores[1].getNombre());
                    System.out.println("3. " + autores[2].getNombre());

                    int opcionAutor = scan.nextInt();
                    scan.nextLine();
                    
                    Autor autorLibro = autores[(opcionAutor - 1)];
                    
                    
                    Libro nuevoLibro = new Libro(titulo, anio, favorito, autorLibro);
                    libros[contadorLibros] = nuevoLibro;
                    
                    contadorLibros++;

                    break;
                case 2:
                    for (Libro libro : libros) {
                        if (libro != null && libro.isFavorito()) {
                            System.out.println(libro);
                        }
                    }
                    break;
                case 3:
                    
                    System.out.println("Seleccione el autor");
                    System.out.println("1. " + autores[0].getNombre());
                    System.out.println("2. " + autores[1].getNombre());
                    System.out.println("3. " + autores[2].getNombre());

                    int opcionAutor1 = scan.nextInt();
                    scan.nextLine();
                    
                    Autor autorSeleccionado = autores[(opcionAutor1 -1)];
                    
                    int contadorLibrosAutor = 0;
                    
                    for(Libro libro: libros) {
                        if(libro != null && libro.getAutor().equals(autorSeleccionado)) {
                            contadorLibrosAutor++;
                        }
                    }
                    
                    System.out.println("Este autor tiene " + contadorLibrosAutor + " libros.");
                    
                    break;
                case 4:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);
    }

}
