package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,4,3,3,2};
        System.out.println(longestStrictlyIncreasingOrStrictlyDecreasingSubarray(nums1));

        int[] nums2 = new int[]{3,3,3,3};
        System.out.println(longestStrictlyIncreasingOrStrictlyDecreasingSubarray(nums2));

        int[] nums3 = new int[]{3,2,1};
        System.out.println(longestStrictlyIncreasingOrStrictlyDecreasingSubarray(nums3));

    }

    // This method returns the length of the longest subarray
    // that is either strictly increasing or strictly decreasing.
    public static int longestStrictlyIncreasingOrStrictlyDecreasingSubarray(int[] nums) {

        // int increase and int decrease depicts the streak of values
        // that are either strictly increasing or decreasing in nums[].
        // They will be continuously updated during the for-loop of the method.
        int increase = 1;
        int decrease = 1;

        // int maximum depicts the longest streak that has been achieved so far.
        // It will be continuously checked and updated during the for-loop.
        int maximum = 1;

        for (int i = 1; i < nums.length; i++) {

            // If the current index has a higher value than the previous, an increase is detected.
            // We increment int increase by 1, and reset int decrease back to 1.
            if (nums[i] > nums[i - 1]) {
                increase++;
                decrease = 1;
            }

            // If the current index has a lower value than the previous, a decrease is detected.
            // We increment int decrease by 1, and reset int increase back to 1.
            if (nums[i] < nums[i - 1]) {
                decrease++;
                increase = 1;
            }

            // If the current index has the same value as the previous, we set both int increase and
            // int decrease back to 1 as the subarray streak must be -strictly- increasing or decreasing.
            if (nums[i] == nums[i - 1]) {
                increase = 1;
                decrease = 1;
            }

            // At the end of each loop, we check the current highest value between int increase and
            // int decrease, and compare that against int maximum. If it turns out to be higher,
            // then we update int maximum with that value to reflect the current longest streak.
            if (Math.max(increase, decrease) > maximum) { maximum = Math.max(increase, decrease); }

        }

        // At the end, we return int maximum which reflects the highest strictly
        // increasing or decreasing streak obtained while looping through the nums[] array.
        return maximum;

    }

}
