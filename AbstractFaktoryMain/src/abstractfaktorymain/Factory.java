
package abstractfaktorymain;

public class Factory {
    private PcFaktory pcFactory;
    private HddAbstract hdd;
    private RamAbstract ram;

    public  Factory(PcFaktory pcfaktory){
        pcFactory=pcfaktory;
        hdd=pcFactory.CreateHdd();
        ram=pcFactory.CreateRam();
    }
    public void Birlestir(){
    
        hdd.HddIslem();
        hdd.Hddtur();
        ram.RamIslem();
        ram.Ramtur();
    
    }
   
}
