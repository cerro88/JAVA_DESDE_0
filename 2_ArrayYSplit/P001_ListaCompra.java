/*
 * EJERCICIO: LISTA DE LA COMPRA
 *
 * Crear un programa que pida al usuario una lista de productos
 * separados por comas en una única línea.
 *
 * El programa deberá:
 *
 * 1. Leer la lista introducida por el usuario.
 * 2. Separar cada producto utilizando la coma como separador.
 * 3. Mostrar el primer producto de la lista.
 * 4. Mostrar el último producto de la lista.
 * 5. Mostrar el número total de productos introducidos.
 *
 * Ejemplo de entrada:
 * pan,leche,huevos,queso
 *
 * Ejemplo de salida:
 * Primer producto: pan
 * Último producto: queso
 * Hay 4 productos.
 */


import java.util.Scanner;

public class P001_ListaCompra {
   
    public static void main(String[] args){
        // Scanner para leer información del user.
        Scanner input = new Scanner(System.in);

        // Mensaje para el usuario.
        System.out.println("Introduce los productos de tu lista separados por comas: ");

        //Guardamos los productos en una variable
        String lista = input.nextLine();

        //Dividir el texto cada vez que haya una coma
        String[] productos = lista.split(",");

        //Mostramos el primer y último producto
        System.out.println("Primer producto: " + productos[0]);
        System.out.println("Último producto: " + productos[productos.length - 1]);

        System.out.println("Hay " + productos.length + " productos.");

        input.close();

        


    }
    
}
