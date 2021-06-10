package com.algorithm.programmers;

    /*
    *-문제 설명-
    자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
    예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

    * -입출력 예-
    * 입출력 예
        N	answer
        123	  6
        987	  24
    * */

import java.util.Scanner;

public class 자릿수더하기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        while(num > 0){
            sum += num % 10;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
