
package visitortablet;


public class Ipad extends Tablet {

    public Ipad(String model, String Brand) {
        super(model, Brand);
    }

    @Override
    public void Accept(Ivisitor visitor) {
        visitor.Visit(this);
    }
    
}
