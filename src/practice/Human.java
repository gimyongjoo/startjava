package practice;

public class Human {

    // 오버로드 : 메소드의 이름은 같으나 매개변수가 달라야 한다.
    public Human(){

    }

    public Human(String name){
        this.name = name;
    }

    public Human(int age, boolean married){
        this.age = age;
        this.married = married;
    }

    private String name;
    private int age;
    private boolean married;
    private String job;

    public void setName(String name){
        // 멤버변수 = 매개변수
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int humanAge){
        // 멤버변수 = 매개변수
        age = humanAge;
    }

    public int getAge(){
        return age;
    }
    public void setMarried(boolean humanMarried){
        // 멤버변수 = 매개변수
        married = humanMarried;
    }

    public boolean getMarried(){
        return married;
    }
    public void setJob(String humanJob){
        // 멤버변수 = 매개변수
        job = humanJob;
    }

    public String getJob(){
        return job;
    }
    public void printInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("결혼여부 : " + married);
        System.out.println("직업 : " + job);
    }

}
