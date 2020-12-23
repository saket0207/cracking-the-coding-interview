package com.planetj.arrays;

import java.util.Arrays;

public class SubArrayOfSizeKWithMaxSum {
    public static void main(String[] args) {

        int [] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int startIndex = SubArrayOfSizeKWithMaxSum.findSubArrayWithMaximumSum(k, arr);
        int [] result = new int[k];

        for(int i = 0; i < k; i++)
            result[i] = arr[startIndex + i];
        System.out.println(Arrays.toString(result));
    }

    private static int findSubArrayWithMaximumSum(int k, int[] arr) {
        int sum = 0, startIndex = 0;
        int windowStart = 0;
        Integer maxSum = null;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            sum += arr[windowEnd];
            if(windowEnd >= k-1){
                if(maxSum == null){
                    maxSum = sum;
                }else if(maxSum < sum){
                    maxSum = sum;
                    startIndex = windowStart;
                }
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return startIndex;


    }


}
