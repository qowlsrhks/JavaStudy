package org.example;

public class 메소드 {
    //메소드 형식
    //[접근권한지정자][static]메소드의리턴타입 메소드이름([인수],....) //메소드의 머리
    //[return 값]// 리턴 값이 없는 메소드는 리턴 타입에 void 라고 적는다

    //접근권한지정자
    //public   : 아무곳에서나 자유롭게 사용 가능
    //private  : 현재 클래스 외부에서 접근 할수없다 상속 불가능
    //protected: 현재 클래스와 상속받은 자식클래스에서 사용가능 상속 가능
    //package  : 현재 패키지에서는 public 처럼 사용 가능하지만 다른 패키지에서는 private 처럼 사용된다
    //접근 권한을 생략하면 package가 된다

    //정적(static)메소드 : 클래스 객체를 생성하지 않고 클래스 이름에 "."을 찍어서 실행가능 자주 사용하는 메소드에 쓴다

    //Class: 설계도
    //Method
    public static int total() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //Class 설계도식
    //메소드 method = new 메소드;
    //method.total();

    //정적(static)메소드식
    //메소드.total();

}
