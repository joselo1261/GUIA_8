/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia8.servicios;

import ejercicio3_guia8.entidad.Persona;
import java.util.Scanner;


/**
 *
 * @author Joselo
 */
public class PersonaServicio {
    
    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La
    // función devuelve un booleano. 
    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
      
    // Metodo crearPersona(): el método crear persona, le pide los valores
    // de los atributos al usuario y después se le asignan a sus respectivos
    // atributos para llenar el objeto Persona. Además, comprueba que el
    // sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
    // deberá mostrar un mensaje
    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Nombre: ");
        String nombre = sc.nextLine();
        System.out.println(" ");
        System.out.print("Ingrese Edad: ");
        int edad = sc.nextInt();
        System.out.println(" ");
        System.out.print("Ingrese Sexo (H/M/O): ");
        char sexo = sc.next().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.print("Sexo incorrecto. Ingrese sexo (H/M/O): ");
            sexo = sc.next().charAt(0);
            System.out.println(" ");
        }
        System.out.print("Ingrese Peso en Kg.: ");
        double peso = sc.nextDouble();
        System.out.println(" ");
        System.out.print("Ingrese Altura en mts.: ");
        double altura = sc.nextDouble();
        System.out.println("");

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    // Método calcularIMC(): calculara si la persona está en su peso ideal
    // (peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
    // valor menor que 20, significa que la persona está por debajo de su
    // peso ideal y la función devuelve un -1. Si la fórmula da por resultado
    // un número entre 20 y 25 (incluidos), significa que la persona está en
    // su peso ideal y la función devuelve un 0. Finalmente, si el resultado
    // de la fórmula es un valor mayor que 25 significa que la persona tiene
    // sobrepeso, y la función devuelve un 1.
    public int calcularIMC(Persona persona) {
        // Funcion potencia Math.pow(numero,potencia);
        double imc = persona.getPeso()/Math.pow(persona.getAltura(), 2);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    } 
     
}
    
    
    
    
    
    
    




    

