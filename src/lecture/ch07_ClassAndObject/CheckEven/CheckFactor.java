package lecture.ch07_ClassAndObject.CheckEven;

public class CheckFactor {
    public boolean isFactor(int x, int y) {
        if((y % x) == 0)
            return true;
        else
            return false;
    }
}
