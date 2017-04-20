package zad5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * @author Paweł Głogowski
 */
public class NewJPanel extends javax.swing.JPanel {

    /** Creates new form NewJPanel */
    public NewJPanel() {
        initComponents();
    }

    /** metoda rysująca */
    @Override
    public void paint(Graphics x)
    {
        double wysokosc = getHeight();
        double szerokosc = getWidth();

        Trojkat []tablicaTrojkatow = {
            new Trojkat(new Punkt(70,-100), new Punkt(220,15), new Punkt(70,15)),
            new Trojkat(new Punkt(210,200), new Punkt(350,350), new Punkt(200,350))
        };

        Czworokat []tablicaCzworokatow = {
            new Czworokat(new Punkt(-200,-100), new Punkt(0,-100), new Punkt(0,30), new Punkt(-200,30)),
            new Czworokat(new Punkt(350,-100), new Punkt(350,100), new Punkt(250,100), new Punkt(250,-100)),
            new Czworokat(new Punkt(-200,250), new Punkt(-100,150), new Punkt(0,250), new Punkt(-100,350))
        };
        
        Graphics2D g = (Graphics2D)x;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        tablicaTrojkatow[0].Koloruj(Color.black);
        tablicaTrojkatow[1].Koloruj(Color.blue);
        tablicaCzworokatow[0].Koloruj(Color.red);
        tablicaCzworokatow[1].Koloruj(Color.yellow);
        tablicaCzworokatow[2].Koloruj(Color.orange);
        
        Skalowanie.skaluj(tablicaTrojkatow, tablicaCzworokatow, wysokosc, szerokosc);
        
        tablicaTrojkatow[0].Rysuj(g);
        tablicaTrojkatow[1].Rysuj(g);
        tablicaCzworokatow[0].Rysuj(g);
        tablicaCzworokatow[1].Rysuj(g);
        tablicaCzworokatow[2].Rysuj(g);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
