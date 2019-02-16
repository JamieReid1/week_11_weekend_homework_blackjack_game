
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void Before(){

        deck = new Deck();

    }


    @Test
    public void canPopulateDeckWith52Cards(){
        deck.populateDeck();
        assertEquals(52, deck.deckCardCount());
    }


}
