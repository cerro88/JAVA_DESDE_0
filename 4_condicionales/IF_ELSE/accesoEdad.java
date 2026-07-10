/*
 * EJERCICIO: ACCESO SEGÚN LA EDAD
 *
 * Crear un programa que pida la edad de una persona.
 *
 * El programa deberá:
 *
 * 1. Si tiene 18 años o más, mostrar:
 *    "Acceso permitido."
 *
 * 2. Si tiene entre 16 y 17 años, preguntar si tiene autorización.
 *    - Si responde "si", permitir el acceso.
 *    - Si responde "no", denegar el acceso.
 *
 * 3. Si es menor de 16 años, denegar el acceso.
 *
 * EXTRA:
 * El programa debe aceptar "si", "SI", "Si" o "sI" utilizando
 * equalsIgnoreCase().
 */

import java.util.Scanner;

public class accesoEdad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce tu Edad: ");
        int edad = input.nextInt();

        if (edad >= 18) {

            System.out.println("Acceso permitido.");

        } else if (edad >= 16 && edad <= 17) {

            System.out.println("¿Tiene autorización? (si/no)");
            String autorizacion = input.next();

            /*
             * equalsIgnoreCase() compara dos textos ignorando
             * las mayúsculas y las minúsculas.
             *
             * Ejemplos válidos:
             * si
             * SI
             * Si
             * sI
             */

            if (autorizacion.equalsIgnoreCase("si")) {

                System.out.println("Acceso permitido con la autorización.");

            } else {

                System.out.println("Acceso denegado por falta de autorización.");

            }

        } else {

            System.out.println("Acceso denegado.");

        }

        input.close();

    }

}