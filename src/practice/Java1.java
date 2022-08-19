package practice;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해 주세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력해 주세요 : ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // \n
        System.out.println("사칙 연산자를 넣어 주세요");
        String operator = scanner.nextLine();

        // int a = calculator();
        System.out.println(calculator(num1, num2, operator));


    }

    // +, -, *, / 메소드를 만들어 주세요.
    // calculator();
    // ㄴ> return int;
    // 매개변수는 없음
    // 사용자로부터 숫자 두 개를 받아줍니다.
    // "첫 번째 숫자 : " 5
    // "두 번째 숫자 : " 10
    // "사칙연산 연산자를 넣어 주세요 : " +, -, *, /
    // switch-case
    // default : "지원하지 않는 연산자입니다."
    // 연산은 위에서 만든 사칙연산 메소드를 사용해 연산합니다.
    // System.out.println(calculator());

    // main
    // "첫 번째 숫자 : " 5
    // "두 번째 숫자 : " 10
    // scanner.nextLine();
    // "사칙연산 연산자를 넣어 주세요 : " +, -, *, /
    // method
    // calculator(5, 10, "+");
    public static int plus(int a, int b){
        return a + b;
    }

    public static int minus(int a, int b){
        return a - b;
    }
    public static int multiple(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }

    public static int calculator(int a, int b, String c) {

        int result = 0;
        switch (c) {
            case "+":
                result = plus(a, b);
                break;
            case "-":
                result = minus(a, b);
                break;
            case "*":
                result = multiple(a, b);
                break;
            case "/":
                result = divide(a, b);
                break;
            default:
                System.out.println("지원하지 않는 연산자입니다.");
                break;
        }
        return result;
    }

}
