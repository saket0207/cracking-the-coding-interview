package com.planetj.arrays;

import java.util.Arrays;

public class FindIfStringsArePermutation {

    public static void main(String[] args) {

        String s1 = "mad";
        String s2 = "dam";
        boolean arePermutation = FindIfStringsArePermutation.arePermutations(s1, s2);
        System.out.println("Are Permutations ? = " + arePermutation);
    }

    private static boolean arePermutations(String s1, String s2) {

        if(s1.length() != s2.length()){
            return false;
        }
        int [] strArr = new int[256];
        Arrays.fill(strArr, 0);
        for(int i = 0; i < s1.length() && i < s2.length(); i++){

            strArr[s1.charAt(i)]++;
            strArr[s2.charAt(i)]--;
        }
        for(int i = 0; i < strArr.length; i++){

            if(strArr[i] != 0){
                return false;
            }
        }

        return true;
    }
}
