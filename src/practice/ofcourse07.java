package practice;

import java.util.Scanner;
// 7/26
public class ofcourse07 {


    public static void main(String[] args) {

/*
        System.out.print("월을 입력해 주세요. : ");
        Scanner input = new Scanner(System.in);

        int months = input.nextInt();

        switch (months) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(months + "월은 31일까지 입니다.");
                break;
            case 6: case 9: case 11:
                System.out.println(months + "월은 30일까지 입니다.");
                break;
            case 2:
                System.out.println(months + "월은 28일까지 입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
*/

        // 반복문
        // while / for

        // 1부터 10까지의 합
        // 1부터 10까지의 합은 55

/*
        while (조건식) {
            수행문
        }
*/
/*
        while (true) {
            System.out.println("하이");
        }
*/
/*
        int n = 1;
        int sum = 0;
        while (n <= 10) {
            System.out.println(n);
            sum += n;

            n++;
        }

        System.out.println("1부터 10까지의 합은 " + sum + "입니다. ");
*/
        // 1. while문을 사용해 1부터 10까지 출력해 주세요.
        /*
        int n = 1;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }
        // 2. 1부터 100까지 숫자 중 짝수만 출력해 주세요.
        int num = 1;
        while(num <= 100) {
            if(num%2 == 0){
            System.out.println(num);
            }
            num++;
        }
        */
        // 중첩 while문
        /*
        while () { 10 1 2 3 4...

            while () { 10 1-10 1-10 1-10...

            }

        }
        */

        // 2 X 1 = 2
/*
        int dan = 2;
        while (dan <= 9) { // 2 3 4
            int n = 1;

            while (n <= 9) { // 1-9 1-9 1-9
                System.out.println(dan + " X " + n + " = " + dan*n);
                n += 1;
            }
            dan += 1;
            System.out.println();

        }
*/

        // 커피 1잔을 300원에 판매하는 커피 자판기가 있습니다.
        // 이 커피자판기에 돈을 넣으면 자판기가 뽑을 수 있는 커피가 몇 잔이며,
        // 잔 돈은 얼마인지 함께 출력하는 프로그램을 구현하세요.

        // > 1500원
        // > 커피 1 잔, 잔 돈 1200원
        // > 커피 2 잔, 잔 돈 900원
        // > 커피 3 잔, 잔 돈 600원
        // > 커피 4 잔, 잔 돈 300원
        // > 커피 5 잔, 잔 돈 0원

        Scanner scanner = new Scanner(System.in);
        System.out.println("얼마를 넣으시겠습니까?");
        int money = scanner.nextInt();
        int n = 0;
        while(money >= 300){
            n += 1; // n = n + 1
            money -= 300; // money = money - 300
            System.out.println("커피" + n + "잔, " + " 잔 돈 " + money + "원");
        }

    }

}
