package javacore;

import java.util.Scanner;

class Task2_DisplayStrings {

     public static void main(String args[]){

         //Написать и запустить программу которая принимает два аргумента в виде строк и выводит их построчно
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String inputFirstString = scanner.nextLine();
        System.out.println("Great! Now enter second string");
        String inputSecondString = scanner.nextLine();

        System.out.println("You entered:"+'\n'+inputFirstString +'\n'+inputSecondString );


     }

}
