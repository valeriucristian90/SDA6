package persoana;

public class Persoana {

    int varsta;
    String nume;
    String sex;
    String stareCivila;
    String numePartener;

    public Persoana(int varsta, String nume, String sex, String stareCivila, String numePartener) {
        this.varsta = varsta;
        this.nume = nume;
        this.sex = sex;
        this.stareCivila = stareCivila;
        this.numePartener = numePartener;
    }

    public Persoana(int varsta, String nume, String sex, String stareCivila) {
        this.varsta = varsta;
        this.nume = nume;
        this.sex = sex;
        this.stareCivila = stareCivila;

    }

    public Persoana(int varsta, String nume, String sex) {
        this.varsta = varsta;
        this.nume = nume;
        this.sex = sex;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getSex() {
        return sex;
    }

    public String getStareCivila() {
        return stareCivila;
    }

    public String getNumePartener () {
        return numePartener;
    }

    public void setStareCivila (String stareCivila) {
        this.stareCivila = stareCivila;
    }

    public void setNumePartener (String numePartener){
        this.numePartener = numePartener;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", sex='" + sex + '\'' +
                ", stareCivila='" + stareCivila + '\'' +
                ", numePartener='" + numePartener + '\'' +
                '}';
    }
}
