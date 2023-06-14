package lecture.ch08_OOP.MinivanRent;

public class TwoMinivanDemo {
    public static void main(String[] args) {
        Minivan m1 = new Minivan(7, 16);
        Minivan m2 = new Minivan(5, 20);

        m1.showPayments();
        m2.showPayments();

        // int distance = m1.fuelcap * m1.mpg;
        // int payments = distance * 2000;
        // System.out.printf("passengers : %d, distance : %d\n", m1.passenger, distance);
        // System.out.printf("payments : %d\n", payments);

        // System.out.println(payments);
    }
}