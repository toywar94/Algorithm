package com.algorithm.programmers;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test {
    /*
    * 나열된 배열의 최소공배수를 구하는 문제
    * 첫번째와 두번째를 계산하고 차례대로 구하면됨.
    * */

    public int convertInt(int[] arr) {
        int answer = arr[0];
        //int[] tmpArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            answer = min(answer, arr[i]);

        }
        return answer;
    }
    static int min(int answer, int arrNum){
        return (answer * arrNum) / gcd(answer, arrNum);
    }
    static int gcd(int answer, int arrNum){
        while(arrNum != 0){
            int tmp = answer % arrNum;
            answer = arrNum;
            arrNum = tmp;
        }
        return answer;
    }


    public static void main(String[] args) {

        Test test = new Test();
        int[] arr = {2,6,4,14};
        System.out.println(test.convertInt(arr));

    }
}


