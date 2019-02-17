
import java.util.ArrayList;


public class Player {

    private String name;
    private ArrayList<Card> hand;
    private boolean bust;
    private boolean stick;

    public Player(String name){

        this.name = name;
        this.hand = new ArrayList<>();
        this.bust = false;
        this.stick = false;

    }


    public String getName(){
        return this.name;
    }

    public int cardCount(){
        return this.hand.size();
    }

    public void getCard(Card card){
        this.hand.add(card);
    }

    public void foldHand(){
        this.hand.clear();
    }

    public int getHandValue(){
        int total = 0;
        for (Card card : this.hand) {
            total += card.getCardValue();
        }
        if (total > 21){
            setBust(true);
        }
        return total;
    }

    public boolean getBust(){
        return this.bust;
    }

    public void setBust(boolean value){
        this.bust = value;
    }

    public void stick(){
        this.stick = true;
    }

    public boolean getStick(){
        return this.stick;
    }


}
