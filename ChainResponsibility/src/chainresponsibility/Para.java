
package chainresponsibility;

public abstract class Para {
    private int adet,kalan;
     protected Para sonraki;
    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getKalan() {
        return kalan;
    }

    public void setKalan(int kalan) {
        this.kalan = kalan;
    }
    public abstract void Hesapla(int sayi); 
}
