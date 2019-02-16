
import java.util.ArrayList;


public class Dealer {

    private ArrayList<Card> hand;

    public Dealer(){

        this.hand = new ArrayList<>();

    }


    public int cardCount(){
        return this.hand.size();
    }

    public Card dealCard(Deck deck){
        return deck.dealCard();
    }

    public void getCard(Card card){
        this.hand.add(card);
    }

}
