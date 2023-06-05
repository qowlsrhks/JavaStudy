package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class two배열 {
    public static void 이차배열문제1() {
        //ㄹ자 출력 문제
        int[][] arr = new int[4][5];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j] = ++count;
                }
            } else {
                //for문을 활용한 ㄹ자 입력 방법
                for (int j = 4; j >= 0; j--) {
                    arr[i][j] = ++count;
                }
            }
        }
        //printf를 이용한 배열 출력 방법
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void 이차배열문제2() {
        //두번쨰 방법
        int[][] arr2 = new int[4][5];
        int count2 = 0, start = 0, end = 4, sw = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = start; j != end + sw; j += sw) {
                arr2[i][j] = ++count2;
            }
            //자리 바꿈으로 반대로 입력
            int temp = start;
            start = end;
            end = temp;
            sw *= -1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%2d ", arr2[i][j]);
            }
            System.out.println();
        }
    }

    public static void 이차배열문제3() {
        int[][] arr = new int[5][5];
        //count=1~25,  i=행,  j:열,    sw:부호 변경, k:반복횟수
        int count = 0, i = 0, j = -1, sw = 1, k = 5;

        while (true) {
            //행방향 채우기
            for (int l = 0; l < k; l++) {
                j+= sw;
                arr[i][j] = ++count;
            }

            if (--k == 0) {
                break;
            }
            //열방향 채우기
            for (int l = 0; l < k; l++) {
                i+= sw;
                arr[i][j] = ++count;
            }
            sw *= -1;

        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void 이차배열문제4() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("홀수를 입력하시오:");
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];
        //마방진 첫 번쨰 숫자가 채워지는 자리는 첫열 가운데
        int i = 0, j = n/2;

        //Math.pow(x, y): x,의 y승을 계산
        for (int k = 1; k <= Math.pow(n,2); k++) {
            arr[i][j] = k;
            //방금 배열에 채운 숫자가 5의 배수이면 다음 숫자는 1행만 증가
            //5의 배수가 아닐경우 오른쪽,위 배열에 배치 (행-1,열+1)

            if (k % n == 0) {
                i++;
            } else {
                if (--i < 0) {
                    //행이 배열의 범위를 벗어나면 마지막 행으로 이동
                    i = n-1;
                }
                if (++j == n) {
                    //열이 배열의 범위를 벗어나면 첫번째 열로 이동
                    j = 0;
                }

            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
