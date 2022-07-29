package javacore;

public class DisplayArray {
    //Дан массив int[] arr = {1,5,33,12,88,9,192,123,567,88,44,32}. Вывести все все элементы массива через разный виды циклов.
   public static void displayWithForLoop (int[]arr){

       for(int k=0;k<arr.length;k++){
           System.out.print(arr[k]+" ");
       }
   }

    public static void displayWithForEachLoop (int[]arr){
        for(int j: arr){
            System.out.print(j +" ");
        }
    }

    public static void displayWithWhileLoop (int[]arr){

        int i=0;
        while(i<arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
    }

    public static void displayWithDoWhileLoop(int []arr){
        int i=0;
        do{
            System.out.print(arr[i]+" ");
            i++;
        }while(i<arr.length);

    }

    public static void main(String args[]){
        int[] arr = {1,5,33,12,88,9,192,123,567,88,44,32};

        System.out.println("Array elements output with the For loop");
        displayWithForLoop(arr);

        System.out.println('\n'+"Array elements output with the For-each loop");
        displayWithForEachLoop(arr);

        System.out.println('\n'+"Array elements output with the while loop");
        displayWithWhileLoop(arr);

        System.out.println('\n'+"Array elements output with the do- while loop");
        displayWithDoWhileLoop(arr);
    }
}
