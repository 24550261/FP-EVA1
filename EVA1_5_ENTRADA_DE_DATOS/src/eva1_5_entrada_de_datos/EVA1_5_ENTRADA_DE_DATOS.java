/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_de_datos;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_5_ENTRADA_DE_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLES
        String marca;
        String modelo;
        int year;
        double precio;
        //Como se captura?
        //SCANNER-->Clase: mos proporcionan muchas herramientas
        Scanner captura;//declaramosla herramienta previamente 
        //hay que imrportar la herramienta (hacer un import)
        captura= new Scanner(System.in);//creamos la herramienta 
        
        //HAY QUE INDICARSE AL USUARIO DE CAPTURAR
        System.out.println("Introduce la marca del Automovil:");
        //capturamos --> una asigancion 
        marca=captura.nextLine();//Les regresa todo el texto que introduzcamos hasta que se presona la tecla "enter'"
        
        System.out.println(marca);
        System.out.println("Introuce el modelo del Automovil");
        modelo=captura.nextLine();
        System.out.println(modelo);
        System.out.println("Introduzca el año");
        year=captura.nextInt();
        System.out.println(year);
        System.out.println("Introduzca el preico");
        precio=captura.nextDouble();
        System.out.println(precio);
        
        //En este mismo codigo se imrimen los valores capturados, despues de capturarlos se imprimen.
        
    }
    
}
