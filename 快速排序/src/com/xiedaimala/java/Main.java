package com.xiedaimala.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] a = {5,4,9,8,7,6,0,1,3,2};
        quickSort(a);
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }

    public static void sort(int[] a, int lo, int hi) {
        int i, j;
        int index;
        if (lo > hi) return;
        i = lo;
        j = hi;
        index = a[i];
        while (i < j) {
            while (i < j && a[j] >=index) {
                j--;
            }
                if (i < j) {
                    a[i++] = a[j];
                }

            while (i < j && a[i] < index) {
                i++;
            }
                if (i < j) {
                    a[j--] = a[i];
                }
        }
        a[i]=index;
        sort(a,lo,i-1);
        sort(a,i+1,hi);
    }
    public static void quickSort(int[] a){
        sort(a,0,a.length-1);
    }
}
