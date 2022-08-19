import practice.Person;

import java.util.Scanner;

public class Student extends Person {

    private String school;
    private String grade;

    public Student(String name, int age, String gender, String school, String grade){
        super(name, age, gender);
        this.school = school;
        this.grade = grade;
    }

    public void score(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("국어, 수학, 영어 점수를 입력해 주세요 : ");
        int kor = scanner.nextInt();
        int math = scanner.nextInt();
        int en = scanner.nextInt();

        int sum = kor + math + en;
        int avg = sum / 3;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);

    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("학교 : " + school + " 학년 : " + grade);
    }

    @Override // 어노테이션
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }



    // 오버라이딩
    // - 메소드의 내용을 재정의 하는 것이기 때문에 메소드의 이름은 동일하되 본문이 달라져야 한다.

    // 오버로드
    // - 메소드의 이름만 같고 매개변수가 달라야 한다.

    //               오버로드                오버라이드
    // 메소드 이름       동일                    동일
    // 매개변수          다름                   동일
    // 반환값          상관없음                  동일


}
