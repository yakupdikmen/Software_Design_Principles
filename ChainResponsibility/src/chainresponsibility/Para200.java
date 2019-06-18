
package chainresponsibility;

public class Para200 extends Para {

    @Override
    public void Hesapla(int sayi) {
        if(sayi>=200)
        {
             setKalan(sayi);
                while(getKalan()>=200)
                {
                     setKalan(getKalan()-200);
                     setAdet(getAdet()+1);
                 }
                System.out.println(getAdet()+" tane "+" 200 lira ");
                if(sonraki!=null)sonraki.Hesapla(getKalan());
        }
        else if(sonraki!=null){
            sonraki.Hesapla(sayi);
        }
        
    }
    
    
}
