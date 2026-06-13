import java.util.Scanner;


public class P005_CalculaEdad {
    public static void main(String[] args) {

        int anoActual = 2026;
        int mesActual = 6;

        Scanner input = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String name = input.nextLine();

        System.out.println("¿Cuántos años tienes?");
        int age = input.nextInt();

        System.out.println("¿En qué mes naciste?");
        int mesNacimiento = input.nextInt();

        int anoNacimiento;

        if (mesNacimiento > mesActual) {
            anoNacimiento = anoActual - (age + 1);
        } else {
            anoNacimiento = anoActual - age;
        }

        System.out.println("Hola " + name + ", naciste en el año " + anoNacimiento);

        input.close();
    }
}
