
public class Card {

    private Suit suit;
    private Rank rank;
    private boolean visibility;

    public Card(Suit suit, Rank rank){

        this.suit = suit;
        this.rank = rank;
        this.visibility = true;

    }

    public Suit getSuit(){
        return suit;
    }

    public Rank getRank(){
        return rank;
    }

    public int getCardValue(){
        return rank.getValue();
    }

    public boolean getVisibility(){
        return this.visibility;
    }

    public void setVisibility(boolean value){
        this.visibility = value;
    }

}
