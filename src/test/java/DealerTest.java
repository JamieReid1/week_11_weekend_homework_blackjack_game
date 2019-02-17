
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class DealerTest {

    private Dealer dealer;
    private Deck deck;
    private Card card;

    @Before
    public void Before(){

        dealer = new Dealer();
        deck = new Deck();
        card = new Card(Suit.DIAMONDS, Rank.ACE);

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

    @Test
    public void canGetCard(){
        Card card = dealer.dealCard(deck);
        dealer.getCard(card);
        assertEquals(1, dealer.cardCount());
    }

    @Test
    public void canGetHandValue(){
        dealer.getCard(card);
        assertEquals(11, dealer.getHandValue());
    }

    @Test
    public void canGetBust(){
        assertEquals(false, dealer.getBust());
    }

    @Test
    public void canSetBust(){
        dealer.setBust(true);
        assertEquals(true, dealer.getBust());
    }

}
