
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class GameTest {

    private Game game;
    private Deck deck;
    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Dealer dealer;
    private Player player1;
    private Player player2;
    private Player player3;
    private ArrayList<Player> players;

    @Before
    public void Before(){

        deck = new Deck();
        card1 = new Card(Suit.DIAMONDS, Rank.TEN);
        card2 = new Card(Suit.DIAMONDS, Rank.FIVE);
        card3 = new Card(Suit.DIAMONDS, Rank.THREE);
        card4 = new Card(Suit.DIAMONDS, Rank.NINE);
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

    @Test
    public void dealerMustTwistIf16OrLess(){
        dealer.getCard(card2);
        dealer.getCard(card3);
        assertEquals(2, dealer.cardCount());
        deck.shuffleCards();
        game.dealerPlay();
        assertNotEquals(2, dealer.cardCount());
        System.out.println(dealer.cardCount());
        System.out.println(dealer.getHandValue());
        System.out.println(dealer.getBust());
    }

    @Test
    public void dealerGoesBustOver21(){
        dealer.getCard(card1);
        dealer.getCard(card4);
        dealer.getCard(card2);
        game.dealerPlay();
        assertEquals(true, dealer.getBust());
    }

}
