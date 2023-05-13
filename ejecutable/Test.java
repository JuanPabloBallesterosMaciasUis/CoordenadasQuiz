package ejecutable;

import modelo.Coordenadas;

public class Test {

    public static void main(String[] args) {

        Coordenadas c1 = new Coordenadas();
        Coordenadas c2 = new Coordenadas(1.3, 3.5);
        Coordenadas c3 = c1;
        Coordenadas c4 = c2;

        // Se imprime las cordenadas de c1 y c2
        System.out.println("X: " + c1.getX());
        System.out.println("Y: " + c1.getY());

        System.out.println("X: " + c2.getX());
        System.out.println("Y: " + c2.getY());

        if(c1.equals(c2))
        {
            System.out.println("Son iguales");
        }

        else
        {
            System.out.println("Son diferentes");
        }

        System.out.println("El días es "+ c1.getX());
        

    }
    
}