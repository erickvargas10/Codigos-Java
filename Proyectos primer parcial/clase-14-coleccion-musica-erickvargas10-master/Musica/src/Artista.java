import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Artista {
    private String nombreArtista;
    private String fechaNacimiento;
    private String pais;
    private Album[] albums;


    public Artista(String nombreArtista, String fechaNacimiento, String pais, Album[] albums) {
        this.nombreArtista = nombreArtista;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
        this.albums = albums;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    @Override
    public boolean equals(Object object) {

        final Artista otherArtista = (Artista) object;
        if (!this.nombreArtista.equals(otherArtista.nombreArtista) || !this.albums.equals(otherArtista.albums)) {
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", pais='" + pais + '\'' +
                ", albums=" + (albums == null ? null : Arrays.asList(albums)) +
                '}';
    }
}
