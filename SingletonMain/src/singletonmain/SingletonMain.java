
package singletonmain;


public class SingletonMain {

    
    public static void main(String[] args) {
       Singleton singleton =Singleton.getNesne();
       singleton.sout();
       Singleton singleton1=Singleton.getNesne();
       singleton1.sout();
    }
   
}
