package practice;

import java.util.Scanner;

public class ofcourse08 {


    public static void main(String[] args) {

        // for
/*
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int n = 1;
        while (n <= 10) {
            System.out.println(n);
            n++;
        }

        // for문을 사용한 1-10 까지의 합
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum += j; // sum = sum + j
        }
        System.out.println(sum);

        // 1부터 100수 중에 짝수만 출력.
        for(int k = 1; k <= 100; k++) {
            if(k % 2 == 0) {
                System.out.println(k);
            }
        }
*/
        /*
        for(){

        }
        */
/*
        for (int dan = 2; dan <= 9; dan++) {
            for (int gop = 1; gop <= 9; gop++) {
                System.out.println(dan + "X" + gop + "=" + dan*gop);
            }
        }
*/

        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        for(int b = 1; b <= 9; b++) {
            System.out.println(dan + "x" + b + "=" + dan * b);
        }

        // 중첩 for문

//        for (int d = 1; d <= 9; d++) {
//            for (int g = 1; g <= 9; g++) {
//                System.out.println(d + "X" + g + "=" + d * g);
//            }
//            System.out.println();
//        }

        // ****
        // ****
        // ****
/*
        for(int c = 1; c <= 3; c++) { // 3줄을 출력하기 위한 반복.
            for(int d = 1; d <= 4; d++) { // 4번의 별을 출력하기 위한 반복.
                System.out.print("*");
            }
            System.out.println();
        }
        // 첫 번째 반복보다 두 번째 반복되는 숫자가 작으면 o
        for(int e = 1; e <= 4; e++){ // 4줄
            for(int f = 1; f <= e; f++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

    }


}
