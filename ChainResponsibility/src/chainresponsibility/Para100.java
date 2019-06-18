
package chainresponsibility;

public class Para100 extends Para {

    @Override
    public void Hesapla(int sayi) {
      if(sayi>=100)
        {
             setKalan(sayi);
                while(getKalan()>=100)
                {
                     setKalan(getKalan()-100);
                     setAdet(getAdet()+1);
                 }
                System.out.println(getAdet()+" tane "+" 100 lira ");
                if(sonraki!=null)sonraki.Hesapla(getKalan());
        }
        else if(sonraki!=null){
            sonraki.Hesapla(sayi);
        }
        
    }
    
}
