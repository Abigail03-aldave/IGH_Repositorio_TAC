//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo1;

import java.util.Scanner;

public class problema8 {
    public problema8() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes:");
        int nroe = sc.nextInt();
        System.out.println("Ingrese el costo por persona:");
        int costo = sc.nextInt();
        int importe = nroe * costo;
        System.out.println("El importe que haria la promoción es: " + importe);
    }
}
