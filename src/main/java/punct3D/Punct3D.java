package punct3D;

public class Punct3D {

    private int x, y, z;

    public Punct3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void muta(int dx, int dy, int dz) {
        x += dx;
        y += dy;
        z += dz;
    }

    public boolean compara(Punct3D p) {
        if ((x == p.x) && (y == p.y) && (z == p.z))
            return true;
        else
            return false;
    }

    public double distanta(Punct3D p) {
        double distantaX = x - p.x;
        double distantaY = y - p.y;
        double distantaZ = z - p.z;
        double distanta = Math.sqrt((Math.pow(distantaX, 2) + Math.pow(distantaY, 2) + Math.pow(distantaZ, 2)));
        return distanta;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void afisare() {
        System.out.println("Coordonatele punctului sunt : " + "X = " + x + " Y = " + y + " Z = " + z);
    }
}
