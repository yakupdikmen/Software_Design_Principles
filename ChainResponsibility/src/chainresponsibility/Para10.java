
package chainresponsibility;

public class Para10 extends Para {
    @Override
    public void Hesapla(int sayi) {
      if(sayi>=10)
        {
             setKalan(sayi);
                while(getKalan()>=10)
                {
                     setKalan(getKalan()-10);
                     setAdet(getAdet()+1);
                 }
                System.out.println(getAdet()+" tane "+" 10 lira ");
                if(sonraki!=null)sonraki.Hesapla(getKalan());
        }
        else if(sonraki!=null){
            sonraki.Hesapla(sayi);
        }
        
    }
}
