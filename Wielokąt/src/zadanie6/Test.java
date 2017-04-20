/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie6;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author Paweł Głogowsi
 */
public class Test {
    /** Tablica obiektów klasy Figura */
    private Figura[] figury;
    /** Konstruktor domyślny */
    Test()
     {
            figury = new Figura[]{
                new Trojkat(new Punkt(70,77), new Punkt(40,11), new Punkt(32,44)),
                new Trojkat(new Punkt(82,202), new Punkt(47,202), new Punkt(57,142)),
                new Trojkat(new Punkt(170,177), new Punkt(140,111), new Punkt(132,144)),
                new Czworokat(new Punkt(200,200), new Punkt(100,200), new Punkt(100,180), new Punkt(200, 180)),
                new Czworokat(new Punkt(5,50), new Punkt(25,50), new Punkt(25,0), new Punkt(5, 0)),
                new Czworokat(new Punkt(155,200), new Punkt(175,200), new Punkt(175,150), new Punkt(155, 150))
                };  
      }
    /**
     * Metoda wywołująca metody klasy Trojkat i Czworokat
     */
    public void wyswietl()
     {     
         Random r = new Random();    

         for (Figura f: figury)
            { f.obwod(); f.pole(); }
             
        ((Trojkat) figury[0]).wysokosc(); 
        ((Trojkat) figury[1]).wysokosc();
        ((Trojkat) figury[2]).wysokosc();
        ((Trojkat) figury[0]).ustaw_kolor(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        ((Trojkat) figury[1]).ustaw_kolor(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        ((Trojkat) figury[2]).ustaw_kolor(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        System.out.println("\nTrójkąty\n" + (Trojkat) figury[0] +"\n"+ (Trojkat) figury[1]+"\n"+ (Trojkat) figury[2]);
        
        ((Czworokat) figury[3]).przekatna(); 
        ((Czworokat) figury[4]).przekatna();
        ((Czworokat) figury[5]).przekatna();
        ((Czworokat) figury[3]).ustawKolor(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        ((Czworokat) figury[4]).ustawKolor(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        ((Czworokat) figury[5]).ustawKolor(r.nextInt(255),r.nextInt(255),r.nextInt(255));
        System.out.println("\nCzworokąty\n" + (Czworokat) figury[3] +"\n"+ (Czworokat) figury[4]+"\n"+ (Czworokat) figury[5]);
     }
     /**
      * Rysowanie figur
      * @param g 
      * @param s Skala
      */
     public void rysuj_obiekty(Graphics g, double[] s)
     {
         Graphics2D g2 = (Graphics2D) g;
         
         for (Figura f: figury)
                f.rysuj(g2, s);
     }
}
