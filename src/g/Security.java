package g;

import java.util.Random;

public class Security implements OnOff {

    public String id;

    public Security(String id){
        this.id = id;
    }

    @Override
    public boolean on() {
        System.out.println(id + " 보안이 켜졌습니다.");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println(id + " 보안이 꺼졌습니다.");
        return false;
    }

    public int getExistPeople(){
        Random random = new Random();
        int check = random.nextInt(5);
        System.out.println(check);
        return check;
    }
}
