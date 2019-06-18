
package builderbilgisayar;

public class Monster implements BilgisayarTopla {
    Bilgisayar monster;
    public Monster(){monster=new Bilgisayar("monster");}
    @Override
    public Bilgisayar getBilgisayar() {
        return monster;
    }

    @Override
    public void Ram_olustur() {
        monster.parcalar.put("ram", "128 gb");
    }

    @Override
    public void CDrom_olustur() {
        monster.parcalar.put("cdrom", "56x");
    }

    @Override
    public void Monitor_olustur() {
        monster.parcalar.put("monitor", "15");
    }

    @Override
    public void HDD_olustur() {
        monster.parcalar.put("hdd", "1.5 tb");
    }
    
}
