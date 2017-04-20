/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie6;
import java.awt.Graphics;
/**
 *
 * @author Paweł Głogowski
 */
public interface Figura {
    /** 
     * Metoda licząca obwód (abstrakcyna)
     */
    void obwod();
    /**
     * Metoda licząca pole (abstrakcyjna)
     */
    void pole();
    /**Metoda rysująca figurę w odpowiedniej skali
     * Metoda 
     * @param g
     * @param s 
     */
    void rysuj(Graphics g, double[] s);
}
