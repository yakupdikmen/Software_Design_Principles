
package abstractfactorymobilya;

public class Bellona  extends Fabrika{

    @Override
    public Masa CreateMasa() {
       return new MasaBellona();
    }

    @Override
    public Dolap CreateDolap() {
        return new DolapBellona();
    }
    
}
