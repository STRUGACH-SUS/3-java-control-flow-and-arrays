package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8, 5656, 67};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));

    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) return null;

        int count = 0;
        for (int i : arr) {
            if (i <= 1000) count++;
        }

        int[] nArr = new int[count];

        int ind = 0;
        for (int i : arr) {
            if (i <= 1000) {
                nArr[ind++] = i;
            }
        }
        return nArr;
    }

}