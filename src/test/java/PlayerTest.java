
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlayerTest {

    private Player player;
    private Card card1;
    private Card card2;
    private Card card3;

    @Before
    public void Before(){

        player = new Player("Jamie");
        card1 = new Card(Suit.DIAMONDS, Rank.ACE);
        card2 = new Card(Suit.CLUBS, Rank.EIGHT);
        card3 = new Card(Suit.CLUBS, Rank.QUEEN);

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
        player.getCard(card1);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void canFoldHand(){
        player.getCard(card1);
        assertEquals(1, player.cardCount());
        player.foldHand();
        assertEquals(0, player.cardCount());
    }

    @Test
    public void canGetHandValue(){
        player.getCard(card1);
        assertEquals(11, player.getHandValue());
    }

    @Test
    public void canGetBust(){
        assertEquals(false, player.getBust());
    }

    @Test
    public void canSetBust(){
        player.setBust(true);
        assertEquals(true, player.getBust());
    }


}
