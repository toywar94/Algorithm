package com.algorithm.programmers;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] reverseArr(long n){

        //long -> int로 변환.
        int len = Long.toString(n).length();
        int[] numArr = new int[len];

        for(int i = 0; i < len; i++){
            numArr[i] = (int) (n%10);
            n /= 10;
        }
        return numArr;

    }

    public static void main(String[] args) {

        자연수_뒤집어_배열로_만들기 test = new 자연수_뒤집어_배열로_만들기();
        System.out.println(Arrays.toString(test.reverseArr(12345)));


    }
}
