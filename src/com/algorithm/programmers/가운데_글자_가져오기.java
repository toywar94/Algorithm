package com.algorithm.programmers;

    /* - 문제 설명 -
    *단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
    *단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
    *
    * - 입출력 예 -
    * s	        return
    "abcde"	    "c"
    "qwer"	    "we"
    * */

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        String str = "abcde";
        String str2 = "qwer";
        String str3 = "qwasdfer";

        System.out.println(getStr(str));
        System.out.println(getStr(str2));
        System.out.println(getStr(str3));
    }

    public static String getStr(String str){
        String answer = "";
        int len = str.length();

        if(len % 2 == 0){
            answer += str.charAt((len / 2) -1);
            answer += str.charAt((len / 2));
        }else{
            answer += str.charAt((len / 2));
        }

        return answer;
    }
}
