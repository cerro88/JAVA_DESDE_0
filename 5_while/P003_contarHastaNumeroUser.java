
import java.util.Scanner;

public class P003_contarHastaNumeroUser {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero = 1;

        System.out.println("Introduce un número entero positivo: ");

        int numeroUsuario = input.nextInt();

        while ( numero <= numeroUsuario ){

            System.out.println(numero);

            numero ++;
        }
         input.close();


    }
}
