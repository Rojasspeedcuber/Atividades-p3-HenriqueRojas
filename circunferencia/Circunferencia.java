
package com.mycompany.circunferencia;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
        double distancia;
        int cont = 0;
        boolean resultado;
        Scanner in = new Scanner(System.in);
        while (cont < 6) {
            
            System.out.println("Informe o valor de x1: ");
            Pontos.x1 = in.nextDouble();
            System.out.println("Informe o valor de x2: ");
            Pontos.x2 = in.nextDouble();
            System.out.println("Informe o valor de y1: ");
            Pontos.y1 = in.nextDouble();
            System.out.println("Informe o valor de y2: ");
            Pontos.y2 = in.nextDouble();

            distancia = Pontos.distancia();

            System.out.println("Informe o valor do raio: ");
            Pontos.raio = in.nextDouble();

            resultado = Pontos.estaDentro(distancia);
            if (resultado == true) {
                System.out.println("O ponto está dentro da circunferência");
            } else {
                System.out.println("O ponto está fora da circunferência");
            }
        }
    }
}
    

