package com.planetj.arrays;

import java.util.Arrays;

public class AverageOfAllContiguousSubArraySizeK {

    public static void main(String[] args) {

        int [] arr = {1, 3, 2, 6, -1, 4, 1 , 8, 2};
        int k = 5;

        double [] result = AverageOfAllContiguousSubArraySizeK.findAverageOfContiguousSubArrayOfSizeK(k, arr);
        System.out.print("The averages are : ");
        System.out.println(Arrays.toString(result));

    }

    private static double[] findAverageOfContiguousSubArrayOfSizeK(int k, int[] arr) {

        int windowStart = 0, windowSum = 0;
        double [] result = new double[arr.length - k + 1];

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){

            windowSum += arr[windowEnd];

            if(windowEnd >= k-1){
                result[windowStart] = (double) windowSum/k;
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return result;

    }
}
