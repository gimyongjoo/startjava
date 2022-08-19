package practice;

import java.util.Random;
import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {

        /* while은 참일때만 실행됨.
        while(조건){
            실행문
        }
         */

        /* do-while은 거짓이어도 실행됨.
        do{
            실행문
        } while(조건);
        */

        int n = 1;

        while(n >= 10){
            System.out.println("while : " + n);
            n++;
        }


        n = 1;

        do{
            System.out.println("do : " + n);
            n++;
        }while(n > 11);

        // 숫자
/*
        int number = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("숫자를 입력해주세요 : ");
            number = sc.nextInt();
        }while(number != 0);

        System.out.println("반복문 종료");
*/
        // 문자
        // o, x
        // String
        // 반복을 종료하시겠씁니까 : o
        // 반복문 종료
        // == equals()
/*
        String a;

        do{
            System.out.println(" x, o : ");
            a = sc.nextLine();
        }while(a.equals("x"));

        System.out.println("반복문 종료");
*/
/*
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);

        int i = 1;
        while(i < 11){
            int x = random.nextInt(10);
            System.out.println(x);
            i++;
        }
*/
        // do-while
        // 0-10까지의 난수를 두 개 만들어 줍니다.
        // 두 난수를 더해 변수에 담아 줍니다.(합)
        // 7 + 5 =
        // 예상하는 합의 결과를 입력 받습니다.
        // 7 + 5 = 12
        // 정답입니다.
        // 정답이 아닙니다.
        // 계속 하시겠습니까?(Y, N) :
        // N를 입력하면 "게임 끝"이라고 출력 후 강제 종료

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean take = true;
        System.out.println("돈을 넣어주세요 : ");
        int money = scanner.nextInt();

        do{
            if(money <= 0){
                System.out.println("돈이 부족합니다.");
                take = false;
            }else{
                money -= 500;
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int sum = num1 + num2;

            System.out.print(num1 + " + " + num2 + " = ");

            int result = scanner.nextInt();

            if(sum == result){
                System.out.println("정답입니다.");
            }else {
                System.out.println("정답이 아닙니다.");
            }
            }

        }while(true);


        // do-while
        // 불린타입의 변수를 만들어 ture
        // 돈을 넣어주세요 : 1500

        // money <= 0
        // 돈이 부족합니다.
        // 돈이 부족하면 불린타입의 변수를 false로 바꿔 반복 멈추기

        // money -= 500







    }


}
