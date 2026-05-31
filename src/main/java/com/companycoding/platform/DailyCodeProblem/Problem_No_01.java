package com.companycoding.platform.DailyCodeProblem;

//Sorting without using function()..
//Bubble Sort algorithm
public class Problem_No_01 {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 7, 9};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {

                System.out.println("Comparing " + arr[j] + " and " + arr[j + 1]);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("After swap: "+ java.util.Arrays.toString(arr));
                }
            }
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }
}
