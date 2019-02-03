package formeGeometrie;

public class Cerc extends FormaGeometrica {

    final static double PI = Math.PI;
    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public double getArie () {
        double arie = Math.pow(raza,2)*PI;
        return arie;
    }
}
