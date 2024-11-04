package com.teachmeskills.hw.lesson_10.card;

public class CardOperation {

    public static void compareClientCards(Card[] cards) {

        if (cards != null && cards.length > 1) {
            int counter = 0;
            boolean[] result = new boolean[cards.length];

            for (int i = 0; i < cards.length; i++) {
                if (result[i]) {
                    continue;
                }

                int count = 1;
                for (int j = i + 1; j < cards.length; j++) {
                    if (cards[i].equals(cards[j])) {
                        count++;
                        result[j] = true;
                    }
                }

                if (count > 1) {
                    counter += count;
                }
            }
            if (counter > 0) {
                System.out.println("Identical cards" + "\nTotal identical cards: " + counter);
            } else {
                System.out.println("There is no identical cards.");
            }
        } else if (cards != null && cards.length == 1) {
            System.out.println("No com.teachmeskills.hw.lesson_10.card to compare with ");
        } else {
            System.out.println("Can't do anything :( ");
        }
    }
}
