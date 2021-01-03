package com.planetj.arrays;

import java.util.ArrayList;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "ANT";
        String str2 = "TAN";
        boolean areAnagram = Anagram.areAnagram(str1, str2);
        System.out.println("Are anagram : " + areAnagram);
    }

    private static boolean areAnagram(String str1, String str2) {



        if(str1.length() != str2.length())
            return false;

        int [] arr = new int[256];
        for(int i = 0; i < str1.length(); i++){
            arr[str1.charAt(i)]++;
            arr[str2.charAt(i)]--;

        }
         for(int i = 0; i < 256; i++) {
            if(arr[i] != 0 )
                return false;
        }


        return true;
    }
}
