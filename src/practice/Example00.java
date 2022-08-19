package practice;

import java.util.Scanner;

public class Example00 {


    public static void main(String[] args) {


        // 변수를 불린 타입으로 만들어 true를 주고,
        // 정수 타입의 변수를 하나 만들어 0을 대입합니다.
/*
        boolean eyes = true;
        int nose = 0;

        while(eyes){
            System.out.println(nose);
            if(nose == 5){
                eyes = false;
            }
            nose++;
        }
 */
        // 정수변수의 값을 1 증가 시켜 줍니다.

        // break
        /*
        boolean eyes = true;
        int nose = 0;

        while(eyes){
            System.out.println(nose);
            if(nose == 5){
                break;
            }
            nose++;
        }
        */
/*
        // for문 사용
        // 1-10까지 반복되는데 5가 되면 break를 사용해 반복을 멈춰주세요.

        for(int a = 1; a <= 10; a++){

            if(a == 5){
                break;
            }

            System.out.println(a);
        }


        // 1부터 10까지의 수를 더하는데 그 합이 10이 넘어가면 멈추게 만들어 주세요.
        // 숫자 :
        // 합 :
        int sum = 0;
        for(int b = 1; b <= 10; b++){

            if(sum > 10){
                break;
            }

            sum += b;
            System.out.println("숫자 : " + b);
            System.out.println("합 : " + sum);
        }
*/

        // continue
        // 1-10
/*
        int nose = 0;
        while(nose <= 10){
            nose++;
            if(nose == 5){
                continue;
            }
            System.out.println(nose);
        }
*/
        // 1-100까지의 수를 더하는데 홀수일 때 더하고, 짝수일 때 더하지 않는 프로그램을 만들어

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                continue;
            }
            sum += i;
        }
        System.out.println("합은 : " + sum);

        // 홀수단만 출력해
        for(int dan = 1; dan <= 9; dan++){
            if(dan % 2 == 0){
                continue;
            }
            for(int gop = 1; gop <= 9; gop++){
                System.out.println(dan + "X" + gop + "=" + dan*gop);
            }
            System.out.println();
        }





    }


}

