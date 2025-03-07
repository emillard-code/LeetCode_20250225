package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {
        
        int[] arr1 = {1,3,5};
        System.out.println(numberOfSubArraysWithOddSum(arr1));

        int[] arr2 = {2,4,6};
        System.out.println(numberOfSubArraysWithOddSum(arr2));

        int[] arr3 = {1,2,3,4,5,6,7};
        System.out.println(numberOfSubArraysWithOddSum(arr3));

    }

    // This method adds the sum of the numbers in each sub-array
    // and returns the number of sums that are odd-numbered.
    public static int numberOfSubArraysWithOddSum(int[] arr) {

        // This int will contain the number of sub-array sums that happen to be odd.
        int oddSums = 0;

        // int subArrayLength will be used to help iterate through the array with
        // specific subarray sizes (starting from 1, going up to the array size).
        // For example, we will start by looking at all possible sub-arrays of size 1,
        // then proceed to look through all possible sub-arrays of size 2 etc.
        int subArrayLength = 1;

        // We will perform a for-loop for every sub-array size from 1 to the maximum size of arr[].
        while (subArrayLength <= arr.length) {

            // Since we will be checking future indexes depending on the value of int subArrayLength,
            // we have to make sure that the loop does not go out of bounds.
            for (int i = 0; i <= arr.length - subArrayLength; i++) {

                // We will store the sum of each sub-array in int sum.
                int sum = 0;

                // For every index i, we will loop through the current index and the next several
                // indexes, depending on the current value of int subArrayLength. This is because
                // we are checking for sub-arrays of specific sizes and want to add up the values
                // in order to get the sum and see if it is odd-numbered.
                for (int j = i; j < i + subArrayLength; j++) {

                    sum = sum + arr[j];

                }

                // If the sum is odd, we increment int oddSums by 1.
                if (sum % 2 == 1) { oddSums++; }

            }

            // Once we have done one full loop of the outer loop, we increase the size
            // of the sub-array that we want to check for in the next full loop.
            subArrayLength++;

        }

        // At the very end, we return the value of int oddSums.
        return oddSums;

    }

}
