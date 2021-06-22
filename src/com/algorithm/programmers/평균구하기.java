package com.algorithm.programmers;

public class 평균구하기 {
    public double daverage(int[] n){

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

        평균구하기 test = new 평균구하기();
        int[] n = {1,2,3,4};
        System.out.println(test.daverage(n));


    }
}
