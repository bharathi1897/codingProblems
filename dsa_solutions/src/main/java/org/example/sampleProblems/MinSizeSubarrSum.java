package org.example.sampleProblems;

public class MinSizeSubarrSum {
    //Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
    // whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

    public int minSubArrayLen(int target, int[] nums) {
        //length of input array
        int arrLength = nums.length;
        int left_index = 0;
        //assuming initial window size is infinity
        int minWindow_length = Integer.MAX_VALUE;
        int sum = 0;

        //traverse through elements of array
        for( int i = 0; i<arrLength;i++){
            sum += nums[i];

            //if sum is greater than or equal to target
            while(sum >= target){
                //compare window length
                minWindow_length = Math.min(minWindow_length, i - left_index + 1);
                //reduce window size
                sum -= nums[left_index];
                left_index += 1;
            }

        }

        return minWindow_length == Integer.MAX_VALUE ? 0 : minWindow_length;

    }

    public void display(){
        int[] arr = {2,3,1,2,4,3};
        System.out.println("\nTarget Sum is : " + minSubArrayLen(7,arr));
    }
}
