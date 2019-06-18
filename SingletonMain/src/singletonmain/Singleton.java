
package singletonmain;


public class Singleton {
    private static Singleton singleton;
        private Singleton(){}
    public static Singleton getNesne(){ 
        if(singleton==null)
         singleton=new Singleton();
        return singleton;
   
    }
    public void sout(){
        System.out.println("singleton tasarım deseni oluşturuldu. ");
    }
}
