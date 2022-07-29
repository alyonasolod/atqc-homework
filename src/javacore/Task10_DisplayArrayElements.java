package javacore;

public class Task10_DisplayArrayElements extends Task9_DisplayArray {
    //Дан массив int[] arr = {1,5,33,12,88,9,192,123,567,88,44,32}. Вывести все что больше 10
    public static void main(String args[]) {
        int[] arr = {1, 5, 33, 12, 88, 9, 192, 123, 567, 88, 44, 32};
        System.out.println("Given array : ");
        displayWithForLoop(arr);

        System.out.println('\n'+"Array elements that are greater than 10: ");
        boolean exists = false;
        for(int i:arr){
            if(i>10){
                System.out.print(i+" ");
                exists = true;
            }
        }
        if(!exists){ System.out.println("None element is greater than 10");}
    }
}
