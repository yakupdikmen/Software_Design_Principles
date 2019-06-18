
package arababuilder;

public class Builder {
    public Builder(ArabaBirlestir araba){
        araba.createMarka();
        araba.createModel();
        araba.createKoltuk();
        araba.createTavan();
        araba.createVites();
        System.out.println(araba.getAraba().toString()); 
    
    }
}
