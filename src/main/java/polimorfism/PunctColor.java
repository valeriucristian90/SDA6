package polimorfism;

public class PunctColor extends Punct {

    private String culoare;

    public PunctColor(int x, int y, String culoare) {
        super(x, y);
        this.culoare = culoare;
    }

    public String getCuloare() {
        return culoare;
    }

    public void afisare() {
        System.out.println("Coordonatele punctului sunt : " + " X = " + getX() + " Y = " + getX()
                + " ,iar culoarea punctului este :" + culoare);
    }
}
