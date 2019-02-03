package formeGeometrie;

public class Triunghi extends FormaGeometrica {

    private int l1, l2;

    public Triunghi(int l1, int l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public double getArie () {
        int arie = l1*l2/2;
        return arie;
    }
}
