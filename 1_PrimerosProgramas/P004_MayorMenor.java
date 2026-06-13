import java.util.Scanner;


public class P004_MayorMenor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
       
        System.out.println("¿Cuántos años tienes?");
         int edad = teclado.nextInt();
        
         if (edad >= 67){
             System.out.println("Estas en edad de jubilación");
           
         }
         else if (edad >= 18){
             System.out.println("Eres mayor de edad");
         }
         else{
            System.out.println("Eres menor de edad");
         }

         teclado.close();


    }
}
