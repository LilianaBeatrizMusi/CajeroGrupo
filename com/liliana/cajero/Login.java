package com.liliana.cajero;

import java.util.Scanner;

public class Login {

    public static void login() {
        Scanner teclado = new Scanner(System.in);
        int intentos = 3; // Número de intentos permitidos

        while (intentos > 0) {
            System.out.print("Ingrese su usuario: ");
            String usuarioIngresado = teclado.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String contraseñaIngresada = teclado.nextLine();

            boolean isUserExist = Database.isUserExists(usuarioIngresado, contraseñaIngresada);

            System.out.println("isUserExist: " + isUserExist);
            if (isUserExist) {
                System.out.println("***********************************");
                System.out.println("¡Bienvenido al Cajero Automático!");
                System.out.println("***********************************");
                Cajero cajero = new Cajero();
                cajero.Caja();
                break; // Sale del bucle si las credenciales son correctas.

            } else {
                System.out.println("Su usuario o contraseña son incorrectos.");
                intentos--;
                System.out.println("Le restan " + intentos + " intentos.");

            }
        }
        //Simulacro de bloqueo de la cuenta
        if (intentos == 0) {
            System.out.println("****Inténtenlo más tarde***");

        }
        teclado.close();
    }
}
