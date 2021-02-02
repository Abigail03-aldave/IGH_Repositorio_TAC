//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo1;

import java.util.Scanner;

public class problema9 {
    public problema9() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la velocidad del coche:");
        int velocidad = sc.nextInt();
        System.out.println("Ingrese la distancia a recorrer:");
        int distancia = sc.nextInt();
        int tiempo = distancia / velocidad;
        System.out.println("El importe que haria la promoción es: " + tiempo);
    }
}
