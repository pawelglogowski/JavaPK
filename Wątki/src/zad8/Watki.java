/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package zad8;

/**
 *
 * @author Paweł Głogowski
 */

    
    class Watki implements Runnable
    {
         private static int ilosc = 0;
         private int ktory = ++ilosc;
         private int start;
         private int end;
         private Thread t;
         Macierze A;
         Wektor y, x;

         public Watki(Macierze tmpA, Wektor tmpY, Wektor tmpX, int startTmp, int endTmp)
         {
             A = tmpA;
             y = tmpY;
             x = tmpX;
             start = startTmp;
             end = endTmp;


             t = new Thread(this);
             t.start();
             System.out.println("Start wątku(watek1) " + ktory + ": od " + start + " do " + end);
        }

        public void run()
        {
            double suma;
            for(int i=start; i <= end; i++)
            {
                System.out.println("Watek(watek1) nr " + ktory + " liczy wiersz " + i);
                suma = 0;
                for(int j=0; j < A.getM(); j++)
                {
                    suma += A.getElement(i, j)*x.getElement(j);
                }
                y.setVal(i, suma);
            }
        }
    }


    



