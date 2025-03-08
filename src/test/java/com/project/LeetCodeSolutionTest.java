package com.project;

import com.project.attempt.LeetCodeAttempt;
import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void numOfSubarraysTest() {

        int[] arr1 = {1,3,5};

        assertEquals(4, LeetCodeSolution.numOfSubarrays(arr1));

        int[] arr2 = {2,4,6};

        assertEquals(0, LeetCodeSolution.numOfSubarrays(arr2));

        int[] arr3 = {1,2,3,4,5,6,7};

        assertEquals(16, LeetCodeSolution.numOfSubarrays(arr3));

    }

}
