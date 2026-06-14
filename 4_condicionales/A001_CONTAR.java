import java.util.Scanner;

public class A001_CONTAR {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println(" CONTADOR DE MÚLTIPLOS DE TRES     ");
        System.out.println("===================================");
        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();
        System.out.println("------------------------------------");
        int contador = 0;

            for ( int i = 1; i <= numeroIntroducido; i++){

            if ( i % 3 == 0){
                contador++;
                System.out.println(i);
                
                
            }
        }

        System.out.println("El total de múltiplos de tres és de: " + contador);

    }
    
}
