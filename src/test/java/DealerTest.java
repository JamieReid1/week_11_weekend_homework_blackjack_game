import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
