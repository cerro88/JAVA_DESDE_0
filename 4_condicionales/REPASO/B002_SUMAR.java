import java.util.Scanner;

public class B002_SUMAR{

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("    SUMAR MULTIPLOS DE 3 Y 5       ");
        System.out.println("===================================");
        System.out.println("Introduce un número entero: ");

        int numeroIntroducido = input.nextInt();
        int suma = 0;
        
        

        input.close();

        for ( int i = 1; i <= numeroIntroducido; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                suma = suma + i;
            }
        }

        System.out.println("La suma total es: " + suma);
    }
    
}