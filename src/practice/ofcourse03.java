package practice;

import java.util.Scanner;

public class ofcourse03 {

    public static void main(String[] args) {

        // 조건 연산자를 사용해 15가 짝수면 true를, 아니면 false를 출력해 주세요.
        int num = 15;
        // 조건식? 참:거짓
        boolean result = num % 2 == 0? true : false;
        System.out.println(result);

        // 변수 age를 만들어 19세 미만이면 미성년입니다를 이상이면, 성인입니다를 출력해 주세요.
        int age = 10;
        String result2 = age > 19? "성인입니다." : "미성년입니다.";
        System.out.println(result2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요.");
        String number = scanner.nextLine(); // 10 20 30 40 50 > 모두 출력
        // String number = scanner.next(); // 10 20 30 40 50 > 10 출력
        // int a = scanner.nextInt(); // 숫자만 출력
        System.out.println(number);
        // number = "10";
        int a = Integer.parseInt(number);
        System.out.println(a);

    }

}
