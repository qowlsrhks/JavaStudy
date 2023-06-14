package 내부클래스;

public class Innerclass {
/*
1.내부 클래스의 구조
    class OuterClass{
        class InnerClass{ }
    }

    내부클래스의 사용 목적 : 클래스간의 관계가 긴밀할 때 사용하여 코드를 간결하게 하기 위해 사용

2.내부 클래스의 종류
    -내부 클래스의 선언된 위치에 따라 '인스턴스','스태틱','지역','익명'클래스로 구분

1)인스턴스 클래스
    -외부 클래스에서 멤버 변수 위치에 선언
    -클래스의 내부에서 인스턴스(객체)멤버처럼 다뤄지며,인스턴스 멤버들과 상호작용 가능

<구조>
class OuterClass{
        class InnerClass{ }
    }

2)스태틱(static)클래스
    -외부클래스에서 멤버 변수 위치에 선언
    -클래스 내부에서 static멤버처럼 다뤄지며  static멤버들과 상호작용 가능

<구조>
    class OuterClass{
       static class InnerClass{ }
    }

3) 지역 클래스
    -메서드 내부 지역변수 위치에 선언
    -메서드나 초기화 블록의 내부에서 다뤄지며 선언된 영역 내부에서 사용

<구조>
    class OuterClass{
              void A(){
                         class InnerClass{
                         }
                         }
                         }


내부 클래스에도 접근제어자를 사용할수있다
*/

    public static void main(String[] args) {
    }
}

class A{
    static class StaticInner{ }
    class InstanceInner { }

    StaticInner st1 = new StaticInner();
    InstanceInner II1 = new InstanceInner();

    static void StaticMethod() {
        StaticInner st2 = new StaticInner();
//        InstanceInner II2 = new InstanceInner(); ->스태틱메소드는 인스턴스멤버에 접근 불가능
    }

    void InstanceInnerMethod() {
        StaticInner st3 = new StaticInner();
        InstanceInner II3 = new InstanceInner(); //인스턴스메소드는 둘다 가능
    }
}
