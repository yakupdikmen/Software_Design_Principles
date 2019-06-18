
package observerhava;

import java.util.ArrayList;
import java.util.List;

public class HavaDurumu {
    private String durum;
    List<Kullanici> takipci=new ArrayList<Kullanici>();
    public HavaDurumu(String durum){setDurum(durum);}
    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
        Notify();
    }
    public void Notify(){
        for (int i = 0; i < takipci.size(); i++) {
            takipci.get(i).uyar(this);
        }
    
    }
}
