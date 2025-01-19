package com.durga;

public class DSAAC_2_selectionsort {
    public static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {7, 8, 3, 1, 2};
        printArray(a);
//  time complexity = O(n^2)
//  selection sort
        for(int i=0; i<a.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<a.length; j++) {
                if(a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;
        }

        printArray(a);
    }
}
