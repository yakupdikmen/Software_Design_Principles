
package openclose;

import java.util.ArrayList;
import java.util.List;

public class OpenClose {

  
    public static void main(String[] args) {
      Urun urun1=new Urun();
      urun1.urunOlustur("telefon", 1, 250);
      Urun urun2=new Urun();
      urun2.urunOlustur("televizyon", 1, 250);
      User user1=new User();
        List<Urun> urunler=new ArrayList<Urun>();
      urunler.add(urun2);
      urunler.add(urun1);
     
      user1.kullaniciOlustur("yakup","aydah@fadf", 1);
      
      user1.setUrunler(urunler);
      
      Siparis.odemeYap(user1);
      
      
    }
    
}
