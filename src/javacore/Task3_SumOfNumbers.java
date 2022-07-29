package javacore;

public class Task3_SumOfNumbers {
    //Написать и запустить программу которая принимает два аргумента в виде целых чисел и выводит их сумму.

    public static void main(String args[]){

        int firstNumber,secondNumber;
        System.out.println("Enter first integer number");
        firstNumber = InputChecker.getNumber();
        System.out.println("Enter second integer number");
        secondNumber = InputChecker.getNumber();
        System.out.println(firstNumber+" + "+secondNumber+" = "+ (firstNumber+secondNumber));


    }
}
