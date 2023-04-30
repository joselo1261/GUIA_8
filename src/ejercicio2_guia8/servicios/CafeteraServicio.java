/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia8.servicios;

import ejercicio2_guia8.entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class CafeteraServicio {
    Cafetera cafetera = new Cafetera(); 
    
    // Método llenarCafetera(): hace que la cantidad actual sea igual a la
    // capacidad máxima.
    public void llenarCafetera(Cafetera cafetera) { 
        System.out.println("Cantidad Actual: "+ cafetera.getCantidadActual()+ " ml.");
        System.out.println("Capacidad Maxima: "+ cafetera.getCapacidadMaxima()+ " ml.");
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Cantidad Actual despues llenado: "+ cafetera.getCantidadActual()+ " ml.");
}
 
    
    // Método servirTaza(int): se pide el tamaño de una taza vacía, el
    // método recibe el tamaño de la taza y simula la acción de servir la
    // taza con la capacidad indicada. Si la cantidad actual de café “no
    // alcanza” para llenar la taza, se sirve lo que quede. El método le
    // informará al usuario si se llenó o no la taza, y de no haberse llenado
    // en cuanto quedó la taza.
    public void servirTaza(Cafetera cafetera, int tamTaza) {
        int cantFalta = cafetera.getCantidadActual() - tamTaza;
        if (cantFalta >= 0) {
            cafetera.setCantidadActual(cantFalta);
            System.out.println("La cantidad que falta es " + cantFalta+ " ml.");
            System.out.println("La taza se llenó completamente.");
        } else {
            cafetera.setCantidadActual(0);
            System.out.println("La taza no se llenó completamente. ");
            System.out.println("Quedó con " + (tamTaza + cantFalta) + " ml.");
        }
    }
    
    // Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cafetera) { 
	cafetera.setCantidadActual(0); 
        System.out.println("Cantidad Actual: "+ cafetera.getCantidadActual()+ " ml.");
} 

    
    // Método agregarCafe(int): se le pide al usuario una cantidad de café,
    // el método lo recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cafetera, int cantCafe) {
        int cant = cafetera.getCantidadActual() + cantCafe;
        if (cant <= cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cant);
            System.out.println("Cantidad Actual de cafe "+cant+ " ml.");
        } else {
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
            System.out.println("Se agregó la cantidad máxima posible");
            System.out.println("Quedaron " + (cant - cafetera.getCapacidadMaxima()) + " ml sin agregar.");
        }
    }
} 

     

        
        
        
        
        
        
        
 
