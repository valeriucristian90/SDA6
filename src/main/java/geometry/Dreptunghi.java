package geometry;

public class Dreptunghi {

    int lungime;
    int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public int CalculeazaArie (){
        int arie = getLungime() * getLatime();
        return arie;
    }

    public int CalculeazaPerimetru () {
        int perimetru = 2 * (getLatime() + getLatime());
        return perimetru;
    }
}
