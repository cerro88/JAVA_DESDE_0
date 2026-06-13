/*
Crear un programa que pida al usuario una lista de nombres
separados por comas.

El programa deberá:

1. Leer los nombres introducidos.
2. Separarlos utilizando split().
3. Guardarlos en un array.
4. Utilizar un bucle for para recorrer el array.
5. Mostrar cada nombre precedido por su número de orden.

*/

/*
Necesito:
importar scanner
llamar a scanner
pedir los datos al usuario
crear una variable tipo string 'nombreIntroducidos'
crear una array tipo string 'nombres' que haga split por coma
cerrar scanner
Crear un for:
- int i = 0
- i < que nombres.length
- incremente i en 1

imprimir el valor de i + 1 seguido por un punto y nombre
*/







import java.util.Scanner;

public class P005_ListaNumerada {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una lista de nombres separada por coma: ");

        String nombresIntroducidos = input.nextLine();

        String[] nombre = nombresIntroducidos.split(",");

        input.close();

        for( int i = 0; i < nombre.length; i++){

            System.out.println( (i + 1) + "." + " " + nombre[i]);
        }

    }
}
