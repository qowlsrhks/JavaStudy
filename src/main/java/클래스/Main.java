package 클래스;

public class Main {
    public static void main(String[] args) {
        MemoVo vo1 = new MemoVo();
        GSetter vo2 = new GSetter("홍길동",true,"1등 입니다.");

        System.out.println(vo1);
        System.out.println(vo2);

//      count는 public이기 때문에 외부에서도 접근 가능
        GSetter vo3 = new GSetter("Deruco", false, "남자입니다");
        System.out.println(vo3);

        vo2.count = 100;
        System.out.println(vo3.count);

        System.out.println(vo2.getName());
        vo2.setName("임꺽정");
        System.out.println(vo2.getName());

    }
}
