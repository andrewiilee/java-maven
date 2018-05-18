package com.example;

import org.junit.Test;

import java.util.Arrays;

public class MergeTwoArrays {
    @Test
    public void mergeTwoArrays() {
        int[] a = { 1,4,10,112};
        int[] b = {5,16,32,86,90};

        int[] c = new int[a.length + b.length];

        for(int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }

        for(int i = 0; i < b.length; i++) {
            c[i + a.length]= b[i];
        }

        for(int i = 0; i < c.length - 1; i++) {
            for(int j = 0; j < c.length - i - 1; j++) {
                if(c[j] > c[j+1]) {
                    int tmp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
