package abstraction.cardSuit;

import java.util.Scanner;

public class Main {
       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        switch (input) {
            case "Card Suits":
                System.out.println("Card Suits:");
                for (Suit suit : Suit.values()) {
                    System.out.printf("Ordinal value: %d; Name value: %s%n", suit.getValue(), suit.getName());

                }
                break;
            case "Card Ranks":

                break;
        }
    }
}
