/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia8.servicios;

import ejercicio1_guia8.entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class CuentaBancariaServicio {
// a) Método para crear cuenta pidiéndole los datos al usuario.
// b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
// se le sumará al saldo actual.
// c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
// restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
// retirar se retirará el máximo posible hasta dejar la cuenta en 0.
// d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
// Validar que el usuario no saque más del 20%.
// e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
// f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    // Método para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crearCuenta() {
        System.out.print("Ingrese número de cuenta: ");
        int numeroCuenta = sc.nextInt();
        System.out.print("Ingrese DNI del cliente: ");
        long dniCliente = sc.nextLong();
        System.out.print("Ingrese Saldo actual: ");
        double saldoActual = sc.nextDouble();
        System.out.println("..............................................");
        System.out.println(" ");
        
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
        return cuenta;
    }   
    
    //Método ingresar: recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        System.out.println("Cuanto desea ingresar: ");
        cantidad=sc.nextInt();
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += cantidad;
        cuenta.setSaldoActual(saldoActual);
        System.out.println("Ha ingresado: " + cantidad + " a la cuenta.");
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println(" ");
    }
    
    
    // Método retirar: recibe una cantidad de dinero a retirar y se le
    // restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    // retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public void retirar(CuentaBancaria cuenta, double cantidad) {
        System.out.println("Cuanto desea retirar: ");
        cantidad=sc.nextInt();
        double saldoActual = cuenta.getSaldoActual();
        if (cantidad > saldoActual) {
            cantidad = saldoActual;
        }
        saldoActual -= cantidad;
        cuenta.setSaldoActual(saldoActual);
        System.out.println("Ha retirado: " + cantidad + " de la cuenta.");
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println(" ");
    }
    
    // Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    // Validar que el usuario no saque más del 20%.
    public void extraccionRapida(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        double limiteExtraccion = saldoActual * 0.2;
        System.out.print("Cuanto desea retirar(maximo de " + limiteExtraccion + "): ");
        double cantidad = sc.nextDouble();
        if (cantidad > limiteExtraccion) {
            cantidad = limiteExtraccion;
        }
        saldoActual -= cantidad;
        cuenta.setSaldoActual(saldoActual);
        System.out.println("Ha retirado: " + cantidad + " de la cuenta.");
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println(" ");
    }
    
    // Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    public void consultarSaldo(CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println(" ");
    }
    
    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    public void consultarDatos(CuentaBancaria cuenta) {
        int numeroCuenta = cuenta.getNumeroCuenta();
        long dniCliente = cuenta.getDniCliente();
        double saldoActual = cuenta.getSaldoActual();
        System.out.println("Número Cuenta: " + numeroCuenta);
        System.out.println("DNI Cliente: " + dniCliente);
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println(" ");
    }
       
}
