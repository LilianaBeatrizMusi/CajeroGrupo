package com.liliana.cajero;

/**
 *
 * @author lilianabeatrizmusi
 */

//Creación de métodos 
public class Cuenta {
    //Declaración e inicialización de variable
    private double balance;

    public double resetBalance() {
        balance = 0.0;
        return balance;
    }

    public double verBalance() {
        return balance;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
            System.out.println("Depositado: $" + cantidad);
        } else {
            System.out.println("Monto a depositar inválido");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= balance) {
            balance -= cantidad;
            System.out.println("Transferido: $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes para realizar la operación");
        }
    }
}

    

