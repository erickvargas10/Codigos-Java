/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author ESFOT
 */
public class ClsEscaleno implements Calculos{
    double lado1;
    double lado2;
    double lado3;
    

    public ClsEscaleno(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    
    @Override
    public double CalcularArea() {
        double s=(lado1+lado2+lado3)/2;//semiperimetro
       double raizCuadrada=Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
       return raizCuadrada;
     
    }

    @Override
    public double CalcularPerimetro() {
       return lado1+lado2+lado3;
    }

    @Override
    public double CalcularAltura() {
        
        double s=(lado1+lado2+lado3)/2;//semiperimetro
         double raizCuadrada=Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        return (2/lado1)*(raizCuadrada);

    }
}
