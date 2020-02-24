import java.util.Objects;

public class Album {
    private String nombreAlbum;
    private int fecha;
  private int numCanciones;
  private Genero  genero;

    public Album(String nombreAlbum, int fecha, int numCanciones) {
        this.nombreAlbum = nombreAlbum;
        this.fecha = fecha;
        this.numCanciones = numCanciones;
    }

    public Album(Genero genero) {
        this.genero = genero;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nombreAlbum='" + nombreAlbum + '\'' +
                ", fecha=" + fecha +
                ", numCanciones=" + numCanciones +
                ", genero=" + genero +
                '}';
    }
}

