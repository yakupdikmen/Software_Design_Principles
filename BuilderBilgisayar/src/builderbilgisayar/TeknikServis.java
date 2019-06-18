
package builderbilgisayar;


public class TeknikServis {
    public void BilgisayarToplama(BilgisayarTopla bigisayartopla){
        bigisayartopla.CDrom_olustur();
        bigisayartopla.HDD_olustur();
        bigisayartopla.Monitor_olustur();
        bigisayartopla.Ram_olustur();
    }
}
