package practice;

import java.util.ArrayList;
import java.util.List;

public class ListA {

    // 배열
    public static void main(String[] args) {

        // 배열의 길이가 정해져 있다.
        int[] arr = new int[10];

        arr[0] = 10;

        for(int i = 0, j = 1; i < 10; i++, j++){
            arr[i] = j;
        }

        for(int a : arr){
            System.out.println(a);
        }

        // 길이가 정해져 있지 않다.
        // List<자료형> 배열이름 = new ArrayList<자료형>(배열의 길이);
        List<String> test = new ArrayList<>();

        // 값을 저장
        test.add("문자");
        test.add("숫자");
        test.add("논리");
        System.out.println(test); // [문자, 숫자 논리]

        // 특정 인덱스 값 저장
        test.add(0,"첫번째");
        System.out.println(test); // [첫번째, 문자, 숫자 논리]

        // 특정 값 수정
        test.set(2, "바꾸고자 하는 값");
        System.out.println(test); // [첫번째, 문자, 바꾸고자 하는 값, 논리]

        // 특정 인덱스 값 삭제
        test.remove(0);
        System.out.println(test); // [문자, 바꾸고자 하는 값, 논리]

        // 특정 인덱스 값 확인
        System.out.println(test.get(2)); // 논리

        // 리스트 안에 요소 개수 확인
        System.out.println(test.size()); // 3

        // 값이 몇 번 인덱스에 위치하는지 찾을 때
        System.out.println(test); // [문자, 바꾸고자 하는 값, 논리]
        System.out.println(test.indexOf("논리")); // 2
        System.out.println(test.lastIndexOf("논리")); // ???

        System.out.println(test.indexOf("0")); // -1

        // 값이 리스트에 있는지 확인할 때
        System.out.println(test.contains("문자")); // true
        System.out.println(test.contains("0")); // false
/*
        for(String a : test){

            if(a.startsWith("문")){
                System.out.println(a);
                status = true;
            }

        }

        if(status){
            System.out.println("없습니다.");
        }
*/
        // 리스트 비우기
        test.clear(); // []
        System.out.println(test);
    }


}
