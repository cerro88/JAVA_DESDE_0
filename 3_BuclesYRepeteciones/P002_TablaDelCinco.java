/*Crear un programa que muestre la tabla de multiplicar del 5. */

/*Necesito:
Un bucle for que haga lo siguiente:
 Cree una variable tipo int que empiece por 1,
 Diga que si la variable es <= que 10
 incremente el valor de i en 1
 Imprimir el valor de i multiplicado por 5*/



public class P002_TablaDelCinco {
    public static void main(String[] agrs){
        for ( int i = 1; i <= 10; i++){
            System.out.println( i * 5);
        }
    }
}
