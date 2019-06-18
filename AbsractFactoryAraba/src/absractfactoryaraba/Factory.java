
package absractfactoryaraba;

public class Factory {
    private KasaAbstract kasa;
    private LastikAbstract lastik;
    Araba araba;
    
    
   public Factory(Araba araba){
       this.araba=araba;
       kasa=araba.CreateKasa();
       lastik=araba.CreateLastik();
     }
   public void olustur(){
       kasa.LastikTak(lastik);
   
   }
}
