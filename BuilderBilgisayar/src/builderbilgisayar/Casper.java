
package builderbilgisayar;

public class Casper implements BilgisayarTopla {
    private Bilgisayar casper;
        public Bilgisayar getBilgisayar() {
        return casper;
    }
    public Casper(){casper=new Bilgisayar("Casper");}
   
    @Override
    public void Ram_olustur() {
        casper.parcalar.put("ram", "256 gb");
    }

    @Override
    public void CDrom_olustur() {
        casper.parcalar.put("cdrom", "48x creative");
    }

    @Override
    public void Monitor_olustur() {
       casper.parcalar.put("monitor", "15 casper");
    }
    @Override
    public void HDD_olustur() {
       casper.parcalar.put("hdd", "1 tb casper");
    }

    
}
