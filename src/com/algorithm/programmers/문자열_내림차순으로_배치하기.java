package com.algorithm.programmers;

import java.util.Arrays;

/* - 문제 설명 -
    * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해
    * 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    * s는 영문 대소문자로만 구성되어 있으며,
    * 대문자는 소문자보다 작은 것으로 간주합니다.
    *
    *  - 입출력 예 -
    *  s            return
    * "Zbcdefg"     "gfedcbZ"
    *
    * */
public class 문자열_내림차순으로_배치하기 {

    public String bubbleSort(String str){
        char[] chars = str.toCharArray();
        char temp =' ';

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < str.length()-1 ; j++){
                if( chars[j] < chars[j+1]){
                    temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }


        str = String.valueOf(chars);
        return str;
    }
    public static void main(String[] args) {
        문자열_내림차순으로_배치하기 rs = new 문자열_내림차순으로_배치하기();
        System.out.println( rs.bubbleSort("Zbcdefg") );
    }
}
