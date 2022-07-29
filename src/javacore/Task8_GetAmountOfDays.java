package javacore;

public class Task8_GetAmountOfDays {
    //Написать и запустить программу которая принимает 1 аргумент в виде целого числа месяца. Дальше в заивисомсти от числа выводит сколько в этом месяце дней.

    public static void main(String args[]){

        int daysInFebruary;
        int monthNumber;
        boolean check;
        System.out.println("Enter int value from 1 to 12");
        monthNumber= InputChecker.getMonth()-1;
        if(monthNumber==1){
            System.out.println("Is it a leap year?(Enter true or false)");
            check = InputChecker.checkBool();
            daysInFebruary=!check?28:29;
        } else {daysInFebruary=28;}
        int [] daysAmount ={31,daysInFebruary,31,30,31,30,31,31,30,31,30,31};
        System.out.println("Entered month has :"+ daysAmount[monthNumber]+" days");

    }
}
