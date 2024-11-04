package com.teachmeskills.hw.lesson_10;

import com.teachmeskills.hw.lesson_10.card.Card;
import com.teachmeskills.hw.lesson_10.card.CardOperation;
import com.teachmeskills.hw.lesson_10.client.Client;

/**
 * Задача 1
 * Есть клиент.
 * Клиент может иметь любое кличество карт.
 * Карта имеет три поля - cvv-код, номер карты и сумма на карте.
 * Вывести на экран сообщение о том, сколько одинаковых карты имеет клиент.
 * Поле со значением суммы на карте не должно участвовать в сравнении.
 * Т.е. две краты с одними и теми же cvv-кодами и номерами, но разными суммами считаются одинаковыми.
 * Предусмотреть различные варианты выходного сообщения - например, у клиента нет ни одной карты совсем, у клиента нет одинаковых карт и другие возможные ситуации.
 */
public class ApplicationRunner {
    public static void main(String[] args) {

        Card[] clientCards = {
                new Card(20000, 1248, 111),
                new Card(75000, 1248, 111),
                new Card(20000, 1248, 111),
                new Card(75000, 1248, 111),
                new Card(75000, 1234, 112),
                new Card(75000, 1234, 111),
                new Card(20000, 1234, 111)
        };

        Client client = new Client("User1", clientCards);

        CardOperation.compareClientCards(client.getCards());
    }
}