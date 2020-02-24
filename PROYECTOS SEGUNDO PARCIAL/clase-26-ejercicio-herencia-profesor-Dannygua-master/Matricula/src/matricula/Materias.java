
package matricula;

import java.util.Objects;


public class Materias {
    
   private String materias;

    public Materias(String materias) {
        this.materias = materias;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Materias other = (Materias) obj;
        if (!Objects.equals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return materias ;
    }
   
   
    
}
