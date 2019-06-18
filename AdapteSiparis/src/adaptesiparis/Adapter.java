
package adaptesiparis;


public class Adapter implements Kemen {
    private Gitar gitar;
    public Adapter(){
        gitar=new Gitar();
    }
    public Gitar getGitar(){
        return gitar;
    }

    @Override
    public void KemenSat() {
        System.out.println("kemen satıldı");
    }
    
}
