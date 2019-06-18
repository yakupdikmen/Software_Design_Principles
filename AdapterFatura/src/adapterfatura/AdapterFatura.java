
package adapterfatura;


public class AdapterFatura {

    public static void main(String[] args) {
         Adapter adapter=new Adapter();
        System.out.println(adapter.Hesapla(10, 20));
         System.out.println(adapter.getAdaptee().IskontaliTutarHesapla(10, 20));   
       }
    
}
