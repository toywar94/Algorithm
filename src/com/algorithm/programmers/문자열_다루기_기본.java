package com.algorithm.programmers;

public class 문자열_다루기_기본 {
    public boolean stringDeal(String str){
        boolean answer = true;
        if (str.length() == 4 || str.length() == 6) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    return false;
                }
            }
            return answer;
        }

        return false;

    }

    public static void main(String[] args) {

        문자열_다루기_기본 test = new 문자열_다루기_기본();
        System.out.println(test.stringDeal("a234"));
        System.out.println(test.stringDeal("1234"));
    }
}
