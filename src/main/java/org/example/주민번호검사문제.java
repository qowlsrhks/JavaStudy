package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 주민번호검사문제 {
    void 주민번호검사문제() throws IOException {
        System.out.println("주민등록번호 13자리를 '-'없이 입력하세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String juminNo = br.readLine();
        String check = "234567892345"; //가중치(고정값)
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            //문자열을 숫자로 계산할려면 48이나 문자 '0'을 빼주어야한다.(아스키 코드)
//            sum += (juminNo.charAt(i)-48) * (check.charAt(i)-'0');
//            sum += (juminNo.charAt(i) - 48) * (i < 8 ? i + 2 : i - 6);
            sum += (juminNo.charAt(i) - 48) * (i % 8 + 2); //가중치의 규칙성으로 여러가지의 식을 만들수있다.
        }
        int result = (11 - sum % 11) % 10;

        if (result == juminNo.charAt(12) - 48) {
            System.out.println("정상");
        } else {
            System.out.println("비정상");
        }
    }
}
