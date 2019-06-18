
package arababuilder;

public class BMW extends ArabaBirlestir{
    private Araba araba;
    public BMW(){araba=new Araba();}
    @Override
    public void createMarka() {
        araba.parcalar.put("marka","BMW");
    }

    @Override
    public void createModel() {
       araba.parcalar.put("model", "i200");
    }

    @Override
    public void createVites() {
        araba.parcalar.put("vites","otomatik");
    }

    @Override
    public void createKoltuk() {
        araba.parcalar.put("koltuk", "5 koltuk");
    }

    @Override
    public void createTavan() {
        araba.parcalar.put("tavan", "açılır");
    }

    @Override
    public Araba getAraba() {
        return araba;
    }
    
}
