import java.util.Scanner;
import java.time.LocalDate;


public class P006_CalculaEdadPro {
    public static void main(String[] args) {

        LocalDate hoy = LocalDate.now();

        int anoActual = hoy.getYear();
        int mesActual = hoy.getMonthValue();
        int diaActual = hoy.getDayOfMonth();
    

        Scanner input = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = input.nextLine();

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa):");
        String fechaNacimiento = input.nextLine();

        String[] partes = fechaNacimiento.split("/");

        int diaNacimiento = Integer.parseInt(partes[0]);
        int mesNacimiento = Integer.parseInt(partes[1]);
        int anoNacimiento = Integer.parseInt(partes[2]);

        int edad = anoActual - anoNacimiento;

        if (mesNacimiento > mesActual){
            edad--;
        } else if (mesNacimiento == mesActual &&  diaNacimiento > diaActual){
            edad--;
        }

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        input.close();

            
    }
}