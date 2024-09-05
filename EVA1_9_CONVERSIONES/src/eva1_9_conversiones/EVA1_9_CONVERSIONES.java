/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_9_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temc,tempf,kev;//temperatura en celsius
        Scanner cap= new Scanner(System.in);
       
       System.out.println("Inserte su temperatura en farenheit: ");
       tempf=cap.nextDouble();
       temc=(tempf-32)/1.8;
       System.out.println("Su temperatura en grados centigrados es: "+temc);
       //conversion a farenheit
       System.out.println("Inserte su temperatura en centigrados: ");
       temc=cap.nextDouble();
       tempf=temc * 1.8 + 32.;
       
       System.out.println("Su temperatura en grados farenheit es: "+tempf);
       //convertir a kelvin
       System.out.println("Inserte sus grados en celsisus");
       temc=cap.nextDouble();
       kev=temc+273.15;
       System.out.println("Su temperatura en kelvin es: "+kev);
    }
    
}
