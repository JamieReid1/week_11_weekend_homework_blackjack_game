
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){

        cards = new ArrayList<>();
        populateDeck();

    }


    public int deckCardCount(){
        return this.cards.size();
    }

    public void populateDeck(){
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffleCards(){
        Collections.shuffle(this.cards);
    }

    public Card dealCard(){
        return this.cards.remove(0);
    }


}
