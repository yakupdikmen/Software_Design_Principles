
package observerurun;

public class Kullanici implements IUye {
    private String ad;
    public Kullanici(String ad){setAd(ad);}
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public void Notify(Urun urun) {
        System.out.println(ad+" bey "+urun.getAd()+" "+urun.getFiyat()+" tl oldu.. ");
    }
    
}
