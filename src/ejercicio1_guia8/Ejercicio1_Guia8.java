/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia8;

import ejercicio1_guia8.entidad.CuentaBancaria;
import ejercicio1_guia8.servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio1_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        CuentaBancariaServicio serv = new CuentaBancariaServicio();
        CuentaBancaria cuenta = serv.crearCuenta();
               
        int opcion;
                      
        do {
            System.out.println("Elija una opcion ");
            System.out.println("-----------------");
            System.out.println("1- Consultar Saldo");
            System.out.println("2- Ingresar dinero");
            System.out.println("3- Retirar dinero");
            System.out.println("4- Extraccion rapida");
            System.out.println("5- Consultar datos");
            System.out.println("6- Salir");
            System.out.println("------------------");
            System.out.println(" ");
        
        opcion=sc.nextInt();
            switch(opcion){
                case 1:
                System.out.println(" ");
                serv.consultarSaldo(cuenta);
                System.out.println(" ");
                break;
                case 2:
                serv.ingresar(cuenta,0);   
                System.out.println(" ");
                break;
                case 3:
                serv.retirar(cuenta,0);
                System.out.println(" ");
                break;
                case 4:
                serv.extraccionRapida(cuenta);
                System.out.println(" ");
                break;
                case 5:
                serv.consultarDatos(cuenta);
                System.out.println(" ");
                break;
                case 6:
                System.out.println(" ");
                System.out.println("Gracias !! Por operar con nuestro banco");
                System.out.println(" ");
                break;    
            }
                      
            } while (opcion !=6);
          
    }
    }       
 