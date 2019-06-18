
package chainresponsibiltyvideo;

public class ChainResponsibiltyVideo {

    public static void main(String[] args) {
        VideoOynatici mp4=new Mp4Oynatici();
        VideoOynatici mpg=new MPGOynatici();
        VideoOynatici avi=new AVIOynatici();
        mp4.sonrakiOynatici=mpg;
        mpg.sonrakiOynatici=avi;
        
        mp4.Oynat("Mpg");
        mp4.Oynat("Avi");
        mpg.Oynat("Avi");
    }
    
}
