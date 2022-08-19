package practice;

public class ofcourse02 {

    public static void main(String[] args) {

        // 정수
        int a1 = 10;
        // 실수
        double a2 = 3.14;
        // 문자
        char a3 = 'a';
        // 논리
        boolean a4 = true; // false
        // 문자열
        String a5 = "1--";
        Integer a6 = null;

        System.out.println(a1);
        a1 = 100;
        System.out.println(a1);

        // 상수
        // final 데이터타입 상수명 = 값;
        final int test = 55;
        // test = 100;

        // 연산자
        // = : 대입연산자(같다 x)
        // +, -, *, /(몫), %(나머지)
        System.out.println(3+5);
        System.out.println(3-5);
        System.out.println(3*5);
        System.out.println(3/5);
        System.out.println(3%5);
        System.out.println((3+5)*8);

        int num1 = 15;
        int num2 = 3;
        int sum = num1 + num2;
        System.out.println(sum);

        // korean = 80, math = 100, english = 75
        int korean = 80;
        int math = 100;
        int english = 75;

        int sum1 = korean + math + english;
        int avg = sum1 / 3;
        System.out.println("평균은" + avg + "점");

        // 증가, 감소, 연산자
        // ++ : 1을 더한다.
        // -- : 1을 뺀다.

        int score = 99;
        int lastScore = ++score;
        System.out.println(lastScore);

        int lastScore2 = --score;
        System.out.println(lastScore2);

        // 연산자의 위치에 따라 값이 달라짐.
        int number = 5;
        int number2 = 0;

        number2 = ++number;
        System.out.println("number : " + number + " number2 : " + number2);

        number = 5;
        number2 = 0;
        number2 = number++;
        System.out.println("number : " + number + " number2 : " + number2);


        int b1 = 5;
        int c1 = 5;
        System.out.println("b1++ : " + b1++);
        // System.out.println(b1);
        // b1++;

        System.out.println("++c1 : " + ++c1);
        // ++c1;
        // System.out.println(c1);

        System.out.println("b1 : " + b1);
        System.out.println("c1 : " + c1);

        // 관계 연산자
        // > : 크다.
        // > : 작다.
        // >= : 크거나 같다.
        // <= : 작거나 같다.
        // == : 같다.
        // != : 아니다.
        System.out.println(5 > 2);
        System.out.println(5 < 2);
        System.out.println(5 >= 2);
        System.out.println(5 <= 2);
        System.out.println(5 == 2);
        System.out.println(5 != 2);

        int age = 30;
        // System.out.println(age > 18);
        boolean result = age > 18;
        System.out.println("result : " + result);

        // 논리 연산자
        // && : 두 항이 모두 참인 경우에만 true를 반환.
        // || : 두 항 중 하나만 참이면 true를 반환, 두 항 모두 거짓이면 false.
        // ! : 참인 경우는 거짓으로, 거짓인 경우는 참으로 반환.
        boolean result1 = 5 > 3 && 10 > 5; // 모두 참.
        System.out.println("result1 : " + result1);

        boolean result2 = 5 > 3 || 10 < 5; // 참, 거짓
        System.out.println("result2 : " + result2);

        boolean result3 = !(5 > 3);
        System.out.println("result3 : " + result3);

        // 복합대입 연산자
        // += : 오른쪽 항의 값을 더해 왼쪽 변수에 대입
        // -= : 오른쪽 항의 값을 빼 왼쪽 변수에 대입
        // *= : 오른쪽 항의 값을 곱해 왼쪽 변수에 대입
        // /= : 오른쪽 항의 값을 나눠 그 몫을 왼쪽 변수에 대입
        // %= : 오른쪽 항의 값을 나눠 그 나머지를 왼쪽 변수에 대입

        int numA = 10;
        numA += 2; // numA = numA(10) + 2;
        System.out.println(numA);

        numA -= 2; // numA = numA(12) - 2;
        System.out.println(numA);

        numA *= 2; // numA = numA(10) % 2;
        System.out.println(numA);

        numA /= 2; // numA = numA(20) / 2;
        System.out.println(numA);

        numA %= 2; // numA = numA(10) % 2;
        System.out.println(numA);

        // 조건 연산자
        // 조건식 ? 참 : 거짓
        int last = (5 > 3)? 0 : 1;
        System.out.println(last);

        // 언니와 동생의 나이를 각각 변수로 만들어 주세요.
        // result4 = 조건식이 참이면 T, 거짓이면 F가 출력되도록 만들어 주세요.
        int unni = 14;
        int dongsaeng = 12;
        int result4 = (unni > dongsaeng)? 'T':'F';
        System.out.println("result4 : " + result4);


    }

}
