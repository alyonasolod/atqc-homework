package javacore;

public class TernaryOperatorExample  {

    //Написать и запустить программу которая принимает два аргумента в виде целых чисел и выводит бОльшее из них он через тернарный оператор
    public static void main(String args[]){
        int firstNumber,secondNumber, temp;
        System.out.println("Enter first integer number");
        firstNumber = InputChecker.getNumber();
        System.out.println("Enter second integer number");
        secondNumber =  InputChecker.getNumber();
        if (firstNumber==secondNumber){
            System.out.println("Numbers are equal");
        } else {
            temp=firstNumber>secondNumber?firstNumber:secondNumber;
            System.out.println(temp + " is larger");
        }

    }
}
