/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zad8;

import java.util.Random;


/**
 *
 * @author Paweł Głogowski
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        int n = 100;
        int m = 5;
       
        int iloscWatki = (rand.nextInt(n)+1);
        System.out.println(iloscWatki);
        long czas_przed;
        long czas_po;
        long roznica;
        
        System.out.println("Zostanie utworzonych " + iloscWatki + " watkow");

        if(iloscWatki > n)
            iloscWatki = n;

        int det = n/iloscWatki;
        int reszta=n-iloscWatki*det;
        
        System.out.println("Reszta " + reszta  +" Det "+ det);
       
        Macierze A = new Macierze(n,m);
        Wektor x = new Wektor(m);
        Wektor y = new Wektor(n);

        int j=0;
        czas_przed = System.currentTimeMillis();
        for(int i=0; i < iloscWatki; i++)
        {   
                if (i<reszta){
                    
                    new Watki(A,y,x,j,j+det);
                    j+=det+1;
                }
                else
                {
                    
                    new Watki(A,y,x,j,j+det-1);
                    j+=det;
                    
                }
        }
        
        try
        {
            Thread.sleep(1);
        }
        catch(InterruptedException exc)
        {
            System.out.println("Blad");
        }
        czas_po = System.currentTimeMillis();
        System.out.println("Macierz A:" + A);
        System.out.println("Wektor x:" + x);
        System.out.println("Wektor y:" + y);
        
        roznica = czas_po - czas_przed;
        System.out.println("Czas działania = "+roznica);
    }

}
