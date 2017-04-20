/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author Paweł Głogowski
 */
public class Macierz {
      
    /**
     * Metoda dodająca dwie macierze 
     * @param x macierz
     * @param y macierz
     */
    static public void dodaj(double[][] x, double[][] y){
        if(x.length == y.length)
            for(int i=0; i<x.length; i++){
                for(int j=0; j<x[i].length; j++){
                    x[i][j] = x[i][j]+y[i][j];
                    System.out.print("   "+x[i][j]);
                }
                System.out.println();
            }
        else
            System.err.println("Wektory muszą mieć taką samą długość!");
    }
    /**
     * Metoda obliczająca mnożąca macierz przez wektor 
     * @param x wektor
     * @param y macierz
     */
    static public void iloczyn(double[] x, double[][] y){
        double[] il = new double[x.length];
        if(x.length == y.length){
            for(int i = 0; i<x.length; i++){
                for(int j=0; j<x.length; j++){   
                    il[i] += Wektor.getX(i, x) * y[i][j];
                }
                System.out.println("   "+il[i]);
            }
        }
    }
}
