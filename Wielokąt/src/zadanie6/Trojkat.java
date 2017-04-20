/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie6;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.sqrt;

/**
 *
 * @author Paweł Głogowski
 */
class Trojkat extends Wielokat implements Comparable <Trojkat>{
    /** Tablica wierzchołków trójkąta */
    private Punkt[] punkty = new Punkt[3];
    /** Kolor trójkąta */
    private int[] kolor = new int[]{255,0,0};
    /** Pole trójkąta */
    private double pole;
    /** Obwód trójkąta */
    private double obwod;
    /** Wysokość trójkąta */
    private double wysokosc;
    /**
     * Konstruktor
     * @param x1 Współrzędna x pierwszego wierzchołka 
     * @param y1 Współrzędna y pierwszego wierzchołka
     * @param x2 Współrzędna x drugiego wierzchołka 
     * @param y2 Współrzędna y drugiego wierzchołka 
     * @param x3 Współrzędna x trzeciego wierzchołka
     * @param y3 Współrzędna y trzeciego wierzchołka 
     * @return 
     */
    Trojkat(double x1, double y1, double x2, double y2, double x3, double y3){
        punkty[0] = new Punkt(x1,y1);
        punkty[1] = new Punkt(x2,y2);
        punkty[2] = new Punkt(x3,y3);
    }
    Trojkat(Punkt obj1, Punkt obj2, Punkt obj3){
        punkty[0] = new Punkt(obj1.getX(), obj1.getY());
        punkty[1] = new Punkt(obj2.getX(), obj2.getY());
        punkty[2] = new Punkt(obj3.getX(), obj3.getY());
    }
    Trojkat() {
        punkty[0] = new Punkt();
        punkty[1] = new Punkt();
        punkty[2] = new Punkt();
    }
    /**
     * Metoda obliczająca obwód trójkąta
     */
    @Override
    public void obwod(){
        obwod = punkty[0].odleglosc(punkty[1])+punkty[1].odleglosc(punkty[2])+punkty[2].odleglosc(punkty[0]);
    }
    /**
     * Metoda obliczająca pole trójkąta 
     * @return pole Wartość pola trójkąta
     */
    @Override
    public void pole(){
        double p;
        p = 0.5*obwod;
        double a = punkty[0].odleglosc(punkty[1]), b=punkty[1].odleglosc(punkty[2]), c=punkty[0].odleglosc(punkty[2]);
        pole = sqrt(p*(p-a)*(p-b)*(p-c));
    }
    /**
     * Metoda obliczająca wysokość trójkąta
     */
    public double wysokosc(){
        this.pole();
        wysokosc = (2*pole)/punkty[0].odleglosc(punkty[1]);
        return wysokosc;
    }
    /**
     * Metoda ustawiająca kolor trójkąta 
     * @param R Nasycenie kolorem czerwonym
     * @param G Nasycenie kolorem zielonym
     * @param B Nasycenie kolorem niebieskim
     */
    public void ustaw_kolor(int R, int G, int B){
        kolor[0] = R;
        kolor[1] = G;
        kolor[2] = B;
    }
    @Override
    public void rysuj(Graphics g, double[] s){
        Graphics2D g2 = (Graphics2D) g;
        Color Kolor = new Color(this.kolor[0],this.kolor[1],this.kolor[2]);
        
        int tabX[] = {(int) (punkty[0].getX()*s[0]), (int) (punkty[1].getX()*s[0]), (int) (punkty[2].getX()*s[0])};
        int tabY[] = {(int) (punkty[0].getY()*s[1]),(int) (punkty[1].getY()*s[1]),(int) (punkty[2].getY()*s[1])};
        
        g2.setColor(Kolor);
        g2.fillPolygon(tabX, tabY, 3);
    }
    /** Metoda zwraca wartośc pola trójkąta
     * 
     * @return pole trójkąta
     */
    public double wypiszPole(){
        return pole;
    }
    /** Metoda zwraca wartośc obwodu trójkąta
     * 
     * @return pole trójkąta
     */
    public double wypiszObwod(){
        return obwod;
    }
    /** 
     * Metoda wypisująca współrzędne wierzchołków trójkąta oraz wartości obliczone przez metody:
     * Pole, Obwod i Wysokość
     * @return 
     */
    @Override
    public String toString(){
        return numer +":\ta = "+punkty[0]+" b = "+punkty[1]+" c = "+punkty[2]+"\tPole: "+pole+"\tObwod: "+obwod+"\tWysokość: "+wysokosc;
    }
    /**
     * Metoda porównująca obiekty kalsy Trojkat.
     * @param o Obiekt klasy Trojkat
     * @return 
     */
    @Override
    public int compareTo(Trojkat o) {
        if(pole < o.pole)
            return -1;
        else if (pole == o.pole)
            return 0;
        else 
            return 1;
    }
    
}
