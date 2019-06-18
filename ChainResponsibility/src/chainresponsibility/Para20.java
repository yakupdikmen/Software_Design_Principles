
package chainresponsibility;

public class Para20 extends Para{
    @Override
    public void Hesapla(int sayi) {
      if(sayi>=20)
        {
             setKalan(sayi);
                while(getKalan()>=20)
                {
                     setKalan(getKalan()-20);
                     setAdet(getAdet()+1);
                 }
                System.out.println(getAdet()+" tane "+" 20 lira ");
                if(sonraki!=null)sonraki.Hesapla(getKalan());
        }
        else if(sonraki!=null){
            sonraki.Hesapla(sayi);
        }
        
    }
}
