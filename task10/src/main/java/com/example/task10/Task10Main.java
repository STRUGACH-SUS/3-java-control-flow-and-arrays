package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {
        int min = arr[0];
        int count = -1;
        int count_min = 0;

        for (int n : arr) {
            count++;
            if (n <= min) {
                min = n;
                count_min = count;
            }
        }

        return count_min;
    }

}