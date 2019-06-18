
package facadeeft;

public class EFT {
    public void eftGonder(Musteri gonderici,Musteri alici,double miktar){
        if(Kontrol.NakitKontrol(gonderici, miktar)){
            gonderici.setNakit(gonderici.getNakit()-miktar);
            alici.setNakit(alici.getNakit()+miktar);
            System.out.println("EFT: "+alici.getName()+" e "+miktar+" tl gönderildi. Kalan bakiya: "+gonderici.getNakit());
            System.out.println(alici.getName()+" in "+alici.getNakit() +" tlsi vardır");
        }
        else    
            System.out.println("bakiye yetersiz...");
    }
}
