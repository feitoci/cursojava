import java.util.Scanner;

public class urion1065 {

    public static void main (String arg []){

       Scanner teclado;
       teclado = new Scanner (System.in );
       int valor;
       int count,Pares;
       Pares=0;

             
       for(count = 1; count <=5; count=count+1){
       
       
             valor= teclado.nextInt();

             if (valor%2==0){
                Pares=Pares+1;
                      
             }
        
        }
        System.out.println(Pares + " valores pares");
    }
}
    
  
