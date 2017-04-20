/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author Paweł Głogowski
 */
public class Wektor {
    /**
     * Metoda dodająca dwa wektory
     * @param x
     * @param y 
     */
    static public void dodaj(double[] x, double[] y){
        if (x.length == y.length){
            for(int i=0; i<x.length; i++){
                x[i]=x[i]+y[i];
                System.out.println("x["+i+"]= "+x[i]);
            }
        }
        else {
            System.err.println("Wektory muszą mieć taką samą długość!");
        }
    } 
    /**
     * Metoda obliczająca iloczyn skalarny
     * @param x wektor
     * @param y wektor
     * @return il wynik iloczynu 
     */
    static public double skaler(double[] x, double[] y){
        double il = 0.0;
        if(x.length == y.length){
            for(int i=0; i<x.length; i++)
                il = il+x[i]*y[i];
        }
        else {
            System.err.println("Wektory muszą mieć taką samą długość!");
        }
        return il;
    }
    /**
     * Metoda obliczająca długość wektora
     * @param x wektor
     * @return długość wektora
     */
    static public double dlugosc(double[] x){
        double d = 0.0;
        for(int i=0; i<x.length; i++){
            d = d+Math.pow(x[i],2);
        }
        return Math.sqrt(d);
    }
    /**
     * Metoda wypisująca wartości wektora
     * @param x wektor
     */
    static public void wypisz(double[] x){
        for(int i=0; i<x.length; i++)
            System.out.print(x[i]+"   ");
        System.out.println();
    }
    /**
     * Metoda zaracająca wartości wektora
     * @param i indeks
     * @param x wektor
     * @return 
     */
    static public double getX(int i, double[] x) 
    { 
        return x[i]; 
    }
}
