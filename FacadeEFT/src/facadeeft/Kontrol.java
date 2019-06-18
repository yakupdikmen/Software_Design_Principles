
package facadeeft;

public class Kontrol {
    public static boolean NakitKontrol(Musteri musteri ,double eftMiktar){
        if(musteri.getNakit()>=eftMiktar)
            return true;
        else 
            return false;
    }
    public static boolean KrediKontrol(String ID){
        return true;
      }
}
