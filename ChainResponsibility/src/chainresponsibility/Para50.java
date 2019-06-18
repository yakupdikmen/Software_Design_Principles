
package chainresponsibility;

public class Para50 extends Para {
    @Override
    public void Hesapla(int sayi) {
      if(sayi>=50)
        {
             setKalan(sayi);
                while(getKalan()>=50)
                {
                     setKalan(getKalan()-50);
                     setAdet(getAdet()+1);
                 }
                System.out.println(getAdet()+" tane "+" 50 lira ");
                if(sonraki!=null)sonraki.Hesapla(getKalan());
        }
        else if(sonraki!=null){
            sonraki.Hesapla(sayi);
        }
        
    }
}
