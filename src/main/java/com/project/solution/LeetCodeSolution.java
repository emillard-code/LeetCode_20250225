package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        System.out.println(numOfSubarrays(arr1));

        int[] arr2 = {2,4,6};
        System.out.println(numOfSubarrays(arr2));

        int[] arr3 = {1,2,3,4,5,6,7};
        System.out.println(numOfSubarrays(arr3));

    }

    public static int numOfSubarrays(int[] arr) {

        final int MOD = (int) (1e9 + 7);
        int n = arr.length;
        int count = 0;

        // Generate all possible subarrays
        for (int startIndex = 0; startIndex < n; startIndex++) {

            int currentSum = 0;

            // Iterate through each subarray starting at startIndex
            for (int endIndex = startIndex; endIndex < n; endIndex++) {

                currentSum += arr[endIndex];

                // Check if the sum is odd
                if (currentSum % 2 != 0) {
                    count++;
                }

            }

        }

        return count % MOD;

    }

}
