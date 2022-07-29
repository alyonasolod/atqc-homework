package javacore;

import java.util.Scanner;

public class Number {
    //проверка ввода целого числа с клавиатуры
    public static int getNumber(){

        while(true){
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                return  scanner.nextInt();
            } else {
                System.out.println('\n'+"You entered something that IS NOT an integer number. Please, try again");
            }
        }

    }
}
