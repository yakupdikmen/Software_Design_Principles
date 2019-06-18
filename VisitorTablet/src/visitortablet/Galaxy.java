
package visitortablet;

public class Galaxy  extends Tablet{

    public Galaxy(String model, String Brand) {
        super(model, Brand);
    }

    @Override
    public void Accept(Ivisitor visitor) {
       visitor.Visit(this);
    }
    
}
