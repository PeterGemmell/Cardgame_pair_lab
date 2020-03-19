public class Card {

    private String name;
    private RankType rank;
    private SuitType suit;

    public Card(RankType rank, SuitType suit) {
        this.rank = rank;
        this.suit = suit;
        this.name = new String(this.rank.getValue() + " of " + this.suit);
    }

    public String getName(){
        return name;
    }
}
