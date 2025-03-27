package collection.compare.test;

public class Card {
    private final int rank; //카드의 숫자
    private final Suit suit; //카드의 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}