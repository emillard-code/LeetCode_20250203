package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void longestMonotonicSubarrayTest() {

        int[] nums1 = new int[]{1,4,3,3,2};
        assertEquals(2, LeetCodeSolution.longestMonotonicSubarray(nums1));

        int[] nums2 = new int[]{3,3,3,3};
        assertEquals(1, LeetCodeSolution.longestMonotonicSubarray(nums2));

        int[] nums3 = new int[]{3,2,1};
        assertEquals(3, LeetCodeSolution.longestMonotonicSubarray(nums3));

    }

}
