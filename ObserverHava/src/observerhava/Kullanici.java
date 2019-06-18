
package observerhava;

public class Kullanici implements IKullanici {
    private String ad;
    public Kullanici(String ad){setAd(ad);}

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    
    @Override
    public void uyar(HavaDurumu hava) {
        System.out.println(ad+" "+" hava durumu: "+hava.getDurum());
    }
    
}
