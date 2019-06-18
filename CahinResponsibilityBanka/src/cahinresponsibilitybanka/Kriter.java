
package cahinresponsibilitybanka;


public  abstract class Kriter {
    public boolean tasincak;
    protected Kriter sonraki;
    public void Execute(Costumer c){
        ExecuteProcess(c);
        if(this.sonraki!=null){
            this.sonraki.tasincak=this.tasincak;
            this.sonraki.Execute(Costumer costumer);
        }
    }
    public abstract void ExecuteProcess(Costumer costumer);
}
