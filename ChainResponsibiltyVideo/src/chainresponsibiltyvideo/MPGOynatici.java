
package chainresponsibiltyvideo;

public class MPGOynatici extends VideoOynatici {

    @Override
    public void Oynat(String uzanti) {
        if(uzanti=="Mpg"){
            System.out.println("Mpg dosyası oynatılıyor...");
           }
        else if(sonrakiOynatici!=null){
        sonrakiOynatici.Oynat(uzanti);
        }
        else System.out.println("dosya oynatılamıyor");
    }
    
}
