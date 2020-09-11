import java.util.Scanner;

public class urion1041 {

    public static void main (String arg []){

       Scanner teclado;
       teclado = new Scanner (System.in);
       float x;
       float y;

       x = teclado.nextFloat ();
       y = teclado.nextFloat ();

    

    if ((x == 0 ) && ( y == 0 )){
        System.out.println("Origem");
             }

             else if (( x == 0 ) && ( y != 0 )){
        System.out.println("Eixo Y");
            }


             else if (( x !=0 ) && ( y==0)){
        System.out.println("Eixo X ");
       }
       
        else if (( x >0 ) && ( y > 0 )){
           System.out.println("Q1");
           
       }
       
       else if (( x < 0 ) && ( y > 0 )){
        System.out.println("Q2");
            }
            else if (( x < 0 ) && ( y < 0 )){
        System.out.println("Q3");
            }
       else if (( x > 0 ) && ( y < 0)){
        System.out.println("Q4");
       }
       
           
        }
       }

