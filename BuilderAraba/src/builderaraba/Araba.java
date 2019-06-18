
package builderaraba;

import java.util.Hashtable;

public abstract class Araba {
     String marka;
    Hashtable<String, String> parcalar =  new Hashtable<String, String>();
    public Araba(String name){setMarka(name);}
    public  String getMarka() {
        return marka;
    }

   public void setMarka(String marka1) {
        this.marka = marka1;
    }
    public void Bilgi(){
        System.out.println("araba markası: "+getMarka());
        System.out.println("araba model: "+parcalar.get("marka"));
        System.out.println("araba beygir gücü: "+parcalar.get("beygir"));
        System.out.println("araba tekerlek: "+parcalar.get("tekerlek"));
    }
    
}
