package org.example;

public class 만년달력만들기문제 {
    //year이 윤년이면 true 평년이면 false를 리턴하는 메소드
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    //만년달력만들기문제 manmun = new 만년달력만들기문제;
    //manmun.isLeapYear(2017)

    //만년달력만들기문제.isLeapYear(2017);

    //인수로 년,월을 받아 그 달의 마지막 날짜를 리턴하는 메소드
    public static int lastDay(int year,int month){
        int[] m = {31,28,31,30,31,30,31,31,30,31,30,31};
        m[1] = isLeapYear(year) ? 29 : 28;
        return m[month-1];
        //배열은 0 부터 시작하기에 -1을 해줘야 제대로 된 값을 받을수있음 예) 1월 -1 0번째 인덱스
    }

    //인수로 년,월,일을 받아 1년 1월 1일 부터 지나온 날짜의 합계를 계산하는 메소드
    public static int totalDay(int year, int month, int day) {
        int sum = (year - 1) * 365 + (year -1) / 4 - (year -1) / 100 + (year -1) /400;
        for (int i = 1; i < month; i++) {
            sum += lastDay(year, i);
        }
        return sum+day;
    }

    //인수로 년,월,일을 받아 요일을 리턴하는 메소드
    //일0,월1,화2,수3,목4,금5,토6
    public static int weekday(int year, int month, int day) {
        return totalDay(year, month, day)%7;
    }

}
