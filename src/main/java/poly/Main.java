package poly;

public class Main {
    public static void main(String[] args) {
        Animal caine = new Caine();
        Animal pisica = new Pisica();
        Animal leu = new Leu();
        Animal lup = new Lup();
        Animal zoo [] = {caine, pisica, leu, lup} ;

        for (Animal  x : zoo){
            x.actiune();
        }
    }
}
