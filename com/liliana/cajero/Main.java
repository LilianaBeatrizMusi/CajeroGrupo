package com.liliana.cajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintMenu();
    }

    public static void PrintMenu() {
        Integer opcion = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido");

        do {
            System.out.println("Elija el número de opción que corresponda");
            System.out.println("1. Ingresar");
            System.out.println("2. Registrarse");
            try {
                String ingreso = teclado.nextLine();
                opcion = Integer.parseInt(ingreso);
              } catch (NumberFormatException e) {
              }
        } while (opcion < 1 || opcion > 2);

        if (opcion == 1) {
            System.out.println("Cargando Login");
            Login.login();
        }

        if (opcion == 2) {
            System.out.println("Cargando SingUp");
            SingUp.singUp();
        }

        teclado.close();
    }
}
