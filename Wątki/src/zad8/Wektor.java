/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zad8;

/**
 *
 * @author Paweł Głogowski
 */
public class Wektor {
    public double wektor[];
    private int rozmiar;

    Wektor(int size)
    {

        rozmiar=size;
        wektor = new double [rozmiar];

        for(int i=0; i<size; i++)
        {
            wektor[i] = i;
        }
    }

    public int getSize(){ return rozmiar;}
    public double getElement(int i)
    {
        return wektor[i];
    }
    public void setVal(int i, double suma)
    {
        wektor[i]=suma;
    }

    @Override
    public String toString()
    {
        int i;
        String txt = "";
        for(i=0; i<rozmiar; i++)
        {
            txt = txt + wektor[i] + "  ";
        }
        return txt;
    }

}
