package practice;

import java.util.ArrayList;
import java.util.List;
// 접근제어자
// public / private
public class Run {

    public static void main(String[] args) {
        // 자료형
        Score score = new Score(100,80,70,90,60);
        Score score2 = new Score(10,8,7,9,6);

        System.out.println("총합 : " + score.sum());
        System.out.println("평균 : " + score.avg());

        List<Score> Lists = new ArrayList<>();
        Lists.add(score);
        Lists.add(score2);

        System.out.println(Lists);

        // lastIndexOf();
        List<String> strS = new ArrayList<>();
        strS.add("a");
        strS.add("b");
        strS.add("c");
        strS.add("d");
        strS.add("e");
        strS.add("f");
        strS.add("g");
        strS.add("h");
        strS.add("i");
        strS.add("d");

        System.out.println(strS.indexOf("d"));
        System.out.println(strS.lastIndexOf("d"));



    }

}
