/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author ADMIN-MINEDUC
 */
public class ClsCirculo implements Calculos{
    
    double radio;

    public ClsCirculo(double radio) {
        this.radio = radio;
    }
    

    @Override
    public double CalcularArea() {
       return pi*(radio*radio);
    }

    @Override
    public double CalcularPerimetro() {
       return 2*pi*(radio);
    }
}
