package abstraction.studentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        String input = scanner.nextLine();
        while (!"Exit".equals(input)) {
            String[] studentInfo = input.split("\\s+");
            switch (studentInfo[0]) {
                case "Create":
                    Student student = new Student(studentInfo[1], Integer.parseInt(studentInfo[2]), Double.parseDouble(studentInfo[3]));
                    studentSystem.create(studentInfo[1], student);
                    break;
                case "Show":
                    System.out.println(studentSystem.toString(studentInfo[1]));

                    break;
            }
            input = scanner.nextLine();

        }
    }
}
