
package visitortablet;

public class ThereGVisitor implements Ivisitor {

    @Override
    public void Visit(Tablet tablet) {
        System.out.println(tablet.getModel()+" 3g özelliği aktif.");
    }
    
}
