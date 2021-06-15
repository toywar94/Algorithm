package com.algorithm.programmers;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Test {
    //특정 문자열의 개수를 알아내야하는데...
    //p, y를 담는 변수 2개 생성해서 개수 파악 후 비교할까?
    public boolean stringCnt(String str){
        boolean answer = true;
        int pCnt = 0;
        int yCnt = 0;
        char[] ch = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
           if(ch[i] == 'p' || ch[i] == 'P'){
               pCnt++;
           }else if(ch[i] == 'y' || ch[i] == 'Y'){
               yCnt++;
           }
        }

        if(!(pCnt == yCnt)){
            return false;
        }

        if(!(pCnt == 0 && yCnt == 0)){
            return true;
        }
        return true;

    }

    public static void main(String[] args) {

        Test test = new Test();
        System.out.println(test.stringCnt("pPoooyY"));
        System.out.println(test.stringCnt("pyy"));

    }
}


