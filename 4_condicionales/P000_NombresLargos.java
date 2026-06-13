/*
 * EJERCICIO: NOMBRES LARGOS
 *
 * Crear un programa que pida al usuario una lista de nombres
 * separados por comas.
 *
 * El programa deberá:
 *
 * 1. Leer los nombres.
 * 2. Separarlos con split().
 * 3. Guardarlos en un array.
 * 4. Recorrer el array con un for.
 * 5. Mostrar únicamente los nombres que tengan más de 4 letras.
*/

/*
Necesito:
importar scanner
llamar a scanner 
pedir los datos al usuario
variable de tipo string nombresIntroducidos para guardar los datos
array tipo string nombres para separarlos con split
cerrar scanner 
un for que recorra la array
un condicional que diga que si el total de caracteres es mayor a 4 se muestren los nombres
*/

import java.util.Scanner;

public class P000_NombresLargos {

    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una lista de nombres separados por comas");

        String nombresIntroducidos = input.nextLine();

        String[] nombres = nombresIntroducidos.split(",");

        input.close();

        for ( int i = 0; i < nombres.length; i++ ){

            if (nombres[i].length() > 4) {
                
                System.out.println(nombres[i]);
            } 
        }

    }
    
}
