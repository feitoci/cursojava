import java.util.Scanner;

public class urion1038 {

    public static void main (String arg []){

       Scanner teclado;
       teclado = new Scanner (System.in );
       int codigo;
       int quantidade;

       codigo = teclado.nextInt();
       quantidade = teclado.nextInt();
       

       if (codigo==1){
           
           
    }
       else  if (codigo == 2){
           System.out.printf("Total: R$ %.2f\n",4.50*quantidade);
    }
     else  if (codigo == 3){
           System.out.printf("Total: R$ %.2f\n",5.00*quantidade);
    }
     else  if (codigo == 4){
           System.out.printf("Total: R$ %.2f\n",2.00*quantidade);
    }
     else  if (codigo == 5){
           System.out.printf("Total: R$ %.2f\n",1.50*quantidade);
    }

}
}