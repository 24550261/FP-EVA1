/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mth, klm;//declaro variables de kilometrajes y meses
        Scanner cap= new Scanner(System.in);
        final int MTH=6,KLM=10000;
        System.out.println("Cuantos kilometros ha recorrido su vehiculo desde el ultimo servicio que tuvo? ");
            klm=cap.nextInt();
                cap.nextLine();
        System.out.println("Cuantos meses han pasado desde el ultimo servicio que tuvo? ");
                 mth=cap.nextInt();
                        cap.nextLine();
        if(mth>=MTH||klm>=KLM){
            System.out.println("Usted requiere llevar su unidad movil al servicio");
        }else{
            System.out.println("Su unidad movil puede esperar a recibir el servicio");
        }
    }
    
}
