



import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el primer número entero: ");
        int primerNum = input.nextInt();
        System.out.println("Introduce el segundo número entero: ");
        int segundoNum = input.nextInt();

        input.close();

        if (primerNum > segundoNum){
            System.out.println("El primer número introducido es el mayor.");
        
        } else if (segundoNum > primerNum ){
            System.out.println("El segundo número introducido es el mayor");
        } else {
            System.out.println("Los números introducidos son iguales.");
        }

    }
}
