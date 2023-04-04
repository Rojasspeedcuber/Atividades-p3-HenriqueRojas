
package com.mycompany.circunferencia;

class Pontos {
    public static double x1,x2,y1,y2,raio;
    
    public static double distancia(){
        double distancia;
        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return Math.abs(distancia);
    }
    
    public static boolean estaDentro(double distancia){
        if (distancia <= raio){
            return true;
        }
        return false;
    }
}
