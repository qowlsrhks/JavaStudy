package org.example;

//VO(value Object)클래스: 처리할 데이터 한 건을 기억하는 클래스, DTO(Data Transfer Object)
//Bean: 데이터를 저장할 멤버 변수(필드)와 멤버 변수에 데이터를  입출력할 수 있는 getter&setter 메소드로만 구성된 클래스
public class 클래스 {
    //멤버 변수(필드)를 선언 한다.
//    멤버 변수를 선언하고 초기화 시키지 않으면 숫자는 0,문자는 공백,boolean은 false, 클래스로 만든 모든 멤버는 null
//    멤버 변수에 저장된 데이터를 클래스 외부에서 함부로 변경 불가능하게 일반적으로 멤버 변수의 접근 권한은 private로 지정
//    데이터만 정확하다면 언제 어디서든 메소드를 실행하더라도 같은 결과를 얻을 수 있으므로 일반적으로 메소드 권한은 public으로 지정]

//    [접근 권한 지정자] [static] 자료형 변수명 [=초기치];
      private int no;
      private String name;
      private boolean gender;
      private double height;


//    [접근 권한 지정자]
//    private : 현재 클래스 외부에서 접근할 수 없다 상속은 가능
//    protected: 현재 클래스와 현재 클래스를 상속 받은 자식 클래스에서만 접근 가능, 상속 가능
//    package: 기본값(접근 권한 생략 시) 현재 패키지에서는 public처럼 사용하고 다른 패키지에서는 private처럼 사용
//    public: 현재 클래스 외부에서 자유롭게 사용가능

//    static(정적) 변수
//    최초에 한 번만 생성되고 초기화 되는 변수로 현재 클래스로 생성한 모든 객체에서 공유해서 사용
//    변수를 사용하기 위해 클래스에서 객체 선언 할 필요 없이 '.'을 찍어서 모든 객체에 접근 가능
}
