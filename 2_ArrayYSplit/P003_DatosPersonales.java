/*
 * EJERCICIO: DATOS PERSONALES
 *
 * Crear un programa que pida al usuario sus datos personales
 * en una única línea separados por comas.
 *
 * El programa deberá:
 *
 * 1. Leer los datos introducidos por el usuario.
 * 2. Separar los datos utilizando la coma como separador.
 * 3. Mostrar el nombre.
 * 4. Mostrar la edad.
 * 5. Mostrar la ciudad.
 * 6. Mostrar cuántos datos ha introducido el usuario.
 *
 * Ejemplo de entrada:
 * Belén,37,Muro
 *
 * Ejemplo de salida:
 * Nombre: Belén
 * Edad: 37
 * Ciudad: Muro
 * Has introducido 3 datos.
 */

/*Necesitio:
*   - importar scanner +
    - crear el scanner para leer los datos introducidos +
    - pedir información al usuario en cierto orden, por ejemplo + 
        nombre, apellidos,edad, lugar de residencia
    - crear una variable tipo string llamada datosUsuario para guardar los datos  + 
    - crear una array tipo string llamada datos que me separe los datos por comas (SPLIT) +
    - Imprimir los tres datos que me pide el enunciado
    - Imprimir el total de datos 
    - cerrar scanner */


import java.util.Scanner;


public class P003_DatosPersonales {

   public static void main(String[] args){

     Scanner input = new Scanner(System.in);

     System.out.println("Introduce tus datos (Nombre, Apellidos, edad, Lugar de residencia) separados por comas: ");

     String datosUsuario = input.nextLine();

     String[] datos = datosUsuario.split(",");

     System.out.println("Nombre: " + datos[0]);
     System.out.println("Apellidos: " + datos[1]);
     System.out.println("Edad: " + datos[2]);
     System.out.println("Residencia: " + datos[3]);

     System.out.println("El total de datos introducidos por el usuario son: " + datos.length + ".");

     input.close();

     

     
   }


    
}
