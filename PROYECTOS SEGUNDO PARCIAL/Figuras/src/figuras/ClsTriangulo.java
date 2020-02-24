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
public class ClsTriangulo implements Calculos {
    double lado1;
    double lado2;
    double lado3;
    double altura;

    public ClsTriangulo(double lado1, double lado2, double lado3, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }



    @Override
    public double CalcularPerimetro() {
        return lado1+lado2+lado3;
    }

    @Override
    public double CalcularArea() {
      return (lado3*altura)/2;
    }
    
}
