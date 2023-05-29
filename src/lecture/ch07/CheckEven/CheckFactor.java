package lecture.ch07.CheckEven;

public class CheckFactor {
    public boolean isFactor(int x, int y) {
        if((y % x) == 0)
            return true;
        else
            return false;
    }
}
