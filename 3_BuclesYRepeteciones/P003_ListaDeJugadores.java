/*
 * EJERCICIO: LISTA DE JUGADORES CON FOR
 *
 * Crear un programa que pida al usuario una lista de jugadores
 * separados por comas en una única línea.
 *
 * El programa deberá:
 *
 * 1. Leer la lista de jugadores introducida por el usuario.
 * 2. Separar los nombres utilizando la coma como separador.
 * 3. Guardar los jugadores en un array.
 * 4. Utilizar un bucle for para recorrer el array completo.
 * 5. Mostrar todos los jugadores uno debajo de otro.
 *
 * Ejemplo de entrada:
 * Messi,Yamal,Pedri,Lewandowski,Raphinha
 *
 * Ejemplo de salida:
 * Messi
 * Yamal
 * Pedri
 * Lewandowski
 * Raphinha
 *
 * No se permite utilizar un System.out.println()
 * para cada jugador. Debe utilizarse un bucle for.
 */


/*
Necesito:
importar scanner
llamar a scanner
pedir al usuario que introduzca una lista de jugadores separados por , 
crear una variable string jugadoresLista donde se guarden los datos
crear una array jugadores string donde con split se separen los objetos
crear un bucle for que haga lo siguiente:
que diga que i es = a 0
una condición que diga que mientras i sea menor que jugadores.length
que incremente el valor de i en 1
imprimir jugadores[i]*/
import java.util.Scanner;

public class P003_ListaDeJugadores {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una lista de jugadores separados por una coma: ");

        String jugadoresLista = input.nextLine();

        String[] jugadores = jugadoresLista.split(",");

        input.close();

        for ( int i = 0; i < jugadores.length ; i++){
            System.out.println("-" + jugadores[i]);
        }


    }

    

}