import org.junit.Before;

public class PlayerTest {

    private Player player;
    private Card card;

    @Before
    public void Before(){

        player = new Player("Jamie");
        card = new Card(Suit.DIAMONDS, Rank.ACE);

    }


    

}
