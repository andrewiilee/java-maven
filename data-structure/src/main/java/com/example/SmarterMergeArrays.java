package com.example;

import java.util.Arrays;

public class SmarterMergeArrays {

    /**
     * definitely need a new array that holds all the data
     * while the new array is empty keep filling it
     *
     * @param args
     */
    public static void main(String args[]) {
        int[] a = {1, 2, 10, 112};
        int[] b = {5, 6, 7, 9};
        System.out.println(Arrays.asList(mergeSortedArrays(a, b)));
        System.out.println(Arrays.asList(mergeArrays(a, b)));
        //assert the follow result
        //[1, 5, 16, 17, 20, 21, 22, 23, 29, 30, 90, 112]
        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        //mergeArrays(arr1, arr2);

        int arr3[] = {5, 8, 9};
        int arr4[] = {4, 7, 8};
        //mergeArrays(arr3, arr4);
    }

    /**
     * merge two sorted array where each value does not line up
     *
     * @param a
     * @param b
     */
    private static Integer[] mergeArrays(int a[], int b[]) {
        int x = a.length + b.length;
        Integer[] c = new Integer[x];
        x--;

        int z = 0;
        //while c is not filled
        //while (c[x] == null) {
            for(int i = 0; i < a.length - 1; i++) {
                System.out.println("a" + a[i]);
                if(c[z] < a[i]) {
                    c[z] = a[i];
                    System.out.println("c" + c[z]);
                    z++;
                    break;
                }
                for(int j = 0; j < b.length - 1; j++) {
                    System.out.println("b" + b[j]);
                    if(c[z] < b[j]) {
                        c[z] = b[j];
                        System.out.println("c" + c[z]);
                        z++;
                        break;
                    }
                }
            }
        //}

        return c;
    }

    /**
     * merge two sorted array where each value in the both arrays lines up
     * E.G [2,4,6] and [1,3,5]
     *
     * @param a
     * @param b
     * @return
     */
    private static Integer[] mergeSortedArrays(int a[], int b[]) {
        Integer[] c = new Integer[a.length + b.length];

        int i = 0;
        int j = 0;

        while (c[c.length - 1] == null) {
            if (a.length - 1 < i) {
                c[j] = b[i];
                j++;
            } else if (b.length - 1 < i) {
                c[j] = a[i];
                j++;
            } else if (a[i] > b[i]) {
                c[j] = b[i];
                c[j + 1] = a[i];
                j = j + 2;
            } else if (a[i] <= b[i]) {
                c[j] = a[i];
                c[j + 1] = b[i];
                j = j + 2;
            }
            i++;
        }
        return c;
    }
}
