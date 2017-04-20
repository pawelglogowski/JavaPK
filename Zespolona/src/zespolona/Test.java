/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zespolona;

/**
 *
 * @author Paweł Głogowski
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zespolona z = new Zespolona(4,-7);
        Zespolona z1 = new Zespolona(-3,2);
        
        System.out.println("z = "+z.toString());
        System.out.println("z1 = "+z1.toString());
        System.out.println("Mnożenie przez liczbę "+z.mnoz(2));
        System.out.println("Moduł "+z.modul());
        System.out.println("Dodawanie "+z.dodaj(z1));
        System.out.println("Mnożenie "+z.mnozenie(z1));
        System.out.println("Dzielenie "+z.dziel(z1));
    }
}
