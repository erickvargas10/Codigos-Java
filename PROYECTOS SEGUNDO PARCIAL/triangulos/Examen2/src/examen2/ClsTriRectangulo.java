/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;


public class ClsTriRectangulo implements Calculos{
     double lado1;
    double lado2;

    public ClsTriRectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    
    
     @Override
    public double CalcularArea() {
        
        return (lado2*lado1)/2;
      
    }

     @Override
    public double CalcularPerimetro() {
     int n=2;
     double potencia1=Math.pow(lado1,n);
     double potencia2=Math.pow(lado2,n);
    
   double lado3=Math.sqrt(potencia1+potencia2);
       return  lado1+lado2+lado3;
    }

     @Override
    public double CalcularAltura() {
        
      int n=2;
     double potencia1=Math.pow(lado1,n);
      double potencia2=Math.pow(lado2,n);
    
   double lado3=Math.sqrt(potencia1+potencia2);
      return  (lado1*lado2)/lado3;
    }
    
}
