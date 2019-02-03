package contBancar;

public class ContBancar {
    private int suma;

    public ContBancar(int suma) {
        System.out.println("Cont Bancar");
        this.suma = suma;
    }

    public void adauga (int x){
        this.suma += x;
    }

    public boolean extrage (int x){
        boolean var;
        if (x > suma){
            System.out.println("Nu se poate efectua tranzactia");
            var = false;
        }else{
            suma = suma -x;
            var = true;
        }
        return var;
    }

    public int getSuma() {
        return suma;
    }

    public void afisare(){
        System.out.println("Suma Cont Bancar = " + suma);
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "suma=" + suma +
                '}';
    }
}
