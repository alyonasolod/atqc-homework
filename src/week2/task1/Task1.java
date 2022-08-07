package week2.task1;

import javacore.InputChecker;

public class Task1 {
    //задачка на тему метод: написать метод который вычисляет сумму двух чисел и возвращает ее.

    /*для красоты навесила сюда ввод чисел с клавиатуры из домашки первой недели и вызов созданного метода из статического метода main
    main, ессно, можно и впринципе не писать . Тогда и наш метод getSum может не быть статическим */

    static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        System.out.println("Please, enter first number");
        int a = InputChecker.getNumber();
        System.out.println("Please, enter second number");
        int b = InputChecker.getNumber();
        System.out.println(a + " + " + b + "= " + getSum(a, b));
    }
}
