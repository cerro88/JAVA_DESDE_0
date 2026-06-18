

import java.util.Scanner;

public class A002_CONTAR {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("    CONTADOR DE NÚMEROS > 10     ");
        System.out.println("===================================");
        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();
        input.close();

        System.out.println("------------------------------------");
        int contador = 0;

        for ( int i = 1; i <= numeroIntroducido; i++){

            if ( i >= 10){
                contador++;
                
            }
        }

        System.out.println("La cantidad de números mayores a 10 son: " + contador);

        input.close();
    }
    
}
