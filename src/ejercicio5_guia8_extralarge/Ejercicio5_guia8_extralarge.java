/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia8_extralarge;

import ejercicio5_guia8_extralarge.entidad.Tarea;
import ejercicio5_guia8_extralarge.servicios.TareaServicio;

/**
 *
 * @author Joselo
 */
public class Ejercicio5_guia8_extralarge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TareaServicio tareaserv = new TareaServicio();
        Tarea tarea = tareaserv.crearTarea();
        
        tareaserv.modificarEstado(tarea);
        System.out.println(" ");
        tareaserv.analizarEstado(tarea);
        System.out.println(" ");
        tareaserv.visualizarDatos(tarea);
        System.out.println(" ");
        
              
    }
    
}
