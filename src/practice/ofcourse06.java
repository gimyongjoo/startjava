package practice;

import java.util.Scanner;

public class ofcourse06 {

    public static void main(String[] args) {


        System.out.println("정수를 입력해 주세요 : ");
        Scanner input = new Scanner(System.in);

        // int n = input.nextInt();


        // System.out.println("입력 받은 수 : " + n);
/*
        if (n > 0) {
            System.out.println(n + "는 양수입니다.");
        } else{
            System.out.println(n + "는 음수입니다.");
        }
*/

        // else-if(조건){
        //  수행문
        // }
/*
        if(n > 0){
            System.out.println("양수입니다.");
        } else if(n == 0){
            System.out.println("0입니다.");
        } else{
            System.out.println("음수입니다.");
        }
*/
        // man / woman
        // 입력 받은 값이 man이면 "남성입니다."를 woman이면 "여성입니다."를
        // 둘 다 아니면 "잘못된 입력입니다. man이나 woman을 입력해주세요."
/*
        System.out.println("성별을 입력해주세요 : ");
        String gender = input.nextLine();

        if (gender.equals("man")) {
            System.out.println("남성입니다.");
        } else if (gender.equals("woman")) {
            System.out.println("여성입니다.");
        } else {
            System.out.println("잘못된 입력입니다. man이나 woman을 입력해주세요.");
        }
*/

/*
        String rank = input.nextLine();
        int rankI = Integer.parseInt(rank);

        if (rankI == 1) {
            System.out.println("금메달입니다.");
        } else if (rankI == 2) {
            System.out.println("은메달입니다.");
        } else if (rankI == 3) {
            System.out.println("동메달입니다.");
        } else {
            System.out.println("수상 대상이 아닙니다.");
        }
*/

        // switch-case
//        switch () {
//            case:
//                System.out.println();
//                break;
//        }

/*        String medal;

        switch (rankI) {
            case 1: medal = "금메달";
                System.out.println(medal);
                break;
            case 2: medal = "은메달";
                System.out.println(medal);
                break;
            case 3: medal = "동메달";
                System.out.println(medal);
                break;
            default:
                System.out.println("수상 대상이 아닙니다.");
                break;
        }
*/

        String month = input.nextLine();
        int monthI = Integer.parseInt(month);

        String months;

        switch (monthI) {
            case 1: months = "January";
                System.out.println(months);
                break;
            case 2: months = "February";
                System.out.println(months);
                break;
            case 3: months = "March";
                System.out.println(months);
                break;
            case 4: months = "April";
                System.out.println(months);
                break;
            case 5: months = "May";
                System.out.println(months);
                break;
            case 6: months = "June";
                System.out.println(months);
                break;
            case 7: months = "July";
                System.out.println(months);
                break;
            case 8: months = "August";
                System.out.println(months);
                break;
            case 9: months = "September";
                System.out.println(months);
                break;
            case 10: months = "October";
                System.out.println(months);
                break;
            case 11: months = "November";
                System.out.println(months);
                break;
            case 12: months = "December";
                System.out.println(months);
                break;
        }

    }


}
