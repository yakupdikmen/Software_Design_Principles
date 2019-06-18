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
public class OtoMAin {
    
    public static void Goster(model1 oto){
        System.out.println(oto.getTur());
        System.out.println(oto.getMotorGuc());
        System.out.println(oto.getRenk());
        System.out.println(oto.getTork());
    } 

    public static void main(String[] args) {
       model1 oto1=(model1) new oto(75,100,"kirmizi");
       Goster(oto1);
       model1 oto2=new model1("Fiat",100,110,"beyaz");
       Goster(oto2);
       
    }
    
}
