package com.algorithm.DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class SelectSort {

    private static void selectSort(int[] arr, int num){
        for (int i = 0; i < num-1; i++) {
            int first = i;
            for (int j = i+1; j < num; j++) {
                if(arr[j] < arr[first]){
                    first = j;
                }
            }
            swap(arr, i, first);
        }
        System.out.println("정렬 : " + Arrays.toString(arr));
    }

    private static void swap(int[] arr, int num, int firstNum){
        int temp = arr[num];
        arr[num] = arr[firstNum];
        arr[firstNum] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("요소의 개수를 입력해주세요");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println(num+"개의 정수를 입력해주세요");

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  sc.nextInt();
        }

        selectSort(arr, num);
    }
}
