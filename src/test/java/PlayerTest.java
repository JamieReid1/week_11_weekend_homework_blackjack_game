
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void Before(){

        player = new Player("Jamie");
        card = new Card(Suit.DIAMONDS, Rank.ACE);

    }


    @Test
    public void canGetPlayerName(){
        assertEquals("Jamie", player.getName());
    }

    @Test
    public void canGetNumberOfCardsInHand(){
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canGetCard(){
        player.getCard(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void canFoldHand(){
        player.getCard(card);
        assertEquals(1, player.cardCount());
        player.foldHand();
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canGetHandValue(){
        player.getCard(card);
        assertEquals(11, player.getHandValue());
    }

}
