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
public class Wektor {
    private double[] a;
    /**
     * Konstruktor
     */
    public Wektor(){}
    /**
     * Metoda zwracająca dłuość tablicy 
     * @return a.length 
     */
    public int getLength(){
        return a.length;
    }
    /**
     * Metoda zwaracająca i-ty wyraz wektora
     * @param i numer wyrazu
     * @return 
     */
    public double getA(int i){
        return a[i];
    }
    /**
     * Konstruktor 
     * Jako parametr przyjmuje tablicę typu double
     * Kopiuje wartości z tablicy do składowych obiektu klasy Wektor 
     */
    public Wektor(double[] a)
    {
        this.a = new double[a.length];
        System.arraycopy(a, 0, this.a, 0,a.length);
    }
    /**
     * Konstruktor 
     * Wczytuje dane z wejścia i przypisuje je składowym obiektu klasy Wektor
     * Przyjmuje parametr typu int (wielkość tablicy)
     */
    public Wektor(int a) 
    {
        this.a = new double[a];
        for(int i=0;i<a;i++){
        Scanner in = new Scanner(System.in);
        System.out.print("  a["+i+"] = ");
        this.a[i]=in.nextDouble();
        }
    }
//******************************************************************************
   /**
    * Metoda dodająca dwa obiekty klasy Wektor
    * Jako parametr przyjmuje obiekt klasy Wektor
    * Wyświetla wyniki na wyjściu
    * wynik - tablica typu double 
    * Zwraca obiekt klasy wektor
    */
    public Wektor dodaj(Wektor a)
    {
        double[] wynik = new double[a.a.length];
        for(int i=0;i<a.a.length;i++)
        {
            wynik[i]=this.a[i]+a.a[i];
            System.out.println("Wynik["+i+"] = "+wynik[i]);
        }
        return new Wektor(wynik);
    }
    /**
     * Metoda obliczająca iloczyn skalarny
     * @param a wektor
     * @return il iloczyn skalarny  
     */
    public double skalar(double[] a)
    {
        double il = 0.0;
        for(int i=0;i<a.length;i++)
        il += this.a[i]*a[i];
        return il;
    }
    /**
     * Metoda obliczająca długość wektora 
     * dlugosc - zmienna typu double
     * Zwraca długość wektora (pierwiastek z wartości zmiennej dlugosc) typ double
     * 
     */
    public double dlugosc()
    {
        double dlugosc = 0;
        for(int i=0;i<this.a.length;i++)
        {
        dlugosc += Math.pow(this.a[i],2);
        }
        return Math.sqrt(dlugosc);
    }    
    /**
     * Metoda wypisująca składowe wektora
     */
    public void wypisz(){
        for(int i=0; i<a.length; i++)
            System.out.println("a["+i+"]= "+a[i]);
    }
}
