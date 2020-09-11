import java.util.Scanner;

public class urion1066 {

    public static void main (String arg []){

       Scanner teclado;
       teclado = new Scanner (System.in );
       int valor;
       int count,Pares,impares,negativo,positivo;
       negativo=0;
       positivo=0;
       Pares=0;
       impares=0;

                

        for(count = 1; count <=5; count=count+1){
       
       
             valor= teclado.nextInt();

             if (valor%2==0){
                Pares++;


             }
              else  {
                
                impares++;

                }

                if (valor <0 ) {
                    negativo++;
                }

                else if ( valor >0){
                positivo++;
                }

                      
             }
               System.out.println(Pares + " valores par (es)");
               System.out.println(impares + " valores impar (es)");
               System.out.println(positivo + " valores positvo (s)");
               System.out.println(negativo + " valores negativo (s)");
    }
}
            

