
package eva1_22_califas;

import java.util.Scanner;


public class EVA1_22_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int clfs;
        Scanner cap=new Scanner(System.in);
        
        System.out.println("Inserte la calificacion obtenida: ");
        clfs=cap.nextInt();
        cap.nextLine();
        
        if(clfs>=90&&clfs<=100){
            System.out.println("La calificacion obtenida es una A");
                    }else if(clfs>=80&&clfs<=89){
                        System.out.println("La calificacion obtenida es una B");
                        
                    }else if(clfs>=70&&clfs<=79){
                        System.out.println("La calificacion obtenida es una C");
                        
                    }else if(clfs>=60&&clfs<=69){
                        System.out.println("La calificacion obtenida es una D");
                        
                    }else if(clfs>=0&&clfs<=59){
                        System.out.println("La calificacion obtenida es una F");
                        
                    }else{
                        System.out.println("Inserte una calificacion valida (1-100)");
                    }
        
    }
    
}
