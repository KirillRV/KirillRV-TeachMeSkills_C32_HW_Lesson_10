package com.teachmeskills.hw.lesson_10.client;


import com.teachmeskills.hw.lesson_10.card.Card;

public class Client {

    private final Card[] cards;

    public Client(String name, Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
}