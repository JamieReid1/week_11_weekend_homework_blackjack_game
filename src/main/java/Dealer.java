
import java.util.ArrayList;


public class Dealer {

    private ArrayList<Card> hand;
    private boolean bust;

    public Dealer(){
        this.hand = new ArrayList<>();
        this.bust = false;
    }


    public ArrayList<Card> getHand(){
        return this.hand;
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

    public int getHandValue(){
        int total = 0;
        for (Card card : this.hand){
            total += card.getCardValue();
        }
        return total;
    }

    public boolean getBust(){
        return this.bust;
    }

    public void setBust(boolean value){
        this.bust = value;
    }

}
