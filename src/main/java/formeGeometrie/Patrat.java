package formeGeometrie;

public class Patrat extends FormaGeometrica {
    private int lungime;

    public Patrat(int lungime) {
        this.lungime = lungime;
    }

    public double getArie () {
        int arie = lungime * lungime;
        return arie;
    }
}
