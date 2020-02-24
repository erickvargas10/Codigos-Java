
package matricula;

import java.util.Objects;


public class Profesores extends Persona {
    

    private String facultad;
    private String materiaP;

    public Profesores(String nombre, String apellido, String facultad, String materiaP) {

        super(nombre,apellido);
        this.facultad = facultad;
        this.materiaP = materiaP;
    }

    public String getMateriaP() {
        return materiaP;
    }

    public void setMateriaP(String materia) {
        this.materiaP = materia;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return materiaP ;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Profesores other = (Profesores) obj;
        if (!Objects.equals(this.materiaP, other.materiaP)) {
            return false;
        }
        return true;
    }

    
    
}
