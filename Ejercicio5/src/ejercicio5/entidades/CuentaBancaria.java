/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades;

/**
 *
 * @author adria
 */
public class CuentaBancaria {
  int numeroCuenta;
  long DNICliente;
  int saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int DNICliente, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.DNICliente = DNICliente;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
  
  

}
