package practice;

public class ofcourse {
    // psvm
    public static void main(String[] args) {
        // sout
        System.out.println("hello, world");

        int a;
        a = 10;

        int b = 100;

        // 데이터 타입
        // 원시타입 참조타입
        // 원시타입은 변수에 값 자체가 담긴다.
        // 참조타입은 변수에 주소가 담긴다.
        // 원시타입
        // byte(1), short(2), int(4) , long(8)

        byte c = 1; // byte는 -128 ~ 127 사이 숫자만 가능
        short d = 2000;
        int e = 3;
        long f = 4L; // l, L

        // 실수
        // float(4), double(8)
        float g = 3.14f;
        double h = 3.14;

        // 문자
        // char(2)
        // A == 65
        char i = 'A';
        System.out.println((int)i);


        // 논리형
        // boolean(1) : true / false
        boolean j = true;

        // 참조타입
        // String : 문자열
        // Integer : 정수

        char ch1 = 'V';
        String s1 = "문자열";
        Integer i1 = 100;

        // null
        // int int1 = null; --> X
        Integer int2 = null;

        // 정수 int
        int a1 = 1;
        // 실수 double
        double a2 = 3.14;
        // 문자 char
        char a3 = 'b';
        // 논리 boolean
        boolean a4 = false;
        // 문자열 String
        String a5 = "야야야~";

        Integer a6 = null;

        // 형변환(casting)
        // 자동 형변환/ 명시적 형변환
        // (변환하고자 하는 자료형)
        // int / double

        // int -> double
        int b1 = 5;
        double b2 = b1; // 자동 형변환
        double b3 = (double)b1; // 명시적 형변환
        System.out.println(b2);

        // double -> int
        // int b4 = 5.5;
        int b5 = (int)5.5;
        System.out.println(b5);


        // Integer, String
        // 2, "2"
        String s2 = Integer.toString(2);
        System.out.println(s2);
        System.out.println(s2.getClass().getName());

    }

}
