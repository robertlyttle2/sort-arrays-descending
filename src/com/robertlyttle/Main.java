package com.robertlyttle;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] integerArray = getIntegers(5);
        int[] sortedArray = sortArray(integerArray);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int arrayLength) {
        int[] values = new int[arrayLength];
        System.out.println("Enter " + arrayLength + " integer values:\r");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for(int i=0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static int[] sortArray(int[] array) {
        int temp;
        for(int i = 0; i< array.length; i++) {
            for (int j = i + 1; j< array.length; j++) {
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
