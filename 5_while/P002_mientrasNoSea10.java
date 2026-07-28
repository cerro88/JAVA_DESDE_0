import java.util.Scanner;

public class P002_mientrasNoSea10 {
    
   public static void main(String[] args) {
    

    int numeroCorrecto = 10;
    Scanner input = new Scanner(System.in);

    System.out.println("Introduce un número entero: ");
    int numero = input.nextInt();

  


    while ( numero != numeroCorrecto){

        System.out.println("Introduce un número entero: ");
        numero = input.nextInt();


    }
    input.close();

    System.out.println("¡Correcto!");

   }

   

}
