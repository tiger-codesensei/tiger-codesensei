/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.CuentaBancaria to edit this template
 */
package Taller1;

/**
 *
 * @author VP
 */
public class CuentaBancaria {
    // Propiedades de la clase
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // 1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // 2. Constructor parametrizado con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; // Saldo inicial por defecto
        this.tipoCuenta = tipoCuenta;
    }

    // 3. Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar los detalles
    @Override
    public String toString() {
        return "Detalles de la Cuenta Bancaria: " +
               "\nNúmero de Cuenta: " + numeroCuenta +
               "\nSaldo: $" + saldo +
               "\nTipo de Cuenta: " + tipoCuenta;
    }
}