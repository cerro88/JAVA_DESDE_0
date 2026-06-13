/*
 * EJERCICIO: EQUIPO DE FÚTBOL
 *
 * Crear un programa que pida al usuario una lista de jugadores
 * separados por comas en una única línea.
 *
 * El programa deberá:
 *
 * 1. Leer la lista de jugadores.
 * 2. Separar los nombres utilizando la coma como separador.
 * 3. Mostrar el primer jugador.
 * 4. Mostrar el segundo jugador.
 * 5. Mostrar el último jugador.
 * 6. Mostrar el número total de jugadores introducidos.
 *
 * Ejemplo de entrada:
 * Messi,Yamal,Pedri,Lewandowski,Raphinha
 *
 * Ejemplo de salida:
 * Primer jugador: Messi
 * Segundo jugador: Yamal
 * Último jugador: Raphinha
 * Hay 5 jugadores.
 */



import java.util.Scanner;


public class P002_EquipoFutbol {
    public static void main(String[] args){
        //leer info
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce una lista de jugadores de futbol separados por comas:");
        //Guarda texto que introduce el usuario en una string
        String jugadoresTexto = input.nextLine();
        //array de tipo string donde pido separación por comas
        String[] jugadores = jugadoresTexto.split(",");

        System.out.println("Primer jugador: " + jugadores[0]);
        System.out.println("Segundo jugador: " + jugadores[1]);
        System.out.println("Último jugador: " +  jugadores[jugadores.length - 1]);
        System.out.println("En total hay " + jugadores.length + " jugadores.");
        //cierre de scanner
        input.close();

    }

    
}
