
package builderbilgisayar;


public class BuilderBilgisayar {

    
    public static void main(String[] args) {
        BilgisayarTopla casper =new Casper();
        BilgisayarTopla monster =new Monster();
        TeknikServis teknik=new TeknikServis();
        teknik.BilgisayarToplama(casper);
        casper.getBilgisayar().Bilgisayar_Bilgi();
        teknik.BilgisayarToplama(monster);
        monster.getBilgisayar().Bilgisayar_Bilgi();
    }
    
}
