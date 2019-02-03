package contBancar;

public class ContBancarExtins extends ContBancar{

    private int rataDobandaAnuala;


    public ContBancarExtins(int suma , int rataDobandaAnuala) {
        super(suma);
        System.out.println("Cont Bancar Extins");
        this.rataDobandaAnuala = rataDobandaAnuala ;
    }


    public void adaugaDobandaLunara() {
        int dobandaLunara = getSuma() * (rataDobandaAnuala);
        adauga(dobandaLunara);
    }

    @Override
    public String toString() {
        return "ContBancarExtins{" + "Suma =" + getSuma()+
                " rataDobandaAnuala =" + rataDobandaAnuala +
                '}';
    }

    public void afisare(){
        System.out.println("Suma Cont Bancar Extins = " + getSuma());
    }
}
