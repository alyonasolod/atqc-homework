package javacore;

public class Task11_DisplaySpecificArrayElements extends Task9_DisplayArray {
    //Дан массив int[] arr = {1,5,33,12,88,9,192,123,567,88,44,32}. Все что делится на 2 без остатка вывести , что не делится без остатка умножить на 10 и вывести.

    public static void main(String args[]) {
        int[] arr = {1, 5, 33, 12, 88, 9, 192, 123, 567, 88, 44, 32};
        System.out.println("Given array : ");
        displayWithForLoop(arr);

        System.out.println('\n'+"Array elements that are not divided by 2 without reminder are multipled by 10: ");

        for( int k: arr){
            System.out.print(k%2==0?k+" ":k*10+" ");
            }
        }


}
