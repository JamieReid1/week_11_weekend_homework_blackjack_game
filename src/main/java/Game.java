
import java.util.ArrayList;


public class Game {

    private Deck deck;
    private Dealer dealer;
    private ArrayList<Player> players;

    public Game(Deck deck, Dealer dealer){

        this.deck = deck;
        this.dealer = dealer;
        this.players = new ArrayList<>();

    }


}
