
package bridgebilgisayar;

public class Casper implements Fabrika{

    @Override
    public void createRam(Ram ram) {
        System.out.println("----casper ram----");
        ram.Yazdır();
    }

    @Override
    public void createHdd(Hdd hdd) {
        System.out.println("-----casper hdd-----");
        hdd.Yazdır();
    }
    
}
