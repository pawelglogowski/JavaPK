/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author Paweł Głogowski
 */
public class Test {
    
    public static void main(String[] args){
        double[] x={2,2};
        double[] y={2,2};
        
        System.out.println("Dodawanie wektorów:");
        Wektor.dodaj(x,y);
        System.out.println("Iloczyn skalarny:");
        System.out.println(Wektor.skaler(x, y));
        System.out.println("Długość wektora:");
        System.out.println(Wektor.dlugosc(x));
        
        double[][] xx = new double[2][2];
        xx[0][0]=2;
        xx[0][1]=2;
        xx[1][0]=2;
        xx[1][1]=2;
        double[][] xy = new double[2][2];
        xy[0][0]=2;
        xy[0][1]=2;
        xy[1][0]=2;
        xy[1][1]=2;
        System.out.println("Dodawanie macierzy:");
        Macierz.dodaj(xx,xx);
        System.out.println("Mnożenie macierzy przez wektor:");
        Macierz.iloczyn(y, xy);
        
    }
}
