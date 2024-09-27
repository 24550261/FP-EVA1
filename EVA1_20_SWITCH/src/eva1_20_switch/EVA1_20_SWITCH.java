/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_switch;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_20_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int dia;
        Scanner cap= new Scanner(System.in);
        System.out.println("Numero correspondiente al dia (1-7): ");
        dia=cap.nextInt();
        cap.nextLine();
        
        switch (dia){
            case 1: System.out.println("Usted esta en el Dia Lunes :)");
            break;
            case 2: System.out.println("Usted esta en el Dia Martes :)");
            break;
            case 3: System.out.println("Usted esta en el Dia Miercoles:)");
            break;
            case 4: System.out.println("Usted esta en el Dia Jueves:)");
            break;
            case 5: System.out.println("Usted esta en el Dia Viernes :)");
            break;
            case 6: System.out.println("Usted esta en el Dia Sabado :)");
            break;
            case 7: System.out.println("Usted esta en el Dia domingo :)");
            break;
            default: System.out.println("Usted no esta insertando un nunmero acorde a la semana (1-7)");
        }
    }
    
}
