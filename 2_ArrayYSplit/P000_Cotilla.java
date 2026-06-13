// Importamos Scanner para poder leer datos que escriba el usuario.
import java.util.Scanner;

// La clase debe llamarse igual que el archivo: Cotilla.java.
public class P000_Cotilla {

    // El método main es el punto de entrada del programa.
    // Todo lo que queramos ejecutar va dentro de estas llaves.
    public static void main(String[] args){

        // Creamos un Scanner para leer información desde el teclado.
        Scanner input = new Scanner(System.in);

        // Mostramos un mensaje para que el usuario sepa qué debe introducir.
        System.out.println("Introduce tres nombres separados por comas: ");

        // Guardamos todo lo que escriba el usuario en una variable String.
        // Ejemplo: "Emma,Mar,Belén"
        String name = input.nextLine();

        // Dividimos el texto cada vez que encontramos una coma.
        // El resultado se guarda en un array de String.
        // jugadores[0] = Emma
        // jugadores[1] = Mar
        // jugadores[2] = Belén
        String[] jugadores = name.split(",");

        // Mostramos cada posición del array por separado.
        System.out.println("Nombre 1: " + jugadores[0]);
        System.out.println("Nombre 2: " + jugadores[1]);
        System.out.println("Nombre 3: " + jugadores[2]);

        // Mostramos cuántos elementos contiene el array.
        System.out.println("Hay " + jugadores.length + " nombres.");

        // Cerramos el Scanner porque ya no vamos a leer más datos.
        input.close();
    }
}