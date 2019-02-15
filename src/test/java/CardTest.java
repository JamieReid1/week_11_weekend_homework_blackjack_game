import org.junit.Before;

public class CardTest {

    Card card;

    @Before
    public void before(){

        card = new Card(Suit.DIAMONDS, Rank.ACE);

    }


}
