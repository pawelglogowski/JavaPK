/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zad8;

/**
 *
 * @author Paweł Głogowski
 */
public class Macierze {
    private int m;
    private int n;
    double A[][];

    Macierze()
    {
      n=3; //100
      m=4; //200

      A = new double[n][m];

      for (int i=0; i<n; i++)
      {

          for (int j=0; j<m; j++)
          {
              A[i][j] = i*j;
          }
      }
    }

    Macierze(int nn, int mm)
    {
      n=nn; //100
      m=mm; //200

      A = new double[n][m];

      for (int i=0; i<n; i++)
      {

          for (int j=0; j<m; j++)
          {
              A[i][j] = i*j;
          }
      }
    }


    public int getN() { return n; }
    public int getM() { return m; }
    public double getElement(int i, int j)
    {
        return A[i][j];
    }

    @Override
    public String toString()
    {

        int i,j;
        String txt ="";
        for(i=0; i<n; i++)
        {
            for(j=0; j<m; j++)
            {
                txt = txt + A[i][j] + "  ";
            }
            txt = txt +"\n";
        }

        return txt;
    }
}

