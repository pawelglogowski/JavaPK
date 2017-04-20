/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punkt;

import java.util.Comparator;

/**
 *
 * @author Rysiek
 */
public class Czworokat {
    private Punkt a;
    private Punkt b;
    private Punkt c;
    private Punkt d;
    public Czworokat()
    {
        
    }
    /**
     * Konstróktor 
     * Jako parametry przyjmuje obiekty klasy Punkt
     * @param a
     * @param b
     * @param c
     * @param d 
     */
    public Czworokat(Punkt a, Punkt b, Punkt c, Punkt d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    /**
     * Metoda obliczająca pole czworokąta za pomocą metody odleglosc() z klasy 
     * Punkt. Dzieli czworokąt na dwa trójkąty, oblicza ich pola i dodaje
     * do siebie.
     * P - pole czworokąta
     * p - połowa obwodu trójkąta
     * p1 - pole trójkąta pierwszego
     * p2 - pole trójkąta drugiego
     * Zwraca pole czworokąta 
     */
    public double pole()
    {
        double P, P1, P2;
        double p, p1;
        
        p=0.5*(a.odleglosc(b)+b.odleglosc(c)+c.odleglosc(a));
        p1=0.5*(a.odleglosc(c)+c.odleglosc(d)+d.odleglosc(a));
        P1=Math.sqrt(p*(p-a.odleglosc(b))*(p-b.odleglosc(c))*(p-c.odleglosc(a)));
        P2=Math.sqrt(p1*(p1-a.odleglosc(c))*(p1-c.odleglosc(d))*(p1-d.odleglosc(a)));
        P=P1+P2;
        return P;
    }
    /**
     * Metoda obliczająca obwód czworokąta za pomocą metody odleglosc() z klasy
     * Punkt.
     * O - obwód
     * zwraca wartość zmiwnnej O
     * @return 
     */
     public double obwod()
     {
         double O;
         O=a.odleglosc(b)+b.odleglosc(c)+c.odleglosc(d)+d.odleglosc(a);
         return O;
     }
     /**
      * Metoda obliczająca przekątną czworokąta
      * d - przekątna
      * zwraca wartość przekątnej
      * @return 
      */
     
     public double przekatna()
     {
         double d;
         d = this.a.odleglosc(this.c);
         return d;
     }
     
    @Override
     public String toString()
    {
        return "a = "+a.toString()+" b = "+b.toString()+" c = "+c.toString()+
               " d = "+d.toString();
    }
     public void rysuj()
    {
        System.out.print("Rysuję czworokąt");
    }
}
class porownajDouble2 implements Comparator<Czworokat>
{
    /**
     * Metoda proównuje obiekty klasy Czworokat 
     * Jako kryterium przyjmuje wynik zwracany przez metodę pole().
     * Jako parametry przyjmuje dwa obiekty klasy Czworokat
     * Zwraca najmniejszy wynik
     */
    @Override
    public int compare(Czworokat a, Czworokat b)
    {
        double aa = a.pole();
        double bb = b.pole();
        return aa == bb ? 0 : ( aa < bb ? -1 : 1);
    }
}