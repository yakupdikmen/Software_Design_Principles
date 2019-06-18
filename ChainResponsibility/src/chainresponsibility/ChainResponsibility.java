/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainresponsibility;

public class ChainResponsibility {

   
    public static void main(String[] args) {
      Para p200=new Para200();
      Para p100=new Para100();
      Para p50=new Para50();
      Para p20=new Para20();
      Para p10=new Para10();
      Para p5=new Para5();
      p200.sonraki=p100;
      p100.sonraki=p50;
      p50.sonraki=p20;
      p20.sonraki=p10;
      p10.sonraki=p5;
      p200.Hesapla(185);
    }
    
}
