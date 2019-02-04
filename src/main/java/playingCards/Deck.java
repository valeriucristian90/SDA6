package playingCards;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Deck {

    Card deck[] ;

    public Deck() {
        this.deck = new Card[52] ;
    }

    public void createDeck() {

        ColorGameCards[] color = ColorGameCards.values();
        NumberGameCards[] number = NumberGameCards.values();
        int index = 0;

        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j <number.length ; j++) {

                Card x = new Card(color[i], number[j]);

                deck [index] = x;
                index++;
            }
        }
    }

    @Override
    public String toString() {
       return Arrays.deepToString(deck);
    }
}
