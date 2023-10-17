
package com.liliana.cajero;

/**
 * @author lilianabeatrizmusi
 */

 
import java.util.Scanner;

public class Cajero { 

    public static void main(String[] args) {
        //Creación de objetos teclado y teclado1
        Scanner teclado = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);

        //Declaración e inicialización de variables
        double balance = 0.00;
        double cantidad;
        String opcion;
        String seguir = "si"; //variable para generar un bucle hasta que sea diferente a "SI"

        //Creación del menú usuario
        while (seguir.equalsIgnoreCase("si")) {
            System.out.println("Menu:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Transferir");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opción");
            opcion = teclado1.nextLine();

            //Proceso con switch
            switch (opcion) {
                case "1":
                    System.out.println("El saldo es de: $" + balance);
                    break;
                case "2":
                    System.out.print("Ingrese el monto que desea depositar: $ ");
                    cantidad = teclado.nextDouble();
                    if (cantidad > 0) {
                        balance += cantidad;
                        System.out.println("Depositado: $" + cantidad);
                    } else {
                        System.out.println("Monto a depositar inválido");
                        
                    } 
                    break;               
                case "3":
                    System.out.print("Ingrese el monto a transferir: $ ");
                    cantidad = teclado.nextDouble();
                    if (cantidad > 0 && cantidad <= balance) {
                        balance -= cantidad;
                        System.out.println("La tranferencia de $ " + cantidad + " se realizó con éxito");
                    } else {
                        System.out.println("Fondos insuficientes para realizar la operación");                        
                    }
                    break;


                case "4":
                    System.out.println("Gracias por usar nuestro cajero automático");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Opción inválida. Por favor intente nuevamente.");
            }
            System.out.println("¿Quiere volver al MENU? si/NO");
            seguir = teclado1.nextLine();
            if (seguir.equalsIgnoreCase("no")) {
                System.out.println("¿No quiere realizar otra operación?");
                seguir = teclado1.nextLine();

            }
            
            //Borra consola
            System.out.print("\033[H\033[2J");  
            System.out.flush(); 

        }
        teclado.close();
        teclado1.close();

    }

}
