package com.algorithm.DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    private static void bubbleSort(int[] arr, int num){
        /*
         * 버블정렬의 로직을 구현한다.
         * 1. 인접한 두 항목의 값을 비교한다.
         * 2. 비교했는데 왼쪽이 더 크면 swap한다.
         * */
        for (int i = 0; i < num-1; i++) {
            for (int j = num-1; j > i ; j--) {
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
    }
    private static void swap(int[] arr, int n1, int n2){
        //swap 할 때 하나의 임시 저장 변수 필요함.
        int temp;
        temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    public static void main(String[] args) {

        /*
        * 1. 입력 한 숫자의 크기만큼의 배열크기를 생성한다.
        * 2. 빈 배열에 입력한 값을 대입한다.
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("요소의 개수를 입력해주세요");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println(num+"개의 정수를 입력해주세요");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, num);

        System.out.println("정렬 : " +Arrays.toString(arr));

    }



}
