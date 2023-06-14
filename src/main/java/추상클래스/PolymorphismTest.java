package 추상클래스;

import java.util.Scanner;

//다향성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 사용되는 것을 말한다
//다향성을 구현할 메소드를 포함한 클래스는 같은 부모 클래스를 가져야한다
//부모 클래스와 자식클래스에 반드시 같은 메소드가 있어야 하고 자식 클래스는 반드시 오버라이드 해서 사용해야 한다
//부모 클래스의 객체에 자식 클래스의 객체를 대입해서 실행한다
abstract class Shape{
    public abstract void draw();   //다향성을 구현할 메소드 , 추상 메소드
}
class Point extends Shape{

    @Override
    public void draw() {
        System.out.println("점을 찍는다");
    }
}

class Line extends Shape{

    @Override
    public void draw() {
        System.out.println("선을 그린다");
    }
}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("원을 그린다");
    }
}

class Rect extends Shape{

    @Override
    public void draw() {
        System.out.println("사각형을 그린다.");
    }
}
public class PolymorphismTest {
    public static void main(String[] args) {
        Shape[] sa ={new Point(),new Circle(),new Line(),new Rect()};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sa[n-1].draw();
    }
}
