package com.liliana.cajero;

public class Usuario {
    private static String name;
    private static String password;

    public Usuario(String _name, String _password){
        name = _name;
        password = _password;
    }

    public String getName(){
        return Usuario.name;   
    }

    public String getPassword(){
        return Usuario.password;   
    }
}
