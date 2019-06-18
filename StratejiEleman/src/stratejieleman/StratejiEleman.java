
package stratejieleman;

public class StratejiEleman {

    public static void main(String[] args) {
       Eleman eleman=new Eleman(new DepartmanA(),new MuhendisMaasHesapla());
        System.out.println(eleman.izin.izinHesapla()); 
        System.out.println( eleman.maas.maasHesapla());
        Eleman eleman1=new Eleman(new DepartmanB(),new TeknisyenMaasHesapla());
        System.out.println(eleman1.izin.izinHesapla());
        System.out.println(eleman1.maas.maasHesapla());
    }
    
}
