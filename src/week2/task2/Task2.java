package week2.task2;

import javacore.InputChecker;

public class Task2 {
    //написать метод который принимает число и возарвщает тру или фалс если это число четное или нечетное.

    /* Аналогично первой задаче - добавим чуток "красивостей" :)
    Проверим ввод с клавиатуры и выведем результат в static void main
    */
    static boolean isEven(int number) {return number % 2 == 0 ? true : false;}

    public static void main(String[] args) {
        System.out.println("Enter a value for check whether it is odd or even");
        int n = InputChecker.getNumber();
        System.out.println("Your number is: " + (isEven(n) ? "even" : "odd")); //больше тернарности богу тернарности ! >_<

    }

}
