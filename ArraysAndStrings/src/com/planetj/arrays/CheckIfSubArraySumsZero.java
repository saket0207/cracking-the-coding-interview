package com.planetj.arrays;

import java.util.HashSet;

public class CheckIfSubArraySumsZero {

    public static void main(String[] args) {

        int [] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        boolean isSubArraySumZero = CheckIfSubArraySumsZero.isSubArraySumZero(arr);
        System.out.println("Is Sum of Sub Array Zero : " + isSubArraySumZero);
    }

    private static boolean isSubArraySumZero(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        System.out.println("===========");
        int sum = 0;

        // add 0 to the set if first element of thee array is 0
        set.add(0);

        for(int a : arr){

            sum += a;
            if(set.contains(sum))
                return true;

            set.add(sum);
        }
        return false;

    }
}
