package org.example.sandbox.cards;

import java.util.Objects;

public class Card implements Comparable<Card> {

    private final Suit suit;
    private final FaceValue faceValue;

    public Card(Suit suit, FaceValue faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", faceValue=" + faceValue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && faceValue == card.faceValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, faceValue);
    }

    @Override
    public int compareTo(Card other) {
        int suitCompare = this.suit.compareTo(other.suit);
        if (suitCompare != 0) {
            return suitCompare;
        }
        return this.faceValue.compareTo(other.faceValue);
    }
}
