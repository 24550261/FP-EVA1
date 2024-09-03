/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_peliculas;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA1_6_PELICULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;        //Nombre de la pelicula
        String gen;            //Genero de la pelicula
        int dur;                //Duracion de la pelicula
        String rep;          // Reparto de la peli
        String clas;        //Clasificacion de la pelicula
        
        Scanner cap; //damos de alta el scanner y tmbn la variable scanner
        
                cap= new Scanner(System.in); //NECESARIO
                
                
        System.out.println("Inserte el nombre de la pelicula que desea encontrar:");
            name=cap.nextLine();
        System.out.println("Inserte el genero de la pelicula que desea encontrar:");
            gen=cap.nextLine(); 
        System.out.println("Inserte que duracion tiene la pelicula que desea encontrar");
            dur=cap.nextInt();
            cap.nextLine();
        System.out.println("Inserte que reparto tiene la pelicula que esta buscando;");
            rep=cap.nextLine();
        System.out.println("Inserte que calsificacion tiene la pelicula que esta buscando:");
            clas=cap.nextLine();
            //IMPRIMIR    
                System.out.println(name);
                System.out.println(gen);
                System.out.println(dur);
                System.out.println(rep);
                System.out.println(clas);
                }
    
}
