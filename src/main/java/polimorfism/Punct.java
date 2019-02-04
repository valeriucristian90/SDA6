package polimorfism;

public class Punct {

    private int x, y;

    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void afisare() {
        System.out.println("Coordonatele punctului sunt : " + " X = " + x + " Y = " + y);
    }
}
