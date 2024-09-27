/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_meses_switch;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_21_MESES_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int dia;
        Scanner cap= new Scanner(System.in);
        System.out.println("Numero correspondiente a los meses del año(1-12): ");
        dia=cap.nextInt();
        cap.nextLine();
        
        switch (dia){
            case 1: System.out.println("Usted esta en el Mes Enero:)");
            break;
            case 2: System.out.println("Usted esta en el Mes Febrero :)");
            break;
            case 3: System.out.println("Usted esta en el Mes Marzo:)");
            break;
            case 4: System.out.println("Usted esta en el Mes Abril:)");
            break;
            case 5: System.out.println("Usted esta en el Mes Mayo :)");
            break;
            case 6: System.out.println("Usted esta en el Mes Junio :)");
            break;
            case 7: System.out.println("Usted esta en el Mes Julio :)");
            break;
            case 8: System.out.println("Usted esta en el Mes Agosto:)");
            break;
            case 9: System.out.println("Usted esta en el Mes Septiembre :)");
            break;
            case 10: System.out.println("Usted esta en el Mes Octubre :)");
            break;
            case 11: System.out.println("Usted esta en el Mes Noviembre :)");
            break;
            case 12: System.out.println("Usted esta en el Mes Diciembre:)");
            break;
            
            default: System.out.println("Usted no esta insertando un numero acorde a los meses del year: 1-12 ");
        }
    }
    
}
