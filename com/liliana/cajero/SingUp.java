package com.liliana.cajero;

import java.util.Scanner;

import javax.xml.crypto.Data;

public class SingUp {
    public static void singUp() {
        Scanner teclado = new Scanner(System.in);
        String usuario;
        String contrasena;

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
