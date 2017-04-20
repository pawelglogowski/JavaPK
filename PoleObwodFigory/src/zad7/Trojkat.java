package zad7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * @author Paweł Głogowski
 */
public class Trojkat{
    /** wierzchołki trójkąta */
    private Punkt []t;
    private Color kolor = Color.RED;

    /** konstruktor */
    Trojkat(Punkt p1, Punkt p2, Punkt p3)
    {
        t = new Punkt[3];
        t[0] = p1;
        t[1] = p2;
        t[2] = p3;
    }

    /** metoda zwracająca współrzędne wybranego punktu */
    public Punkt getPunkt(int nr)
    {
        return t[nr];
    }
    public void setPunkt(int nr, double xx, double yy)
    {
        t[nr].setX(xx);
        t[nr].setY(yy);
    }

    /** metoda wzynaczająca wysokość tójkąta */
    double Wysokosc(char bok)
    {
        double h = 0;
        if (bok == 'a')
            h = (Pole()*2/t[0].Odleglosc(t[1]));
        if (bok == 'b')
            h = (Pole()*2/t[1].Odleglosc(t[2]));
        if (bok == 'c')
            h = (Pole()*2/t[2].Odleglosc(t[0]));
        return h;
    }

    /** metoda obliczająca pole trójkąta - wzrór Herona */
    public double Pole()
    {
        double p;
        double polowa = Obwod()/2;
        p = Math.sqrt(polowa*((polowa - t[0].Odleglosc(t[1]))*(polowa - t[1].Odleglosc(t[2]))*(polowa - t[2].Odleglosc(t[1]))));
        return p;
    }

    /** metoda obliczająca obwód trojkąta */
    public double Obwod()
    {
        double obw;
        obw = t[0].Odleglosc(t[1]) + t[1].Odleglosc(t[2]) + t[2].Odleglosc(t[1]);
        return obw;
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
            tabX[i] = (int)t[i].getX();
            tabY[i] = (int)t[i].getY();
        }
        g.fillPolygon(tabX, tabY, 3);
    //    g.setColor(Color.BLACK);
        g.drawPolygon(tabX, tabY, 3);
        
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
        String wypisz = null;
        wypisz = "Wierzchołki trójkąta: \n";
        wypisz += "("+t[0].getX()+", "+t[0].getY()+")\n";
        wypisz += "("+t[1].getX()+", "+t[1].getY()+")\n";
        wypisz += "("+t[2].getX()+", "+t[2].getY()+")\n";
        return wypisz;
    }
}

