package com.algorithm.dataStructure;

import java.util.Scanner;

/*
 * LinearSearch : 선형 검색
 * 배열에서 원하는 키 값을 갖는 요소를 만날 때 까지 앞~뒤까지 검색한다.
 *
 * 배열의 검색 종료 조건
 * 1) 배열 끝까지 검색했는데 값이 없는 경우
 * 2) 값을 발견한 경우
 *
 * ------------------------------------
 * 여기서 겸색 조건을 1개 줄일 수 있는데
 * -보초법-
 * 마지막 요소에 원하는 key값을 넣어서 검색조검의 1번을 없앰.
 *
 * */
public class LinearSearch {
    public static void main(String[] args) {
        /*
        * 요소에 원하는 값을 일단 넣고 배열로 만들거임.
        *
        * */
        System.out.print("원하는 크기를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num + 1];// 보초 생성 ( +1 )

        //요소에 값을 넣는다
        for (int i = 0; i < num; i++){
            System.out.print("요소안에 넣을 값을 입력해주세요 : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값을 입력해주세요 : ");
        int key = sc.nextInt();

        // 배열과 요소의 크기, 키
        int idx = search(arr, num, key);

        if (idx == -1) {
            System.out.println("값이 없습니다");
        }else{
            System.out.println("key 값은 : " + idx + "입니다.");
        }

    }

    private static int search(int[] arr, int num, int key){

        arr[num] = key; //보초에 키 값을 넣어서 검색조건 1번 삭제

        int i = 0;

        while (true){
            if(arr[i] == key)
                break;
            i++;
        }

        return i == num? -1 : i;

    }

}
