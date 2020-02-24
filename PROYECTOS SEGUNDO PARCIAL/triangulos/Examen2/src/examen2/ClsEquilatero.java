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
public class ClsEquilatero implements Calculos {
    
    double lado1;
    

    public ClsEquilatero(double lado1) {
        this.lado1 = lado1;
    }

    
    @Override
    public double CalcularArea() {
        double raizCuadrada=Math.sqrt(3*lado1);
        int n=2;
        double potencia=Math.pow(lado1,n);
        return (raizCuadrada/2)*potencia;      
      
    }

    @Override
    public double CalcularPerimetro() {
       return 3*lado1;
    }

    @Override
    public double CalcularAltura() {
       double raizCuadrada=Math.sqrt(3*lado1);
       return (raizCuadrada/2);
    }
    
}
