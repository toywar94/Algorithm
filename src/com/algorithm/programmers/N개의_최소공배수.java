package com.algorithm.programmers;

public class N개의_최소공배수 {
    /*
     * 나열된 배열의 최소공배수를 구하는 문제
     * 첫번째와 두번째를 계산하고 차례대로 구하면됨.
     * */

    public int convertInt(int[] arr) {
        int N = arr.length;
        int answer = arr[N-1];

        while(true){

            int i;

            for(i = 0; i < N; i++){
                if(answer%arr[i]!=0) break;
            }

            if(i==N)return answer;
            else answer++;
        }
    }

    public static void main(String[] args) {

        N개의_최소공배수 test = new N개의_최소공배수();
        int[] arr = {2,6,8,14};
        System.out.println(test.convertInt(arr));

    }
}
