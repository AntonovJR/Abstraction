package abstraction.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = readIntArray(scanner);
        Rectangle rectangle = new Rectangle(new Point(coordinates[0], coordinates[1]),
                new Point(coordinates[2], coordinates[3]));
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            coordinates = readIntArray(scanner);
            boolean contains = rectangle.contains(new Point(coordinates[0],
                    coordinates[1]));
            System.out.println(contains);

        }
    }
    public static int[] readIntArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
