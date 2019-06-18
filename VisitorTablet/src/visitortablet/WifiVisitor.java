
package visitortablet;

public class WifiVisitor implements Ivisitor {

    @Override
    public void Visit(Tablet tablet) {
        System.out.println(tablet.getModel()+" wifisi açıldı.");
    }
    
}
