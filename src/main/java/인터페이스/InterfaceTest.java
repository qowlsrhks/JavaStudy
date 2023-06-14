package 인터페이스;
class Point{
    int x,y;

    public void move() {}
}
class Shape{
//     변수 앞에 final이 붙으면 프로그램에서 값을 변경 할 수 없다
    public static final double Pi = 3.141592;
}

//class Line extends Point,Shape{ } 클래스는 다중 상속이 불가능


//인터페이스란 정적(static)멤버 변수와 추상 메소드로만 구성된 클래스의 특별한 형태이다

interface Draw{
    public static final double Pi = 3.141592;
    //인터페이스는 아래와 같이 생략해도 static과 final이 자동으로 생성된다
    int LIMIT = 1000;
    public abstract void move2(); //추상 메소드
//    인터페이스는 메소드 선언시 앞에 내용을 생략하면 자동으로 public abstract를 붙여준다
    void erase();

}

interface Graphic{
    void rotate();
    void resize();
}
//class Line extends Draw{}  클래스는 인터페이스를 상속받을 수 없다
//interface Graphics extends Point {} 인터페이스는 클래스를 상속받을 수 없다
//클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속 가능

interface Graphics extends Draw,Graphic{ //인터페이스는 다중 상속 가능
//아무런 내용을 가지지 않는 인터페이스를 표시(marker)인터페이스라고 부른다
}
//클래스 선언시 인터페이스에서 정의한 내용을 사용하려면 상속(extends)을 할 수 없고 구현(implements)을 사용
//Line 클래스는 Point 클래스를 상속 받고 Draw 인터페이스는 Graphic 인터페이스를 구현해서 만든다
class Line extends Point implements Graphics{

    @Override
    public void move2() {


    }

    @Override
    public void erase() {

    }

    @Override
    public void rotate() {

    }

    @Override
    public void resize() {

    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Shape.Pi);
        System.out.println(Draw.Pi);
    }
}
