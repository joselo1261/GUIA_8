/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_guia8_extralarge;

import ejercicio6_guia8_extralarge.servicios.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio6_guia8_extralarge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServicio productoServ = new ProductoServicio();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("  ");
            System.out.println("----- MENU PRODUCTOS -----");
            System.out.println("==========================");
            System.out.println("1. Crear producto");
            System.out.println("2. Comprar producto");
            System.out.println("3. Ver unidades disponibles");
            System.out.println("4. Vender producto");
            System.out.println("5. Visualizar producto");
            System.out.println("6. Salir");
            System.out.println(" ");
            System.out.print("Ingrese una Opción: ");
            System.out.println(" ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    productoServ.crearProducto();
                    break;
                case 2:
                    System.out.println("Ingrese cantidad a comprar: ");
                    int cantidad=sc.nextInt();
                    System.out.println("Ingrese el precio unitario pagado: ");
                    Double precio=sc.nextDouble();
                    productoServ.comprarProducto(cantidad,precio);
                    break;
                case 3:
                    productoServ.unidadesDisponibles();
                    break;
                case 4:
                    System.out.print("Ingrese cantidad a vender: ");
                    System.out.println(" ");
                    cantidad=sc.nextInt();
                    productoServ.venderProducto(cantidad);
                    break;
                case 5:
                    productoServ.visualizarProducto();
                    break;
                case 6:
                    System.out.println("Ud. esta saliendo del programa");
                default:
                    System.out.println("Opción incorrecta, intente nuevamente");
            }
        } while (opcion != 6);
    }
       
}
   
