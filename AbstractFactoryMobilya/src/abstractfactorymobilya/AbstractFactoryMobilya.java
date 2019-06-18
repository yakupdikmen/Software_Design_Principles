
package abstractfactorymobilya;


public class AbstractFactoryMobilya {

   
    public static void main(String[] args) {
        Fabrika bellona=new Bellona();
        Fabrika istikbal=new Istikbal();
        Factory fac=new Factory(bellona);
        fac.Birlestir();
        Factory fac1=new Factory(istikbal);
        fac1.Birlestir();
    }
    
}
