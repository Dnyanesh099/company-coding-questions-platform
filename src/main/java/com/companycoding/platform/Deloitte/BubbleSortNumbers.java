/*
    Program: Sort Integer List Using Bubble Sort

    Description:
    Create a Java program to sort a list of integers
    using Bubble Sort algorithm.

    Concepts Used:
    - Bubble Sort
    - Arrays
    - Nested Loops
    - Swapping Logic

    Author: Dnyanesh Patil
*/

package com.companycoding.platform.Deloitte;

import java.util.Arrays;
import java.util.List;

public class BubbleSortNumbers {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(50, 20, 40, 10, 30);

        Integer[] arr = list.toArray(new Integer[0]);

        // Bubble Sort Logic
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted List : " + Arrays.toString(arr));
    }
}