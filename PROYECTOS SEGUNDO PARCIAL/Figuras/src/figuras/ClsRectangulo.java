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
public class ClsRectangulo implements Calculos{
    double lado1;
    double lado2;

    public ClsRectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    @Override
    public double CalcularArea() {
    return lado1*lado2;
    }

    @Override
    public double CalcularPerimetro() {
        return 2*lado1+2*lado2;
    }
    
}
