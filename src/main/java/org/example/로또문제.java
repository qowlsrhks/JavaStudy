package org.example;

import java.util.Random;

public class 로또문제 {
    //배열과 for문으로 작성한 로또 추첨 문제
    void 로또() {
        Random rd = new Random();
        int[] lotto = new int[45];
        int temp = 0;

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = i+1;
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.printf("%2d ",lotto[i]);
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n===========섞기 전=============");

        for (int i = 0; i < lotto.length*10; i++) {
            int num = rd.nextInt(44)+1;
            temp = lotto[0];
            lotto[0] = lotto[num];
            lotto[num] = temp;
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.printf("%2d ",lotto[i]);
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n===========섞기 후=============");
    }
}
