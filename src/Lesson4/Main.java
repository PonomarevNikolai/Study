package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //Task1();
        //Task2();
        //Task3();
        //Task4();
        Task5();
    }

    private static void Task1() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        String result = "";
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                result = "Please, try again";
                break;
            }
            if (i == array.length - 1) {
                result = "OK";
            }
        }
        System.out.println(result);
    }

    private static void Task2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        String result = "Result: [";
        System.out.print("Array length: ");
        String r = reader.readLine();
        i = Integer.parseInt(r);
        int[] array = new int[i];
        System.out.println("Numbers of array: ");
        for (int j = 0; j < array.length; j++) {
            r = reader.readLine();
            i = Integer.parseInt(r);
            array[j] = i;
        }
        for (int q = 0; q < array.length; q++) {
            result = result + Integer.toString(array[q]);
            if (q == array.length - 1) break;
            result = result + ", ";
        }
        System.out.println(result + "]");


    }

    private static void Task3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        System.out.print("Array length: ");
        String r = reader.readLine();
        i = Integer.parseInt(r);
        int[] array = new int[i];
        System.out.println("Numbers of array: ");
        for (int j = 0; j < array.length; j++) {
            r = reader.readLine();
            i = Integer.parseInt(r);
            array[j] = i;
        }
        System.out.println("Array1: " + Arrays.toString(array));
        i = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = i;
        System.out.println("Array2: " + Arrays.toString(array));


    }

    private static void Task4() {
        int[] array = new int[]{1, 2, 4, 5, 3, 3, 1, 2, 5, 4, 9};
        int[] array2 = array;
        boolean mark = false;
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (mark) {
                break;
            }
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array2[j]) {
                    count++;
                }
                if (count == 1 && j == array.length - 1) {
                    num = array[i];
                    mark = true;
                }

            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(num);

    }

    private static void Task5() {
        int[] array = new int[]{1, 2, 4, 5, 3, 3, 1, 2, 5, 4, 9};
        int[] some = mergeSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(some));
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftMark = 0;
        int rightMark = 0;
        int resultMark = 0;
        while (leftMark < left.length || rightMark < right.length) {
            if (leftMark < left.length && rightMark < right.length) {
                if (left[leftMark] < right[rightMark]) {
                    result[resultMark] = left[leftMark];
                    resultMark++;
                    leftMark++;
                } else {
                    result[resultMark] = right[rightMark];
                    resultMark++;
                    rightMark++;
                }
            } else if (leftMark < left.length) {
                result[resultMark] = left[leftMark];
                resultMark++;
                leftMark++;
            } else if (rightMark < right.length) {
                result[resultMark] = right[rightMark];
                resultMark++;
                rightMark++;
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[mid];
        }
        else {
             right = new int[mid + 1];
        }

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[mid + j];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left, right);
    }
}

