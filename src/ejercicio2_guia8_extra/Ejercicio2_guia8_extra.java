/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia8_extra;

import ejercicio2_guia8_extra.entidad.NIF;
import ejercicio2_guia8_extra.sevicios.NIFService;
import java.util.Arrays;

/**
 *
 * @author Joselo
 */
public class Ejercicio2_guia8_extra {

    public static void main(String[] args) {
        NIFService nifServ = new NIFService();
        
        NIF nif = nifServ.crearNif();
        
        int Posicion[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        char Letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println(" ");
        System.out.println("Posiciones");
        System.out.println("**********");
        System.out.println(Arrays.toString(Posicion));
        System.out.println(" ");
        System.out.println("Letras");
        System.out.println("******");
        System.out.println(Arrays.toString(Letras));
        System.out.println("");
            
        System.out.println("Resto division DNI / 23 = "+nif.getDni()%23);
        System.out.println(" ");
        
        System.out.println("Calcular letra");
        System.out.println("**************");
        System.out.println(nifServ.calcularLetra(nif.getDni()));
        System.out.println(" ");
               
        System.out.println("Metodo impresion con String format");
        System.out.println("**********************************");
        System.out.println(nifServ.mostrar(nif));
        System.out.println(" ");
        
        System.out.println("Metodo impresion con StringBuilder");
        System.out.println("**********************************");
        System.out.println(nifServ.toString());
        System.out.println(" ");
        
    }
}
         
        
       
