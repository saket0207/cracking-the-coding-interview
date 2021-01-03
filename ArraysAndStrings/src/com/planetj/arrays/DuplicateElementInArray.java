package com.planetj.arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementInArray {


    public static void main(String[] args) {

        int arr [] = {1, 2, 3, 4, 4};
        findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a : arr){
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a, 1);
            }
        }
        boolean flag = true;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                flag = false;
                System.out.println(entry.getKey() + " is duplicate");
            }

        }
        if(flag){
            System.out.println("No duplicates found");
        }
    }


}
