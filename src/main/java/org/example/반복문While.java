package org.example;

import java.lang.ref.Cleaner;

public class 반복문While {
    void While() {
        int sum = 0, i = 0;

        while (i < 100) {
            sum += ++i; //sum은 0에서 100까지 더한 수
        }
        System.out.println(sum);
//----------------------------------------------------------------
        //do-while 최초 진입 조건이 거짓이더라도 한번은 실행
        do {
            sum += ++i;
        } while (i > 100); //";"은 빼먹으면 안된다.
        System.out.println(sum);
    }
}
