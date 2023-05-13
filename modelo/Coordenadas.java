package modelo;

public class Coordenadas {

    // Atributos
    private double x;
    private double y;
    

    // Métodos
    public Coordenadas() 
    {

    }

    public Coordenadas(double x, double y) 
    {
        this.x = x;
        this.y = y;
    }

    // Getters y Setters

    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    // toString  (x,y)
    public String toString() 
    {
        return "(" + this.x + "," + this.y + ")";
        
    }

    // equals 
    public boolean equals(Coordenadas c) 
    {
        return this.x == c.x && this.y == c.y;
    }

    // Distancia entre dos puntos del plano
    public double distancia(Coordenadas c) 
    {
        return Math.sqrt(Math.pow(this.x - c.x, 2) + Math.pow(this.y - c.y, 2));
    }
    
    
    
}
