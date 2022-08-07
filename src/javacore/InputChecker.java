package javacore;

import java.time.temporal.ValueRange;
import java.util.Scanner;

public class InputChecker {
    //проверка ввода целого числа с клавиатуры
    public static int getNumber() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println('\n' + "You entered something that IS NOT an integer number. Please, try again");
            }
        }

    }

    public static int getMonth() {

        ValueRange range = java.time.temporal.ValueRange.of(1, 12);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (range.isValidIntValue(number)) {
                    return number;
                } else {
                    System.out.println('\n' + "You entered number that IS NOT in range from 1 to 12. Re-enter, please");
                }
            } else {
                System.out.println('\n' + "You entered something that IS NOT a number. Please, try again");
            }
        }

    }

    public static boolean checkBool() {
        boolean condition = false;
        while (!condition) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();
            } else {
                System.out.println('\n' + "You entered something that is NOT \'true\' or \'false\' Make corrections ");
            }
        }
        return false;
    }
}
