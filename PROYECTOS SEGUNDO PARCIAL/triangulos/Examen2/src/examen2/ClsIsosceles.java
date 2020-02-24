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
public class ClsIsosceles implements Calculos{
   
      double ladosIgual;
      double lado2;

    public ClsIsosceles(double lado2, double ladosIgual) {
        this.lado2 = lado2;
        this.ladosIgual = ladosIgual;
    }
      
      

    @Override
    public double CalcularArea() {
    int n=2;
    double potencia1=Math.pow(ladosIgual,n);
   double potencia2=Math.pow(lado2,n);
    
   double raizCuadrada=Math.sqrt((potencia1-(potencia2/4)));
        return (lado2*raizCuadrada)/2;   
    }

    @Override
    public double CalcularPerimetro() {
      return (2*ladosIgual)+lado2;
    }

    @Override
    public double CalcularAltura() {
      int n=2;
    double potencia1=Math.pow(ladosIgual,n);
   double potencia2=Math.pow(lado2,n);
    
   double raizCuadrada=Math.sqrt((potencia1-(potencia2/4)));
     return raizCuadrada;
    }
   

   
}
