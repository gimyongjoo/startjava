package practice;

public class ArrayExample {

    public static void main(String[] args) {


        // 매개변수
        // 인자 -> () 안에 들어가는 것을
        // 호출

        int result = plus(2,5);
        System.out.println(result);

        // return / sout

        System.out.println(2+7);

        printName();

        printLan("C언어");

        int number = ten();
        System.out.println(number);

        System.out.println(minus(2,5));
        System.out.println(mult(3,7));
        divide(5,9);
    }

    /*
    함수반환형 함수이름(매개변수){

        return

    }
    */

    static int plus(int num1, int num2){

        int result = num1 + num2;
        return result;
    }

    static void printName(){
        System.out.println("자바는 재밌어");
    }

    static void printLan(String language){
        System.out.println(language + "는 재밌어");
    }

    static int ten(){
        return 10;
    }

    // -
    // *
    // /

    static int minus(int a, int b){
        return a - b;
    }

    static int mult(int c, int d){
        return c * d;
    }

    static void divide(int e, int f){
        System.out.println(e / f);
    }
}
