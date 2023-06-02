package org.example;

import java.util.Random;

public class 카드섞기문제 {
    void CardShuffle() {
        int[] card = new int[52]; // 보통 카드 갯수
        String[] arr = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        char[] arr1 = {'♠', '◆', '♥', '♣'};

        for (int i = 0; i < card.length; i++) {
            card[i] = i; //0~51 까지
        }
        for (int i = 0; i < card.length; i++) {
            System.out.printf("%s%2s ", arr1[card[i] / 13], arr[card[i] % 13]);
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
        }
        System.out.println("========섞기 전=========");

        Random rd = new Random();

        for (int i = 0; i < 10000; i++) {
            //+1을 안해주면 마지막 인덱스가 변경되지 않음 52를 해도 상관없지만 불필요한 연산이 들어가서 +1를 선호
            int sum = rd.nextInt(51) + 1;
            int tem = card[0];//자리 바꾸기 공식 // \
            card[0] = card[sum];
            card[sum] = tem;
        }
        for (int i = 0; i < card.length; i++) {
            System.out.printf("%s%2s ", arr1[card[i] / 13], arr[card[i] % 13]);
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }
            System.out.println("=======섞은 후======");
        }
    }
}
