/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicas;

import java.util.Scanner;

/**
 *
 * @author Dangelo
 */
public class Prob_3 {
    //Suma de los N primeros numeros
    public static void main(String[] args) {
        //variables
        int cantidad, suma;
        Scanner lectura= new Scanner(System.in); 
        
        //Captura
        suma=0;
        System.out.println("Ingrese la cantidad:");
        cantidad=lectura.nextInt();
        
        //Proceso
        suma=cantidad*(cantidad+1)/2;
        
        //Reporte
        System.out.println("La suma de los "+cantidad+" primeros numeros es: "+suma);
    }
    
}
