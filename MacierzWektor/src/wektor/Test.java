/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wektor;


/**
 *
 * @author Paweł Głłogowski
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        

        double[] Z = new double[2];
        double[] Z1 = new double[2];
        Z[0]=1.0;
        Z[1]=3.0;
        Z1[1]=4.0;
        Z1[0]=2.0;
        
        System.out.println("Macierze:");
        Macierz A = new Macierz(2,2);
        Macierz B = new Macierz(2,2);
        
        
        System.out.println("Wektory:");
        Wektor ww = new Wektor(2);
        Wektor w = new Wektor(2);   
        System.out.println("Skalar: "+ww.skalar(Z));
        System.out.println("Długość wektora: " +ww.dlugosc());
        System.out.println("Dodawanie Wektorów");
        w.dodaj(ww);
        System.out.println("Dodawanie macierzy");
        A.dodaj(B);
        System.out.println("Macierz * wektor");
        A.iloczyn(ww).wypisz();
        
        
    }
}
