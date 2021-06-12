package com.algorithm.programmers;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        String str = "Zbcdefg";
        char[] arr = {};
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }
        System.out.println(arr);

    }
}
