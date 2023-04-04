package com.mycompany.equacao2grau;

import java.util.Scanner;

public class Equacao2grau {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        System.out.println("Informe o valor do coeficiente 'a' da equação: ");
        a = in.nextDouble();
        System.out.println("Informe o valor do coeficiente 'b' da equação: ");
        b = in.nextDouble();
        System.out.println("Informe o valor do coeficiente 'c' da equação: ");
        c = in.nextDouble();
        // a * Math.pow(x, 2) + b * x + c
        delta = Math.pow(b, 2) + (-4 * (a * c));
        if (delta >= 0) {
            x1 = ((-(b) + Math.sqrt(delta)) / (2 * a));
            x2 = ((-(b) - Math.sqrt(delta)) / (2 * a));

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("Delta não possui raiz!");
        }
    }
}
