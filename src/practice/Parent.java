package practice;

public class Parent {

    public String name;

    public Parent(){
        System.out.println("부모 클래스 생성자");
    }

    public Parent(String name){
        this.name = name;
    }

    public void printParent(){
        System.out.println("부모 클래스입니다.");
    }

    public void printParent(int a){
        System.out.println("부모 클래스입니다.");
    }
}
