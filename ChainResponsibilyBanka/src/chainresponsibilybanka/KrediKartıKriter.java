
package chainresponsibilybanka;

public class KrediKartıKriter extends Kriter{

    @Override
    public void KrediVer(int sayi1, int sayi2) {
        if(sayi2==0) sonrakikriter.KrediVer(sayi1, sayi2);
    }
    
}
