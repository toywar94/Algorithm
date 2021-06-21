package com.algorithm.programmers;

import java.util.Arrays;

public class 정수_내림차순으로_정렬하기 {
    public long decendingSort(long n){

        //118352 -> 내림차순 853211
        /*
         * 1.String으로 변환시킨다.
         * 2.배열로 만들고 정렬한다 : toCharAt
         * 3.정렬하고 long으로 변환해서 return 때리기
         * */

        String str = String.valueOf(n);
        String result = "";

        System.out.println(str.getClass().getName());

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] += str.charAt(i);
        }

        System.out.println(ch);

        Arrays.sort(ch);

        for (int i = ch.length-1; i >=0; i--) {
            result += ch[i];
        }

        long answer = Long.valueOf(result);

        return answer;

    }

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.decendingSort(118372));


    }
}
