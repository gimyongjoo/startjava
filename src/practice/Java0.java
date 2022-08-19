package practice;

import java.util.Scanner;

public class Java0 {


    // 메인 함수
    public static void main(String[] args) {
        // 함수 호출
        // 함수이름();
        // 재사용성, 중복코드 제거, 관리가 용이
/*
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("안녕하세요.");
 */
/*
        loof(20);
        hi("hello");

        check(10);
        check(0);

        test();

        // 숫자를 두 개 받아 나누는 함수를 만들어 주세요.
        // void
        // 나누는 수가 0이면, "나누는 수는 0일 수 없습니다." 라고
        // 출력하고 함수를 종료합니다.
        // 조건문이 false가 되어 실행되지 않으면
        // 두 수를 나눠주시면 됩니다.

        abc(6,3);
        abc(3,0);

        // 숫자 두 개를 받아 더 큰 수를 반환하는 함수를 만들어 주세요.
        System.out.println(def(1,9));
 */




    }

    // 메소드
    // 함수 정의
    /*
    public static 리턴타입 함수이름(){

    }
    */

    public static void loof(int x){
        for(int i = 1; i <= x; i++){
            System.out.println(i);
        }
    }

    public static void hi(String str){
        System.out.println(str);
    }

    // 매개변수 - 매개체가 되는 함수
    // return : 함수 종료, 값 반환

    public static void test(){
        System.out.println("return1");
        return;
        // System.out.println("return2");
    }

    public static void check(int num){

        if(num == 0){
            System.out.println(num + "을 입력하셨습니다. 함수가 종료됩니다.");
            return;
        }

        System.out.println(num);

    }
    public static void abc(int a, int b){
        if(b == 0){
            System.out.println("나누는 수는 0일 될 수 없습니다.");
            return;
        }
        System.out.println(a / b);
    }

    public static int def(int c, int d){
        int big = c;

        if(big < d){
            big = d;
        }
        return big;
    }


}

