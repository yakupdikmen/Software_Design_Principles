
package absractfactoryaraba;


public class MercedesKasa extends KasaAbstract {
    @Override
    public void LastikTak(LastikAbstract lastik) {
        System.out.println(lastik+" lastikli bmw.");
    }
}
