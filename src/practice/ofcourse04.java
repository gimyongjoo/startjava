package practice;

import java.util.Scanner;
// 문제 page
public class ofcourse04 {

    public static void main(String[] args) {

        // 숫자를 입력 받아 입력 받은 수가 짝수면 true를, 홀수면 false를 출력해주세요.
        Scanner scanner = new Scanner(System.in);

        // System.out.println("숫자를 입력해 주세요.");
        // int a = scanner.nextInt();

        // String b = scanner.nextLine();
        // int intB = Integer.parseInt(b);

        // boolean result = intB % 2 == 0? true : false;
        // System.out.println(result);

        // 변수 age를 만들어 20세 이상이면 성인입니다를 이하이면, 미성년입니다를 출력해 주세요.
        int age = 18;

        if(age >= 20){
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년입니다.");
        }


    }
}
