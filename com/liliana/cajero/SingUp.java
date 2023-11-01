package com.liliana.cajero;

import java.util.Scanner;

public class SingUp {
    public static void singUp() {
        //Instancia de la clase Scanner
        Scanner teclado = new Scanner(System.in);
       //Definición de variables
        String usuario;
        String contrasena;

        //Procedimiento 
        do {
            System.out.print("Ingrese su usuario: ");
            usuario = teclado.nextLine();
        } while (usuario.length() == 0);

        do {
            System.out.print("Ingrese su contraseña: ");
            contrasena = teclado.nextLine();
        } while (contrasena.length() == 0);

        
        boolean isCreated = Database.createUser(usuario, contrasena);

        if(isCreated){
            System.out.println("***********************************");
            System.out.println("¡Usuario registrado correctamente!");
            System.out.println("Usuario: " + usuario);
            System.out.println("Contraseña: "+ contrasena);
            System.out.println("***********************************");
        } else {
            System.out.println("***********************************");
            System.out.println("¡Error al registrar el usuario!");
            System.out.println("***********************************");
        }

        Main.PrintMenu();
        teclado.close();
    }
}
