
package chainresponsibiltyvideo;

public class AVIOynatici  extends VideoOynatici {

    @Override
    public void Oynat(String uzanti) {
        if(uzanti=="Avi"){
            System.out.println("Avi dosyası oynatılıyor...");
        }
        else if(sonrakiOynatici!=null){
            sonrakiOynatici.Oynat(uzanti);
        }
        else System.out.println("dosya oynatılamıyor...");
    }
    
}
