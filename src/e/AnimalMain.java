package e;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("강아지");

        dog.eat();
        dog.sleep();
        dog.drink();
        dog.run(20);
        dog.play("공");
        dog.printInfo();

    }

}
