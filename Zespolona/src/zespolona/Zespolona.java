/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zespolona;

/**
 *
 * @author Paweł Głogowski
 */
public class Zespolona {

    private double R;
    private double Im;
    Zespolona()
    {   
    }
    Zespolona(double x, double y)
    {
        this.R=x;
        this.Im=y;
    }
    @Override
    public String toString()
    {
        return "("+R+","+Im+"i)";
    }
    public Zespolona mnoz(double x)
    {
        
        return new Zespolona(this.R*x,this.Im*x);
    }
    public double modul()
    {
        double z;
        z=(Math.sqrt(Math.pow(R, 2)+Math.pow(Im, 2)));
        return z;
    }
    public Zespolona dodaj(Zespolona z)
    {
        return new Zespolona(this.R+z.R,this.Im+z.Im);
    }
    public Zespolona mnozenie(Zespolona z)
    {
        return new Zespolona(this.R*z.R-this.Im*z.Im,this.Im*z.R+this.R*z.Im);
    }
    public Zespolona dziel(Zespolona z)
    {
        
        return new Zespolona((this.R*z.R+this.Im*z.Im)/(z.R*z.R+z.Im*z.Im),
                             (this.Im*z.R-this.R*z.Im)/(z.R*z.R+z.Im*z.Im));
    }
    
}
