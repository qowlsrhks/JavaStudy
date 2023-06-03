package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달력출력문제 {
    public static void MyCalender() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());

        System.out.println("===========================");
        System.out.printf("       %4d년  %2d월\n", year, month);
        System.out.println("===========================");
        System.out.println(" 일   월   화  수  목   금  토 ");
        System.out.println("===========================");

        //1일의 요일만큼 빈칸 띄기
        for (int i = 1; i <=만년달력만들기문제.weekday(year,month,1); i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= 만년달력만들기문제.lastDay(year, month); i++) {
            System.out.printf(" %2d ", i);
            //출력한 날짜가 토요일이고 마지막날이 아니면 줄을 바꾼다.
            if (만년달력만들기문제.weekday(year, month, i) == 6 && 만년달력만들기문제.lastDay(year,month) != i) {
                System.out.println();
            }
        }
        System.out.println("\n===========================");

    }
}
