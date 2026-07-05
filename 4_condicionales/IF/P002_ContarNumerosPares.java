/*
Crear un programa que pida al usuario un número entero.

El programa deberá:

Leer el número introducido.
Recorrer los números desde 1 hasta ese número.
Mostrar únicamente los números pares.
Contar cuántos números pares ha encontrado.
Mostrar el total al final.

*/

/*
Necesito:

importar Scanner
crear Scanner
pedir al usuario un número entero
crear variable int numeroIntroducido para almacenar el dato
crear variable int contador = 0

cerrar Scanner

for para recorrer desde 1 hasta numeroIntroducido

if para comprobar si el número es par

si es par:
    aumentar contador en 1
    mostrar el valor de i

fuera del bucle:
    mostrar el valor de contador

*/

import java.util.Scanner;

public class P002_ContarNumerosPares {

    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("    CONTADOR DE NÚMEROS PARES      ");
        System.out.println("===================================");
        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();
        int contador = 0;

        input.close();

        for ( int i = 1; i <= numeroIntroducido; i++){
            if ( i % 2 == 0){
                contador++;
                System.out.println(i);
            }
        }

        System.out.println("Total de pares: " + contador);


    }
    
}
