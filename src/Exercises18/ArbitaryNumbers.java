package Exercises18;

public class ArbitaryNumbers {
    public static void arbitaryArray(){
        int[] arr = {12, 33, 9, 152};
        int[] arrB = new int[arr.length];

        arrB = arr;

        arrB[0]++;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arrB.length; i++){
            System.out.print(arrB[i] + " ");
        }
    }
}
