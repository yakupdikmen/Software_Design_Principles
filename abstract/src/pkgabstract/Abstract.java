/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author yakup_dikmen
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        a1.setA(5);
        a2.setA(a1.getA()*2);
        A.a=20;
        a1.setb(a1.getA());
        a1.setA(10);
        a2.setb(A.a);
        
        
        System.out.println(
                
        );
               
    }
}
class A {
    private static  int a;
    private int b;
    public void setA(int a){
        this.a=a;
    }
    public int getA(){return a;}
     public void setb(int b){
        this.b=b;
    }
    public int getb(){return b;}
   
}
