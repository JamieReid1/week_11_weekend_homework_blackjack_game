
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
        assertEquals("Jamie", player.getPlayerName());
    }

}
