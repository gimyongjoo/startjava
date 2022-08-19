package f;

public class SamsungWashingMachine implements WashingMachine, DryMachine {

    public int washingSpeed = 0;

    // startButton에서는 washingSpeed가 0이라면 "스피드를 설정해주세요." 아니면 "세탁을 시작합니다."
    // pauseButton에서는 washingSpeed가 0이라면 "스피드를 설정해주세요." 아니면 "세탁을 일시 중지합니다."
    // stopButton에서는 washingSpeed가 0이라면 "스피드를 설정해주세요." 아니면 "세탁을 중지합니다."
    // setSpeed switch-case를 사용해 1이면 "세탁시간이 20분 소요됩니다", 2면 50분, 3이면 100분

    @Override
    public void startButton(){
        if(washingSpeed == 0){
            System.out.println("스피드를 설정해주세요.");
        }else{
            System.out.println("세탁을 시작합니다.");
        }
    }
    @Override
    public void pauseButton(){
        if(washingSpeed == 0){
            System.out.println("스피드를 설정해주세요.");
        }else{
            System.out.println("세탁을 일시 중지합니다.");
        }
    }
    @Override
    public void stopButton(){
        if(washingSpeed == 0){
            System.out.println("스피드를 설정해주세요.");
        }else{
            System.out.println("세탁을 중지합니다.");
        }
    }

    @Override
    public int setSpeed(int speed) {
        switch(speed){
            case 1:
                washingSpeed = 20;
                System.out.println("세탁시간이 20분 소요됩니다.");
                break;
            case 2:
                washingSpeed = 50;
                System.out.println("세탁시간이 50분 소요됩니다.");
                break;
            case 3:
                washingSpeed = 100;
                System.out.println("세탁시간이 100분 소요됩니다.");
                break;
        }
        return washingSpeed;
    }

    @Override
    public void dry() {
        System.out.println("빨래 건조를 시작합니다.");
    }

    public void checkSpeed(){
        if(washingSpeed == 0) {
            System.out.println("스피드를 설정해주세요.");
        }else {
            System.out.println("설정된 세탁 시간은 " + washingSpeed + "분입니다.");
            }
        }
    }

