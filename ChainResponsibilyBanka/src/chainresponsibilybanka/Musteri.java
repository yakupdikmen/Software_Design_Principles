
package chainresponsibilybanka;

public class Musteri {
   private int maas,kefil,krediKarti,krediKartiOdeme,KBB,Firma; 

    public Musteri(int maas, int kefil, int krediKarti, int krediKartiOdeme, int KBB, int Firma) {
        this.maas = maas;
        this.kefil = kefil;
        this.krediKarti = krediKarti;
        if(krediKarti==1){this.krediKartiOdeme = 0;}
        this.KBB = KBB;
        this.Firma = Firma;
    }
   
    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getKefil() {
        return kefil;
    }

    public void setKefil(int kefil) {
        this.kefil = kefil;
    }

    public int getKrediKarti() {
        return krediKarti;
    }

    public void setKrediKarti(int krediKarti) {
        this.krediKarti = krediKarti;
    }

    public int getKrediKartiOdeme() {
        return krediKartiOdeme;
    }

    public void setKrediKartiOdeme(int krediKartiOdeme) {
        this.krediKartiOdeme = krediKartiOdeme;
    }

    public int getKBB() {
        return KBB;
    }

    public void setKBB(int KBB) {
        this.KBB = KBB;
    }

    public int getFirma() {
        return Firma;
    }

    public void setFirma(int Firma) {
        this.Firma = Firma;
    }
   
}
