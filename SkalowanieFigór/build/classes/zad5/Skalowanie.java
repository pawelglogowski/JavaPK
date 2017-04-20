package zad5;

/**
 * @author Paweł Głogowski
 */
public class Skalowanie {

    /** metoda skalująca */
    public static void skaluj(Trojkat []tabTrojkaty, Czworokat []tabCzworokaty, double wysokosc, double szerokosc)
    {
        double maxX = tabTrojkaty[0].getPunkt(0).getX();
        double maxY = tabTrojkaty[0].getPunkt(0).getY();
        double minX = tabTrojkaty[0].getPunkt(0).getX();
        double minY = tabTrojkaty[0].getPunkt(0).getY();

        for (int i = 0; i < tabTrojkaty.length; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (tabTrojkaty[i].getPunkt(j).getX() > maxX)
                    maxX = tabTrojkaty[i].getPunkt(j).getX();
                if (tabTrojkaty[i].getPunkt(j).getX() < minX)
                    minX = tabTrojkaty[i].getPunkt(j).getX();
                if (tabTrojkaty[i].getPunkt(j).getY() > maxY)
                    maxY = tabTrojkaty[i].getPunkt(j).getY();
                if (tabTrojkaty[i].getPunkt(j).getY() < minY)
                    minY = tabTrojkaty[i].getPunkt(j).getY();
            }
        }

        for (int i = 0; i < tabCzworokaty.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (tabCzworokaty[i].getPunkt(j).getX() > maxX)
                    maxX = tabCzworokaty[i].getPunkt(j).getX();
                if (tabCzworokaty[i].getPunkt(j).getX() < minX)
                    minX = tabCzworokaty[i].getPunkt(j).getX();
                if (tabCzworokaty[i].getPunkt(j).getY() > maxY)
                    maxY = tabCzworokaty[i].getPunkt(j).getY();
                if (tabCzworokaty[i].getPunkt(j).getY() < minY)
                    minY = tabCzworokaty[i].getPunkt(j).getY();
            }
        }

        for (int i = 0; i < tabTrojkaty.length; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                tabTrojkaty[i].setPunkt(j, (( (tabTrojkaty[i].getPunkt(j).getX() - minX)* szerokosc)/(maxX - minX)), (( (tabTrojkaty[i].getPunkt(j).getY() - minY)*wysokosc )/(maxY - minY)));
            }
        }
        
        for (int i = 0; i < tabCzworokaty.length; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                tabCzworokaty[i].setPunkt(j, (( (tabCzworokaty[i].getPunkt(j).getX() - minX)*szerokosc )/(maxX - minX)), (( (tabCzworokaty[i].getPunkt(j).getY() - minY)*wysokosc )/(maxY - minY)));
            }
        }
    }
}
