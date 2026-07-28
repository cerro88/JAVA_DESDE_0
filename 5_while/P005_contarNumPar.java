
import java.util.Scanner;

public class P005_contarNumPar {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int i = 0;

        System.out.println("Introduce un número entero positivo: ");

        int numeroUsuario = input.nextInt();
     

        while ( i <= numeroUsuario){
        

            System.out.println(i);
             i = i + 2;
           
        }
         input.close();


    }
}

    
