
package abstractfaktorymain;


public class AbstractFaktoryMain {

  
    public static void main(String[] args) {
        PcFaktory pcA=new FactoryA();
        PcFaktory pcB=new FactoryB();
        Factory fac1=new Factory(pcB);
        Factory fac=new Factory(pcA);
        fac.Birlestir();
        fac1.Birlestir();
        
    }
    
}