package lecture.ch09_EnumAndCollection.Game.Unit;

public class Griffin extends Unit {
    public Griffin(String unitName) {
        super(unitName);
    }

    @Override
    public void attack() {
        System.out.printf("[%s] fire chain lightening\n", getUnitName());
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("[%s] flies to (%d, %d)\n", getUnitName(), x, y);
    }
}
