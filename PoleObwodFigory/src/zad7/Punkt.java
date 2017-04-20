package zad7;

/**
 * @author Paweł Głogowski
 */
public class Punkt {
    /** współrzędne punktu */
    private double x;
    private double y;

    /** konstruktor */
    Punkt(double xx, double yy)
    {
        x = xx;
        y = yy;
    }

    /** metoda pobierająca współrzeną x */
    double getX(){ return x; }
    /** metoda pobierająca współrzeną y */
    double getY(){ return y; }

    void setX(double xx){ x = xx; }
    void setY(double yy){ y = yy; }
    
    /** metoda obliczająca odległość między dwoma punktami */
    double Odleglosc(Punkt p1)
    {
        double odl;
        odl = Math.sqrt(Math.pow((getX() - p1.x),2 ) + Math.pow((getY() - p1.y), 2));
        return odl;
    }

    /** metoda wypisująca współrzędne punktu */
    @Override
    public String toString()
    {
        String wypisz = "Współrzędne punktu: ";
        wypisz += "x = "+getX()+", y = "+getY()+"\n";
        return wypisz;
    }
}
