/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        // TODO code application logic here
        //CONDICIONAL
        //LOGICA BOOLEANA-->OPERACIONES DE VERDADERO Y FALSO
        //olicitar edad.
        int e;
        Scanner cap=new Scanner(System.in);
        
        
        System.out.println("Ingrese su edad: ");
      
        e=cap.nextInt();
        
        //Determinar si es adulto
        if(e>=18){
            System.out.println("Usted es un adulto");
            
        }
        else{
            System.out.println("Usted no es adulto");
        }
        
    }
    
}
