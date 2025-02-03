package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void longestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest() {

        int[] nums1 = new int[]{1,4,3,3,2};
        assertEquals(2, LeetCodeAttempt.longestStrictlyIncreasingOrStrictlyDecreasingSubarray(nums1));

        int[] nums2 = new int[]{3,3,3,3};
        assertEquals(1, LeetCodeAttempt.longestStrictlyIncreasingOrStrictlyDecreasingSubarray(nums2));

        int[] nums3 = new int[]{3,2,1};
        assertEquals(3, LeetCodeAttempt.longestStrictlyIncreasingOrStrictlyDecreasingSubarray(nums3));

    }

}
