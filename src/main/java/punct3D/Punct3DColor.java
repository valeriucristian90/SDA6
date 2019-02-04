package punct3D;

public class Punct3DColor extends Punct3D {
    private String culoareaPunctului;

    public Punct3DColor(int x, int y, int z, String culoareaPunctului) {
        super(x, y, z);
        this.culoareaPunctului = culoareaPunctului;
    }

    public String getCuloareaPunctului() {
        return culoareaPunctului;
    }

    public boolean compara(Punct3DColor p) {
        if ((getX() == p.getX()) && (getY() == p.getY()) && (getZ() == p.getZ())
                && culoareaPunctului.equals(p.culoareaPunctului))
            return true;
        else
            return false;
    }

    public void afisare() {
        System.out.println("Coordonatele punctului sunt : " + "X = " + getX() + " Y = " + getY() + " Z = " + getZ()
        + " , iar culoarea punctului este : " + culoareaPunctului);
    }
}
