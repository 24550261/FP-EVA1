/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_tipo.hacienda;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_14_TIPOHACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //FISICAS-->F
       //MORALES-->M
       char tp;//tipo de persona
       Scanner cap=new Scanner(System.in);
        System.out.println("Capture el tipo de persona (F si es FISICA y M si es MORAL):     ");
        tp=cap.nextLine().charAt(0);
       // System.out.println("El caracter es "+tp);
        if(tp=='F'){
            System.out.println("Usted es una persona Fisica");
            
        }else{
            System.out.println("Usted es una persona moral");
        }
    }
    
}
