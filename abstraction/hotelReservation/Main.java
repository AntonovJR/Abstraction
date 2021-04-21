package abstraction.hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        Season season = Season.valueOf(input[2]) ;
                Discount discount = Discount.valueOf(input[3]);
        System.out.printf("%.2f",PriceCalculator.CalculatePrice(Double.parseDouble(input[0]), Integer.parseInt(input[1]), season, discount));
    }
}
