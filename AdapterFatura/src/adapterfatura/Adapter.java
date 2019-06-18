
package adapterfatura;

public class Adapter implements ITutarHesaplayici {
    private Adaptee adaptee;
    public Adapter(){adaptee=new Adaptee();}
    @Override
    public double Hesapla(double fiyat, double adet) {
       return fiyat*adet*10/100;
    }
    public Adaptee getAdaptee(){return adaptee;}
    
}
