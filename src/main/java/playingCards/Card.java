package playingCards;

public class Card {

    ColorGameCards colorGameCards;
    NumberGameCards numberGameCards;

    public Card(ColorGameCards colorGameCards, NumberGameCards numberGameCards) {
        this.colorGameCards = colorGameCards;
        this.numberGameCards = numberGameCards;
    }

    public void afisare() {
        System.out.println(numberGameCards + " " + colorGameCards);
    }

    @Override
    public String toString() {
        return numberGameCards + " " +
                colorGameCards + "\n";
    }
}
