package practice;

public class Animal {

    private String name;
    private String color;
    private int age;
    private String gender;

    // get() / set()
    public void setName(String animalName){
        name = animalName;
    }

    public String getName(){
        return name;
    }

    public void setColor(String animalColor){
        color = animalColor;
    }

    public String getColor(){
        return color;
    }

    public void setAge(int animalAge){
        age = animalAge;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String animalGender){
        gender = animalGender;
    }

    public String getGender(){
        return gender;
    }

    public void walk() {
        System.out.println("걷는다.");
    }

    @Override
    public String toString() {
        return "practice.Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
