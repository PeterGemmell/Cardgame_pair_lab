import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Card aceofClubs;
    private Card kingofHearts;

    @Before
    public void before(){
        deck = new Deck();
        aceofClubs = new Card(RankType.ACE, SuitType.CLUBS);
        kingofHearts = new Card(RankType.KING, SuitType.HEARTS);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0,deck.cardCount());
    }

    @Test
    public void canAddCard(){
        deck.addCard(aceofClubs);
        assertEquals(1,deck.cardCount());
    }

}



