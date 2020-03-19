import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void setup(){
        player = new Player("Peter");
//        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void playerHasName(){
        assertEquals("Peter", player.getName());
    }

    @Test
    public void playerGetFirstCard(){
        player.addCard(card);
        assertEquals(1, player.cardCount());
    }
}
