
package pkgabstract;

public abstract class Calisan {
    private String isim;
    private double maas;
    public double setMaas(double maas){
        this.maas=maas;
        return maas;
    }
    abstract double hesapla();

    double hesapla(int gun) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Isci extends Calisan{
   
    double hesapla(int gun){
        return setMaas(gun*100);
    }

    @Override
    double hesapla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Muhendis extends Calisan{
    double hesapla(int gun){
        return setMaas(gun*10+1000);
    }

    @Override
    double hesapla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Hesapla{
    public static double maasGetir(Calisan calisan,int gun){
     return calisan.hesapla(gun);
    }
}