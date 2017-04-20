/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie6;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Paweł Głogowski
 */
public class Main extends JFrame implements ComponentListener {
    /** Obikekt klasy Test */
    private static Test t = new Test();
    /** Obiekt klasy panel  */
    private JPanel panel = new Panel(t);
    /** Szerokosc okna */
    private final int SZEROKOSC = 400;
    /** Wysokosc okna */
    private final int WYSOKOSC = 300;
    /** Współrzędna punktu środkowego okna */
    public double[] srodek = new double[2];
    /** Flaga */
    private boolean obliczono = false;
    /** 
     * Ustawienie własciwości okna
     */
    public void ustaw(){
        addComponentListener(this);
        setTitle("Figury");
        setSize(new Dimension(SZEROKOSC,WYSOKOSC));
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  
    }
    /**
     * Metoda main
     * @param args 
     */
    public static void main(String[] args) {
        t.wyswietl();           
        new Main().ustaw();    
    }
    
    /**
     * Obsługa zdarzenia zmiany rozmiaru okna
     * @param e 
     */
    @Override
    public void componentResized(ComponentEvent e) {
        int wys = panel.getHeight();
        int szer = panel.getWidth();
        
        if (!obliczono)
        {
            srodek[0] = panel.getWidth()/2; srodek[1] = panel.getHeight()/2;
            obliczono = true;
        }    
        
        double x2 = szer - (((SZEROKOSC-(SZEROKOSC/2))*(szer))/(SZEROKOSC));
        double y2 = wys - (((WYSOKOSC-(WYSOKOSC/2))*(wys))/(WYSOKOSC));
        
        ((Panel) panel).s[0] = x2/srodek[0]; ((Panel) panel).s[1] = y2/srodek[1];
    }
    

    @Override
    public void componentMoved(ComponentEvent e) {
        
    }

    @Override
    public void componentShown(ComponentEvent e) {
   
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        
    }
    
}
