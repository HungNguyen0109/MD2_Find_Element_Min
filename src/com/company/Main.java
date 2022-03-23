package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {6, 2, 4, 10, 11, 3, 2, 1, 5};
        int index = minValue(arr);
        System.out.println("Element min is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
