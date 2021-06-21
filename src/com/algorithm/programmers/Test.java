package com.algorithm.programmers;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {

    public String repeatString(int n){
        // n의 개수에 따라서 수박수박 반복되는데..
        // ex) n = 1 "수" / n = 2 "수박" / n = 3 "수박수"

        //2로 나눠서 홀수면 '수' 짝이면 '박' 하면 되겠네
        String answer = "";
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                answer += "수";
            }else{
                answer += "박";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.repeatString(3));


    }
}


