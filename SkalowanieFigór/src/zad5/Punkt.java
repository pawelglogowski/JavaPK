package zad5;

/**
 * @author Paweł Głogowski
 */
public class Punkt{

    /** współrzędne punktu */
    double x;
    double y;

    /** konstruktor */
    Punkt()
    {
        x = 0;
        y = 0;
    }
    
    /** konstruktor */
    Punkt(double xx, double yy)
    {
        x = xx;
        y = yy;
    }
    
    double getX(){  return x; }

    double getY(){  return y; }

    void setX(double xx){ x = xx; }

    void setY(double yy){ y = yy; }


    /** metoda obiczająca odległość między punktami */
    double Odleglosc(Punkt p1)
    {
        double odl;
        odl = Math.sqrt(Math.pow((getX() - p1.x), 2) + Math.pow((getY() - p1.y), 2));
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
