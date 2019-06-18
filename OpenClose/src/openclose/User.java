/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclose;

import java.util.List;

/**
 *
 * @author yakup_dikmen
 */
public class User {
    private int id;
    private String isim,mail;
    private List<Urun> urunler;
   
    
    public List<Urun> getUrunler() {
        return urunler;
    }
    
    public void setUrunler(List<Urun> urunler) {
        this.urunler = urunler;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

   public void kullaniciOlustur(String ad,String mail,int id){
       setIsim(ad);
      
       setMail(mail);
       setId(id);
   }
}
