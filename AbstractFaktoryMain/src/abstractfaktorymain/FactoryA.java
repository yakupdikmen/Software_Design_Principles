
package abstractfaktorymain;

public class FactoryA implements PcFaktory {

    @Override
    public HddAbstract CreateHdd() {
        return new Hdd1();
    }

    @Override
    public RamAbstract CreateRam() {
       return new Ram1();
    }

}
