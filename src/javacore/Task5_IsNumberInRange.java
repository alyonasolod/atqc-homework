package javacore;

import java.time.temporal.ValueRange;

public class Task5_IsNumberInRange {
    //Написать и запустить программу которая принимает три аргумента в виде целых чисел. Если хотя бы один из них в диапазоне между 13 и 19 то выводит текст "Small" иначе "Do not know".
    public static void main(String args[]){

        int num1,num2,num3;
        System.out.println("Enter first integer number");
        num1 =  InputChecker.getNumber();
        System.out.println("Enter second integer number");
        num2 =  InputChecker.getNumber();
        System.out.println("Enter third integer number");
        num3 =  InputChecker.getNumber();

        ValueRange range = java.time.temporal.ValueRange.of(13,19);
       if (range.isValidIntValue(num1)||range.isValidIntValue(num2)||range.isValidIntValue(num3)){
           System.out.println("Small");
       } else{
           System.out.println("Do not know");
       }


    }
}
