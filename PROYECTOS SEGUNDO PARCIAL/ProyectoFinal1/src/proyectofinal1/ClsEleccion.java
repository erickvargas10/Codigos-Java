/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal1;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class ClsEleccion extends Items {

    private String vida;
    private String estamina;
    private String ataque;
    private String ataqueFinal;
    private String defensa;
    private String curar;

    public ClsEleccion(String jugador, String personaje, String vida, String estamina, String ataque, String ataqueFinal, String defensa, String curar) {
        super(jugador, personaje);
        this.vida = vida;
        this.estamina = estamina;
        this.ataque = ataque;
        this.ataqueFinal = ataqueFinal;
        this.defensa = defensa;
        this.curar = curar;

    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public String getEstamina() {
        return estamina;
    }

    public void setEstamina(String estamina) {
        this.estamina = estamina;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getAtaqueFinal() {
        return ataqueFinal;
    }

    public void setAtaqueFinal(String ataqueFinal) {
        this.ataqueFinal = ataqueFinal;
    }

    public String getDefensa() {
        return defensa;
    }

    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }

    public String getCurar() {
        return curar;
    }

    public void setCurar(String curar) {
        this.curar = curar;
    }

    @Override
    public String toString() {
        return vida + estamina + ataque + ataqueFinal + defensa + curar;
    }

}
