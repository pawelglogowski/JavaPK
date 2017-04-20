package zad5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;

/**
 * @author Paweł Głogowski
 */
public class Czworokat {

    /** współrzędne wierzchołków czworokąta */
    Punkt a;
    Punkt b;
    Punkt c;
    Punkt d;
    Punkt []p;
    private Color kolor = SystemColor.window;
    /** konstruktor */
    Czworokat(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        a = new Punkt(x1, y1);
        b = new Punkt(x2, y2);
        c = new Punkt(x3, y3);
        d = new Punkt(x4, y4);
    }

    /** konstruktor */
    Czworokat(Punkt p1, Punkt p2, Punkt p3, Punkt p4)
    {
        p = new Punkt[4];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
        p[3] = p4;
    }

    /** metoda zwracajaca współrzędne wybranego punktu */
    Punkt getPunkt(int nr)
    {
        return p[nr];
    }

    /** metoda wpisująca współrzędne wybranego punktu */
    void setPunkt(int nr, double xx, double yy)
    {
        p[nr].setX(xx);
        p[nr].setY(yy);
    }

    /** metoda pozwalająca wyznaczyć przekątną czworokąta miedzy wierzchołkami a i c oraz b i d */
    double Przekatna(char wierzcholek1, char wierzcholek2)
    {
        double przek = 0;
        if ((wierzcholek1 == 'a' && wierzcholek2 == 'c') || (wierzcholek1 == 'c' && wierzcholek2 == 'a'))
        {
            przek = a.Odleglosc(c);
        }
        else if ((wierzcholek1 == 'b' && wierzcholek2 == 'd') || (wierzcholek1 == 'd' && wierzcholek2 == 'b'))
        {
            przek = b.Odleglosc(d);
        }
        else
            System.out.println("Wybrano niewłaściwe wierzchołki.");
        return przek;
    }

    /** metoda obliczająca obwód czworokąta */
    double Obwod()
    {
        double obw;
        obw = a.Odleglosc(b) + b.Odleglosc(c) + c.Odleglosc(d) + d.Odleglosc(a);
        return obw;
    }

    /** metoda obliczająca pole czworokąta - czworokat dzielmy na 2 trójkąty */
    double Pole()
    {
        double p;
        double polowa_p1 = (a.Odleglosc(b) + b.Odleglosc(c) + c.Odleglosc(a))/2;
        double polowa_p2 = (c.Odleglosc(d) + d.Odleglosc(a) + a.Odleglosc(c))/2;
        double p1 = Math.sqrt(polowa_p1*(polowa_p1 - a.Odleglosc(b))*(polowa_p1 - b.Odleglosc(c))*(polowa_p1 - c.Odleglosc(a)));
        double p2 = Math.sqrt(polowa_p2*(polowa_p2 - c.Odleglosc(d))*(polowa_p2 - d.Odleglosc(a))*(polowa_p2 - a.Odleglosc(c)));
        p = p1 + p2;
        return p;
    }

    /** metoda rysująca czworokąt */
    public void Rysuj(Graphics x)
    {
        Graphics2D g = (Graphics2D)x;
        g.setColor(kolor);

        int []tabX = new int[4];
        int []tabY = new int[4];

        for (int i = 0; i < 4; i++)
        {
            tabX[i] = (int)p[i].getX();
            tabY[i] = (int)p[i].getY();
        }
        g.fillPolygon(tabX, tabY, 4);
        
    }

    /** metoda określająca kolor wypełnienia czworokąta */
    public void Koloruj(Color kolorr)
    {
        kolor = kolorr;
    }

    /** metoda wypisująca dane czworokąta */
    @Override
    public String toString()
    {
        String wypisz;
        wypisz = "Wierzchołki czworotkata: \n";
        wypisz += "("+a.getX()+", "+a.getY()+")\n";
        wypisz += "("+b.getX()+", "+b.getY()+")\n";
        wypisz += "("+c.getX()+", "+c.getY()+")\n";
        wypisz += "("+d.getX()+", "+d.getY()+")\n";
        return wypisz;
    }

}
