package zadanie6;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
/**
 *
 * @author Paweł Głogowski
 */
public class Punkt {
    /** Współrzędna x */
    private double x;
    /** Współrzędna y */
    private double y;
    /**
     * Konstruktor domyślny
     */
    Punkt () {
        x=0; 
        y=0; 
    }
    /**
     * Konsturktor 
     * @param x Współrzędna x
     * @param y Współrzędna y
     */
    Punkt (double x, double y){
        this.x = x;
        this.y = y;
    }
    /**
     * Konstruktor kopiujący
     * 
     * @parm obj Objekt klasy punkt
     */
    Punkt(Punkt obj){
        x=obj.getX();
        y=obj.getY();
    }
    /**
     * Metoda zwracająca współrzędną x obiektu 
     * @return x Wartość współrzędnej x
     */
    public double getX(){
        return x;
    }
    /**
     * Metoda zwracająca współrzędną y obiektu 
     * @return y Wartość współrzędnej y
     */
    public double getY(){
        return y;
    }
    /**
     * Metoda używana do wyświetlania współrzędnych punktu
     * @return 
     */
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    /**
     * Metoda obliczająca odległość między punktami 
     * @param obj
     * @return 
     */
    public double odleglosc(Punkt obj){
        return sqrt(pow(obj.x-x,2)+pow(obj.y-y,2));
    }
    /**
     * Metoda ustawiająca współrzędną x
     * @param x wartośc przypisywana współrzędnej x
     */
    public void setX(double x){
        this.x = x;
    }
    /**
     * Metoda ustawiająca współrzędną y
     * @param x wartośc przypisywana współrzędnej y
     */
    public void setY(double y){
        this.y = y;
    }
}
