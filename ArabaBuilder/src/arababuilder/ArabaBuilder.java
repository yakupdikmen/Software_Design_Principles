
package arababuilder;

public class ArabaBuilder {

    public static void main(String[] args) {
        ArabaBirlestir bmw =new BMW();
        ArabaBirlestir audi=new Audi();
        ArabaBirlestir mercedes=new Mercedes();
        Builder bmwaraba=new Builder(bmw);
        Builder audiaraba=new Builder(audi);
        Builder mercedesaraba=new Builder(mercedes);
    }
    
}
