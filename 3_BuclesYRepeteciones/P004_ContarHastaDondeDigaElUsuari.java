/*Crear un programa que pida al usuario un número entero.

Después deberá mostrar todos los números desde 1 hasta el
número introducido utilizando un bucle for.

*/

/*
Necesito:
importar scanner
llamar a scanner
pedir al usuario que introduzca un número entero
crear una variable tipo int que almacene el número del usuario 
cerrar scanner
crear un for que haga:
una variable i = 1
condición de que si i <= que numeroIntroducido
incremente 1
imprimir i

*/

import java.util.Scanner;

public class P004_ContarHastaDondeDigaElUsuari {
    
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();

        input.close();

        for ( int i = 1; i <= numeroIntroducido; i++){
            System.out.println(i);
        }
    }




}
