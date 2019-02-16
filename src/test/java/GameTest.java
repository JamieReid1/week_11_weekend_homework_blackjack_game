
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class GameTest {

    private Game game;
    private Deck deck;
    private Dealer dealer;
    private Player player1;
    private Player player2;

    @Before
    public void Before(){

        deck = new Deck();
        dealer = new Dealer();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        game = new Game(deck, dealer);

    }


    @Test
    public void canGetPlayerCount(){
        assertEquals(0, game.playerCount());
    }

}
