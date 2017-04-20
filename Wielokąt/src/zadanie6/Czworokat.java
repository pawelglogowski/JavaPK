/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Paweł Głogowski
 */
public class Czworokat extends Wielokat implements Comparable<Czworokat> {
    /** Tablica wierzchołków czworokąta */
    private Punkt[] punkty = new Punkt[4];
    /** Pole czworokąta */
    private double pole;
    /** Obwod czworokąta */
    private double obwod;
    /** Przekątna czworokąta */
    private double przekatna;
    /** Tablica kolorów */
    private int[] kolor = new int[3]; 
    /** Konstruktor
     * 
     * @param a Pierwszy wierzchołek czworokąta
     * @param b Drugi wierzchołek czworokąta
     * @param c Trzeci wierzchołek czworokąta
     * @param d Czwarty wierzchołek czworokąta
     */
    Czworokat(Punkt a, Punkt b, Punkt c, Punkt d){
        punkty[0] = new Punkt(a.getX(),a.getY());
        punkty[1] = new Punkt(b.getX(),b.getY());
        punkty[2] = new Punkt(c.getX(),c.getY());
        punkty[3] = new Punkt(d.getX(),d.getY());
    }
    /** Konsturktor
     * 
     * @param x1 Współrzędna x wierzchołka pierwszego
     * @param y1 Współrzędna y wierzchołka pierwszego
     * @param x2 Współrzędna x wierzchołka drugiego
     * @param y2 Współrzędna y wierzchołka drugiego
     * @param x3 Współrzędna x wierzchołka trzeciego
     * @param y3 Współrzędna y wierzchołka trzeciego
     * @param x4 Współrzędna x wierzchołka czwartego
     * @param y4 Współrzędna y wierzchołka czwartego
     */
    Czworokat(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        punkty[0].setX(x1);    punkty[0].setY(y1);
        punkty[1].setX(x2);    punkty[1].setY(y2);
        punkty[2].setX(x3);    punkty[2].setY(y3);
        punkty[3].setX(x4);    punkty[3].setY(y4);
    }
    /** Konstruktor domyślny */
    Czworokat() {
        punkty[0] = new Punkt(); 
        punkty[1] = new Punkt();
        punkty[2] = new Punkt(); 
        punkty[3] = new Punkt(); 
    }
    /** Metoda zwraca wartośc pola czworokąta
     * 
     * @return pole czworokąta
     */
    public double wypiszPole(){
        return pole;
    }
    /**
     * Metoda zwraca wartość obwodu czowrokąta
     * @return obwod 
     */
    public double wypiszObwod(){
        return obwod;
    }
    /**
     * Metoda zwraca wartość przekątnej czworokąta
     * @return przekatna
     */
    public double wypiszPrzekatna(){
        return przekatna;
    }
    /** 
     * Metoda wypisująca współrzędne wierzchołków czworokąta oraz wartości obliczone przez metody:
     * Pole i Obwod
     * @return 
     */
    @Override
    public String toString(){
        return numer +":\ta = "+punkty[0]+" b = "+punkty[1]+" c = "+punkty[2]+" d = "+punkty[3]+"\tPole: "+pole+"\tObwod: "+obwod;
    }
    /**
     * Metoda obliczająca obwód czworokąta
     */
    @Override
    public void obwod() {
        obwod = punkty[0].odleglosc(punkty[1]) + punkty[1].odleglosc(punkty[2]) + punkty[2].odleglosc(punkty[3]) + punkty[3].odleglosc(punkty[0]); 
    }
    /**
     * Metoda obliczająca przekątną czworokąta
     */
    public void przekatna() { 
        przekatna = punkty[0].odleglosc(punkty[2]); 
    }
    
    /**
     * Metoda obliczająca pole czworokąta
     */
    @Override
    public void pole() {
        Trojkat T = new Trojkat(punkty[0], punkty[1],punkty[2]), T2 = new Trojkat(punkty[0], punkty[2], punkty[3]);
        T.pole(); 
        T2.pole();
        pole = T.wypiszPole()+T2.wypiszPole();
    }
    /** 
     * Metoda rysująca czworokąt
     * @param g 
     * @param s Skala
     */
    @Override
    public void rysuj(Graphics g, double[] s) {
        Graphics2D g2 = (Graphics2D) g;
        Color Kolor = new Color(kolor[0],kolor[1],kolor[2]);
        int tabX[]={(int) (punkty[0].getX()*s[0]),(int) (punkty[1].getX()*s[0]),(int) (punkty[2].getX()*s[0]),(int) (punkty[3].getX()*s[0])};
        int tabY[]={(int) (punkty[0].getY()*s[1]),(int) (punkty[1].getY()*s[1]),(int) (punkty[2].getY()*s[1]),(int) (punkty[3].getY()*s[1])};
        
        g2.setColor(Kolor);
        g2.fillPolygon(tabX, tabY, 4);
    }
    /**
     * Metoda ustawiająca kolor trójkąta 
     * @param R Nasycenie kolorem czerwonym
     * @param G Nasycenie kolorem zielonym
     * @param B Nasycenie kolorem niebieskim
     */
    public void ustawKolor(int R, int G, int B){
        kolor[0] = R;
        kolor[1] = G;
        kolor[2] = B;
    }
    /**
     * Metoda porównująca obiekty kalsy Trojkat.
     * @param o Obiekt klasy Trojkat
     * @return 
     */
    @Override
    public int compareTo(Czworokat o) {
        if(pole < o.pole)
            return -1;
        else if (pole == o.pole)
            return 0;
        else 
            return 1;
    }
}
