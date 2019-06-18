
package abstractfaktorymain;

public class FactoryB implements PcFaktory {

    @Override
    public HddAbstract CreateHdd() {
       return new Hdd2();
    }

    @Override
    public RamAbstract CreateRam() {
        return new Ram2();
    }

}
