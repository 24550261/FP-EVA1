/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double c;//calificacion
        Scanner cap=new Scanner(System.in);
        System.out.println("Inserte su calificacion: ");
        c=cap.nextDouble();
        if(c<=7){
            System.out.println("NA");
        }else{
            System.out.println("ACREDITADA");
        }
        
    }
    
}
