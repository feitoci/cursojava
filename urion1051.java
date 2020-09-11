import java.util.Scanner;

public class urion1051 {

    public static void main (String arg []){

       Scanner teclado;
       teclado = new Scanner (System.in);
       float salario;
       
       
       salario= teclado.nextFloat ();
       
      if ((salario > 0) && (salario < 2000)){
        System.out.println("Isento %.2f\n",salario);

       
             }
    }
}