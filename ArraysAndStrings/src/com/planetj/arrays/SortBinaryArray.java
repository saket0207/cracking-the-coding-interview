package com.planetj.arrays;

import java.util.Arrays;

public class SortBinaryArray {

    public static void main(String[] args) {

        int [] arr = {1,0,1,0,1,0,0,1};
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
        System.out.println("");
        SortBinaryArray.sort(arr);
        System.out.println("================");
        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

    }

    private static void sort(int[] arr) {

        int pivot = 1;
        int j = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < pivot){
                swapp(arr, i, j);
                j++;
            }
        }

    }

    private static void swapp(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
