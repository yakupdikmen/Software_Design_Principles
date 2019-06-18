
package absractfactoryaraba;

public class AbsractFactoryAraba {

    public static void main(String[] args) {
        Araba bmw=new BMWAraba();
       Factory fac=new Factory(bmw);
       
       fac.olustur();
    }
    
}
