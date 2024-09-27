
package eva1_19_meses_year;

import java.util.Scanner;


public class EVA1_19_MESES_YEAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mnths;
        Scanner cap= new Scanner (System.in);
        
        System.out.println("Inserte el numeri del mes: ");
        mnths=cap.nextInt();
        
        if(mnths==1){
            System.out.println("Usted esta en Enero");
        }else if (mnths==2){
             System.out.println("Usted esta en Febrero");
        }else if (mnths==3){
             System.out.println("Usted esta en Marzo");
        }else if (mnths==4){
             System.out.println("Usted esta en Abril");
        }else if (mnths==5){
             System.out.println("Usted esta en Mayo");
        }else if (mnths==6){
             System.out.println("Usted esta en Junio");
        }else if (mnths==7){
             System.out.println("Usted esta en Julio");
        }else if (mnths==8){
             System.out.println("Usted esta en Agosto");
        }else if (mnths==9){
             System.out.println("Usted esta en Septiembre");
        }else if (mnths==10){
             System.out.println("Usted esta en Octubre");
        }else if (mnths==11){
             System.out.println("Usted esta en Noviembre");
        }else if (mnths==12){
             System.out.println("Usted esta en Diciembre");
        }else{
            System.out.println("Usted no esta insertando un numero valido conforme a los meses del año (1-12)");
        }
    }
    
}
