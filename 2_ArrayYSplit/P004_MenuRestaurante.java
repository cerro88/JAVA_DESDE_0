/*
 * EJERCICIO: MENÚ DE RESTAURANTE
 *
 * Crear un programa que pida al usuario una lista de platos
 * separados por comas.
 *
 * El programa deberá:
 *
 * 1. Leer la lista de platos.
 * 2. Separarlos utilizando la coma como separador.
 * 3. Mostrar el primer plato.
 * 4. Mostrar el plato central.
 * 5. Mostrar el último plato.
 * 6. Mostrar el número total de platos.
 *
 * Ejemplo de entrada:
 * Ensalada,Sopa,Paella,Tarta,Café
 *
 * Ejemplo de salida:
 * Primer plato: Ensalada
 * Plato central: Paella
 * Último plato: Café
 * Total de platos: 5
 */

/*
*Necesito:
* Importar Scanner
* Crear Scanner para leer los datos del usuario
* Pedir al usuario que introduzca los platos elegidos separados por comas
* Crear una variable tipo string donde se almacene el MenuElegido
* Crear una array tipo string 'Menu' que separe los datos (split) por comas
* Imprimir primer central último y total de datos introducidos
* Scanner cerrar
 */


import java.util.Scanner;


public class P004_MenuRestaurante {
    public static void main(String[] args){

    System.out.println("MENÚ DEL DÍA");
    System.out.println("ENTRANTES: Ensalada, Entremeses, Pan ali oli.");
    System.out.println("PRIMEROS:, Sopa fria de melón, Sopa de pollo, Crema de calabacín.");
    System.out.println("SEGUNDOS:, Paella, Pollo al horno, Merluza en salsa verde.");
    System.out.println("POSTRES:, Tarta de Manzana, Helado, Fruta fresca.");
    System.out.println("Cafés o infusiones:, Café solo/con leche/cortado, Té verde/rojo/manzanilla.");
    System.out.println("*****************************");
    Scanner input = new Scanner(System.in);
    System.out.println("Bienvenido!\nIntroduzca su elección de platos separado por coma: ");
    String menuElegido = input.nextLine();
    String[] menu = menuElegido.split(",");
    System.out.println("Entrante: " + menu[0]);
    System.out.println("Segundo: " + menu[2]);
    System.out.println("Último: " + menu[4]);
    System.out.println("El total de platos introducidos por el usuario son: " + menu.length + ".");
    input.close();

         

    }    
}
