package com.algorithm.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    * - 문제 설명 -
      문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
      각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
      예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면
      각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

      strings	                n	return
      ["sun", "bed", "car"]	    1	["car", "bed", "sun"]
      ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
    */
public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        /*
         배열 안의 문자열 n번째를 뽑아야하는데 charAt쓰면 될듯?
         뽑아서 정렬시켜야하는데...
         뽑은거 + 문자열해서 정렬시키고 마지막에 subString해서 없애버려?
        */
        String[] str = {"sun","bed","car"};
        String[] str2 = {"abce","abcd","cdx"};
        int n = 1;
        int n2 = 2;

        System.out.println(Arrays.toString(StringSort(str, n)));
        System.out.println(Arrays.toString(StringSort(str2, n2)));
    }

    public static String[] StringSort(String[] strings, int n){

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            //usun ebed acar
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);// acar, ebed, usun

        String[] answer = new String[list.size()];
        // 첫번 째 문자열 빼내면
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;

    }
}
