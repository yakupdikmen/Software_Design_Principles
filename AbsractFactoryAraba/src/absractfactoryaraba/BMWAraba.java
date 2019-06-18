
package absractfactoryaraba;


public class BMWAraba extends Araba {

    @Override
    public LastikAbstract CreateLastik() {
        return new BMWLastik();
    }

    @Override
    public KasaAbstract CreateKasa() {
       return new BMWKasa();
    }
    
}
