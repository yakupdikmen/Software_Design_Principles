
package openclose;

public class Urun {
    private int id,fiyat;
    private String isim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void urunOlustur(String isim,int id,int fiyat){
        setIsim(isim);
        setId(id);
        setFiyat(fiyat);
    }
}

