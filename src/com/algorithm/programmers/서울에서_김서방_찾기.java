package com.algorithm.programmers;

public class 서울에서_김서방_찾기 {
    public String KimSearch(String[] s){

        String result = "";
        for(int i = 0; i < s.length; i++){
            if(s[i].equals("kim")){
                result = "김서방은 "+i+"에 있다";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        서울에서_김서방_찾기 test = new 서울에서_김서방_찾기();
        String[] strArr = {"Jane", "Kim"};
        System.out.println(test.KimSearch(strArr));


    }
}
