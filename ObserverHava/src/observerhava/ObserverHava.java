
package observerhava;

public class ObserverHava {

    public static void main(String[] args) {
        Kullanici ali=new Kullanici("ali");
        Kullanici veli=new Kullanici("veli");
        HavaDurumu hava=new HavaDurumu("yağışlı");
        HavaDurumu hava1=new HavaDurumu("karlı");
        hava1.takipci.add(veli);
        hava.takipci.add(veli);
        hava.takipci.add(ali);
        hava.setDurum("bulutlu");
        hava1.setDurum("yoğun karlı");
    }
    
}
