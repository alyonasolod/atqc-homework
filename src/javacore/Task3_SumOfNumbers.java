package javacore;

public class Task2_SumOfNumbers {
    //Написать и запустить программу которая принимает два аргумента в виде целых чисел и выводит их сумму.

    public static void main(String args[]){

        int firstNumber,secondNumber,sum;
        System.out.println("Enter first integer number");
        firstNumber = InputChecker.getNumber();
        System.out.println("Enter second integer number");
        secondNumber = InputChecker.getNumber();
        sum=firstNumber+secondNumber;
        System.out.println(firstNumber+" + "+secondNumber+" = "+sum);


    }
}
