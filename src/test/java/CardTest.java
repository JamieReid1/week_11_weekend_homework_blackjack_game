
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){

        card = new Card(Suit.DIAMONDS, Rank.ACE);

    }


    @Test
    public void canGetSuit(){
        assertEquals(Suit.DIAMONDS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void canGetCardValue(){
        assertEquals(11, card.getCardValue());
    }


}
