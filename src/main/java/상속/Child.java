package 상속;

//Parent 클래스를 상속 받아 Child클래스를 만든다.
public class Child extends Parent{
//    Parent 클래스를 상속받았기때문에 모든 멤버 변수와 메소드를 별도로 정의 하지않아도 사용 할 수있다
//    부모 클래스의 private 권한을 가진 멤버는 상속 받았지만 접근할 수 없다

    private int age;
    private String nickname;

    public Child() {}
//   자동 완성 기능을 사용해도 현재 클래스에서 직접 입력해 정의 하지않은 멤버 변수는 보이지 않는다
//   자바가 업데이트 되면서 현재는 직접 입력하지 않아도 된다

//    부모 클래스로 부터 상속받은 멤버 변수의 접근 권한이 private일 경우 부모 클래스의 생성자를 호출해서 초기화 시킨다
    public Child(String name, boolean gender, int age, String nickname) {
        super(name, gender);
        this.age = age;
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
//        부모클래스로 부터 상속받은 멤버변수의 접근 권한이 private이면 접근 할 수 없으므로 Getter를 사용해야한다
        return getName()+"("+(isGender()?"남":"여")+") - "+age+"," +nickname;
    }
}
