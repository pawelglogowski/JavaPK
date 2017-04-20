/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package punkt;

import java.util.Arrays;

/**
 *
 * @author Rysiek
 */


public class Test {
       /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Punkt a = new Punkt(2,2);
        Punkt b = new Punkt(4,2);
        Punkt c = new Punkt(4,4);
        Punkt d = new Punkt(2,4);
        Punkt e = new Punkt(2,8);
        Punkt f = new Punkt(8,2);
        Punkt g = new Punkt(7,5);
        Trojkat[] t = new Trojkat[3];
        Czworokat[] cz = new Czworokat[3];
        
        
        t[0] = new Trojkat(d,c,e);
        t[1] = new Trojkat(a,f,g);
        t[2] = new Trojkat(a,b,c);
        
        cz[0] = new Czworokat(a,b,c,d);
        cz[2] = new Czworokat(b,f,g,c);
        cz[1] = new Czworokat(a,f,g,d);

        for(int i=0;i<t.length;i++)
        {
            t[i].rysuj();
            System.out.format(" nr %d"+": Obwód %.2f"+"  Pole: %.2f\n",(i+1),t[i].obwod(),t[i].pole());

        }
        
        System.out.println();
        
        for(int i=0;i<cz.length;i++)
        {
            cz[i].rysuj();
            System.out.format(" nr %d"+": Pole %.2f"+
                               "  Obwód: %.2f"+
                               "  Przekątna: %.2f \n",(i+1),cz[i].pole(),cz[i].obwod(),cz[i].przekatna());

        }
        System.out.println("Sortowanie: ");
        Arrays.sort(t, new porownajDouble() {});
        Arrays.sort(cz, new porownajDouble2() {});
        System.out.println();
        for(int i=0;i<t.length;i++)
        {
            t[i].rysuj();
            System.out.format(" nr %d"+": Obwód %.2f"+"  Pole: %.2f\n",(i+1),t[i].obwod(),t[i].pole());

        }
        System.out.println();
        for(int i=0;i<cz.length;i++)
        {
            cz[i].rysuj();
            System.out.format(" nr %d"+": Pole %.2f"+
                               "  Obwód: %.2f"+
                               "  Przekątna: %.2f \n",(i+1),cz[i].pole(),cz[i].obwod(),cz[i].przekatna());

        }
    }
}
