import java.util.Scanner;

public class urion1064 {

    public static void main (String arg []){

       Scanner teclado;
       teclado = new Scanner (System.in );
       float valor,media;
       int count,Positivo;
       

       Positivo = 0;
       media = 0;
       
       for(count = 1; count <=5; count=count+1){
        valor= teclado.nextFloat();

       if (valor > 0){
           Positivo=Positivo +1;
           media=media + valor;
       }
       
    }
    media = media/Positivo;

    System.out.println(Positivo + " valores positivos");
    System.out.printf("%.1f\n",media);

       }
}
