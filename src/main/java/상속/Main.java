package 상속;

public class Main {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println(parent1);
        Parent parent2 = new Parent("이몽룡",true);
        System.out.println(parent2);

        Child child1 = new Child("성춘향",false,16,"이쁜이");
        System.out.println(child1);

    }
}
