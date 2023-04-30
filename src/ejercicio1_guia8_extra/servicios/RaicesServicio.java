/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia8_extra.servicios;

import ejercicio1_guia8_extra.entidad.Raices;

/**
 *
 * @author Joselo
 */
public class RaicesServicio {

    // Método getDiscriminante(): devuelve el valor del discriminante
    // (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c  
    public double getDiscriminante(Raices raices){
        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
     
    }    
        
    // Método tieneRaices(): devuelve un booleano indicando si tiene dos
    // soluciones, para que esto ocurra, el discriminante debe ser mayor o
    // igual que 0.   
    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices)>= 0;
   }
    
    // Método tieneRaiz(): devuelve un booleano indicando si tiene una
    // única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }
    
    // Método obtenerRaices(): llama a tieneRaices() y si devolvio true,
    // imprime las 2 posibles soluciones.
    // Fórmula ecuación 2o grado: (-b ± √ ((b^2)-(4*a*c))) / (2*a) 
    // Solo varía el signo delante de -b
    public void obtenerRaices(Raices raices) {
        
        if (tieneRaices(raices)) {
            double x1 = (-raices.getB()+Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            double x2 = (-raices.getB()-Math.sqrt(getDiscriminante(raices))) / (2 * raices.getA());
            System.out.println("Las raíces son: x1 = " + x1 + ", x2 = " + x2);
        }
    }
    
    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvio ́true imprime
    // una única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices raices) {
        
        if (tieneRaiz(raices)) {
            double x = -raices.getB() / (2 * raices.getA());
            System.out.println("La raíz única es: x = " + x);
        }else{
            System.out.println("NO tiene Raiz");
        }
        
    }
        
        
    // Método calcular(): este metodo llamara a tieneRaices() y a tieneRaíz(),
    // y mostrara por pantalla las posibles soluciones que tiene nuestra
    // ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    // que devuelvan nuestros métodos y en caso de no existir solución, se
    // mostrará un mensaje.    
    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No hay solución real para la ecuación.");
        }
    }   
    
      
    }
    
