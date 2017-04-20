package zad5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;

/**
 * @author Paweł Głogowski
 */
public class Trojkat {

    /** wierzchołki trojkąta */
    Punkt a;
    Punkt b;
    Punkt c;
    Punkt []p;

    /** konstruktor */
    Trojkat(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        a = new Punkt(x1, y1);
        b = new Punkt(x2, y2);
        c = new Punkt(x3, y3);
    }

    /** konstruktor  */
    Trojkat(Punkt p1, Punkt p2, Punkt p3)
    {
        p = new Punkt[3];
        p[0] = p1;
        p[1] = p2;
        p[2] = p3;
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

    /** metoda wyznaczająca wysokość trojkąta - korzystając ze wzoru P = (a*h)/2 */
    double Wysokosc(char bok)
    {
        double h = 0;
        System.out.println("Wysokosc poprowadzona na bok: ");
        if (bok == 'a')
        {
            System.out.println("a");
            h = ((Pole()*2)/a.Odleglosc(b));
        }
        if (bok == 'b')
        {
            System.out.println("b");
            h = ((Pole()*2)/b.Odleglosc(c));
        }
        if (bok == 'c')
        {
            System.out.println("c");
            h = ((Pole()*2)/c.Odleglosc(a));
        }
        return h;
    }

    /** metoda obliczająca obwód trojkąta */
    double Obwod()
    {
        double obw;
        obw = a.Odleglosc(b) + b.Odleglosc(c) + c.Odleglosc(a);
        return obw;
    }

    /** metoda obliczająca pole trójkąta - wzrór Herona */
    double Pole()
    {
        double p;
        double polowa = Obwod()/2;
        p = Math.sqrt(polowa*((polowa - a.Odleglosc(b))*(polowa - b.Odleglosc(c))*(polowa - c.Odleglosc(a))));
        return p;
    }

    /** metoda rysująca trójkąt */
    public void Rysuj(Graphics x)
    {
        Graphics2D g = (Graphics2D)x;
        g.setColor(kolor);

        int []tabX = new int[3];
        int []tabY = new int[3];

        for (int i = 0; i < 3; i++)
        {
            tabX[i] = (int)p[i].getX();
            tabY[i] = (int)p[i].getY();
        }
        g.fillPolygon(tabX, tabY, 3);
       
    }

    /** metoda określająca kolor wypełnienia trójkata */
    public void Koloruj(Color kolorr)
    {
        kolor = kolorr;
    }

    /** metoda wypisująca dane trojkąta */
    @Override
    public String toString()
    {
        String wypisz;
        wypisz = "Wierzchołki trójkąta: \n";
        wypisz += "("+a.getX()+", "+a.getY()+")\n";
        wypisz += "("+b.getX()+", "+b.getY()+")\n";
        wypisz += "("+c.getX()+", "+c.getY()+")\n";
        return wypisz;
    }
private Color kolor = SystemColor.window;
}
