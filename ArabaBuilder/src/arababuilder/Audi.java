
package arababuilder;

public class Audi extends ArabaBirlestir {
    private Araba araba;
    public Audi(){araba=new Araba();}
    @Override
    public void createMarka() {
        araba.parcalar.put("marka","Audi");
    }

    @Override
    public void createModel() {
       araba.parcalar.put("model","A3");
    }

    @Override
    public void createVites() {
       araba.parcalar.put("vites","manuel");
    }

    @Override
    public void createKoltuk() {
        araba.parcalar.put("koltuk", "4");
    }

    @Override
    public void createTavan() {
       araba.parcalar.put("tavan","alçak");
    }

    @Override
    public Araba getAraba() {
       return araba;
    }
    
}
