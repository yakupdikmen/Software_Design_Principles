
package builderbilgisayar;

import java.util.Hashtable;


public class Bilgisayar {
   private String name;
   Hashtable<String, String> parcalar =  new Hashtable<String, String>();
             
    public Bilgisayar(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Bilgisayar_Bilgi(){
    
        System.out.println("Bilgisayar adı: "+getName());
        System.out.println("bilgisayar cdrom: "+parcalar.get("cdrom"));
        System.out.println("bilgisayar ram: "+parcalar.get("ram"));
        System.out.println("bilgisayar monitor: "+parcalar.get("monitor"));
        System.out.println("bilgisayar hdd: "+parcalar.get("hdd"));
    }
   
    
}
