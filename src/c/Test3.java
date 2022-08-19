package c;

public class Test3 extends Test2 {

    public void test2Method(){}

    // public void test2Method2(){}

    // final 변수 : 값을 변경할 수 없고, 반드시 초기화해 만들어줘야 한다.
    public final int a = 10;

    @Override
    public void override(){
        super.override();
        System.out.println("test3class method");
    }

}
