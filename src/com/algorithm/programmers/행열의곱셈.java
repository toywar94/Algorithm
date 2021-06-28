package com.algorithm.programmers;

import java.util.Arrays;

public class 행열의곱셈 {
    /*
     * 파라미터로 받은 2차원 배열의 행열 곱셉..
     * 로직은 간단함.
     * 행과 열을 그려서 보면 ..
     * 1행
     * (1*3) + (4*3) = 15
     * (1*3) + (4*3) = 15
     * 2행
     * (3*3) + (3*2) = 15
     * */
    public int[][] matrix(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        System.out.println("test : "+ Arrays.deepToString(arr1));
        System.out.println("test : "+Arrays.deepToString(arr2));
        //arr1 행 : 3
        //arr2 행 : 2
        System.out.println(answer.length+","+answer[0].length);

        for (int i = 0; i < arr1.length; i++) {//3
            for (int j = 0; j < arr1[0].length; j++) {//2
                for (int k = 0; k < arr2[0].length; k++) {//2
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        return answer;

    }


    public static void main(String[] args) {

        행열의곱셈 test = new 행열의곱셈();
        int[][] arr1 = {{1,4},{3,2},{4,1}};
        int[][] arr2 = {{3,3},{3,3}};

        //System.out.println(test.convertInt(arr1,arr2));
        System.out.println(Arrays.deepToString(test.matrix(arr1, arr2)));

    }
}
