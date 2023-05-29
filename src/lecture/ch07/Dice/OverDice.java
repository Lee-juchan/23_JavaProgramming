package lecture.ch07.Dice;

import java.util.Random;

public class OverDice {
    private int faceValue = 0;
    private int MAX_VALUE = 6;
    private int MIN_VALUE = 1;
    private Random rand = new Random(); // 난수생성 객체

    // 주사위 굴리고 결과 리턴
    public int roll() {
        faceValue = rand.nextInt(MAX_VALUE) + MIN_VALUE;
        return faceValue;
    }

    // 내부정보 확인용
    public int getFaceValue() {
        return faceValue;
    }
}