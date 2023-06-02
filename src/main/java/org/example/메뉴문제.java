package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 메뉴문제 {
    //Switch문과 while 문으로 작성한 메뉴 선정 문제

    void 메뉴() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int menu = 0;
        while (menu != 5) {
            do {
                System.out.println("==============================");
                System.out.println("1.저장 2.보기 3.수정 4.삭제 5.종료");
                System.out.println("==============================");
                System.out.println("원하는 메뉴를 선택하세요: ");
                menu = Integer.parseInt(br.readLine());
            } while (menu < 1 || menu > 5);
            switch (menu) {
                case 1:
                    System.out.println("입력");
                    break;
                case 2:
                    System.out.println("보기");
                    break;
                case 3:
                    System.out.println("수정");
                    break;
                case 4:
                    System.out.println("삭제");
                    break;
//                case 5:
//                    System.exit(0); //프로그램 강제 종료
//                    break;
            }
        }
        System.out.println("바이바이");
    }
}
