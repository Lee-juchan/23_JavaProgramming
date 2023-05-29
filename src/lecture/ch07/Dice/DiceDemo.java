package lecture.ch07.Dice;

public class DiceDemo {
    public static void main(String[] args) {

        // Dice
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        d1.roll();
        d2.roll();
        int sum1 = d1.getFaceValue() + d2.getFaceValue();
        System.out.printf("sum1 : %d + %d = %d\n", d1.getFaceValue(), d2.getFaceValue(), sum1);


        // OverDice
        OverDice d3 = new OverDice();
        OverDice d4 = new OverDice();
        
        int sum2 = d3.roll() + d4.roll();
        System.out.printf("sum2 : %d + %d = %d\n", d3.getFaceValue(), d4.getFaceValue(), sum2);
    }
}
