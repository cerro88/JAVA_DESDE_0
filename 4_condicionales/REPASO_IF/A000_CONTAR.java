
import java.util.Scanner;

public class A000_CONTAR {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        

        int numeroIntroducido = input.nextInt();
        input.close();

        System.out.println("------------------------------------");
        int contador = 0;

        for ( int i = 1; i <= numeroIntroducido; i++){

            if ( i % 2 != 0){
                contador++;
                System.out.println(i);
                
                
            }
        }

        System.out.println("El total de números impares és: " + contador);

    }
    
}
