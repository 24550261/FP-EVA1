/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_rangos;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_17_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int clfs;
       final int CLFSA=100,CLFS=70;
        Scanner cap= new Scanner (System.in);
        System.out.println("Inserte la calificacion de esta unidad: ");
        clfs=cap.nextInt();
      
        
                if(clfs>=CLFS&&clfs<=CLFSA&&clfs==0){
                        System.out.println("El alumno acredtio la materia: ");
                                }else{
                                            if(clfs>0&&clfs<CLFS){
                                                       System.out.println("Usted no esta insertando un numero valido en las calificaciones");
                                                            }else{
                                                                 System.out.println("El alumno acredito la materia");
                                                                }
            
        }
    }
    
}
