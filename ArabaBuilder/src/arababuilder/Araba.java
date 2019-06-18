
package arababuilder;

import java.util.Hashtable;

public class Araba {
    Hashtable<String,String> parcalar=new Hashtable<String,String>();
    public String toString(){
        return "Marka: "+parcalar.get("marka")+" Model: "+parcalar.get("model")+" Vites: "+parcalar.get("vites")+" Koltuk: "+parcalar.get("koltuk")+" Tavan: "+parcalar.get("tavan");
    }
}
