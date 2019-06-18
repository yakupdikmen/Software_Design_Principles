
package facadeeft;

public class Musteri {
    private int Mnumara;
    private String name,IDno;
    private double nakit;

    public Musteri(int Mnumara, String name, String IDno, double nakit) {
        this.Mnumara = Mnumara;
        this.name = name;
        this.IDno = IDno;
        this.nakit = nakit;
    }

    public int getMnumara() {
        return Mnumara;
    }

    public void setMnumara(int Mnumara) {
        this.Mnumara = Mnumara;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIDno() {
        return IDno;
    }

    public void setIDno(String IDno) {
        this.IDno = IDno;
    }

    public double getNakit() {
        return nakit;
    }

    public void setNakit(double nakit) {
        this.nakit = nakit;
    }
   
}
