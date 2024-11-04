package com.teachmeskills.hw.lesson_10.card;
import java.util.Objects;
public class Card {
    private final int cardnumber;
    private final int cvv;
    private final int amount;

    public Card(int cardnumber, int cvv, int amount) {
        this.cardnumber = cardnumber;
        this.cvv = cvv;
        this.amount = amount;
    }
    @Override
    public boolean equals(Object o) {
        if ( this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Card card = (Card) o;
        return cvv == card.cvv && Objects.equals(cardnumber, card.cardnumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cardnumber, cvv);
    }
}
