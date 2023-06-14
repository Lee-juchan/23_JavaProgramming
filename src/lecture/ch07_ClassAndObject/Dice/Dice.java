/*
    #lecture 07-02 / 23.04.28 leejuchan

    @brief : 주사위 클래스 구현
    @details : 주사위 2개 굴려서 나온 수 합산 (Demo)
*/

package lecture.ch07_ClassAndObject.Dice;

import java.util.Random;

public class Dice {
    private int faceValue = 0;
    private int MAX_VALUE = 6;
    private int MIN_VALUE = 1;
    private Random rand = new Random(); // 난수생성 객체

    // 주사위 굴리기
    public void roll() {
        faceValue = rand.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    // 결과 확인
    public int getFaceValue() {
        return faceValue;
    }
}