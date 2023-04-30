/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia8_extra;

import ejercicio1_guia8_extra.entidad.Raices;
import ejercicio1_guia8_extra.servicios.RaicesServicio;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio1_guia8_extra {

    /**
    https://acortar.link/ymEeP4  <= Link ejercicios y respuestas
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Ingrese a , b y c");
        double a=sc.nextDouble(); 
        double b=sc.nextDouble(); 
        double c=sc.nextDouble();
        Raices ecuacion = new Raices(a, b, c);
        RaicesServicio serv = new RaicesServicio();
        
        System.out.println("Valores");
        System.out.println("*******");
        System.out.println("a= "+ecuacion.getA()+" , b= "+ecuacion.getB()+" , c= "+ecuacion.getC());
        System.out.println(" ");
        
        System.out.println("Discriminante");
        System.out.println("*************");
        System.out.println("Formula= (b^2)-4*a*c");
        System.out.println(serv.getDiscriminante(ecuacion));
        System.out.println(" ");
        
        System.out.println("Tiene Raices");
        System.out.println("************");
        if(serv.tieneRaices(ecuacion)){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        System.out.println(" ");
        
        System.out.println("Tiene Raiz Unica ?");
        System.out.println("******************");
        if(serv.tieneRaiz(ecuacion)){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        System.out.println(" ");
        
        System.out.println("Obtener Raices");
        System.out.println("**************");
        serv.obtenerRaices(ecuacion);
        System.out.println(" ");
        
        System.out.println("Obtener Raiz");
        System.out.println("**************");
        serv.obtenerRaiz(ecuacion);
        System.out.println(" ");
        
        System.out.println("Calcular");
        System.out.println("********");
        serv.calcular(ecuacion);
        System.out.println(" ");
        
        
    }
}
        
        

