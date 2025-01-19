package com.durga;
import java.util.*;

public class DSAAC_1_bubblesort {
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};
//   bubble sort
      // not a very good sorting technique due to time complexity // time complexity = O(n^2)
        for (int i = 0; i < arr.length-1; i++) {       //outer loop runs for n times
            for (int j = 0; j < arr.length - i - 1; j++) {    // i subtracted to remove the sorted elements.
                if(arr[j] > arr[j+1]) {                 // inner loop runs for n times, n-1 times, ....& goes on
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArray(arr);           //calling the array
    }
}
