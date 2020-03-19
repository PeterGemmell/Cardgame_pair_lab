import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;


    @Before
    public void before(){
        card = new Card(RankType.EIGHT, SuitType.CLUBS);
    }

    @Test
    public void cardHasName(){
        assertEquals("EIGHT of CLUBS", card.getName());
    }
}
