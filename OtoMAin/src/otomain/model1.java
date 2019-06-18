/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomain;

/**
 *
 * @author yakup_dikmen
 */
public class model1 extends oto {
    public String tur;

    public model1(String tur,double guc, double tork, String renk) {
        super(guc, tork, renk);
        this.tur=tur;
        
    }
    public String getTur() {
        return tur;
    }

    public void TurGoster(){
        System.out.println("Türü: "+getTur());
    }
}
