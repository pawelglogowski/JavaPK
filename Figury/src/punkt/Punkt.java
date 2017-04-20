/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punkt;

/**
 *
 * @author pglogow
 */
public class Punkt {
    
    /**
     * @param args the command line arguments
     * 
     */
    private double x;
    private double y;
    public  Punkt(){}
    public Punkt(Punkt obj)
    {
        this.x=obj.x;
        this.y=obj.y;
    }
    /**
     * Konstruktor przyjmuje dwa parametry typu double x, y i przypisuje
     * wartości tych zmiennych do składowych klasy Punkt x , y;
     * @param x
     * @param y 
     */
    public Punkt(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    /**
     * 
     * @return
     * Metoda zwraca składową x klasy Punkt
     */
    public double getX()
    {
        return this.x;
    }
    /**
     * 
     * @return 
     * Metoda zwraca składową y klasy Punkt
     */
     public double getY()
    {
        return this.y;
    }
    /**
     * Metoda odleglosc oblicza odległość międy dwoma obiektami klasy Punkt.
     * Przyjmuje objekt typu Punkt. 
     * Zwraca odległość: v.
     * 
     */
    public double odleglosc(Punkt obj)
    {
        double v;
        v=Math.sqrt(Math.pow(this.x-obj.x,2)+Math.pow(this.y-obj.y,2));

        return v; 
    }
    /**
     * Metoda zwraca składowe klasy Punkt jako String
     * @return 
     */
    @Override
    public String toString()
    {
        return "("+x+","+y+")";
    }

}
