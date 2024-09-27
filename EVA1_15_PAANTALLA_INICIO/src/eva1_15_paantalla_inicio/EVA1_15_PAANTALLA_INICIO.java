/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_paantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_15_PAANTALLA_INICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String us,ps;//Se declaran variables de usuario (us) y contrasena (ps)
        Scanner cap=new Scanner(System.in);
        //constantes
       final String US="Admin";
        final String PS="bisongod";
       
       
       
         System.out.println("usuario: ");
            us=cap.nextLine();
             System.out.println("Inserte su contraseña: ");
                ps=cap.nextLine();
         
         //como validamos el acceso
         if( us.equals(US)&&ps.equals(PS)){
             System.out.println("ACCESO ACEPTADO");
         }else{
             System.out.println("ACCESO DENEGADO");
         }
    }
    
}
