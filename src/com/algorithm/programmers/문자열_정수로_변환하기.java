package com.algorithm.programmers;

public class 문자열_정수로_변환하기 {
    public int convertInt(String n){
        int n1 = Integer.parseInt(n);


        return n1;
    }

    public static void main(String[] args) {

        문자열_정수로_변환하기 test = new 문자열_정수로_변환하기();
        System.out.println(test.convertInt("1234"));


    }
}
