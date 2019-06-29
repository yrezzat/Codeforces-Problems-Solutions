package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noCards = Integer.parseInt(scanner.nextLine());
        int[] cards = new int[noCards];
        int firstPlayer = 0, secondPlayer = 0;

        for (int i = 0; i < noCards; i++) {
            cards[i] = scanner.nextInt();
        }

        for (int i = 1; i <= noCards; i++) {
            if (i % 2 == 1) {
                if (cards[0] > cards[cards.length - 1]) {
                    firstPlayer += cards[0];
                    cards = Arrays.copyOfRange(cards, 1, cards.length);
                } else {
                    firstPlayer += cards[cards.length - 1];
                    cards = Arrays.copyOfRange(cards, 0, cards.length - 1);
                }
            } else if (i % 2 == 0) {
                if (cards[0] > cards[cards.length - 1]) {
                    secondPlayer += cards[0];
                    cards = Arrays.copyOfRange(cards, 1, cards.length);
                } else {
                    secondPlayer += cards[cards.length - 1];
                    cards = Arrays.copyOfRange(cards, 0, cards.length - 1);
                }
            }

        }
        System.out.println(firstPlayer + " " + secondPlayer);
    }
}
