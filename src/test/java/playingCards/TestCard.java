package playingCards;

import org.junit.Test;

public class TestCard {

    @Test
    public void test () {
        Card a = new Card(ColorGameCards.DIAMOND,NumberGameCards.ACE);
        a.afisare();
        Deck b = new Deck();
        b.createDeck();
        System.out.println(b.toString());


    }
}
