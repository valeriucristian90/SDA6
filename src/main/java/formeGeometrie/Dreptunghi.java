package formeGeometrie;

public class Dreptunghi extends FormaGeometrica {

    private int lung, lat;

    public Dreptunghi(int lung, int lat) {
        this.lung = lung;
        this.lat = lat;
    }

    public double getArie (){
        int arie = lung *lat;
        return arie;
    }


}
