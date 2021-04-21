package abstraction.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String ranks = scanner.nextLine();
        String suit = scanner.nextLine();
        int sum = Ranks.valueOf(ranks).getValue() + Suit.valueOf(suit).getValue();
        System.out.printf("Card name: %s of %s; Card power: %d", ranks, suit, sum);

    }

}
