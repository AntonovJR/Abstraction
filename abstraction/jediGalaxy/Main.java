package abstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = createMatrices(scanner);

        String command = scanner.nextLine();
        int sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediLocation = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int[] evilLocation = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int evilRow = evilLocation[0];
            int evilCol = evilLocation[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (evilRow < matrix.length && evilCol < matrix[0].length) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int jediRow = jediLocation[0];
            int jediCol = jediLocation[1];

            while (jediRow >= 0 && jediCol < matrix[1].length) {
                if (jediRow < matrix.length && jediCol >= 0 && jediCol < matrix[0].length) {
                    sum += matrix[jediRow][jediCol];
                }

                jediCol++;
                jediRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static int[][] createMatrices(Scanner scanner) {
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = input[0];
        int y = input[1];
        int[][] matrix = new int[x][y];


        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }
}
