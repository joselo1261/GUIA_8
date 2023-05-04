/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_guia8_extralarge.servicios;

import ejercicio7_guia8_extralarge.entidad.Autobus;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class AutobusServicio {
    Scanner sc = new Scanner(System.in);
    private Autobus autobus;
    
    
    // Método para crear un Autobús: se pedirá al usuario que ingrese los datos.
    public void crearAutobus() {
        System.out.print("Linea de Autobus Nro.: ");
        String identificacion = sc.nextLine();
        System.out.print("Capacidad Maxima de Pasajeros: ");
        int capacidadMaxima = sc.nextInt();
        System.out.print("Cantidad Actual de Pasajeros: ");
        int capacidadActual = sc.nextInt();
        System.out.print("Cantidad Paradas Recorrido: ");
        int cantidadParadas = sc.nextInt();
        
        autobus = new Autobus(identificacion, capacidadMaxima, capacidadActual, cantidadParadas);
    }   
    
    // Método inicioRecorrido(int cantidad), recibirá por parámetro la cantidad de personas que suben al autobús en el inicio del recorrido. 
    // La misma no debe superar la capacidad máxima del autobús.
    public void inicioRecorrido(int cantidad) {
        do {            
        if (cantidad <= autobus.getCapacidadMaxima()) {
            autobus.setCapacidadActual(cantidad);
            System.out.println("Se subieron al Autobus " + cantidad + " pasajeros en el inicio del recorrido.");
        } else {
            System.out.println("La cantidad de pasajeros no puede superar la capacidad máxima del autobús.");
            System.out.println("La misma es de: "+ autobus.getCapacidadMaxima());
        }
         } while (cantidad>autobus.getCapacidadMaxima());
    }
        
    // Método finRecorrido(), debe simular la finalización del recorrido
    // y por lo cual el autobús debe quedar vacío.  
    public void finRecorrido() {
        System.out.println("El recorrido ha finalizado. El autobús queda vacio.");
        autobus.setCapacidadActual(0);
        System.out.println("Capacidad Actual: "+autobus.getCapacidadActual());
    }
        
    // Método subirPasajeros(int cantidad, int parada), recibe por parámetro la cantidad de personas a subir y el número de parada.
    // En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada debe ejecutarse el método inicioRecorrido(int cantidad). 
    // En el caso que sea la última parada, debe informar al usuario que se encuentra en la finalización del recorrido y no pueden subir más pasajeros.
    // Si el número de parada es distinto al número de inicio y de finalización, debe subir a los pasajeros indicados, analizando la capacidad actual 
    // y verificando que no sobrepase la capacidad máxima. Solamente podrán subir pasajeros hasta cubrir la capacidad máxima.
    public void subirPasajeros(int cantidad, int parada) {
        if (parada == 1) {
            inicioRecorrido(cantidad);
        } else if (parada == autobus.getCantidadParadas()) {
            System.out.println("El autobús esta en su ultima parada. No pueden subir más pasajeros.");
        } else {
            int capacidadLibre = autobus.getCapacidadMaxima() - autobus.getCapacidadActual();
            if (cantidad <= capacidadLibre) {
                autobus.setCapacidadActual(autobus.getCapacidadActual() + cantidad);
                System.out.println("Se han subido " + cantidad + " pasajeros en la parada " + parada);
            } else {
                autobus.setCapacidadActual(autobus.getCapacidadMaxima());
                System.out.println("Solo pudieron subir " + capacidadLibre + " pasajeros en la parada " + parada);
            }
        }
        int paradaActual = parada;
    }
    
    // Método bajarPasajeros (int cantidad, int parada), recibe por parámetro la cantidad de personas a bajar del autobús y el número de paradas.
    // En primer lugar debe analizar el número de parada, si la misma corresponde a la primera parada, se debe informar al usuario que el autobús aún se encuentra vacío. 
    // En el caso que sea la última parada, se debe ejecutar el método finRecorrido().
    // Si el número de parada es distinto al número de inicio y de finalización, deben bajar los pasajeros indicados.
    public void bajarPasajeros(int cantidad, int parada) {
        if (parada == 1) {
            System.out.println("El autobús aun se encuentra vacío.");
        } else if (parada == autobus.getCantidadParadas()) {
            finRecorrido();
        } else {
            if (cantidad <= autobus.getCapacidadActual()) {
                autobus.setCapacidadActual(autobus.getCapacidadActual() - cantidad);
                System.out.println("Se han bajado " + cantidad + " pasajeros en la parada " + parada);
            } else {
                System.out.println("La cantidad de pasajeros a bajarse no puede ser mayor a la cantidad actual de pasajeros.");
            }
        }
        int paradaActual = parada;
    }
    
    
    // Método mostrarAutobus(), debe imprimir los datos del Autobus.
    public void mostrarAutobus() {
        System.out.println(" ");
        System.out.println("Autobus Nro.: " + autobus.getIdentificacion());
        System.out.println("Capacidad Maxima de Pasajeros: " + autobus.getCapacidadMaxima());
        System.out.println("Cantidad Actual de Pasajeros: " + autobus.getCapacidadActual());
        System.out.println("Cantidad Paradas Recorrido: " + autobus.getCantidadParadas());
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
