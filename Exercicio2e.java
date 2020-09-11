import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner (Chamei de TECLADO)
        teclado = new Scanner(System.in);  // este componente vai ler dados do Dispositivo de Entrada padrão

        int area, Base1 , base2, altura;

        System.out.println("Por favor, digite o valor da area do trapezio");
        Base1 = teclado.nextInt();
        base2 = teclado.nextInt();  
        altura = teclado.nextInt();      
        area = (Base1 + base2) *altura/2;

        System.out.println("A area do losangulo é "+ area);

    }
}