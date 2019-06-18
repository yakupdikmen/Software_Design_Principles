
package observerurun;

public class ObserverUrun {

    public static void main(String[] args) {
       Urun urun1=new Urun1("makarna",50);
       Urun urun3=new Urun1("kitap",80);
       Urun urun2=new Urun2("köfte",75);
       Kullanici ali=new Kullanici("ail");
       Kullanici veli=new Kullanici("veli");
       urun1.takipci.add(veli);
       urun1.takipci.add(ali);
       urun2.takipci.add(veli);
       urun2.takipci.add(ali);
       urun1.setFiyat(35);
       urun2.setFiyat(48);
       urun3.setFiyat(80);
        System.out.println(urun3.getFiyat());
    }
    
    
}
