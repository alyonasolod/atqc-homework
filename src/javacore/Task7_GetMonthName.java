package javacore;

public class Task7_GetMonthName {


    //Написать и запустить программу которая принимает 1 аргумент в виде целого числа месяца. Дальше в зависмости от числа выводит текстом какой это месяц.
    public static void main(String args[]){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int monthNumber;
        System.out.println("Enter int value from 1 to 12");
        monthNumber= InputChecker.getMonth()-1;
        System.out.println("Your month name is: "+ months[monthNumber]);
    }
}
