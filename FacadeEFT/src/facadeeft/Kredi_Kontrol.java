
package facadeeft;

public class Kredi_Kontrol {
    public void KrediKullan(Musteri musteri){
        if(Kontrol.KrediKontrol(musteri.getIDno()))
                System.out.println(musteri.getName()+" Kredi alınd...");
    else    
            System.out.println("kredi alamazsınız...");
    }
}
