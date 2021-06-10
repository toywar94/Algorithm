package com.algorithm.programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* - 문제 설명 -
    * array의 각 element 중 divisor로 나누어 떨어지는 값을
    * 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    *
    *   - 입출력 예 -
    *
    *   arr	            divisor	return
        [5, 9, 7, 10]	5	    [5, 10]
        [2, 36, 1, 3]	1	    [1, 2, 3, 36]
        [3,2,6]	        10	    [-1]
    * */
public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        /*
        - 이거 어제 푼 '같은 숫자는 싫어' 비슷하네...

        1. divisor로 나눠서 떨어지는 값을 list or array에 담고(for문 if문사용)
        2. 그 리스트가 비어있으면 -1 리턴 떄리고
        3. 마지막에 list의 있는 값들을 answer 배열에 넣으면 끝.
        */

        int[] arr = {5, 9, 7, 10};
        int[] arr2 = {2, 36, 1, 3};
        int[] arr3 = {3,2,6};

        int divisor = 5;
        int divisor2 = 1;
        int divisor3 = 10;
        System.out.println(Arrays.toString(solution(arr,divisor)));
        System.out.println(Arrays.toString(solution(arr2,divisor2)));
        System.out.println(Arrays.toString(solution(arr3,divisor3)));

    }
    
    public static int[] solution(int[] arr, int divisor){
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()) list.add(-1);

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
    
}
