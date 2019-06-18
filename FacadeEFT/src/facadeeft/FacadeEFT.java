
package facadeeft;

public class FacadeEFT {

    public static void main(String[] args) {
        Facade facade =new Facade();
        Musteri ali=new Musteri(1,"ali","e1",1000.55);
        Musteri veli=new Musteri(2,"veli","e2",500.55);
        facade.EFTyolla(veli, ali, 450.0);
        facade.KrediKullan(veli);
        facade.EFTyolla(veli, ali, 300);
        facade.EFTyolla(veli, ali, 40);
        facade.EFTyolla(ali, veli,1000);
        
    }
    
}
