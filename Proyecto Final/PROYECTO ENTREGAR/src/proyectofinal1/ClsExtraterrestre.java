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
public class ClsExtraterrestre implements Calculos {
    double vida=1000;
    double estamina=500;
    double ataque=80;
    double ataqueFinal=200;


    ClsExtraterrestre(double ataque) {
         this.ataque= ataque;
    }
    
    @Override
    public double CalcularAtaque() {
        return estamina-(0.05*estamina);
    }

    @Override
    public double CalcularDefensa() {
    return estamina-(estamina*0.25);
    }

    @Override
    public double CalcularAtaqueFinal() {
        return estamina-(0.5*estamina);
    }

    @Override
    public double CalcularCurar() {
     return vida+(vida*0.20);
    }

    @Override
    public double CalcularAtaqueReducir() {
      return vida-ataque;
    }
    
}
