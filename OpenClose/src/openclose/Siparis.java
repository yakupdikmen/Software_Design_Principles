/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclose;

/**
 *
 * @author yakup_dikmen
 */
public class Siparis {
    public static void odemeYap(User user){
        int toplamTutar=0;
         for (int i = 0; i < user.getUrunler().size(); i++) {
            toplamTutar+=user.getUrunler().get(i).getFiyat();
        }
        System.out.println(user.getIsim()+" tarafından "+toplamTutar+" odendi");
    }
}
