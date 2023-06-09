package arraytest;

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void 어레이리스트() {
//        배열은 한 번 선언하면 프로그램에서 배열의 크기를 변경 할 수없다.
//        for문으로 10번째가 넘어가면 오류가 나온다
        int[] data = new int[10];

//      <E> : 제네릭이라 부르며 ArrayList에 저장할 자료형을 반드시 클래스로 적는다
//        ArrayList에 저장할 자료가 기본 자료형이라면 기본 자료형을 클래스화 시켜놓은 랩퍼 클래스를 사용한다
//        랩퍼 클래스는 기본 자료형의 첫 문자만 대문자로적으면 되고 Character 와 Integer는 풀네임을 사용한다


//        ArraysList<Integer> list = new ArrayList              JDK 1.4이전의 코딩 방법
//        ArraysList<Integer> list = new ArrayList<Integer>();  JDK 1.5이후의 코딩 방법
        ArrayList<Integer> list = new ArrayList<>();         //JDK 1.7이후의 코딩 방법

//      ArrayList<>는 배열과 비슷하지만 배열은 크기를 변경할 수 없지만 Array는 넣는 만큼 들어간다.

        for (int i = 0; i < 10; i++) {
            data[i] = i+1;
            list.add(i+1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("data["+i+"] = "+data[i]+", list.get("+i+") = "+list.get(i));
        }

        for (int i = 10; i < 20; i++) {
            list.add(i+1);
        }
        for (int i = 10; i < 20; i++) {
            System.out.println("list.get("+i+") = "+list.get(i));
        }
    }
}
