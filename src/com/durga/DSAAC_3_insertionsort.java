package com.durga;

public class DSAAC_3_insertionsort {
    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {7, 8, 3, 1, 2};

//  insertion sort
        for(int i=0; i<a.length; i++) {
            int current = a[i];
            int j = i-1;
            while (j >= 0 && current < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            //placement
            a[j+1] = current;
        }

        printArray(a);
    }
}
