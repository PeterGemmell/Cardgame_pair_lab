import java.lang.reflect.Array;
import java.util.ArrayList;

public class Deck {

  private ArrayList<Card> cards;
  public Deck(){
    this.cards = new ArrayList<Card>();
  }

  public ArrayList getCards(){
      return cards;
  }

  public void addCard(Card card){
     this.cards.add(card);
  }

    public int cardCount(){
      return cards.size();
    }
}
