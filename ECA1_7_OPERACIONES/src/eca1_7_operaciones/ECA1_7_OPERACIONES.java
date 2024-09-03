/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eca1_7_operaciones;

/**
 *
 * @author Ivan
 */
public class ECA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Operaciones asitmeticas
        //Suma y Resta
        int x=10;//declaracion y asisgnacion d1
        int y=5;
        int suma,resta,divi,multi,pot,raiz;//declaracion de varias variables del mismo tipo 
        suma=x+y;//operador de suma +
        System.out.println("La suma de x+y es: ");
        System.out.println(suma);
        
        resta=x-y;//operador de diferencia -
        System.out.println("la resta de x-y es: ");
        System.out.println(resta);
        /*tambien hay reglas de jeraquia de operaciones*/
      
        
        //MUltiplicacion
        multi=x*y;//operador de de mutiplicacion es *
        System.out.println("la multipliaion de x*y es: ");
        System.out.println(multi);
        
        
        //Division--> el manejo de tipos de datos 
        //si dividimos enteros, Java da como resultado un entero
        divi=x/y;
        System.out.println("el reultado de la division x(10)/y(5) es: ");
         System.out.println(divi);
        
        x=5;
        y=2;
        divi=x/y;
        System.out.println("la division entre x(5) y(2)");
        System.out.println(divi);
        
        double val1=11, val2=3;
        double diviD;
        diviD=val1/val2;
        System.out.println("division entre numeros decimales");
        System.out.println(diviD);
    }
    
}
