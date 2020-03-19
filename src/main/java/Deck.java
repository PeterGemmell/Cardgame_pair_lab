import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

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


    public void populateDeck(){
      for(SuitType suit : SuitType.values()){
          for(RankType rank : RankType.values()){
              Card card = new Card(rank, suit);
              this.addCard(card);
          }
      }
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    public Card getFirstCard(){
      return this.cards.get(0);
    }

    public void dealFirstCard(Player playerName){
        Card card = this.getFirstCard();
        playerName.addCard(card);
    }

    public Card dealOne(){
        return this.cards.remove(0);
    }
}

