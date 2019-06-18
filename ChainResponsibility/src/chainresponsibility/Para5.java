

package chainresponsibility;

public class Para5 extends Para {
    @Override
    public void Hesapla(int sayi) {
      if(sayi >=5)
        {
             setKalan(sayi);
                while(getKalan()>=5)
                {
                     setKalan(getKalan()-5);
                     setAdet(getAdet()+1);
                 }
                System.out.println(getAdet()+" tane "+" 5 lira ");
                if(sonraki!=null)sonraki.Hesapla(getKalan());
        }
        else if(sonraki!=null){
            sonraki.Hesapla(sayi);
        }
        
        
    }
}
