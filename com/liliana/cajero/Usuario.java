package com.liliana.cajero;

public class Usuario {
    //Declaración de variables
    private static String name;
    private static String password;

    //Método constructor
    public Usuario(String _name, String _password){
        name = _name;
        password = _password;
    }

    //Getters
    public String getName(){
        return Usuario.name;   
    }

    public String getPassword(){
        return Usuario.password;   
    }
}
