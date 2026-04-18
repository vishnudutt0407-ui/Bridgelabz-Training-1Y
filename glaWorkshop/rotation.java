package com.glaWorkshop;

import java.util.Scanner;

public class rotation {
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5};

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        k = k % arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println("Array after rotation:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}