package com.algorithm.programmers;

import java.util.Arrays;

public class 숫자의_표현 {
    /*
*   1 + 2 + 3 + 4 + 5 = 15
    4 + 5 + 6 = 15
    7 + 8 = 15
    15 = 15
* */
    public int expressionNum(int n) {
        int answer = 0;
        int[] nArr = new int[n];

        for (int i = 0; i < n; i++) {
            nArr[i] = i + 1;
        }
        System.out.println(Arrays.toString(nArr));

        for (int i = 0; i < nArr.length; i++) {
            int sum = 0;
            for (int j = i; j < nArr.length ; j++) {
                sum += nArr[j];

                if(sum == n){
                    answer++;
                    break;
                }else if(sum > n){
                    break;
                }
            }

        }
        return answer;

    }


    public static void main(String[] args) {

        숫자의_표현 test = new 숫자의_표현();

        System.out.println(test.expressionNum(15));
        System.out.println(test.expressionNum(6));


    }
}
