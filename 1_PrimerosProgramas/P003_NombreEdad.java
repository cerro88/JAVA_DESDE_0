import java.util.Scanner;

public class P003_NombreEdad {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
         String nombre = input.nextLine();

        System.out.println("¿Cuántos años tienes?");
         int edad = input.nextInt();

        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años.");

        input.close();
    }
}


