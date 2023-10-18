package com.liliana.cajero;

import java.util.ArrayList;

public class Database {
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private static Database miBaseDeDatos;

    public static Database getDatabase(String url, String baseDatos) {
        if (miBaseDeDatos == null) {
            miBaseDeDatos = new Database();
        }
        return miBaseDeDatos;
    }

    // public Usuario getUser(String name,String password) {
    //     Usuario user = new Usuario(name, password);
    //     return usuarios.contains(user);
    // }

    // public static boolean isUserExists(String name, String password) {
    //     System.out.println(usuarios);
    //     // Usuario user = new Usuario(name, password);
    //     System.out.println("+: " + name);
    //     System.out.println("-: " + password);
    //     boolean _isUserExists = false;
        
    //     usuarios.forEach(new Consumer <Usuario> () {
    //         @Override
    //         public void accept(final Usuario usuario) {

    //             System.out.println(usuario.getName());
    //             System.out.println(usuario.getPassword());

    //             if(
    //                 name == usuario.getName() && 
    //                 password == usuario.getPassword()
    //             ){
    //                 _isUserExists = true;
    //             }
    //         }
    //     });

    //     return _isUserExists;
    // }

    // private ArrayList<Usuario> getUsuarios(){
    //     return usuarios;
    // }

    public static boolean isUserExists(String name, String password) {
        System.out.println(usuarios);
        boolean _isUserExists = false;

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getName());
            System.out.println(usuario.getPassword());

            if (name.equals(usuario.getName()) && password.equals(usuario.getPassword())) {
                _isUserExists = true;
                break; // No need to continue checking
            }
        }

        return _isUserExists;
    }

    public static boolean createUser(String nombre, String password) {
        Usuario nuevoUsuario = new Usuario(nombre, password);
        return usuarios.add(nuevoUsuario);
    }
}
