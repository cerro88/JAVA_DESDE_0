

import java.util.Scanner;

public class A003_CONTAR {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println(" CONTADOR DE NÚMEROS ENTRE 5 Y 15  ");
        System.out.println("===================================");
        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();
        input.close();

        System.out.println("------------------------------------");
        int contador = 0;

        for ( int i = 1; i <= numeroIntroducido; i++){

            if ( i >= 5 && i <= 15){
                contador++;
                System.out.println(i);
                
            }
        }

        System.out.println("La cantidad de números entre 5 i 15 son: " + contador);

        input.close();
    }
    
}
