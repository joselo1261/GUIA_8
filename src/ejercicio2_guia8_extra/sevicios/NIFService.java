/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia8_extra.sevicios;

import ejercicio2_guia8_extra.entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class NIFService {
    NIF nif = new NIF();
    
    
    // Metodo array (vector) de los caracteres.
    // https://acortar.link/Eoq4fg <== Link
    private static final char[] Letras = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };
    
      
    // Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
    // letra que le corresponderá. Una vez calculado, le asigna la letra que
    // le corresponde según cuadro.   
    public NIF crearNif() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de DNI: ");
        long dni = sc.nextLong();
        char letra = calcularLetra(dni);
        nif.setDni(dni);
        nif.setLetra(letra);
        return nif;
    }
        
    // Metodo para calcular la letra se toma el resto de dividir el número de DNI por 23
    // (el resultado debe ser un número entre 0 y 22).
    // Buscar en el vector de caracteres la posición que corresponda al resto de la división para
    // obtener la letra correspondiente.
    public char calcularLetra(long dni) {
        int posicion = (int) (dni % 23);
        return Letras[posicion];
    }
    
    
    // Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
    // guion y la letra en mayúscula; por ejemplo: 00395469-F).
    // https://www.javatpoint.com/java-string-format <== Link imprimir caracteres
    public String mostrar(NIF nif) {
        return String.format("%d-%s",nif.getDni() , nif.getLetra());
    }
      
    
    // Metodo que devuelve un String de la forma 88888888-A
    // https://www.javatpoint.com/StringBuilder-class <== Link 
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nif.getDni());sb.append("-");sb.append(nif.getLetra());
        return sb.toString();
    }
}    
  
    
    
    
    
    
    
    
    
    
    
