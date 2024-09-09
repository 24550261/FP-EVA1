/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //velocidad inicial--> m/s
        //tiempo en segundos
        //aceleracion en m/s2
        
       double d,Vo,t,ac;
        Scanner cap=new Scanner(System.in);
        
        System.out.println("MEDIDOR DE DISTANCIA:");
        System.out.println("Inserte la velocidad inicial del recorrido: ");
        Vo=cap.nextDouble();
        cap.nextLine();
        System.out.println("Inserte el tiempo en que se realizó el recorrido: ");
        t=cap.nextDouble();
        cap=new Scanner(System.in);
        System.out.println("Inserte la aceleracion con la que se realizó el recorrido: ");
       
      ac=cap.nextDouble();
      cap.nextLine();
      
        d=Vo*t+(ac*(t*t)/2);
        
        System.out.println("La distancia recorrida fue de: "+d+" metros");
        
        
    }
    
}
