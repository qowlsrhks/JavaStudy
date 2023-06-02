package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 반복문 {
    void For() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        //1월 1일 부터 입력한 전년도 12월 31일까지 지난 날을 계산
        int sum = (year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
        for (int i = 1; i <month; i++) {
            switch(i){
                case 2:
                    sum += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
                    break;
                case 4: case 6: case 9: case 11: //짧은달
                    sum += 30;
                    break;
                default:                         //긴 달
                    sum += 31;
                    break;
            }
        }
        //전달 까지 지난 날수에 일을 더한다.
        sum += day;
        //1년 1월 1일 부터 입력한 날짜까지 지난 날짜의 합계를 7로 나눈 나머지가 0이면 일요일,1이면 월요일 ..

        char[] week = {'일','월','화','수','목','금','토'};

        System.out.println(week[sum%7]);
    }
}
