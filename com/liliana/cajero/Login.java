package com.liliana.cajero;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuarioCorrecto = "usuario"; // usuario correcto
        String contraseñaCorrecta = "contraseña"; // contraseña correcta
        int intentos = 3; // Número de intentos permitidos

        while (intentos > 0) {
            System.out.print("Ingrese su usuario: ");
            String usuarioIngresado = teclado.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String contraseñaIngresada = teclado.nextLine();

            if (usuarioIngresado.equals(usuarioCorrecto) && contraseñaIngresada.equals(contraseñaCorrecta)) {
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
