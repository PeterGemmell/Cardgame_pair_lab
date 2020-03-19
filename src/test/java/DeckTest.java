import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    private Deck deck;
    private Card aceofClubs;
    private Card kingofHearts;
    private Player peter;

    @Before
    public void before(){
        deck = new Deck();
        aceofClubs = new Card(RankType.ACE, SuitType.CLUBS);
        kingofHearts = new Card(RankType.KING, SuitType.HEARTS);
        peter = new Player("peter");
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

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52,deck.cardCount());
    }

    @Test
    public void canShuffleDeck(){
        deck.populateDeck();
        Card firstCard = deck.getFirstCard();
        deck.shuffleDeck();
        Card shuffledCard = deck.getFirstCard();
        assertNotEquals(firstCard,shuffledCard);
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.shuffleDeck();
        Card topCard = deck.getFirstCard();
        deck.dealFirstCard(peter);
        assertEquals(topCard, peter.getFirstCard());
    }


}



