package f;

public class Fmain {

    public static void main(String[] args) {

        SamsungWashingMachine samsungWashingMachine = new SamsungWashingMachine();
        samsungWashingMachine.startButton();
        samsungWashingMachine.setSpeed(2);
        samsungWashingMachine.startButton();
        samsungWashingMachine.pauseButton();
        samsungWashingMachine.stopButton();
        samsungWashingMachine.checkSpeed();

    }

}
