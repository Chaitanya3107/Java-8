package Streams;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        // imperative approach
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum of array is: " + sum);

        // using streams
        int[] arr2 = {1,2,3,4,5,6};
        int sum2 = Arrays.stream(arr2).filter(x -> x % 2 == 0).sum();
        System.out.println("Sum of array is: " + sum2);
    }
}
