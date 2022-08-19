package h;

import java.util.*;

public class Hmain {

    public static void main(String[] args) {

        Test test = new Test();

        test.a = "3.14";
        test.b = true;
        boolean c = true;
        // weapper 클래스 : 원시타입을 객체인 것처럼 포장한다.

        System.out.println(test.a);
        System.out.println(test.b);
        System.out.println(test.a.getClass().getName());
        System.out.println(test.b.getClass().getName());

        Test<String, Integer> test1 = new Test();
        test1.a = "A";
        test1.b = 100;

        Test<String, String> test2 = new Test();
        test2.a = "A";
        test2.b = "B";


        List list = new ArrayList();
        Map<String, Integer> map = new HashMap<>();
        // 맵에 값을 추가할 때 사용
        map.put("키", 186);
        map.put("나이",23);
        System.out.println(map);

        // 맵의 갯수를 반환
        System.out.println(map.size()); // 갯수 확인
        // 맵에 있는 키만 반환
        System.out.println(map.keySet()); // 확인
        // key에 해당하는 value를 반환
        System.out.println(map.get("키")); // 대상 확인
        // 맵에 해당 key가 있는지 없는지 boolean으로 반환
        System.out.println(map.containsKey("키")); // 사실 확인
        // key값을 제거
        map.remove("키"); // 대상 지우기
        System.out.println(map);
        // 맵을 비움
        map.clear(); // 비우기
        System.out.println(map);



    }

}
