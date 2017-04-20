/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie6;

/**
 *
 * @author Paweł Głogowsi
 */
abstract class Wielokat implements Figura {
    /** liczba utworzonych obiektów */
    static int liczba;
    /** numer początkowy */
    int numer;
    /**
     * Konstruktor domyślny
     */
    Wielokat(){
        liczba ++;
        numer = liczba;
    }
}
