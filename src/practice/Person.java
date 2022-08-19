package practice;

public class Person {

    public String name;
    private int age;
    private String gender;

    // set()
    // get()

    // protected : 같은 패키지 내에서는 사용이 가능하나 다른 패키지에서는 사용이 불가하고,
    //      다른 패키지에서 사용하고자 한다면 그 클래스를 상속 받은 클래스(자식클래스)만 사용 가능.

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printInfo(){
        System.out.println("이름 : " + name + " 나이 : " + age + " 성별 : " + gender);
    }

}
