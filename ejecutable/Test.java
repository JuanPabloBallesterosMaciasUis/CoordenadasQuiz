package ejecutable;

import modelo.Coordenadas;

public class Test {

    public static void main(String[] args) {

        Coordenadas c1 = new Coordenadas();
        Coordenadas c2 = new Coordenadas(1.3, 3.5);
        Coordenadas c3 = c1;
        Coordenadas c4 = c2;

        // Se imprime las cordenadas de c1 y c2
        System.out.println("Coordenada c1 X: " + c1.getX());
        System.out.println("Coordenada c1 Y: " + c1.getY());

        System.out.println("---------------------");

        System.out.println("Coordenada c2 X: " + c2.getX());
        System.out.println("Coordenada c2 Y: " + c2.getY());

        System.out.println("---------------------");

        // Se imprime el toString de c1 y c2
        System.out.println("Coordenada c1: " + c1.toString());
        System.out.println("Coordenada c2: " + c2.toString());

        System.out.println("---------------------");

        if(c1.equals(c2))
        {
            System.out.println("Son iguales c1 y c2");
        }

        else
        {
            System.out.println("Son diferentes c1 y c2");
        }

        // Distancia entre c1 y c2
        System.out.println("La distancia entre c1 y c2 es: " + c1.distancia(c2));        

    }
    
}