
package absractfactoryaraba;

public class MercedesAraba extends Araba{

    @Override
    public LastikAbstract CreateLastik() {
       return new MercedesLastik();
    }

    @Override
    public KasaAbstract CreateKasa() {
        return new MercedesKasa();
    }
    
}
