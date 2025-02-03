package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,4,3,3,2};
        System.out.println(longestMonotonicSubarray(nums1));

        int[] nums2 = new int[]{3,3,3,3};
        System.out.println(longestMonotonicSubarray(nums2));

        int[] nums3 = new int[]{3,2,1};
        System.out.println(longestMonotonicSubarray(nums3));

    }

    public static int longestMonotonicSubarray(int[] nums) {

        int maxLength = 0;

        // Find longest strictly increasing subarray
        for (int start = 0; start < nums.length; start++) {

            int currLength = 1;

            for (int pos = start + 1; pos < nums.length; pos++) {

                // Extend subarray if next element is larger
                if (nums[pos] > nums[pos - 1]) {
                    currLength++;
                } else {
                    // Break if sequence is not increasing anymore
                    break;
                }

            }

            maxLength = Math.max(maxLength, currLength);

        }

        // Find longest strictly decreasing subarray
        for (int start = 0; start < nums.length; start++) {

            int currLength = 1;

            for (int pos = start + 1; pos < nums.length; pos++) {

                // Extend subarray if next element is smaller
                if (nums[pos] < nums[pos - 1]) {
                    currLength++;
                } else {
                    // Break if sequence is not decreasing anymore
                    break;
                }

            }

            maxLength = Math.max(maxLength, currLength);

        }

        return maxLength; // Return the longer of increasing or decreasing sequences

    }

}
