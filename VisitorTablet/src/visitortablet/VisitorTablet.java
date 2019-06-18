
package visitortablet;

public class VisitorTablet {

    
    public static void main(String[] args) {
        Tablet galaxy=new Galaxy("galaxy","brand");
        Tablet ıpad=new Ipad("Ipad","brand");
        Ivisitor wifi=new WifiVisitor();
        Ivisitor g = new ThereGVisitor();
        galaxy.Accept(wifi);
        ıpad.Accept(g);
        
        
    }
    
}
