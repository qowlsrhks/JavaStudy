package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스위치문 {
    void Switch() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int total = a+b+c;
        double average = (double) total/3;
        //key 값은 정수를 기억하는 변수 또는 연산결과가 정수인 수식, 자바 1.7부터는 문자열도 가능
        switch((int)average/10){
            //key 값을 10으로 나눈결과 코드가 더욱더 간결해진다
            case 10 :
                System.out.println("참 잘했어요.");
//                System.out.println("수"); break;
                //key값이 정수임으로 평균갑은 9.0~9.9가 전부 9가 되어버림
            case 9 :
                System.out.println('수'); break;
            case 8 :
                System.out.println('우'); break;
            case 7 :
                System.out.println('미'); break;
            case 6 :
                System.out.println('양'); break;
//            case 5 :case 4 :case 3 :case 2 :case 1 :case 0 :
            default :
                System.out.println('가'); break;
        }
    }
}
