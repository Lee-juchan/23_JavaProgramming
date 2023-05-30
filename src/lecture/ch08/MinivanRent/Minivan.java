/*
    @brief : 객체지향 연습 (class -> method, encapsulation, constructor)
    @details : 2대의 Minivan을 운영하며, 얻은 비용을 계산하는 프로그램 (Demo)
*/

package lecture.ch08.MinivanRent;

public class Minivan {
    private int passenger;
    private int fuelcap;

    public Minivan(int passenger, int fuelcap) {
        this.passenger = passenger;
        this.fuelcap = fuelcap;
    }

    private int getDistance() {
        return fuelcap * Constants.MILE_PER_GASOLNE;
    }
    private int getPayments() {
        return getDistance() * passenger * Constants.PAYMENTS_PER_PERSON;
    }

    public void showPayments() {
        System.out.printf("Distance : %d, Payments : %d\n", getDistance(), getPayments());
    }
}
