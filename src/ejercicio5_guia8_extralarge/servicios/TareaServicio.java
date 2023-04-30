/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia8_extralarge.servicios;
import ejercicio5_guia8_extralarge.entidad.Tarea;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class TareaServicio {
    Scanner sc = new Scanner(System.in);
    // Método para crear una Tarea: se pedirá al usuario que ingrese el título y la descripción.
    // Por defecto, al crear una tarea se tiene que asignar el valor de true al atributo estado,
    // esto indicará que la tarea está en proceso.
    public Tarea crearTarea() {
        System.out.println("Ingrese el título de la tarea:");
        String titulo = sc.nextLine();
        System.out.println("Ingrese la descripción de la tarea:");
        String descripcion = sc.nextLine();
        return new Tarea(titulo,descripcion,true); // <== Se asigna true al estado por defecto
    }
    
    // Método para modificar el estado a false, esto indicará que la tarea está terminada.
    public void modificarEstado(Tarea tarea) {
        tarea.setEstado(false);
    }

    // Método para analizar si el estado de la tarea y que muestre si la misma está en proceso o terminada.
    public void analizarEstado(Tarea tarea) {
        if (tarea.isEstado()) {
            System.out.println("Tarea en proceso.");
        } else {
            System.out.println("Tarea terminada.");
        }
    }
    
    // Método para visualizar los datos de la Tarea.
    public void visualizarDatos(Tarea tarea) {
        System.out.println("Título: " + tarea.getTitulo());
        System.out.println(" ");
        System.out.println("Descripción: " + tarea.getDescripcion());
        System.out.println(" ");
        System.out.println("Estado: " + (tarea.isEstado() ? "En proceso" : "Terminada"));
        System.out.println(" ");
    }
    
    
    
    
    
    
    
    
    
}
