package com.algorithm.programmers;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test {

    public double convertInt(int[] n){

        int tmp = 0;
        int cnt = 0;
        for (int i = 0; i < n.length; i++) {
            tmp += n[i];
            cnt++;
        }
        double answer = (double)tmp/cnt;



        return answer;
    }

    public static void main(String[] args) {

        Test test = new Test();
        int[] n = {1,2,3,4};
        System.out.println(test.convertInt(n));


    }
}


