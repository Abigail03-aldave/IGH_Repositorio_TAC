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
public class Prob_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //variables
        float lado1, lado2, lado3, semip, area;
        Scanner lectura= new Scanner(System.in); 
        
        //Captura
        semip=0;
        System.out.println("Ingrese los lados del triangulo:");
        lado1=lectura.nextFloat();
        lado2=lectura.nextFloat();
        lado3=lectura.nextFloat();
        
        //Proceso
        semip=(lado1+lado2+lado3)/2;
        
        area=(float) Math.pow(  semip*(semip-lado1)*(semip-lado2)*(semip-lado3) , 0.5);
        
        
        //Reporte
        System.out.println("El area del triangulo es: "+area);
    }
    
}
