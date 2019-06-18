
package chainresponsibiltyvideo;

public class Mp4Oynatici extends VideoOynatici{

    @Override
    public void Oynat(String uzanti) {
        if(uzanti=="Mp4"){
            System.out.println("Mp4 dosya oynatılıyor...");
       }
        else if(sonrakiOynatici!=null){
            sonrakiOynatici.Oynat(uzanti);
        }
        else System.out.println("dosya oynatılamıyor...");
    }
    
}
