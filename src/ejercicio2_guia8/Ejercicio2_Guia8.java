/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia8;

import ejercicio2_guia8.entidad.Cafetera;
import ejercicio2_guia8.servicios.CafeteraServicio;

/**
 *
 * @author Joselo
 */
public class Ejercicio2_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraServicio cafe = new CafeteraServicio();
        Cafetera cafetera = new Cafetera();   
        
        System.out.println("LLenar Cafetera");
        System.out.println("***************");
        cafe.llenarCafetera(cafetera);
        System.out.println(" ");
        
        System.out.println("Servir Taza Cafe");
        System.out.println("****************");
        cafetera.setCantidadActual(250); 
        cafe.servirTaza(cafetera,200); // Capacidad maxima de una taza de cafe 200 ml.
        System.out.println(" ");  
        
        System.out.println("Vaciar Cafetera");
        System.out.println("***************");
        cafe.vaciarCafetera(cafetera);
        System.out.println(" "); 
        
        System.out.println("Agregar Cafe Cafetera");
        System.out.println("*********************");
        cafetera.setCantidadActual(950);
        cafe.agregarCafe(cafetera,100);
        System.out.println(" "); 
        
                
    }
    
}
