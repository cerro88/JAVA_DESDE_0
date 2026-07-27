import java.util.Scanner;


public class P000_cajeroAutomatico {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double saldo = 1000;

        System.out.println("===================================");
        System.out.println("    CAJERO AUTOMÁTICO     ");
        System.out.println("===================================");

        /* 1 consultar saldo */
        System.out.println("Su saldo actual es de: " + saldo + "€");

        /* 2 Ingresar saldo */
        System.out.println("¿Desea ingresar dinero? (si/no)");
        String ingresar = input.next();

        if (ingresar.equalsIgnoreCase("si")){

            System.out.println("¿Cuánto dinero desea ingresar? ");
            double ingreso = input.nextDouble();

            System.out.println("Ingreso realizado correctamente.");

            saldo = saldo + ingreso;

        } else{

            System.out.println("No desea hacer ningún ingreso.");
        }

        System.out.println("Saldo actual: " + saldo + "€");

        /* 3 retirar saldo */
        System.out.println("¿Desea retirar dinero? (si/no)");
        String retirar = input.next();

        if (retirar.equalsIgnoreCase("si")){

             System.out.println("¿Cuánto dinero desea retirar? ");
            double retiro = input.nextDouble();
            /*3 comprobar saldo suficiente */
            if (saldo <= retiro){

                System.out.println("No dispone de saldo suficiente.");

            } else{
                saldo = saldo - retiro;
            }
         
        }else{

            System.out.println("No desea retirar efectivo.");
        }
        
        System.out.println("Saldo actual: " + saldo + "€");

        /* 4 Despedida */

        System.out.println(" Gracias por utilizar este cajero, que tenga un buen día.");
        input.close();



        
    }


    
}


/*

CORRECCIÓN

import java.util.Scanner;

public class P000_cajeroAutomatico {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double saldo = 1000;

        System.out.println("===================================");
        System.out.println("      CAJERO AUTOMÁTICO");
        System.out.println("===================================");

        // Consultar saldo
        System.out.println("Su saldo actual es de: " + saldo + " €");

        // Ingresar dinero
        System.out.print("\n¿Desea ingresar dinero? (si/no): ");
        String ingresar = input.next();

        if (ingresar.equalsIgnoreCase("si")) {

            System.out.print("¿Cuánto dinero desea ingresar?: ");
            double ingreso = input.nextDouble();

            saldo += ingreso;

            System.out.println("Ingreso realizado correctamente.");
        } else {

            System.out.println("No se ha realizado ningún ingreso.");

        }

        System.out.println("Saldo actual: " + saldo + " €");

        // Retirar dinero
        System.out.print("\n¿Desea retirar dinero? (si/no): ");
        String retirar = input.next();

        if (retirar.equalsIgnoreCase("si")) {

            System.out.print("¿Cuánto dinero desea retirar?: ");
            double retiro = input.nextDouble();

            if (retiro > saldo) {

                System.out.println("No dispone de saldo suficiente.");

            } else {

                saldo -= retiro;
                System.out.println("Retirada realizada correctamente.");

            }

        } else {

            System.out.println("No se ha realizado ninguna retirada.");

        }

        System.out.println("Saldo final: " + saldo + " €");

        System.out.println("\nGracias por utilizar nuestro cajero.");
        input.close();

    }

}*/

