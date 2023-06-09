package 클래스;

import java.util.Date;

public class MemoVo {
    private int no;
    private String name;
    private boolean gender;
    private String memo;
    private Date writeDate;

//    생성자 메소드(이하 생성자)
//    생성자 이름은 반드시 클래스 이름과 같아야한다
//    생성자는 return을 가지지 않는다 return을 가지지 않는 메소드는 접근권한에 void를 입력하는데 생성자는 접근권한을 입력하지 않는다
//    생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지않는 기본 생성자를 만들어 준다 하지만 사용자가 생성자를 선언하면
//    기본 생성자는 자동으로 생기지 않는다
//    생성자는 객체가 생성될 때 자동으로 실행되며 멤버 변수를 초기화 시키는 목적으로 사용된다


    public MemoVo() {
//        System.out.println("기본 생성자가 실행");

//        생성자 MemoVo(String name, boolean gender, String memo)를 실행한다.
        this("무명씨", false, "없음");
    }

    //                (                 지역변수                )
    public MemoVo(String name, boolean gender, String memo) {
//        같은{} 블록에 같은 이름을 가지는 지역 변수와 멤버 변수가 있을 경우 지역변수에 우선권이있다
//        super() : 부모 클래스의 생성자를 의미한다 생략하면 컴파일러가 자동으로 넣어준다
//        this() : 현재 클래스의 생성자를 의미한다
//        super() 와 this()는 반드시 생성자의 첫 줄에 작성해야한다
//      super : 부모 클래스를 의미
//      this : 현재 클래스를 의미

        this.name = name;
        this.gender = gender;
        this.memo = memo;
    }

    //    객체에 저장된 내용을 출력할려면 toString() 메소드를 Override(재정의) 한다.
    @Override
    public String toString() {
        return no + "." + name + "(" + (gender ? "남" : "여") + ")님이 " + "에 남긴 말 " + memo;

    }
}
