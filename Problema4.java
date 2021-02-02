//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Modulo1;

import java.util.Scanner;

public class problema4 {
    public problema4() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        int n1 = sc.nextInt();
        System.out.println("Ingrese el numero 2:");
        int n2 = sc.nextInt();
        System.out.println("Ingrese el numero 3:");
        int n3 = sc.nextInt();
        float media = (float)((n1 + n2 + n3) / 3);
        System.out.println("El promedio aritmetico de los números ingresados es:" + media);
    }
}
