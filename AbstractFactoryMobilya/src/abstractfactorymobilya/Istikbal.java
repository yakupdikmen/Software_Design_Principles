
package abstractfactorymobilya;

public class Istikbal extends Fabrika {

    @Override
    public Masa CreateMasa() {
       return new MasaIstikbal();
    }

    @Override
    public Dolap CreateDolap() {
       return new DolapIstikbal();
    }
    
}
