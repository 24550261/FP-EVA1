/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_if_anidado;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_18_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner cap= new Scanner(System.in);
        System.out.println("Numero correspondiente al dia (1-7: ");
        dia=cap.nextInt();
        cap.nextLine();
        
                if(dia==1){
                     System.out.println("Es el dia Lunes ");
                }else if(dia==2){
                     System.out.println("Es el dia Martes ");
                }else if(dia==3){
                     System.out.println("Es el dia Miercoles");
                }else if(dia==4){
                     System.out.println("Es el dia Jueves ");
                }else if(dia==5){
                     System.out.println("Es el dia Viernes");
                }else if(dia==6){
                     System.out.println("Es el dia Sabado ");
                }else if(dia==7){
                     System.out.println("Es el dia Domingo");
                }else{//opcional
                    System.out.println("Usted no esta insertando un dia valido de la semana");
    }
                
    }
    
}
