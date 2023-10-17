package com.liliana;

public class Transferencia {
    
        public static void main(String[] args) {
            CuentaBancaria cuentaOrigen = new CuentaBancaria("Cuenta Origen", 1000.0);
            CuentaBancaria cuentaDestino = new CuentaBancaria("Cuenta Destino", 500.0);
    
            System.out.println("Saldo inicial de la cuenta origen: " + cuentaOrigen.getSaldo());
            System.out.println("Saldo inicial de la cuenta destino: " + cuentaDestino.getSaldo());
    
            double montoATransferir = 200.0;
    
            if (cuentaOrigen.transferirDinero(cuentaDestino, montoATransferir)) {
                System.out.println("Transferencia exitosa");
            } else {
                System.out.println("La transferencia no pudo realizarse debido a fondos insuficientes");
            }
    
            System.out.println("Saldo final de la cuenta origen: " + cuentaOrigen.getSaldo());
            System.out.println("Saldo final de la cuenta destino: " + cuentaDestino.getSaldo());
        }
    }
    
    class CuentaBancaria {
        private String titular;
        private double saldo;
    
        public CuentaBancaria(String titular, double saldoInicial) {
            this.titular = titular;
            this.saldo = saldoInicial;
        }
    
        public double getSaldo() {
            return saldo;
        }
    
        public boolean transferirDinero(CuentaBancaria cuentaDestino, double monto) {
            if (saldo >= monto) {
                saldo -= monto;
                cuentaDestino.saldo += monto;
                return true;
            } else {
                return false;
            }
        }
    }
    
    

