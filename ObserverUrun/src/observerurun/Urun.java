
package observerurun;

import java.util.ArrayList;
import java.util.List;

public abstract class Urun {
    private String ad;
    private int fiyat;
    List<Kullanici> takipci=new ArrayList<Kullanici>();
    public void Urun(String ad,int fiyat){
        setFiyat(fiyat);
        setAd(ad);
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
        Notify();
    }
  public void Notify(){
      for (int i = 0; i < takipci.size(); i++) {
          takipci.get(i).Notify(this);
      }
  }
 
}
