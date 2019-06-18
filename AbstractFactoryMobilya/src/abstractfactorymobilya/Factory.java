
package abstractfactorymobilya;

public class Factory {
    
    private Masa masa;
    private Dolap dolap;
    public Factory(Fabrika fabrika){
        masa=fabrika.CreateMasa();
        dolap=fabrika.CreateDolap();
    }
    public void Birlestir(){
        masa.MasaBilgi();
        dolap.DolapBilgi();
    }
}
