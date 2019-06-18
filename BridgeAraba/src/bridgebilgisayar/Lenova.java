
package bridgebilgisayar;

public class Lenova implements Fabrika {
          
    @Override
    public void createRam(Ram ram) {
        System.out.println("----lenova Ram-----");
        ram.Yazdır();
    }

    @Override
    public void createHdd(Hdd hdd) {
        System.out.println("----lenova Hdd----");
        hdd.Yazdır();
    }
    
}
