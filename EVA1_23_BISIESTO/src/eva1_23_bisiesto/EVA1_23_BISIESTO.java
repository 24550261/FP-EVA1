

package eva1_23_bisiesto;

import java.util.Scanner;


public class EVA1_23_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int yr
              ;
      Scanner cap=new Scanner(System.in);
      
      System.out.println("Inserte el year a evaluar: ");
      yr=cap.nextInt();
      cap.nextLine();
      if(yr%4==0&&yr%100==0&&yr%400==0){
          System.out.println("Su year es bisiesto");
    }else{
           if(yr%100==0){
               System.out.println("Su year no es bisiesto");
           }else {
               if(yr%4==0){
                   System.out.println("Su year es bisiesto");
               }else{
                   System.out.println("Su year no es bisiesto");
                   
                        
               }
    }    
    }
    }     
}  
    
    

