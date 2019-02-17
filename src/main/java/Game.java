
import java.util.ArrayList;


public class Game {

    private Deck deck;
    private Dealer dealer;
    private ArrayList<Player> players;

    public Game(Deck deck, Dealer dealer, ArrayList<Player> players){
        this.deck = deck;
        this.dealer = dealer;
        this.players = players;
    }


    public int playerCount(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void setup(){
        deck.shuffleCards();
        for (int i = 0; i < 2; i++){
            Card dealerCard = dealer.dealCard(deck);
            dealer.getCard(dealerCard);
            for (Player player : this.players){
                Card playerCard = dealer.dealCard(deck);
                player.getCard(playerCard);
            }
        }
        dealer.getHand().get(0).setVisibility(true);
    }

    public void dealerPlay(){
        while (dealer.getHandValue() <= 16){
            Card dealerCard = dealer.dealCard(deck);
            dealer.getCard(dealerCard);
        }
        if (dealer.getHandValue() > 21){
            dealer.setBust(true);
        }
    }

    public ArrayList<Player> checkForWinners(){
        ArrayList<Player> winningPlayers = new ArrayList<>();
        for (Player player : this.players){
            player.getHandValue();
            if ((!player.getBust() && dealer.getBust()) || (!player.getBust() && !dealer.getBust()) && (player.getHandValue() > dealer.getHandValue())) {
                winningPlayers.add(player);
            }
        }
        return winningPlayers;
    }

    public boolean allPlayersStand(){
        boolean value = false;
        ArrayList<Player> stuckPlayers = new ArrayList<>();
        for (Player player : this.players){
            if (player.getStandValue()){
                stuckPlayers.add(player);
            }
        }
        if (stuckPlayers.size() == players.size()){
            value = true;
        }
        return value;
    }

    public void play(){
        setup();
        if (allPlayersStand()){
            dealerPlay();
            checkForWinners();
        }
    }


}
