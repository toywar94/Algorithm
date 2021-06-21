package com.algorithm.programmers;

public class CaesarCipher {

        public String cipher(String s, int n){
            /*
             * s의 문자열을 n만큼 밀어서 암호화 시킨다
             * ex) s = "AB" n = 1 -> "BC"
             * 아스키코드 참고하면서 하면 될 듯?
             * 소문자 대문자 이것도 신경써주고
             * z 넘어가면 a로 / Z에서 넘어가면 A로
             * */
            String answer = "";

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                //둘 다 소문자 , n만큼 민다.
                if(ch >= 'a' && ch <= 'z'){
                    //n이랑 더해서 z넘어가면 순환해야하니까 아스키코드
                    //차이 알아내서 a로 다시 순환시칸다 차이 -26
                    if(ch+n > 'z'){
                        answer += (char)(ch + n-26);
                    }else{
                        answer += (char)(ch + n);
                    }
                }else if(ch >= 'A' && ch <= 'Z'){
                    if(ch+n > 'Z'){
                        answer += (char)(ch + n-26);
                    }else{
                        answer += (char)(ch + n);
                    }
                }else{
                    answer += (char)ch;
                }

            }


            return answer;

        }

        public static void main(String[] args) {

            CaesarCipher test = new CaesarCipher();
            System.out.println(test.cipher("AB",1));
            System.out.println(test.cipher("z",1));
            System.out.println(test.cipher("a B z",4));

            
    }
}
