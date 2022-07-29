package javacore;

public class DisplayGreaterNumber  {
    public static void main(String args[]){
        int firstNumber,secondNumber;
        System.out.println("Enter first integer number");
        firstNumber = InputChecker.getNumber();
        System.out.println("Enter second integer number");
        secondNumber = InputChecker.getNumber();
        if (firstNumber==secondNumber){
            System.out.println("Numbers are equal");
        } else {
            System.out.println(Math.max(firstNumber,secondNumber) + " is larger");
        }

    }
}
