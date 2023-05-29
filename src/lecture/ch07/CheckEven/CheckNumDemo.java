package lecture.ch07.CheckEven;

public class CheckNumDemo {
    public static void main(String[] args) {
        CheckEven ce = new CheckEven();
        System.out.println(ce.isEven(3));
        System.out.println(ce.isEven(4));
        
        CheckFactor cf = new CheckFactor();
        System.out.println(cf.isFactor(10, 100));
        System.out.println(cf.isFactor(7, 99));
    }
}
