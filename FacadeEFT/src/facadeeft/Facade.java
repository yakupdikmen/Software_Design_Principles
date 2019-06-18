
package facadeeft;

public class Facade {
    private EFT eft;
    private Kredi_Kontrol kredi;
    public Facade(){
        eft=new EFT();
        kredi=new Kredi_Kontrol();
    }
    public void EFTyolla(Musteri gönderici,Musteri alici,double miktar){
        eft.eftGonder(gönderici, alici, miktar);
     }
    public void KrediKullan(Musteri musteri){
            kredi.KrediKullan(musteri);
        }
}
