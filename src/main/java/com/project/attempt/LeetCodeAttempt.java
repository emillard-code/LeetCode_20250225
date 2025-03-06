package com.project.attempt;

import java.util.LinkedList;

public class LeetCodeAttempt {

    public static void main(String[] args) {
        
        int[] arr1 = {1,3,5};
        System.out.println(numberOfSubArraysWithOddSum(arr1));

        int[] arr2 = {2,4,6};
        System.out.println(numberOfSubArraysWithOddSum(arr2));

        int[] arr3 = {1,2,3,4,5,6,7};
        System.out.println(numberOfSubArraysWithOddSum(arr3));

    }

    public static int numberOfSubArraysWithOddSum(int[] arr) {

        LinkedList subArray = new LinkedList();

        int subArrayLength = 1;

        while (subArrayLength <= arr.length) {

            for (int i = 0; i <= arr.length - subArrayLength; i++) {

                int sum = 0;

                for (int j = i; j < i + subArrayLength; j++) {

                    sum = sum + arr[j];

                }

                if (sum % 2 == 1) { subArray.add(sum); }

            }

            subArrayLength++;

        }
        
        return subArray.size();

    }

}
