import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest {

    private Dealer dealer;
    private Deck deck;

    @Before
    public void Before(){

        dealer = new Dealer();
        deck = new Deck();

    }


    @Test
    public void canGetNumberOfCardsInHand(){
        assertEquals(0, dealer.cardCount());
    }

    @Test
    public void canDealCard(){
        Card card = dealer.dealCard(deck);
        assertNotNull(card);
        assertEquals(51, deck.cardCount());
    }

}
