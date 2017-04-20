/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie6;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
/**
 *
 * @author Paweł Głogowski
 */
public class Panel extends JPanel {
    /** Obiekt klasy Test */
    private Test t;
    /**
     * Skala
     * @param t 
     */
    double s[] = {1,1};
    /**
     * Mtoda zarządzająca panelem
     * @param g 
     */
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; 
        t.rysuj_obiekty(g2, s);
    }
    /**
     * Konstruktor 
     * @param t Obiekt klasy Test
     */
    Panel(Test t){
        this.t = t;
    }
}
