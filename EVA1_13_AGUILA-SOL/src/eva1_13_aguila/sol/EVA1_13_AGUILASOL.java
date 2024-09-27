/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_aguila.sol;

/**
 *
 * @author Ivan
 */
public class EVA1_13_AGUILASOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALEATORIO
        //GENERAR NUMERO ALEATORIOS
       double valor= Math.random();
       //random genera valores >=0 y <1
       //entre 0 y 0.999999999999999999999999..
       if (valor>=0.5){
           System.out.println("Aguila");
           
       }else{
           System.out.println("Sello");
    }
    }
    
}
