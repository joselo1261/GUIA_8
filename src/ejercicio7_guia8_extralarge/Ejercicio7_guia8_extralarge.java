/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_guia8_extralarge;

import ejercicio7_guia8_extralarge.servicios.AutobusServicio;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio7_guia8_extralarge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutobusServicio autobusServ = new AutobusServicio();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do { 
            System.out.println("  ");
            System.out.println("---- MENU AUTOBUS ----");
            System.out.println("======================");
            System.out.println("1. Crear Autobus");
            System.out.println("2. Iniciar recorrido");
            System.out.println("3. Subir pasajeros");
            System.out.println("4. Bajar pasajeros.");
            System.out.println("5. Finalizar recorrido");
            System.out.println("6. Mostrar Autobus");
            System.out.println("7. Salir");
            System.out.println(" ");
            System.out.print("Ingrese una Opción: ");
            System.out.println(" ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    autobusServ.crearAutobus();
                    break;
                case 2:
                    System.out.println("Cuantas personas suben al Autobus ? ");
                    int cant=sc.nextInt();
                    autobusServ.inicioRecorrido(cant);
                    break;
                case 3:
                    System.out.println("Cuantas personas suben al Autobus ?");
                    int cant1=sc.nextInt();
                    System.out.println("En que parada se encuentra ?");
                    int parada=sc.nextInt();
                    autobusServ.subirPasajeros(cant1,parada);
                    break;
                case 4:
                    System.out.println("Cuantas personas bajan del Autobus ?");
                    int cant2=sc.nextInt();
                    System.out.println("En que parada se encuentra ?");
                    int parada1=sc.nextInt();
                    autobusServ.bajarPasajeros(cant2,parada1);
                    break;
                case 5:
                    autobusServ.finRecorrido();
                    break;
                case 6:
                    autobusServ.mostrarAutobus();
                    break;
                case 7:
                    System.out.println("Ud. esta saliendo del programa");
                    break;
                default:
                    System.out.println("Opción incorrecta, intente nuevamente");
                    break;
            }
        } while (opcion != 7);
    }
       
}