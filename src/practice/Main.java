import practice.Child;

public class Main {

    public static void main(String[] args) {

        Child child = new Child("tom", 30);
        child.printChild();
        child.printParent();

        // this
        // super
        Potato potato = new Potato("brown");
        System.out.println(potato.calorie);
        System.out.println(potato.color);

        System.out.println(potato.toString());

//        Student studentA = new Student("kim", 15,"남", "둔산중", "2학년");
//
//        studentA.printInfo();
//        studentA.score();
//        studentA.printInfo();
//        studentA.name = "a";

    }

    public static class Root {
        public int calorie = 150;
    }

    public static class Potato extends Root {

        public String color;

        // super : 부모 클래스로부터 상속받은 멤버변수나 멤버메소드를
        //         자식 클래스에서 사용하고자 할 때 사용하는 키워드
        // super.변수/메소드
        // super
        public Potato(String color){
            this.color = color;
            super.calorie = 250;
        }

    }


}
