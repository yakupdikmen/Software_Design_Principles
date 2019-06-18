
package arababuilder;

public class Mercedes extends ArabaBirlestir {
    private Araba araba;
    public Mercedes(){araba=new Araba();}
    @Override
    public void createMarka() {
        araba.parcalar.put("marka", "Mercedes");
    }

    @Override
    public void createModel() {
       araba.parcalar.put("model", "benz");
    }

    @Override
    public void createVites() {
        araba.parcalar.put("vites", "otomatik");
    }

    @Override
    public void createKoltuk() {
        araba.parcalar.put("koltuk", "5");
    }

    @Override
    public void createTavan() {
        araba.parcalar.put("tavan", "kapalı");
    }

    @Override
    public Araba getAraba() {
        return araba;
    }
    
}
