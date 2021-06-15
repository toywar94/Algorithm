package com.algorithm.programmers;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {

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

        Test test = new Test();
        System.out.println(test.reverseArr(12345));


    }
}


