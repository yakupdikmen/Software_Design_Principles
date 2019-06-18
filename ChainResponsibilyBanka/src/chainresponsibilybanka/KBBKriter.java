
package chainresponsibilybanka;


public class KBBKriter extends Kriter{

    @Override
    public void KrediVer(int sayi1, int sayi2) {
        if(sayi1<1000){System.out.println("kredi veremiyoruz.");}
        else sonrakikriter.KrediVer(sayi1,sayi2);
    }
        
}
