/*
Crear un programa que pida al usuario un número entero.

El programa deberá:

Leer el número introducido.
Recorrer los números desde 1 hasta ese número.
Mostrar cada número.
Ir sumando todos los números.
Mostrar la suma total al final.

*/

/*
NECESITO:
- importar scanner
- llamar a scanner
- pedir al usuario un número entero 
- crear una variable numerointroducido 
para almacenar el input delusuario cerrar scanner
- variable int numeroIntroducido para almacenarlo .nextInt
- variable int suma con valor 0
- for para recorrer del 1 hasta el numeroIntroducido
- mostar los números del 1 al numeroIntroducido
- mostrar el valor de suma + i

*/

import java.util.Scanner;

public class P003_SumarNumeros {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("    SUMAR NÚMEROS +++      ");
        System.out.println("===================================");
        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();
        int suma = 0;

        input.close();

        for ( int i = 1; i <= numeroIntroducido; i++){

            System.out.println(i);
            suma = suma + i;
        }

        System.out.println("La suma total es: " + suma);
    }
    
}
