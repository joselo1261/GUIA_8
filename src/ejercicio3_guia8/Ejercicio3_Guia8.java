/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_guia8;

import ejercicio3_guia8.entidad.Persona;
import ejercicio3_guia8.servicios.PersonaServicio;


/**
 *
 * @author Joselo
 */
public class Ejercicio3_Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crear 4 objetos de tipo Persona con distintos valores, a continuación,
    // llamaremos todos los métodos para cada objeto, deberá comprobar si la
    // persona está en su peso ideal, tiene sobrepeso o está por debajo de su
    // peso ideal e indicar para cada objeto si la persona es mayor de edad.       
            
       PersonaServicio personaserv = new PersonaServicio();
                     
       Persona p1 = new Persona("Jose", 55, 'H', 100.7, 1.85);
       Persona p2 = new Persona("Maria", 25, 'M', 55, 1.68);
       Persona p3 = new Persona("Emiliano", 41, 'H', 85, 1.70);
       Persona p4 = new Persona("Giselle", 17, 'O', 65, 1.62);

       Persona[] personas = {p1, p2, p3, p4};
       
        
        for (Persona persona : personas) {
            System.out.println("\nNombre: " + persona.getNombre());
            System.out.println("Mayor de edad: " + (personaserv.esMayorDeEdad(persona) ? "Sí" : "No"));

            int imc = personaserv.calcularIMC(persona);
            switch (imc) {
                case -1:
                    System.out.println("Por debajo del peso ideal");
                    break;
                case 0:
                    System.out.println("Peso ideal");
                    break;
                case 1:
                    System.out.println("Tiene Sobrepeso !!!!");
                    break;
            }
        }
      
        personas[0]=new Persona("Jose", 55, 'H', 100.7, 1.85);
        personas[1]=new Persona("Maria", 25, 'M', 55, 1.68);
        personas[2]=new Persona("Emiliano", 41, 'H', 85, 1.70);
        personas[3]=new Persona("Giselle", 17, 'O', 65, 1.62);
        
        // Calcular un % de las personas: cuantas están por debajo de su peso,
        // cuantas en su peso ideal y cuantos, por encima
        Persona pers =new Persona(); 
        double cont1=0,cont0=0,contn1=0; 
             for (int i = 0; i < 4; i++) { 
                 if (personaserv.calcularIMC(personas[i])==1) { 
                 cont1++; 
                 }else if(personaserv.calcularIMC(personas[i])==0) {   
                  cont0++;    
                     }else{ 
                   contn1++; 
                 }
              }
        System.out.println(" ");
        System.out.println("Control de Peso"); 
        System.out.println("***************"); 
        System.out.println("Personas con sobrepeso: "+cont1+ " ,repesenta el "+ cont1/4*100+" % del total" );  
        System.out.println("Personas con peso ideal: "+cont0+" ,representa el "+ cont0/4*100+" % del total" ); 
        System.out.println("Personas con bajo peso: "+contn1+" ,representa el "+  contn1/4*100+" % del total"); 
        System.out.println(" "); 
        
        
        // Calcular un % de cuantas personas son mayores de edad y cuantos menores.
        double contmay=0,contmen=0; 
                for (int i = 0; i < 4; i++) { 
                    if (personaserv.esMayorDeEdad(personas[i])==true) { 
                 contmay++; 
                    }else{ 
                   contmen++; 
                 }
              }
        System.out.println(" ");
        System.out.println("Control de Edad"); 
        System.out.println("***************"); 
        System.out.println("Personas mayores de Edad: "+contmay+" ,representa el "+ contmay/4*100+" % del total" ); 
        System.out.println("Personas menores de Edad: "+contmen+" ,representa el "+  contmen/4*100+" % del total"); 
        System.out.println(" "); 
    }
}

  
    
