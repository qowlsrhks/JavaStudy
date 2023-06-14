package 내부클래스;

public class 익명클래스 {
    public static void main(String[] args) {
//        Inter1 it = new Inter1(); 인터페이스는 객체 생성 불가능 하다
        Inter1 it = new Inter1(){
            public void f1(){
                System.out.println("f1()");
            }
        };
        it.f1();
        //익명클래스는 1회용 이다
        //익명클래스는 인터페이스 혹은 추상클래스를 일회성으로 구현할 때 많이 사용한다
    }
}

interface Inter1{
    public void f1();
}
