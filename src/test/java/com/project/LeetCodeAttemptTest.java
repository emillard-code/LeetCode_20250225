package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void numberOfSubArraysWithOddSumTest() {

        int[] arr1 = {1,3,5};

        assertEquals(4, LeetCodeAttempt.numberOfSubArraysWithOddSum(arr1));

        int[] arr2 = {2,4,6};

        assertEquals(0, LeetCodeAttempt.numberOfSubArraysWithOddSum(arr2));

        int[] arr3 = {1,2,3,4,5,6,7};

        assertEquals(16, LeetCodeAttempt.numberOfSubArraysWithOddSum(arr3));

    }

}
