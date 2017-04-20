/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punkt;

import java.util.Comparator;

/**
 *
 * @author pglogow
 */
public class Trojkat {
    private Punkt a;
    private Punkt b;
    private Punkt c;
/**
 * Konstruktor przyjmuje trzy parametry typu Punkt i przypisuje 
 * ich wartość składowym klasy Trojkat.
 * @param a
 * @param b
 * @param c 
 */
    public Trojkat(Punkt a, Punkt b, Punkt c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Trojkat(){}
     
//    public double wysokosc()
//    {
//        double h;
//        
//        return h;
//    }
    /**
     * Metoda obliczająca pole trójkąta.
     * p - połowa obwodu trójkąta
     * P - pole trójkąta
     * @return P 
     */
    public double pole()
    {
        double P, p;
        p=0.5*(a.odleglosc(b)+b.odleglosc(c)+c.odleglosc(a));
        
        P=Math.sqrt(p*(p-a.odleglosc(b))*(p-b.odleglosc(c))*(p-c.odleglosc(a)));
        return P;
    }
    /**
     * Metoda obliczająca obwód trójkąta
     * O - obwód trójkąta
     * @return O
     */
    public double obwod()
    {
        double O;
        O=a.odleglosc(b)+b.odleglosc(c)+c.odleglosc(a);
        return O;
    }
    /**
     * Metoda zwraca składowe obiektu klasy Trojkat
     * @return 
     */
    @Override
    public String toString()
    {
        return "a = "+a.toString()+" b = "+b.toString()+" c = "+c.toString();
    }

    public void kolor()
    {
        
    }
/**
 * 
 * 
 */
   public void rysuj()
    {
        System.out.print("Rysuję trojkat");
    }
}
/**
 * Klasa Porównująca 
 * @author Rysiek
 */
class porownajDouble implements Comparator<Trojkat>
{
    /**
     * Metoda proównuje obiekty klasy Trojkat 
     * Jako kryterium przyjmuje wynik zwracany przez metodę pole().
     * Jako parametry przyjmuje dwa obiekty klasy Trojkat
     * Zwraca najmniejszy wynik
     */
    @Override
    public int compare(Trojkat a, Trojkat b)
    {
        double aa = a.pole();
        double bb = b.pole();
        return aa == bb ? 0 : ( aa < bb ? -1 : 1);
    }
}