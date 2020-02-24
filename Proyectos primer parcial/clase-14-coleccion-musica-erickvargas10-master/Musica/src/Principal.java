import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int opcion =0;
int contadorGeneros=0;
int contadorAlbumes=0;
Genero listaGeneros[]=new Genero[3];
Album listaAlbum[]=new Album[4];
do{
    System.out.println(" COLECCION DE MUSICA");
    System.out.println("debe ingresar generos y albumes del artista para ser regitrado ");

    System.out.println("1. Ingresar genero");
    System.out.println("2. Ingresar album");
    System.out.println("3. Ingresar artista ");
    System.out.println("4. Imprimir artistas");
    System.out.println("5. Salir");

    System.out.println("Seleccione opcion");
    opcion=scan.nextInt();

    switch (opcion){
        case  1:
            if(contadorGeneros == 3){
                System.out.println("La lista de generos está llena.");
                break;
            }

            System.out.println("Ingrese el nombre del género:");
            scan.nextLine();
            String nombreGenero = scan.nextLine();

            Genero genero = new Genero(nombreGenero);

            listaGeneros[contadorGeneros] = genero;
            contadorGeneros++;

            break;


        case  2:
            if(contadorGeneros == 0) {
                System.out.println("No ha ingresado ningún género.");
                break;
            }

            System.out.println("Ingrese el nombre del album:");
            scan.nextLine();
            String nombreAlbum =  scan.nextLine();

            System.out.println("Ingrese el año de creación:");
            int fecha = scan.nextInt();

            System.out.println("Ingrese el numero de canciones:");
            int numCanciones = scan.nextInt();


            for(int i = 0; i < listaGeneros.length; i++) {
                if(listaGeneros[i] != null){
                    System.out.println( (i+1) + ". " + listaGeneros[i]);
                }
            }
            System.out.println("Seleccione el genero:");
            int opcionGenero = scan.nextInt();
            Genero generoSeleccionado = listaGeneros[opcionGenero-1];

            Album album = new Album(nombreAlbum, fecha, numCanciones );
            System.out.println("Se ha ingresado el siguiente album:");

            System.out.println(album  + " genero : "  + generoSeleccionado);

            listaAlbum[contadorAlbumes] = album;
            contadorAlbumes++;

            break;

        case  3:

            System.out.println("Ingrese el nombre del artista:");
            scan.nextLine();

            String nombreArtista = scan.nextLine();

            System.out.println("Ingrese el pais");
            String pais = scan.nextLine();


            System.out.println("Seleccione todos los albumes que le pertenecen al artista separados por comas:");

            for(int i = 0; i < listaAlbum.length; i++) {
                if(listaAlbum[i] != null) {
                    System.out.println((i+1) + ". " + listaAlbum[i].getNombreAlbum());
                }
            }

            String albumesArtistaTmp = scan.nextLine();
            String[] idAlbumesArtista = albumesArtistaTmp.split(",");

            Album[] albumesArtista = new Album[idAlbumesArtista.length];

            for(int i = 0; i < idAlbumesArtista.length; i++) {
                albumesArtista[i] = listaAlbum[Integer.valueOf(idAlbumesArtista[i])-1];
            }




            break;

        case  5:
            System.out.println("Adios");
            break;
default:
        System.out.println("Adios");
 break;
    }


}while(opcion!=5);

    }


}


