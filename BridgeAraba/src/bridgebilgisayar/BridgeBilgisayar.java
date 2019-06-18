
package bridgebilgisayar;

public class BridgeBilgisayar {

    public static void main(String[] args) {
        Fabrika lenova=new Lenova();
         Fabrika casper=new Casper();
         lenova.createHdd(new Hdd1tb());
         lenova.createRam(new Ram8());
         casper.createHdd(new Hdd1tb());
         lenova.createRam(new Ram16());
         casper.createRam(new Ram16());
         lenova.createHdd(new Hdd500Mb());
        
         
       
    }
    
}
