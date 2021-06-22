package com.algorithm.programmers;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test {

    public int convertInt(int n){

        /*
        *  n을 입력 받아서 +1씩 증가시키면서 2로 계속 나누고
        *  거기의 몫과 나머지를 저장하고
        *  개수가 같으면 그 값을 넣어서 리턴 때리면
        *
        * */
        int answer;
        for (int i = n+1; ; i++) {
            if(numCompare(i) == numCompare(n)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    private static int numCompare(int num){
        // ex) num 16 / 15
        int cnt = 0;
        while(num != 0){
            if(num % 2 != 0){
                cnt++;
            }
            num /= 2;
        }

        return cnt;
    }

    public static void main(String[] args) {

        Test test = new Test();

        System.out.println(test.convertInt(15));


    }
}


