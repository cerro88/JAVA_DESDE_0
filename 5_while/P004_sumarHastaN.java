
import java.util.Scanner;

public class P004_sumarHastaN {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int i = 1;

        System.out.println("Introduce un número entero positivo: ");

        int numeroUsuario = input.nextInt();
        int suma = 0;

        while ( i <= numeroUsuario){
            
            suma = suma + i;

            i++;

            System.out.println(suma);

           
        }
         input.close();


    }
}
