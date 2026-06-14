/*
 * EJERCICIO: NÚMEROS PARES
 *
 * Crear un programa que pida al usuario un número entero.
 *
 * El programa deberá:
 *
 * 1. Leer el número introducido.
 * 2. Utilizar un bucle for desde 1 hasta ese número.
 * 3. Mostrar únicamente los números pares.
*/

/*
Necesito:
importar scanner
llamar a scanner
perdir al usuario que introduzca un numero entero
variable int numeroIntroducido para almacenarlo .nextInt
cerrar scanner
for para ir desde 1 hasta el numeroIntroducido
condicional para imprimir los numeros que / 2 su resto sea 0
 */

/* 8 % 2 */


import java.util.Scanner;

public class P001_NumerosPares {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("           NÚMEROS PARES           ");
        System.out.println("===================================");
        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();

        System.out.println("Los números pares que hay hasta el " + numeroIntroducido + " son:");

        input.close();

        for ( int i = 1; i <= numeroIntroducido; i++){

            if ( i % 2 == 0) {

                System.out.println(i);
                
            } 
        }

        

    }
    
}
