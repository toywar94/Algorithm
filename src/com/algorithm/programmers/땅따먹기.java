package com.algorithm.programmers;

public class 땅따먹기 {
    /*
     * 1행부터 1칸씩 내려온다
     * 각 행의 4칸중 1칸만 밟으며 내려온다
     * 같은 열을 반복해서 밟을순 없다.
     * 행의 최대값을 밟아야 한다.
     * */

    public int eatGround(int[][] land) {
        int answer = 0; //return 값

        //1~4열을 랜덤으로 골라야하는건가?

        //이 문제 2단계 맞는건가... 모르겠네...
        //일단 행의 최대값을 구하는 조건은 제외하고 풀었는데...
        for (int i = 0; i < land.length; i++) {
            int randomRow = (int)(Math.random()*4);//0~3 열4개니까
            System.out.println(randomRow);
            for (int j = 0; j < 1; j++) {
                //1행은 그냥 더하고 나머지 2행부터 그 전의 열은 찍으면 x
                if(i == 0){
                    answer += land[i][randomRow];
                }else{
                    //좀 더 생각해보자
                }

            }

        }

        return answer;
    }


    public static void main(String[] args) {

        땅따먹기 test = new 땅따먹기();
        int[][] numArr = {
                {1,2,3,5},
                {5,6,7,8},
                {4,3,2,1}
        };
        System.out.println(test.eatGround(numArr));

    }
}
