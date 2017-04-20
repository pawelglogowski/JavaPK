/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wektor;
import java.util.Scanner;
/**
 *
 * @author Paweł Głogowski
 */
public class Macierz {
    /** Macierz **/
    private double[][] aa;
    
    public Macierz(){}
    /**
     * Konsturktor 
     * Jako parametry przyjmuje dwie zmienne typu int ( wielkości tablicy n x m)
     * Wczytuje dane z wejścia i przypisuje je składowym obiektu klasy Macierz
     * @param n
     * @param m 
     */
    public Macierz(int n, int m)
    {
        aa = new double[n][m];
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                Scanner in = new Scanner(System.in);
                System.out.print("  A["+i+"]"+"["+j+"] = ");
                this.aa[i][j]=in.nextDouble();        
            }
        }
        
    }
    /**
     * Konstruktor
     * Jako parametr przyjmuje tablicę dwuwymiarową typu double 
     * Kopiuje wartości tablicy do tablicy A obiektu klasy Macierz
     * @param a 
     */
    public Macierz(double[][] a)
    {
       this.aa = new double[a.length][a.length];
        for(int i=0;i<a.length;i++){
              for(int j=0;j<a.length;j++){
                 System.arraycopy(a, 0, this.aa, 0,a.length);
              }
        }
    }
    /**
     * Metoda dodająca dwa obiekty klasy Macierz.
     * Jako parametr przyjmuje obiekt klasy Macierz.
     * Sprawdza czy tablice obiektów są takiej samej wielkości i dodaje składowe
     * obiektów.
     * Zwraca obiekt klasy Macierz.
     */
    public Macierz dodaj(Macierz A)
    {
        
        double[][] Wynik = new double[A.aa.length][A.aa.length] ;
        if(this.aa.length == A.aa.length){
                for(int i=0;i<A.aa.length;i++){
                    for(int j=0;j<A.aa.length;j++){
                        Wynik[i][j]=A.aa[i][j]+this.aa[i][j];
                        System.out.println("A+B["+i+"]["+j+"] = "+Wynik[i][j]);
                    }
                } 
            }
        return new Macierz(Wynik);
    }
    /**
     * Metoda mnożąca macierz przez wektor
     * @param x wektor
     * @return Wektor
     */
    public Wektor iloczyn(Wektor x){
        double[] il = new double[x.getLength()];
        if( this.aa.length == x.getLength()){
            for(int i=0; i<x.getLength(); i++)
                for(int j=0; j<x.getLength(); j++)
                    il[i]+=aa[i][j]*x.getA(i);
        }
        else 
           System.err.println("Liczba kolumn macierzy musi być równa wielkości wektora");
        return new Wektor(il);
    }
    /**
     * Metoda wypisująca składowe macierzy
     */
    public void wypisz(){
        for(int i=0; i<aa.length; i++)
            for(int j=0; j<aa.length; j++)
            System.out.println("a["+i+"]"+"["+j+"]= "+aa[i][j]);
    }
}