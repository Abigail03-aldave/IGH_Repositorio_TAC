
package Practicas;

import java.util.Scanner;

public class Prob_2 {
    //Programa para habllar el area del circulo
    
    public static void main(String[] args) {
        //variables
        float   radio, pi, area;
        Scanner lectura= new Scanner(System.in); 
       
        pi=(float) Math.PI;
        
        //Captura
        System.out.println("Ingrese radio");
        radio=lectura.nextInt();
        
        
        
        //Proceso
        area=(float) (pi*Math.pow(radio, 2));
        
        
        //Reporte
        System.out.println("El area del circulo con radio "+radio+" es: "+area);
        
        
    }
    
}
