package 추상클래스;
//추상 클래스는 : 한 개 이상의 추상 메소드를 포함한 클래스로 불완전한 클래스이기 때문에 객체를 만들어 사용 할 수 없다
//추상 클래스는 상속을 시키기 위한 클래스로 추상 클래스를 상속받은 자식 클래스는 상속받은 추상메소드를 반드시 오버라이드해서 사용
abstract class Product{
//    추상 메소드 : 아무런 일도 하지 않는 메소드로 {}블록을 가지지않는 메소드로 abstract 예약어를 사용해서 만든다
//    추상메소드를 만드는 이유는 상속받을 자식 클래스에서 무조건 오버라이드 시켜서 사용해야 할 메소드는 부모클래스에서 코딩해봐야
//    무시되므로 내용없는 메소드를 만드는 것이다. 상속받은 자식 클래스에서 무조건 재정의 해야만한다

//    public void move(){}  아무런 일도 하지 않는 메소드
    public abstract void move();
}

//추상 클래스 Product를 상속받아 Camera 클래스를 만든다
class Camera extends Product {

    @Override
    public void move() {

    }
}

//파일 이름과 같은 이름을 가지는 클래스에만 public를 붙여야한다
public class AbstractClassTest {
    public static void main(String[] args) {

//        Product product = new Product() ; //추상 클래스는 객체를 만들어 사용 할 수 없으므로 에러가 발생한다

    }
}
