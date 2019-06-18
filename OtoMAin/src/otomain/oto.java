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
public class oto {
       protected double motorGuc;
       protected double tork;
       protected String renk;
      
       public oto(double guc,double tork,String renk){
           this.motorGuc=guc;
           this.tork=tork;
           this.renk=renk;
       }

    oto(String tur, int i, int i0, String kirmizi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double getMotorGuc() {
        return motorGuc;
    }

    public double getTork() {
        return tork;
    }

    public String getRenk() {
        return renk;
    }
       public void ozellik_goster(){
           System.out.println("Motor gucu: "+getMotorGuc());
           System.out.println("Tork: "+getTork());
           System.out.println("Renk: "+getRenk());
       }

  

  
  
    
}
