package com.algorithm.programmers;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
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

        Test test = new Test();
        System.out.println(test.stringDeal("a234"));
        System.out.println(test.stringDeal("1234"));
    }
}


