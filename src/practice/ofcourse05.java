package practice;

public class ofcourse05 {

    public static void main(String[] args) {

        // 조건문
        // if(조건식) {
        //    실행문
        // }

        if(true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int score = 70;

        // if(score >= 80) {
        //    System.out.println("합격입니다.");
        // }

        if(score >= 80) {
            System.out.println(score + "점은 합격입니다.");
        }else {
            System.out.println(score + "점은 불합격입니다.");
        }

        // 입력 받은 수 n이 0보다 크면 "n은 양수입니다"를 아니면 "n은 음수입니다"가 출력

        int n = -1;

        if (n > 0) {
            System.out.println("n은 양수입니다");
        } else {
            System.out.println("n은 음수입니다");
        }

    }

}
