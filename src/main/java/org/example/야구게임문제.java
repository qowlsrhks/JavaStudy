package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class 야구게임문제 {
    void BaseBallGame() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ball = {0, 1, 2, 3, 4, 5, 6, 7, 6, 9};
        Random rd = new Random();

        for (int i = 0; i < 1000000; i++) {
            int sum = rd.nextInt(9) + 1;// +1을 안하고 10을 하면 불필요한 메모리 소모
            int tem = ball[0];//자리 바꾸기 공식 // \
            ball[0] = ball[sum];
            ball[sum] = tem;
        }
        System.out.print("레벨을 정하세요:");
        int level = Integer.parseInt(br.readLine());

        //정답 알려주는 로직
        System.out.print("CPU:");
        for (int i = 0; i < level; i++) {
            System.out.print(ball[i]);
        }
        System.out.println();
        
        int count =0;
        //currentTimeMillis():1900년 1월 1일 부터 이 메소드가 실행되는 순간까지 지난 시간을 1/1000초 단위로 얻어온다.
        long start = System.currentTimeMillis();//게임 시작 시간
        while (true) {
            System.out.print("USER:");
            String user = br.readLine();
            //스트라이크와 볼은 반복마다 초기화 해주어야해서 반복문 안에서 작성
            int s = 0;
            int b = 0;
            count++;
            //스트라이크를 세주는 로직
            for (int i = 0; i < level; i++) {
                if (ball[i] == user.charAt(i) - '0') {//문자열을 출력할때는 아스키코드를 보고
                    // 문자열과 뺴주어야 원하는 정수를 얻을수있음
                    s++;
                }
                //indexOf:문자열에서 괄호 안에 문자나 문자열의 최초로 나타나는 위치를 얻어온다.없으면 -1리턴
                //정수+""를하면 문자열이된다
//                user.indexOf(ball[i]+"");
                //볼의 갯수
                if (user.indexOf(ball[i] + "") >= 0) {
                    b++;
                }
            }
            //맞추면 반복문 탈출 로직
            if (s == level) {
                break;
            }
            System.out.println(s + "스트라이크" + (b - s) + "볼");
        }
       long end = System.currentTimeMillis();//게임 종료 시간
        System.out.println((end - start)/1000.+"초 걸려서 "+count+"번 만에 맞췄다");
    }
}
