package com.planetj.arrays;

public class MaximumSubArrayOfSizeKWithMaxSum {
    public static void main(String[] args) {

        int [] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int startIndex = MaximumSubArrayOfSizeKWithMaxSum.findSubArrayWithMaximumSum(k , arr);

        System.out.println("Sub array of size k with maximum sum : [" + arr[startIndex] + ", " + arr[startIndex+1] + ", " + arr[startIndex+2] + "]");
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
