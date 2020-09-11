import  java.util.Scanner;

public class urion1003{
     public static void main (String arg []){

    Scanner teclado;
    teclado = new Scanner(System.in);

    int A,B, SOMA;
       
    A = teclado.nextInt();
    B = teclado.nextInt();

    SOMA = A + B;
    System.out.println("SOMA = " + SOMA );

}

} 
