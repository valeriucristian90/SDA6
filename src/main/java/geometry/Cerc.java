package geometry;

public class Cerc {

    int raza ;

    public Cerc (int raza){
        this.raza = raza;
    }

    public void setRaza (int raza){
        this.raza = raza;
    }

    public int getRaza (){
        return raza;
    }

    public double CalculeazaAria () {
        double aria = Math.PI * Math.pow(getRaza(),2);
        return aria;
    }

    public double CalculeazaCircumferinta () {
        double circumferinta = (2 * Math.PI) * getRaza();
        return circumferinta;
    }
}
