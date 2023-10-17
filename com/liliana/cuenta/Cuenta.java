


package com.liliana.cuenta;

/**
 *
 * @author lilianabeatrizmusi
 */

//Creación de métodos 
class Cuenta {
    //Declaración e inicialización de variable
    private double balance;

    public Cuenta() {
        balance = 0.0;
    }

    public double verBalance() {
        return balance;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
            System.out.println("Depositado: $ + cantidad");
        } else {
            System.out.println("Monto a depositar inválido");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= balance) {
            balance -= cantidad;
            System.out.println("Retirado: $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes para realizar la operación");
        }
    }
}

    

