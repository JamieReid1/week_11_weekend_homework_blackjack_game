
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class GameTest {

    private Game game;
    private Deck deck;
    private Dealer dealer;
    private Player player1;
    private Player player2;
    private Player player3;
    private ArrayList<Player> players;

    @Before
    public void Before(){

        deck = new Deck();
        dealer = new Dealer();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        player3 = new Player("Player 3");
        players = new ArrayList<>();
        game = new Game(deck, dealer, players);

    }


    @Test
    public void canGetPlayerCount(){
        game.addPlayer(player1);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        assertEquals(2, game.playerCount());
    }

    @Test
    public void canPlayGame1Player(){
        game.addPlayer(player1);
        game.setup();
        assertEquals(2, dealer.cardCount());
        assertEquals(2, player1.cardCount());
        assertEquals(48, deck.cardCount());
    }

    @Test
    public void canPlayGame3Players(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(player3);
        game.setup();
        assertEquals(2, dealer.cardCount());
        assertEquals(2, player1.cardCount());
        assertEquals(2, player2.cardCount());
        assertEquals(2, player3.cardCount());
        assertEquals(44, deck.cardCount());
    }

}
